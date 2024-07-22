grammar LAGrammar;

programa: declaracoes 'algoritmo' corpo 'fim_algoritmo';

declaracoes: (decl_local_global)*;

decl_local_global: declaracao_global | declaracao_local | constante;

declaracao_local: 'declare' declaracao_variavel;

declaracao_global: declaracoes_variaveis | procedimento | funcao | declaracao_tipo;

declaracoes_variaveis: 'declare' declaracao_variavel (',' declaracao_variavel)* ('fim_declare' | ';')?;


declaracao_variavel: identificadores DOISPONTOS tipo;

identificadores: identificador (',' identificador)*;

corpo: (declaracao_local | comandos | funcao | procedimento | registro | declaracao_tipo)*;

comandos: comando (comando)*;

comando: escreva_cdm
       | leia_cmd
       | cmd_para
       | atribuicao_cmd
       | chamada_tipo_cdm
       | chamada_procedimento_cmd
       | chamada_funcao_cmd
       | cmd_condicional
       | cmd_enquanto
       | retorno;

leia_cmd: 'leia' '(' identificadores ')';

escreva_cdm: 'escreva' '(' expressao (',' expressao)* ')';

mensagem_literal: '"' ~'"'* '"';

atribuicao_cmd: (identificador | ponteiro) '<-' expressao;

chamada_funcao_cmd: identificador '(' argumentos? ')';

chamada_tipo_cdm: identificador ':' registro;

chamada_procedimento_cmd: identificador '(' argumentos? ')';

argumentos: expressao (',' expressao)*;

cmd_condicional: 'se' expressao 'entao' corpo ('senao' corpo)? 'fim_se';

cmd_enquanto: 'enquanto' expressao 'faca' corpo 'fim_enquanto';

cmd_para: 'para' identificador '<-' expressao 'ate' expressao ('passo' expressao)? 'faca' corpo 'fim_para';

retorno: 'retorne' expressao;

// expressao: operacao
//          | mensagem_literal
//          | literal
//          | termo (( '+' | '-' ) termo)*
//          | NUM_INT
//          | NUM_REAL
//          | IDENT
//          | identificador
//          | ponteiro
//          |'-' identificador
//          | endereco
//          | chamada_funcao_cmd
//          | chamada_tipo_cdm
//          | chamada_procedimento_cmd
//          | '(' expressao ')'
//          | expressao ('+'|'-'|'*'|'/'|'>'|'<'|'>='|'<='|'<>'|'=') expressao
//          | expressao logico expressao;

expressao
    : termo relacional expressao
    | expressao logico expressao logico expressao   
    | expressao logico expressao
    | expressao relacional expressao
    | termo ( '+' | '-' ) termo
    | termo ('*' | '/' ) termo
    | termo ( ('+' | '-' | '*' | '/') termo )*
    | termo relacional termo
    | termo logico termo
    | '(' expressao ')'
    | expressao ('+'|'-'|'*'|'/'|'>'|'<'|'>='|'<='|'<>'|'=') expressao
    // | expressao ('+'|'-'|'*'|'/') expressao
    | termo
    ;

// expressao
//     : termo relacional expressao
//     | termo ( ('+' | '-' | '*' | '/') termo )*
//     | termo ( '+' | '-' ) termo
//     | termo ('*' | '/' ) termo
//     | expressao logico expressao (logico expressao)*           
//     | expressao relacional expressao             
//     | expressao ('+' | '-' | '*' | '/') expressao  
//     | '(' expressao ')'                        
//     | termo  
//     | termo relacional termo
//     | termo logico termo                                 
//     ;


relacional
    : '>' | '<' | '>=' | '<=' | '<>' | '='
    ;
termo
    : operacao
    | mensagem_literal
    | literal
    | NUM_INT
    | NUM_REAL
    | IDENT
    | identificador
    | ponteiro
    | '-' identificador
    | endereco
    | chamada_funcao_cmd
    | chamada_tipo_cdm
    | chamada_procedimento_cmd
    | 'verdadeiro'
    | 'falso'
    ;

literal: CADEIA | LOGICO | endereco | IDENT;

tipo: 'literal'
    | 'inteiro'
    | 'real'
    | 'logico'
    | '^' tipo
    | 'registro'
    | 'endereco'
    | IDENT;

// operacao: operando (operador operando)* ;

// operando: '(' operacao ')' 
//         | identificador 
//         | NUM_INT 
//         | NUM_REAL 
//         ;

operacao
    : identificador
    | identificador '(' expressao ')'
    ;

// termo
//     : fator (( '*' | '/' ) fator)*
//     ;

fator
    : IDENT
    | NUM_INT
    | NUM_REAL
    | IDENT
    | '(' expressao ')'
    ;

registro: 'registro' campos_registro 'fim_registro';

campos_registro: campo_registro (campo_registro)+;

campo_registro: identificadores ':' tipo;

declaracao_tipo: 'tipo' declaracoes_tipos;

declaracoes_tipos: (declaracao_tipo_lista)+;

declaracao_tipo_lista: IDENT ':' registro;

identificador: IDENT ('.' IDENT)* dimensao?;

constante: 'constante' IDENT DOISPONTOS tipo '=' expressao;


dimensao: ('[' expressao ']');

ponteiro: '^' tipo;

logico: 'e' | 'ou' | 'e nao';

endereco: '&';

operador: '+' | '-' | '*' | '/' | '>' | '<' | '>=' | '<=' | '<>' | '=' ;

parametros: parametro (',' parametro)*;

parametro: 'var'? identificador ':' tipo;

procedimento: 'procedimento' IDENT '(' parametros? ')' bloco 'fim_procedimento';

funcao: 'funcao' IDENT '(' parametros? ')' ':' tipo bloco 'fim_funcao';

bloco: '{' corpo '}';

DOISPONTOS: ':';

DIFERENTE : '<>';

IDENT: [a-zA-Z] [a-zA-Z0-9_]*;

CADEIA: '"' (~('\n'|'"'))* '"';

LOGICO: 'verdadeiro' | 'falso';

NUM_INT: [0-9]+;

NUM_REAL: [0-9]+'.'[0-9]+;

WS: [ \t\r\n]+ -> skip;

COMMENTS: '{' ~('}')* '}' -> skip;

ErrorChar: .;
