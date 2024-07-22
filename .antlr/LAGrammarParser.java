// Generated from /Users/alexandrafloriano/Desktop/T3 Compiladores/Trabalho-3-Compiladores/LAGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LAGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		DOISPONTOS=60, DIFERENTE=61, IDENT=62, CADEIA=63, LOGICO=64, NUM_INT=65, 
		NUM_REAL=66, WS=67, COMMENTS=68, ErrorChar=69;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_declaracao_global = 4, RULE_declaracoes_variaveis = 5, RULE_declaracao_variavel = 6, 
		RULE_identificadores = 7, RULE_corpo = 8, RULE_comandos = 9, RULE_comando = 10, 
		RULE_leia_cmd = 11, RULE_escreva_cdm = 12, RULE_mensagem_literal = 13, 
		RULE_atribuicao_cmd = 14, RULE_chamada_funcao_cmd = 15, RULE_chamada_tipo_cdm = 16, 
		RULE_chamada_procedimento_cmd = 17, RULE_argumentos = 18, RULE_cmd_condicional = 19, 
		RULE_cmd_enquanto = 20, RULE_cmd_para = 21, RULE_retorno = 22, RULE_expressao = 23, 
		RULE_relacional = 24, RULE_termo = 25, RULE_literal = 26, RULE_tipo = 27, 
		RULE_operacao = 28, RULE_fator = 29, RULE_registro = 30, RULE_campos_registro = 31, 
		RULE_campo_registro = 32, RULE_declaracao_tipo = 33, RULE_declaracoes_tipos = 34, 
		RULE_declaracao_tipo_lista = 35, RULE_identificador = 36, RULE_constante = 37, 
		RULE_dimensao = 38, RULE_ponteiro = 39, RULE_logico = 40, RULE_endereco = 41, 
		RULE_operador = 42, RULE_parametros = 43, RULE_parametro = 44, RULE_procedimento = 45, 
		RULE_funcao = 46, RULE_bloco = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "declaracao_global", 
			"declaracoes_variaveis", "declaracao_variavel", "identificadores", "corpo", 
			"comandos", "comando", "leia_cmd", "escreva_cdm", "mensagem_literal", 
			"atribuicao_cmd", "chamada_funcao_cmd", "chamada_tipo_cdm", "chamada_procedimento_cmd", 
			"argumentos", "cmd_condicional", "cmd_enquanto", "cmd_para", "retorno", 
			"expressao", "relacional", "termo", "literal", "tipo", "operacao", "fator", 
			"registro", "campos_registro", "campo_registro", "declaracao_tipo", "declaracoes_tipos", 
			"declaracao_tipo_lista", "identificador", "constante", "dimensao", "ponteiro", 
			"logico", "endereco", "operador", "parametros", "parametro", "procedimento", 
			"funcao", "bloco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "','", "'fim_declare'", 
			"';'", "'leia'", "'('", "')'", "'escreva'", "'\"'", "'<-'", "'se'", "'entao'", 
			"'senao'", "'fim_se'", "'enquanto'", "'faca'", "'fim_enquanto'", "'para'", 
			"'ate'", "'passo'", "'fim_para'", "'retorne'", "'+'", "'-'", "'*'", "'/'", 
			"'>'", "'<'", "'>='", "'<='", "'='", "'verdadeiro'", "'falso'", "'literal'", 
			"'inteiro'", "'real'", "'logico'", "'^'", "'registro'", "'endereco'", 
			"'fim_registro'", "'tipo'", "'.'", "'constante'", "'['", "']'", "'e'", 
			"'ou'", "'e nao'", "'&'", "'var'", "'procedimento'", "'fim_procedimento'", 
			"'funcao'", "'fim_funcao'", "'{'", "'}'", "':'", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DOISPONTOS", "DIFERENTE", "IDENT", "CADEIA", "LOGICO", "NUM_INT", "NUM_REAL", 
			"WS", "COMMENTS", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LAGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LAGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			declaracoes();
			setState(97);
			match(T__0);
			setState(98);
			corpo();
			setState(99);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90159953477632008L) != 0)) {
				{
				{
				setState(101);
				decl_local_global();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				declaracao_global();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				declaracao_local();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				constante();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_localContext extends ParserRuleContext {
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__2);
			setState(113);
			declaracao_variavel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_globalContext extends ParserRuleContext {
		public Declaracoes_variaveisContext declaracoes_variaveis() {
			return getRuleContext(Declaracoes_variaveisContext.class,0);
		}
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public Declaracao_tipoContext declaracao_tipo() {
			return getRuleContext(Declaracao_tipoContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_global);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				declaracoes_variaveis();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				procedimento();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				funcao();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				declaracao_tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracoes_variaveisContext extends ParserRuleContext {
		public List<Declaracao_variavelContext> declaracao_variavel() {
			return getRuleContexts(Declaracao_variavelContext.class);
		}
		public Declaracao_variavelContext declaracao_variavel(int i) {
			return getRuleContext(Declaracao_variavelContext.class,i);
		}
		public Declaracoes_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_variaveis; }
	}

	public final Declaracoes_variaveisContext declaracoes_variaveis() throws RecognitionException {
		Declaracoes_variaveisContext _localctx = new Declaracoes_variaveisContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracoes_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__2);
			setState(122);
			declaracao_variavel();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(123);
				match(T__3);
				setState(124);
				declaracao_variavel();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__5) {
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_variavelContext extends ParserRuleContext {
		public IdentificadoresContext identificadores() {
			return getRuleContext(IdentificadoresContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel; }
	}

	public final Declaracao_variavelContext declaracao_variavel() throws RecognitionException {
		Declaracao_variavelContext _localctx = new Declaracao_variavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			identificadores();
			setState(134);
			match(DOISPONTOS);
			setState(135);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadoresContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public IdentificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificadores; }
	}

	public final IdentificadoresContext identificadores() throws RecognitionException {
		IdentificadoresContext _localctx = new IdentificadoresContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			identificador();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(138);
				match(T__3);
				setState(139);
				identificador();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<ProcedimentoContext> procedimento() {
			return getRuleContexts(ProcedimentoContext.class);
		}
		public ProcedimentoContext procedimento(int i) {
			return getRuleContext(ProcedimentoContext.class,i);
		}
		public List<RegistroContext> registro() {
			return getRuleContexts(RegistroContext.class);
		}
		public RegistroContext registro(int i) {
			return getRuleContext(RegistroContext.class,i);
		}
		public List<Declaracao_tipoContext> declaracao_tipo() {
			return getRuleContexts(Declaracao_tipoContext.class);
		}
		public Declaracao_tipoContext declaracao_tipo(int i) {
			return getRuleContext(Declaracao_tipoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4701778901713691784L) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(145);
					declaracao_local();
					}
					break;
				case T__6:
				case T__9:
				case T__12:
				case T__16:
				case T__19:
				case T__23:
				case T__39:
				case IDENT:
					{
					setState(146);
					comandos();
					}
					break;
				case T__55:
					{
					setState(147);
					funcao();
					}
					break;
				case T__53:
					{
					setState(148);
					procedimento();
					}
					break;
				case T__40:
					{
					setState(149);
					registro();
					}
					break;
				case T__43:
					{
					setState(150);
					declaracao_tipo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comandos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			comando();
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					comando();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public Escreva_cdmContext escreva_cdm() {
			return getRuleContext(Escreva_cdmContext.class,0);
		}
		public Leia_cmdContext leia_cmd() {
			return getRuleContext(Leia_cmdContext.class,0);
		}
		public Cmd_paraContext cmd_para() {
			return getRuleContext(Cmd_paraContext.class,0);
		}
		public Atribuicao_cmdContext atribuicao_cmd() {
			return getRuleContext(Atribuicao_cmdContext.class,0);
		}
		public Chamada_tipo_cdmContext chamada_tipo_cdm() {
			return getRuleContext(Chamada_tipo_cdmContext.class,0);
		}
		public Chamada_procedimento_cmdContext chamada_procedimento_cmd() {
			return getRuleContext(Chamada_procedimento_cmdContext.class,0);
		}
		public Chamada_funcao_cmdContext chamada_funcao_cmd() {
			return getRuleContext(Chamada_funcao_cmdContext.class,0);
		}
		public Cmd_condicionalContext cmd_condicional() {
			return getRuleContext(Cmd_condicionalContext.class,0);
		}
		public Cmd_enquantoContext cmd_enquanto() {
			return getRuleContext(Cmd_enquantoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comando);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				escreva_cdm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				leia_cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				cmd_para();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				atribuicao_cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				chamada_tipo_cdm();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				chamada_procedimento_cmd();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				chamada_funcao_cmd();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				cmd_condicional();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(171);
				cmd_enquanto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
				retorno();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Leia_cmdContext extends ParserRuleContext {
		public IdentificadoresContext identificadores() {
			return getRuleContext(IdentificadoresContext.class,0);
		}
		public Leia_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia_cmd; }
	}

	public final Leia_cmdContext leia_cmd() throws RecognitionException {
		Leia_cmdContext _localctx = new Leia_cmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_leia_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__6);
			setState(176);
			match(T__7);
			setState(177);
			identificadores();
			setState(178);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Escreva_cdmContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Escreva_cdmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva_cdm; }
	}

	public final Escreva_cdmContext escreva_cdm() throws RecognitionException {
		Escreva_cdmContext _localctx = new Escreva_cdmContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_escreva_cdm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__9);
			setState(181);
			match(T__7);
			setState(182);
			expressao(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(183);
				match(T__3);
				setState(184);
				expressao(0);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mensagem_literalContext extends ParserRuleContext {
		public Mensagem_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensagem_literal; }
	}

	public final Mensagem_literalContext mensagem_literal() throws RecognitionException {
		Mensagem_literalContext _localctx = new Mensagem_literalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mensagem_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__10);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2050L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 63L) != 0)) {
				{
				{
				setState(193);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atribuicao_cmdContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public Atribuicao_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_cmd; }
	}

	public final Atribuicao_cmdContext atribuicao_cmd() throws RecognitionException {
		Atribuicao_cmdContext _localctx = new Atribuicao_cmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atribuicao_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(201);
				identificador();
				}
				break;
			case T__39:
				{
				setState(202);
				ponteiro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(205);
			match(T__11);
			setState(206);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_funcao_cmdContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Chamada_funcao_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao_cmd; }
	}

	public final Chamada_funcao_cmdContext chamada_funcao_cmd() throws RecognitionException {
		Chamada_funcao_cmdContext _localctx = new Chamada_funcao_cmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_chamada_funcao_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			identificador();
			setState(209);
			match(T__7);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 558463950476541961L) != 0)) {
				{
				setState(210);
				argumentos();
				}
			}

			setState(213);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_tipo_cdmContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Chamada_tipo_cdmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_tipo_cdm; }
	}

	public final Chamada_tipo_cdmContext chamada_tipo_cdm() throws RecognitionException {
		Chamada_tipo_cdmContext _localctx = new Chamada_tipo_cdmContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_chamada_tipo_cdm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			identificador();
			setState(216);
			match(DOISPONTOS);
			setState(217);
			registro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_procedimento_cmdContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Chamada_procedimento_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_procedimento_cmd; }
	}

	public final Chamada_procedimento_cmdContext chamada_procedimento_cmd() throws RecognitionException {
		Chamada_procedimento_cmdContext _localctx = new Chamada_procedimento_cmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chamada_procedimento_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			identificador();
			setState(220);
			match(T__7);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 558463950476541961L) != 0)) {
				{
				setState(221);
				argumentos();
				}
			}

			setState(224);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			expressao(0);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(227);
				match(T__3);
				setState(228);
				expressao(0);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_condicionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CorpoContext> corpo() {
			return getRuleContexts(CorpoContext.class);
		}
		public CorpoContext corpo(int i) {
			return getRuleContext(CorpoContext.class,i);
		}
		public Cmd_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_condicional; }
	}

	public final Cmd_condicionalContext cmd_condicional() throws RecognitionException {
		Cmd_condicionalContext _localctx = new Cmd_condicionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmd_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__12);
			setState(235);
			expressao(0);
			setState(236);
			match(T__13);
			setState(237);
			corpo();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(238);
				match(T__14);
				setState(239);
				corpo();
				}
			}

			setState(242);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_enquantoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public Cmd_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_enquanto; }
	}

	public final Cmd_enquantoContext cmd_enquanto() throws RecognitionException {
		Cmd_enquantoContext _localctx = new Cmd_enquantoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmd_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__16);
			setState(245);
			expressao(0);
			setState(246);
			match(T__17);
			setState(247);
			corpo();
			setState(248);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_paraContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public Cmd_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_para; }
	}

	public final Cmd_paraContext cmd_para() throws RecognitionException {
		Cmd_paraContext _localctx = new Cmd_paraContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmd_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__19);
			setState(251);
			identificador();
			setState(252);
			match(T__11);
			setState(253);
			expressao(0);
			setState(254);
			match(T__20);
			setState(255);
			expressao(0);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(256);
				match(T__21);
				setState(257);
				expressao(0);
				}
			}

			setState(260);
			match(T__17);
			setState(261);
			corpo();
			setState(262);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__23);
			setState(265);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<LogicoContext> logico() {
			return getRuleContexts(LogicoContext.class);
		}
		public LogicoContext logico(int i) {
			return getRuleContext(LogicoContext.class,i);
		}
		public TerminalNode DIFERENTE() { return getToken(LAGrammarParser.DIFERENTE, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(268);
				termo();
				setState(269);
				relacional();
				setState(270);
				expressao(12);
				}
				break;
			case 2:
				{
				setState(272);
				termo();
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				termo();
				}
				break;
			case 3:
				{
				setState(276);
				termo();
				setState(277);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				termo();
				}
				break;
			case 4:
				{
				setState(280);
				termo();
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(281);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						termo();
						}
						} 
					}
					setState(287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 5:
				{
				setState(288);
				termo();
				setState(289);
				relacional();
				setState(290);
				termo();
				}
				break;
			case 6:
				{
				setState(292);
				termo();
				setState(293);
				logico();
				setState(294);
				termo();
				}
				break;
			case 7:
				{
				setState(296);
				match(T__7);
				setState(297);
				expressao(0);
				setState(298);
				match(T__8);
				}
				break;
			case 8:
				{
				setState(300);
				termo();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(303);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(304);
						logico();
						setState(305);
						expressao(0);
						setState(306);
						logico();
						setState(307);
						expressao(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(309);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(310);
						logico();
						setState(311);
						expressao(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(313);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(314);
						relacional();
						setState(315);
						expressao(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(317);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(318);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843026360008704L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(319);
						expressao(3);
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelacionalContext extends ParserRuleContext {
		public TerminalNode DIFERENTE() { return getToken(LAGrammarParser.DIFERENTE, 0); }
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843025856692224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public Mensagem_literalContext mensagem_literal() {
			return getRuleContext(Mensagem_literalContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAGrammarParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammarParser.NUM_REAL, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public EnderecoContext endereco() {
			return getRuleContext(EnderecoContext.class,0);
		}
		public Chamada_funcao_cmdContext chamada_funcao_cmd() {
			return getRuleContext(Chamada_funcao_cmdContext.class,0);
		}
		public Chamada_tipo_cdmContext chamada_tipo_cdm() {
			return getRuleContext(Chamada_tipo_cdmContext.class,0);
		}
		public Chamada_procedimento_cmdContext chamada_procedimento_cmd() {
			return getRuleContext(Chamada_procedimento_cmdContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_termo);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				operacao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				mensagem_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(NUM_INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(NUM_REAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(IDENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				identificador();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				ponteiro();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				match(T__25);
				setState(336);
				identificador();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(337);
				endereco();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(338);
				chamada_funcao_cmd();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(339);
				chamada_tipo_cdm();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(340);
				chamada_procedimento_cmd();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(341);
				match(T__33);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(342);
				match(T__34);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LAGrammarParser.CADEIA, 0); }
		public TerminalNode LOGICO() { return getToken(LAGrammarParser.LOGICO, 0); }
		public EnderecoContext endereco() {
			return getRuleContext(EnderecoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(CADEIA);
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(LOGICO);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				endereco();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tipo);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				match(T__39);
				setState(356);
				tipo();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(358);
				match(T__41);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(359);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operacao);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				identificador();
				setState(364);
				match(T__7);
				setState(365);
				expressao(0);
				setState(366);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public TerminalNode NUM_INT() { return getToken(LAGrammarParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammarParser.NUM_REAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fator);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(NUM_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				match(NUM_REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(IDENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(T__7);
				setState(375);
				expressao(0);
				setState(376);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegistroContext extends ParserRuleContext {
		public Campos_registroContext campos_registro() {
			return getRuleContext(Campos_registroContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__40);
			setState(381);
			campos_registro();
			setState(382);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campos_registroContext extends ParserRuleContext {
		public List<Campo_registroContext> campo_registro() {
			return getRuleContexts(Campo_registroContext.class);
		}
		public Campo_registroContext campo_registro(int i) {
			return getRuleContext(Campo_registroContext.class,i);
		}
		public Campos_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos_registro; }
	}

	public final Campos_registroContext campos_registro() throws RecognitionException {
		Campos_registroContext _localctx = new Campos_registroContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_campos_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			campo_registro();
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(385);
				campo_registro();
				}
				}
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campo_registroContext extends ParserRuleContext {
		public IdentificadoresContext identificadores() {
			return getRuleContext(IdentificadoresContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Campo_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_registro; }
	}

	public final Campo_registroContext campo_registro() throws RecognitionException {
		Campo_registroContext _localctx = new Campo_registroContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_campo_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			identificadores();
			setState(391);
			match(DOISPONTOS);
			setState(392);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_tipoContext extends ParserRuleContext {
		public Declaracoes_tiposContext declaracoes_tipos() {
			return getRuleContext(Declaracoes_tiposContext.class,0);
		}
		public Declaracao_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_tipo; }
	}

	public final Declaracao_tipoContext declaracao_tipo() throws RecognitionException {
		Declaracao_tipoContext _localctx = new Declaracao_tipoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declaracao_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__43);
			setState(395);
			declaracoes_tipos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracoes_tiposContext extends ParserRuleContext {
		public List<Declaracao_tipo_listaContext> declaracao_tipo_lista() {
			return getRuleContexts(Declaracao_tipo_listaContext.class);
		}
		public Declaracao_tipo_listaContext declaracao_tipo_lista(int i) {
			return getRuleContext(Declaracao_tipo_listaContext.class,i);
		}
		public Declaracoes_tiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_tipos; }
	}

	public final Declaracoes_tiposContext declaracoes_tipos() throws RecognitionException {
		Declaracoes_tiposContext _localctx = new Declaracoes_tiposContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declaracoes_tipos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(397);
					declaracao_tipo_lista();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(400); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_tipo_listaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Declaracao_tipo_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_tipo_lista; }
	}

	public final Declaracao_tipo_listaContext declaracao_tipo_lista() throws RecognitionException {
		Declaracao_tipo_listaContext _localctx = new Declaracao_tipo_listaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declaracao_tipo_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(IDENT);
			setState(403);
			match(DOISPONTOS);
			setState(404);
			registro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(LAGrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAGrammarParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_identificador);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(IDENT);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(407);
					match(T__44);
					setState(408);
					match(IDENT);
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(414);
				dimensao();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__45);
			setState(418);
			match(IDENT);
			setState(419);
			match(DOISPONTOS);
			setState(420);
			tipo();
			setState(421);
			match(T__32);
			setState(422);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(424);
			match(T__46);
			setState(425);
			expressao(0);
			setState(426);
			match(T__47);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PonteiroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public PonteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiro; }
	}

	public final PonteiroContext ponteiro() throws RecognitionException {
		PonteiroContext _localctx = new PonteiroContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ponteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__39);
			setState(429);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicoContext extends ParserRuleContext {
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnderecoContext extends ParserRuleContext {
		public EnderecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endereco; }
	}

	public final EnderecoContext endereco() throws RecognitionException {
		EnderecoContext _localctx = new EnderecoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_endereco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__51);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode DIFERENTE() { return getToken(LAGrammarParser.DIFERENTE, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843026360008704L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			parametro();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(438);
				match(T__3);
				setState(439);
				parametro();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(445);
				match(T__52);
				}
			}

			setState(448);
			identificador();
			setState(449);
			match(DOISPONTOS);
			setState(450);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimentoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__53);
			setState(453);
			match(IDENT);
			setState(454);
			match(T__7);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52 || _la==IDENT) {
				{
				setState(455);
				parametros();
				}
			}

			setState(458);
			match(T__8);
			setState(459);
			bloco();
			setState(460);
			match(T__54);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__55);
			setState(463);
			match(IDENT);
			setState(464);
			match(T__7);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52 || _la==IDENT) {
				{
				setState(465);
				parametros();
				}
			}

			setState(468);
			match(T__8);
			setState(469);
			match(DOISPONTOS);
			setState(470);
			tipo();
			setState(471);
			bloco();
			setState(472);
			match(T__56);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__57);
			setState(475);
			corpo();
			setState(476);
			match(T__58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001E\u01df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001g\b\u0001\n\u0001\f\u0001"+
		"j\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002o\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004x\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005~\b\u0005\n\u0005\f\u0005\u0081\t\u0005\u0001\u0005"+
		"\u0003\u0005\u0084\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008d\b\u0007\n\u0007"+
		"\f\u0007\u0090\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u0098\b\b\n\b\f\b\u009b\t\b\u0001\t\u0001\t\u0005\t\u009f\b\t"+
		"\n\t\f\t\u00a2\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ae\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u00ba\b\f\n\f\f\f\u00bd\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005"+
		"\r\u00c3\b\r\n\r\f\r\u00c6\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00cc\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00d4\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00df\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00e6\b\u0012\n\u0012\f\u0012\u00e9"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00f1\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0103\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u011c\b\u0017\n\u0017\f\u0017\u011f\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u012e\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0141\b\u0017\n\u0017\f\u0017\u0144"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0158\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u015e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0169\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0171\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u017b\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0004\u001f\u0183\b\u001f\u000b\u001f\f\u001f\u0184"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0004\"\u018f"+
		"\b\"\u000b\"\f\"\u0190\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0005$\u019a\b$\n$\f$\u019d\t$\u0001$\u0003$\u01a0\b$\u0001%\u0001%"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0005+\u01b9\b+\n+\f+\u01bc\t+\u0001,\u0003,\u01bf\b,\u0001,"+
		"\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u01c9\b-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0003.\u01d3\b.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0000\u0001.0\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^\u0000"+
		"\b\u0001\u0000\u0005\u0006\u0001\u0000\u000b\u000b\u0001\u0000\u0019\u001a"+
		"\u0001\u0000\u001b\u001c\u0001\u0000\u0019\u001c\u0002\u0000\u0019!=="+
		"\u0002\u0000\u001d!==\u0001\u000013\u0200\u0000`\u0001\u0000\u0000\u0000"+
		"\u0002h\u0001\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000\u0006p"+
		"\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000"+
		"\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000"+
		"\u0010\u0099\u0001\u0000\u0000\u0000\u0012\u009c\u0001\u0000\u0000\u0000"+
		"\u0014\u00ad\u0001\u0000\u0000\u0000\u0016\u00af\u0001\u0000\u0000\u0000"+
		"\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u00c0\u0001\u0000\u0000\u0000"+
		"\u001c\u00cb\u0001\u0000\u0000\u0000\u001e\u00d0\u0001\u0000\u0000\u0000"+
		" \u00d7\u0001\u0000\u0000\u0000\"\u00db\u0001\u0000\u0000\u0000$\u00e2"+
		"\u0001\u0000\u0000\u0000&\u00ea\u0001\u0000\u0000\u0000(\u00f4\u0001\u0000"+
		"\u0000\u0000*\u00fa\u0001\u0000\u0000\u0000,\u0108\u0001\u0000\u0000\u0000"+
		".\u012d\u0001\u0000\u0000\u00000\u0145\u0001\u0000\u0000\u00002\u0157"+
		"\u0001\u0000\u0000\u00004\u015d\u0001\u0000\u0000\u00006\u0168\u0001\u0000"+
		"\u0000\u00008\u0170\u0001\u0000\u0000\u0000:\u017a\u0001\u0000\u0000\u0000"+
		"<\u017c\u0001\u0000\u0000\u0000>\u0180\u0001\u0000\u0000\u0000@\u0186"+
		"\u0001\u0000\u0000\u0000B\u018a\u0001\u0000\u0000\u0000D\u018e\u0001\u0000"+
		"\u0000\u0000F\u0192\u0001\u0000\u0000\u0000H\u0196\u0001\u0000\u0000\u0000"+
		"J\u01a1\u0001\u0000\u0000\u0000L\u01a8\u0001\u0000\u0000\u0000N\u01ac"+
		"\u0001\u0000\u0000\u0000P\u01af\u0001\u0000\u0000\u0000R\u01b1\u0001\u0000"+
		"\u0000\u0000T\u01b3\u0001\u0000\u0000\u0000V\u01b5\u0001\u0000\u0000\u0000"+
		"X\u01be\u0001\u0000\u0000\u0000Z\u01c4\u0001\u0000\u0000\u0000\\\u01ce"+
		"\u0001\u0000\u0000\u0000^\u01da\u0001\u0000\u0000\u0000`a\u0003\u0002"+
		"\u0001\u0000ab\u0005\u0001\u0000\u0000bc\u0003\u0010\b\u0000cd\u0005\u0002"+
		"\u0000\u0000d\u0001\u0001\u0000\u0000\u0000eg\u0003\u0004\u0002\u0000"+
		"fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000i\u0003\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000ko\u0003\b\u0004\u0000lo\u0003\u0006\u0003\u0000mo\u0003"+
		"J%\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000"+
		"\u0000\u0000o\u0005\u0001\u0000\u0000\u0000pq\u0005\u0003\u0000\u0000"+
		"qr\u0003\f\u0006\u0000r\u0007\u0001\u0000\u0000\u0000sx\u0003\n\u0005"+
		"\u0000tx\u0003Z-\u0000ux\u0003\\.\u0000vx\u0003B!\u0000ws\u0001\u0000"+
		"\u0000\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001"+
		"\u0000\u0000\u0000x\t\u0001\u0000\u0000\u0000yz\u0005\u0003\u0000\u0000"+
		"z\u007f\u0003\f\u0006\u0000{|\u0005\u0004\u0000\u0000|~\u0003\f\u0006"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0007\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u000b\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0003\u000e\u0007\u0000\u0086\u0087\u0005<\u0000\u0000\u0087\u0088\u0003"+
		"6\u001b\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u008e\u0003H$\u0000"+
		"\u008a\u008b\u0005\u0004\u0000\u0000\u008b\u008d\u0003H$\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u000f"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0098"+
		"\u0003\u0006\u0003\u0000\u0092\u0098\u0003\u0012\t\u0000\u0093\u0098\u0003"+
		"\\.\u0000\u0094\u0098\u0003Z-\u0000\u0095\u0098\u0003<\u001e\u0000\u0096"+
		"\u0098\u0003B!\u0000\u0097\u0091\u0001\u0000\u0000\u0000\u0097\u0092\u0001"+
		"\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0011\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u00a0\u0003"+
		"\u0014\n\u0000\u009d\u009f\u0003\u0014\n\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u0013\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00ae\u0003\u0018"+
		"\f\u0000\u00a4\u00ae\u0003\u0016\u000b\u0000\u00a5\u00ae\u0003*\u0015"+
		"\u0000\u00a6\u00ae\u0003\u001c\u000e\u0000\u00a7\u00ae\u0003 \u0010\u0000"+
		"\u00a8\u00ae\u0003\"\u0011\u0000\u00a9\u00ae\u0003\u001e\u000f\u0000\u00aa"+
		"\u00ae\u0003&\u0013\u0000\u00ab\u00ae\u0003(\u0014\u0000\u00ac\u00ae\u0003"+
		",\u0016\u0000\u00ad\u00a3\u0001\u0000\u0000\u0000\u00ad\u00a4\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ad\u00a6\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u0015\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0007"+
		"\u0000\u0000\u00b0\u00b1\u0005\b\u0000\u0000\u00b1\u00b2\u0003\u000e\u0007"+
		"\u0000\u00b2\u00b3\u0005\t\u0000\u0000\u00b3\u0017\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0005\b\u0000\u0000\u00b6"+
		"\u00bb\u0003.\u0017\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000\u00b8\u00ba"+
		"\u0003.\u0017\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\t\u0000\u0000\u00bf\u0019\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c4\u0005\u000b\u0000\u0000\u00c1\u00c3\b\u0001\u0000"+
		"\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\u000b\u0000\u0000\u00c8\u001b\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cc\u0003H$\u0000\u00ca\u00cc\u0003N\'\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\f\u0000\u0000\u00ce\u00cf\u0003"+
		".\u0017\u0000\u00cf\u001d\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003H$"+
		"\u0000\u00d1\u00d3\u0005\b\u0000\u0000\u00d2\u00d4\u0003$\u0012\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6"+
		"\u001f\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003H$\u0000\u00d8\u00d9\u0005"+
		"<\u0000\u0000\u00d9\u00da\u0003<\u001e\u0000\u00da!\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0003H$\u0000\u00dc\u00de\u0005\b\u0000\u0000\u00dd"+
		"\u00df\u0003$\u0012\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0005\t\u0000\u0000\u00e1#\u0001\u0000\u0000\u0000\u00e2\u00e7\u0003"+
		".\u0017\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000\u00e4\u00e6\u0003.\u0017"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8%\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\r\u0000\u0000\u00eb\u00ec\u0003.\u0017\u0000\u00ec"+
		"\u00ed\u0005\u000e\u0000\u0000\u00ed\u00f0\u0003\u0010\b\u0000\u00ee\u00ef"+
		"\u0005\u000f\u0000\u0000\u00ef\u00f1\u0003\u0010\b\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005\u0010\u0000\u0000\u00f3\'\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005\u0011\u0000\u0000\u00f5\u00f6\u0003.\u0017"+
		"\u0000\u00f6\u00f7\u0005\u0012\u0000\u0000\u00f7\u00f8\u0003\u0010\b\u0000"+
		"\u00f8\u00f9\u0005\u0013\u0000\u0000\u00f9)\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005\u0014\u0000\u0000\u00fb\u00fc\u0003H$\u0000\u00fc\u00fd\u0005"+
		"\f\u0000\u0000\u00fd\u00fe\u0003.\u0017\u0000\u00fe\u00ff\u0005\u0015"+
		"\u0000\u0000\u00ff\u0102\u0003.\u0017\u0000\u0100\u0101\u0005\u0016\u0000"+
		"\u0000\u0101\u0103\u0003.\u0017\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005\u0012\u0000\u0000\u0105\u0106\u0003\u0010\b\u0000\u0106"+
		"\u0107\u0005\u0017\u0000\u0000\u0107+\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005\u0018\u0000\u0000\u0109\u010a\u0003.\u0017\u0000\u010a-\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0006\u0017\uffff\uffff\u0000\u010c\u010d\u0003"+
		"2\u0019\u0000\u010d\u010e\u00030\u0018\u0000\u010e\u010f\u0003.\u0017"+
		"\f\u010f\u012e\u0001\u0000\u0000\u0000\u0110\u0111\u00032\u0019\u0000"+
		"\u0111\u0112\u0007\u0002\u0000\u0000\u0112\u0113\u00032\u0019\u0000\u0113"+
		"\u012e\u0001\u0000\u0000\u0000\u0114\u0115\u00032\u0019\u0000\u0115\u0116"+
		"\u0007\u0003\u0000\u0000\u0116\u0117\u00032\u0019\u0000\u0117\u012e\u0001"+
		"\u0000\u0000\u0000\u0118\u011d\u00032\u0019\u0000\u0119\u011a\u0007\u0004"+
		"\u0000\u0000\u011a\u011c\u00032\u0019\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u012e\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u00032\u0019\u0000"+
		"\u0121\u0122\u00030\u0018\u0000\u0122\u0123\u00032\u0019\u0000\u0123\u012e"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u00032\u0019\u0000\u0125\u0126\u0003"+
		"P(\u0000\u0126\u0127\u00032\u0019\u0000\u0127\u012e\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0005\b\u0000\u0000\u0129\u012a\u0003.\u0017\u0000"+
		"\u012a\u012b\u0005\t\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c"+
		"\u012e\u00032\u0019\u0000\u012d\u010b\u0001\u0000\u0000\u0000\u012d\u0110"+
		"\u0001\u0000\u0000\u0000\u012d\u0114\u0001\u0000\u0000\u0000\u012d\u0118"+
		"\u0001\u0000\u0000\u0000\u012d\u0120\u0001\u0000\u0000\u0000\u012d\u0124"+
		"\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000\u0000\u012d\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u0142\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\n\u000b\u0000\u0000\u0130\u0131\u0003P(\u0000\u0131\u0132\u0003.\u0017"+
		"\u0000\u0132\u0133\u0003P(\u0000\u0133\u0134\u0003.\u0017\f\u0134\u0141"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\n\n\u0000\u0000\u0136\u0137\u0003"+
		"P(\u0000\u0137\u0138\u0003.\u0017\u000b\u0138\u0141\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\n\t\u0000\u0000\u013a\u013b\u00030\u0018\u0000\u013b"+
		"\u013c\u0003.\u0017\n\u013c\u0141\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\n\u0002\u0000\u0000\u013e\u013f\u0007\u0005\u0000\u0000\u013f\u0141\u0003"+
		".\u0017\u0003\u0140\u012f\u0001\u0000\u0000\u0000\u0140\u0135\u0001\u0000"+
		"\u0000\u0000\u0140\u0139\u0001\u0000\u0000\u0000\u0140\u013d\u0001\u0000"+
		"\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143/\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0007\u0006\u0000"+
		"\u0000\u01461\u0001\u0000\u0000\u0000\u0147\u0158\u00038\u001c\u0000\u0148"+
		"\u0158\u0003\u001a\r\u0000\u0149\u0158\u00034\u001a\u0000\u014a\u0158"+
		"\u0005A\u0000\u0000\u014b\u0158\u0005B\u0000\u0000\u014c\u0158\u0005>"+
		"\u0000\u0000\u014d\u0158\u0003H$\u0000\u014e\u0158\u0003N\'\u0000\u014f"+
		"\u0150\u0005\u001a\u0000\u0000\u0150\u0158\u0003H$\u0000\u0151\u0158\u0003"+
		"R)\u0000\u0152\u0158\u0003\u001e\u000f\u0000\u0153\u0158\u0003 \u0010"+
		"\u0000\u0154\u0158\u0003\"\u0011\u0000\u0155\u0158\u0005\"\u0000\u0000"+
		"\u0156\u0158\u0005#\u0000\u0000\u0157\u0147\u0001\u0000\u0000\u0000\u0157"+
		"\u0148\u0001\u0000\u0000\u0000\u0157\u0149\u0001\u0000\u0000\u0000\u0157"+
		"\u014a\u0001\u0000\u0000\u0000\u0157\u014b\u0001\u0000\u0000\u0000\u0157"+
		"\u014c\u0001\u0000\u0000\u0000\u0157\u014d\u0001\u0000\u0000\u0000\u0157"+
		"\u014e\u0001\u0000\u0000\u0000\u0157\u014f\u0001\u0000\u0000\u0000\u0157"+
		"\u0151\u0001\u0000\u0000\u0000\u0157\u0152\u0001\u0000\u0000\u0000\u0157"+
		"\u0153\u0001\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158"+
		"3\u0001\u0000\u0000\u0000\u0159\u015e\u0005?\u0000\u0000\u015a\u015e\u0005"+
		"@\u0000\u0000\u015b\u015e\u0003R)\u0000\u015c\u015e\u0005>\u0000\u0000"+
		"\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e5\u0001\u0000\u0000\u0000\u015f\u0169\u0005$\u0000\u0000\u0160\u0169"+
		"\u0005%\u0000\u0000\u0161\u0169\u0005&\u0000\u0000\u0162\u0169\u0005\'"+
		"\u0000\u0000\u0163\u0164\u0005(\u0000\u0000\u0164\u0169\u00036\u001b\u0000"+
		"\u0165\u0169\u0005)\u0000\u0000\u0166\u0169\u0005*\u0000\u0000\u0167\u0169"+
		"\u0005>\u0000\u0000\u0168\u015f\u0001\u0000\u0000\u0000\u0168\u0160\u0001"+
		"\u0000\u0000\u0000\u0168\u0161\u0001\u0000\u0000\u0000\u0168\u0162\u0001"+
		"\u0000\u0000\u0000\u0168\u0163\u0001\u0000\u0000\u0000\u0168\u0165\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167\u0001"+
		"\u0000\u0000\u0000\u01697\u0001\u0000\u0000\u0000\u016a\u0171\u0003H$"+
		"\u0000\u016b\u016c\u0003H$\u0000\u016c\u016d\u0005\b\u0000\u0000\u016d"+
		"\u016e\u0003.\u0017\u0000\u016e\u016f\u0005\t\u0000\u0000\u016f\u0171"+
		"\u0001\u0000\u0000\u0000\u0170\u016a\u0001\u0000\u0000\u0000\u0170\u016b"+
		"\u0001\u0000\u0000\u0000\u01719\u0001\u0000\u0000\u0000\u0172\u017b\u0005"+
		">\u0000\u0000\u0173\u017b\u0005A\u0000\u0000\u0174\u017b\u0005B\u0000"+
		"\u0000\u0175\u017b\u0005>\u0000\u0000\u0176\u0177\u0005\b\u0000\u0000"+
		"\u0177\u0178\u0003.\u0017\u0000\u0178\u0179\u0005\t\u0000\u0000\u0179"+
		"\u017b\u0001\u0000\u0000\u0000\u017a\u0172\u0001\u0000\u0000\u0000\u017a"+
		"\u0173\u0001\u0000\u0000\u0000\u017a\u0174\u0001\u0000\u0000\u0000\u017a"+
		"\u0175\u0001\u0000\u0000\u0000\u017a\u0176\u0001\u0000\u0000\u0000\u017b"+
		";\u0001\u0000\u0000\u0000\u017c\u017d\u0005)\u0000\u0000\u017d\u017e\u0003"+
		">\u001f\u0000\u017e\u017f\u0005+\u0000\u0000\u017f=\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0003@ \u0000\u0181\u0183\u0003@ \u0000\u0182\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185?\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0003\u000e\u0007\u0000\u0187\u0188\u0005"+
		"<\u0000\u0000\u0188\u0189\u00036\u001b\u0000\u0189A\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005,\u0000\u0000\u018b\u018c\u0003D\"\u0000\u018c"+
		"C\u0001\u0000\u0000\u0000\u018d\u018f\u0003F#\u0000\u018e\u018d\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191E\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0005>\u0000\u0000\u0193\u0194\u0005<\u0000\u0000"+
		"\u0194\u0195\u0003<\u001e\u0000\u0195G\u0001\u0000\u0000\u0000\u0196\u019b"+
		"\u0005>\u0000\u0000\u0197\u0198\u0005-\u0000\u0000\u0198\u019a\u0005>"+
		"\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000"+
		"\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019e\u01a0\u0003L&\u0000\u019f\u019e\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0I\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0005.\u0000\u0000\u01a2\u01a3\u0005>\u0000\u0000\u01a3\u01a4\u0005"+
		"<\u0000\u0000\u01a4\u01a5\u00036\u001b\u0000\u01a5\u01a6\u0005!\u0000"+
		"\u0000\u01a6\u01a7\u0003.\u0017\u0000\u01a7K\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005/\u0000\u0000\u01a9\u01aa\u0003.\u0017\u0000\u01aa\u01ab\u0005"+
		"0\u0000\u0000\u01abM\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005(\u0000"+
		"\u0000\u01ad\u01ae\u00036\u001b\u0000\u01aeO\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0007\u0007\u0000\u0000\u01b0Q\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u00054\u0000\u0000\u01b2S\u0001\u0000\u0000\u0000\u01b3\u01b4\u0007\u0005"+
		"\u0000\u0000\u01b4U\u0001\u0000\u0000\u0000\u01b5\u01ba\u0003X,\u0000"+
		"\u01b6\u01b7\u0005\u0004\u0000\u0000\u01b7\u01b9\u0003X,\u0000\u01b8\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bbW\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bf\u0005"+
		"5\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003H$\u0000"+
		"\u01c1\u01c2\u0005<\u0000\u0000\u01c2\u01c3\u00036\u001b\u0000\u01c3Y"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c5\u00056\u0000\u0000\u01c5\u01c6\u0005"+
		">\u0000\u0000\u01c6\u01c8\u0005\b\u0000\u0000\u01c7\u01c9\u0003V+\u0000"+
		"\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\t\u0000\u0000\u01cb"+
		"\u01cc\u0003^/\u0000\u01cc\u01cd\u00057\u0000\u0000\u01cd[\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u00058\u0000\u0000\u01cf\u01d0\u0005>\u0000\u0000"+
		"\u01d0\u01d2\u0005\b\u0000\u0000\u01d1\u01d3\u0003V+\u0000\u01d2\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\t\u0000\u0000\u01d5\u01d6\u0005"+
		"<\u0000\u0000\u01d6\u01d7\u00036\u001b\u0000\u01d7\u01d8\u0003^/\u0000"+
		"\u01d8\u01d9\u00059\u0000\u0000\u01d9]\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0005:\u0000\u0000\u01db\u01dc\u0003\u0010\b\u0000\u01dc\u01dd\u0005"+
		";\u0000\u0000\u01dd_\u0001\u0000\u0000\u0000#hnw\u007f\u0083\u008e\u0097"+
		"\u0099\u00a0\u00ad\u00bb\u00c4\u00cb\u00d3\u00de\u00e7\u00f0\u0102\u011d"+
		"\u012d\u0140\u0142\u0157\u015d\u0168\u0170\u017a\u0184\u0190\u019b\u019f"+
		"\u01ba\u01be\u01c8\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}