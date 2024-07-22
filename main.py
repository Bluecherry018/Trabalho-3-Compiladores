import sys
from antlr4 import *
from LAGrammarLexer import LAGrammarLexer
from LAGrammarParser import LAGrammarParser
from LAGrammarListener import LAGrammarListener
from antlr4.error.ErrorListener import ErrorListener, ConsoleErrorListener

class SemanticErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errors = []

    def add_error(self, line, msg):
        if (line, msg) not in self.errors:
            self.errors.append((line, msg))

    def has_errors(self):
        return len(self.errors) > 0

    def print_errors(self, output_file):
        self.errors.sort(key=lambda x: x[0]) 
        with open(output_file, 'w') as f:
            for error in self.errors:
                f.write(f"Linha {error[0]}: {error[1]}\n")
            f.write("Fim da compilacao\n")

class LAGrammarSemanticAnalyzer(LAGrammarListener):
    def __init__(self, error_listener):
        super().__init__()
        self.symbol_table = {}
        self.current_scope = "global"
        self.error_listener = error_listener

    def enterDeclaracoes_variaveis(self, ctx: LAGrammarParser.Declaracoes_variaveisContext):
        for declaracao_var in ctx.declaracao_variavel():
            self.enterDeclaracao_variavel(declaracao_var)

    def enterDeclaracao_variavel(self, ctx: LAGrammarParser.Declaracao_variavelContext):
        tipo = ctx.tipo().getText()
        identificadores = ctx.identificadores().identificador()

        for identificador in identificadores:
            nome = identificador.getText()
            if nome in self.symbol_table:
                self.error_listener.add_error(identificador.start.line, f"identificador {nome} ja declarado anteriormente")
            else:
                self.symbol_table[nome] = tipo

    def enterIdentificadores(self, ctx: LAGrammarParser.IdentificadoresContext):
        for identificador in ctx.identificador():
            self.enterIdentificador(identificador)

    def enterIdentificador(self, ctx: LAGrammarParser.IdentificadorContext):
        nome = ctx.getText()
        if nome not in self.symbol_table:
            self.error_listener.add_error(ctx.start.line, f"identificador {nome} nao declarado")

    def enterTipo(self, ctx: LAGrammarParser.TipoContext):
        nome = ctx.getText()
        if nome not in ['literal', 'inteiro', 'real', 'logico', 'registro', 'ponteiro']:
            tipo_formatado = nome if nome != "literal" else nome
            self.error_listener.add_error(ctx.start.line, f"tipo {tipo_formatado} nao declarado")

    def exitAtribuicao_cmd(self, ctx: LAGrammarParser.Atribuicao_cmdContext):
        identificador = ctx.identificador().getText()
        self.enterIdentificador(ctx.identificador()) 
        tipo_variavel = self.symbol_table.get(identificador)
        tipo_expressao = self.get_tipo_expressao(ctx.expressao())

        if tipo_variavel and tipo_expressao:
            if not self.tipo_compativel(tipo_variavel, tipo_expressao):
                self.error_listener.add_error(ctx.identificador().start.line, f"atribuicao nao compativel para {identificador}")
        elif tipo_variavel is None:
            self.error_listener.add_error(ctx.identificador().start.line, f"identificador {identificador} nao declarado")
        elif tipo_expressao is None:
            self.error_listener.add_error(ctx.identificador().start.line, f"atribuicao nao compativel para {identificador}")


    def get_tipo_expressao(self, ctx: LAGrammarParser.ExpressaoContext):
        if ctx.termo():
            for ter in ctx.termo():
                tipo = self.get_tipo_termo(ter)
            return tipo
        elif ctx.getChildCount() == 1:
            return self.get_tipo_termo(ctx.getChild(0))
        elif ctx.getChildCount() == 3 and ctx.getChild(0).getText() == '(' and ctx.getChild(2).getText() == ')':
            return self.get_tipo_expressao(ctx.getChild(1))
        elif len(ctx.termo()) == 2:
            tipo_expr1 = self.get_tipo_termo(ctx.termo(0))
            tipo_expr2 = self.get_tipo_termo(ctx.termo(1))
            if tipo_expr1 == tipo_expr2:
                return tipo_expr1
            else:
                return "tipo_indefinido"

        elif ctx.getChildCount() == 3:
            operador = ctx.getChild(1).getText()
            tipo_expr1 = self.get_tipo_expressao(ctx.getChild(0))
            tipo_expr2 = self.get_tipo_expressao(ctx.getChild(2))
            if operador in ['+', '-', '*', '/']:
            
                if tipo_expr1 in ['inteiro', 'real'] and tipo_expr2 in ['inteiro', 'real']:
                    if tipo_expr1 == tipo_expr2:
                        return tipo_expr1
                    elif tipo_expr1 == 'real' or tipo_expr2 == 'real':
                        return 'real'
                if tipo_expr1 == 'literal' and tipo_expr2 == 'literal':
                    if tipo_expr1 == tipo_expr2:
                        return tipo_expr1
                
            elif operador in ['>', '<', '>=', '<=', '<>', '=']:
                if tipo_expr1 == tipo_expr2:
                    return 'logico'  
                else:
                    return "tipo_indefinido"
            elif operador in ['e', 'ou', 'e nao']:
                if tipo_expr1 == tipo_expr2:
                    return tipo_expr1
                else:
                    return 'tipo_indefinido'
                

        elif ctx.getChildCount() == 5:
            operador1 = ctx.getChild(1).getText()
            operador2 = ctx.getChild(3).getText()
            tipo_expr1 = self.get_tipo_expressao(ctx.getChild(0))
            tipo_expr2 = self.get_tipo_expressao(ctx.getChild(2))
            tipo_expr3 = self.get_tipo_expressao(ctx.getChild(4))
        

            if operador1 in ['e', 'ou', 'e nao'] and operador2 in ['e', 'ou', 'e nao']:
                if tipo_expr1 == 'real' and tipo_expr2 == 'real' and tipo_expr3 == 'real':
                    return 'logico'
                elif tipo_expr1 == 'logico' and tipo_expr2 in ['inteiro', 'real'] and tipo_expr3 in ['inteiro', 'real']:
                    return 'logico'
                elif tipo_expr1 == 'logico' and tipo_expr2 == 'logico' and tipo_expr3 == 'logico':
                    return 'logico'
                else:
                    return 'tipo_indefinido'
            
            elif operador1 in ['+', '-', '*', '/'] or operador2 in ['+', '-', '*', '/']:
                if tipo_expr1 in ['inteiro', 'real'] and tipo_expr2 in ['inteiro', 'real'] and tipo_expr3 in ['inteiro', 'real']:
                    if tipo_expr1 == tipo_expr2 == tipo_expr3:
                        return tipo_expr1
                    elif 'real' in [tipo_expr1, tipo_expr2, tipo_expr3]:
                        return 'real'
                    else:
                        return 'tipo_indefinido'
            
            elif operador1 in ['>', '<', '>=', '<=', '<>', '='] or operador2 in ['>', '<', '>=', '<=', '<>', '=']:
                if tipo_expr1 in ['inteiro', 'real'] and tipo_expr2 in ['inteiro', 'real'] and tipo_expr3 in ['inteiro', 'real']:
                    return 'logico'
                else:
                    return 'tipo_indefinido'
                    
        return "tipo_indefinido"


    def get_tipo_termo(self, ctx: LAGrammarParser.TermoContext):
        if ctx.operacao():
            return self.get_tipo_operacao(ctx.operacao())
        elif ctx.mensagem_literal():
            return "literal"
        elif ctx.literal():
            return self.get_tipo_literal(ctx.literal())
        elif ctx.NUM_INT():
            return "inteiro"
        elif ctx.NUM_REAL():
            return "real"
        elif ctx.IDENT():
            identificador = ctx.IDENT().getText()
            if identificador in self.symbol_table:
                return self.symbol_table[identificador]
            else:
                return None  
        elif ctx.identificador():
            return self.get_tipo_identificador(ctx.identificador())
        elif ctx.getChild(0).getText() == '-' and ctx.identificador():
            # Handle unary minus
            return self.get_tipo_identificador(ctx.identificador())
        return "tipo_indefinido"

    def get_tipo_operacao(self, ctx: LAGrammarParser.OperacaoContext):
        if ctx.identificador():
            return self.get_tipo_identificador(ctx.identificador())
        elif ctx.identificador() and ctx.getChildCount() == 4 and ctx.getChild(1).getText() == '(':
            # Handle function call
            return self.get_tipo_identificador(ctx.identificador())
        return "tipo_indefinido"
    
    def enterEscreva_cdm(self, ctx: LAGrammarParser.Escreva_cdmContext):
        expressoes_ctx = ctx.expressao()

        for expressao_ctx in expressoes_ctx:
            texto_expressao = expressao_ctx.getText()
            
            if texto_expressao.startswith('"') and texto_expressao.endswith('"'):
                mensagem = texto_expressao[1:-1] 
            else:
                self.get_tipo_expressao(expressao_ctx)


    def get_tipo_literal(self, ctx: LAGrammarParser.LiteralContext):
        if ctx.CADEIA():
            return "literal"
        elif ctx.LOGICO():
            return "logico"
        elif ctx.IDENT():
            return "identificador"
        elif ctx.endereco():
            return "endereco"
        return "tipo_indefinido"


    def get_tipo_identificador(self, ctx: LAGrammarParser.IdentificadorContext):
        identificador = ctx.IDENT(0).getText()
        if identificador in self.symbol_table:
            return self.symbol_table[identificador]
        else:
            return None  


    def tipo_compativel(self, tipo_var, tipo_expr):
        if tipo_var == tipo_expr:
            return True
        if (tipo_var == "real" and tipo_expr == "inteiro") or (tipo_var == "inteiro" and tipo_expr == "real"):
            return True
        if (tipo_var == "logico" and tipo_expr == "inteiro") or (tipo_var == "logico" and tipo_expr == "real"):
            return True
        return False

    def print_errors(self, output_file):
        self.error_listener.print_errors(output_file)

def main(input_file, output_file):
    input_stream = FileStream(input_file, encoding='utf-8')
    lexer = LAGrammarLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = LAGrammarParser(stream)
    
    parser.removeErrorListeners()
    error_listener = SemanticErrorListener()
    parser.addErrorListener(error_listener)
    
    tree = parser.programa()

    analyzer = LAGrammarSemanticAnalyzer(error_listener)
    walker = ParseTreeWalker()
    walker.walk(analyzer, tree)

    analyzer.print_errors(output_file)

if __name__ == '__main__':
    if len(sys.argv) != 3:
        print("Uso: Python3 main.py entrada.txt saida.txt")
        sys.exit(1)
    
    input_file = sys.argv[1]
    output_file = sys.argv[2]
    main(input_file, output_file)
