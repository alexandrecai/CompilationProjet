// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class julParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, WS=16, INT=17, 
		Op=18, Const=19, ID=20;
	public static final int
		RULE_type = 0, RULE_exp = 1, RULE_function = 2, RULE_param = 3, RULE_pv = 4, 
		RULE_inst = 5, RULE_program = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "exp", "function", "param", "pv", "inst", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'int'", "'('", "')'", "'read()'", "','", "';'", "'return'", 
			"'='", "'print'", "'if'", "'else'", "'while'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WS", "INT", "Op", "Const", "ID"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public julParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpUnContext extends ExpContext {
		public TerminalNode Op() { return getToken(julParser.Op, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpUnContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpUn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpUn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpUn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpBinContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Op() { return getToken(julParser.Op, 0); }
		public ExpBinContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpBin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpConstContext extends ExpContext {
		public TerminalNode Const() { return getToken(julParser.Const, 0); }
		public ExpConstContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIntContext extends ExpContext {
		public TerminalNode INT() { return getToken(julParser.INT, 0); }
		public ExpIntContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpParContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpCallContext extends ExpContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpCallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIdContext extends ExpContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public ExpIdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpReadContext extends ExpContext {
		public ExpReadContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ExpIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new ExpIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExpConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(Const);
				}
				break;
			case 4:
				{
				_localctx = new ExpUnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(Op);
				setState(21);
				exp(4);
				}
				break;
			case 5:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(T__2);
				setState(23);
				exp(0);
				setState(24);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new ExpReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new ExpCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(ID);
				setState(28);
				match(T__2);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1966120L) != 0) {
					{
					setState(29);
					exp(0);
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(30);
						match(T__5);
						setState(31);
						exp(0);
						}
						}
						setState(36);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(39);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpBinContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(42);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(43);
					match(Op);
					setState(44);
					exp(6);
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			type();
			setState(51);
			match(ID);
			setState(52);
			match(T__2);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(53);
				param();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(54);
					match(T__5);
					setState(55);
					param();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(63);
			match(T__3);
			setState(64);
			inst();
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
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			type();
			setState(67);
			match(ID);
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
	public static class PvContext extends ParserRuleContext {
		public PvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterPv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitPv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitPv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PvContext pv() throws RecognitionException {
		PvContext _localctx = new PvContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__6);
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
	public static class InstContext extends ParserRuleContext {
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
	 
		public InstContext() { }
		public void copyFrom(InstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstReturnContext extends InstContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PvContext pv() {
			return getRuleContext(PvContext.class,0);
		}
		public InstReturnContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstIfContext extends InstContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public InstIfContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstAffContext extends InstContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PvContext pv() {
			return getRuleContext(PvContext.class,0);
		}
		public InstAffContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstAff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstAff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstAff(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstWhileContext extends InstContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public InstWhileContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstListContext extends InstContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public InstListContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstDeclContext extends InstContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public PvContext pv() {
			return getRuleContext(PvContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InstDeclContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstPrintContext extends InstContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PvContext pv() {
			return getRuleContext(PvContext.class,0);
		}
		public InstPrintContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inst);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new InstReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__7);
				setState(72);
				exp(0);
				setState(73);
				pv();
				}
				break;
			case T__0:
			case T__1:
				_localctx = new InstDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				type();
				setState(76);
				match(ID);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(77);
					match(T__8);
					setState(78);
					exp(0);
					}
				}

				setState(81);
				pv();
				}
				break;
			case ID:
				_localctx = new InstAffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(ID);
				setState(84);
				match(T__8);
				setState(85);
				exp(0);
				setState(86);
				pv();
				}
				break;
			case T__9:
				_localctx = new InstPrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(T__9);
				setState(89);
				match(T__2);
				setState(90);
				exp(0);
				setState(91);
				match(T__3);
				setState(92);
				pv();
				}
				break;
			case T__10:
				_localctx = new InstIfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(T__10);
				setState(95);
				match(T__2);
				setState(96);
				exp(0);
				setState(97);
				match(T__3);
				setState(98);
				inst();
				setState(99);
				match(T__11);
				setState(100);
				inst();
				}
				break;
			case T__12:
				_localctx = new InstWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(T__12);
				setState(103);
				match(T__2);
				setState(104);
				exp(0);
				setState(105);
				match(T__3);
				setState(106);
				inst();
				}
				break;
			case T__13:
				_localctx = new InstListContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				match(T__13);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1076486L) != 0) {
					{
					{
					setState(109);
					inst();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__14);
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
	public static class ProgramContext extends ParserRuleContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(118);
					inst();
					}
					break;
				case 2:
					{
					setState(119);
					function();
					}
					break;
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 1076486L) != 0 );
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
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014}\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001"+
		"\f\u0001$\t\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0003\u0001)\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u0001"+
		"1\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00029\b\u0002\n\u0002\f\u0002<\t\u0002\u0003\u0002"+
		">\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"P\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005\u0001\u0005\u0003\u0005"+
		"u\b\u0005\u0001\u0006\u0001\u0006\u0004\u0006y\b\u0006\u000b\u0006\f\u0006"+
		"z\u0001\u0006\u0000\u0001\u0002\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000"+
		"\u0001\u0001\u0000\u0001\u0002\u008a\u0000\u000e\u0001\u0000\u0000\u0000"+
		"\u0002(\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006B"+
		"\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000"+
		"\u0000\fx\u0001\u0000\u0000\u0000\u000e\u000f\u0007\u0000\u0000\u0000"+
		"\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0006\u0001\uffff\uffff"+
		"\u0000\u0011)\u0005\u0011\u0000\u0000\u0012)\u0005\u0014\u0000\u0000\u0013"+
		")\u0005\u0013\u0000\u0000\u0014\u0015\u0005\u0012\u0000\u0000\u0015)\u0003"+
		"\u0002\u0001\u0004\u0016\u0017\u0005\u0003\u0000\u0000\u0017\u0018\u0003"+
		"\u0002\u0001\u0000\u0018\u0019\u0005\u0004\u0000\u0000\u0019)\u0001\u0000"+
		"\u0000\u0000\u001a)\u0005\u0005\u0000\u0000\u001b\u001c\u0005\u0014\u0000"+
		"\u0000\u001c%\u0005\u0003\u0000\u0000\u001d\"\u0003\u0002\u0001\u0000"+
		"\u001e\u001f\u0005\u0006\u0000\u0000\u001f!\u0003\u0002\u0001\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000%\u001d\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\')\u0005\u0004\u0000\u0000(\u0010\u0001\u0000"+
		"\u0000\u0000(\u0012\u0001\u0000\u0000\u0000(\u0013\u0001\u0000\u0000\u0000"+
		"(\u0014\u0001\u0000\u0000\u0000(\u0016\u0001\u0000\u0000\u0000(\u001a"+
		"\u0001\u0000\u0000\u0000(\u001b\u0001\u0000\u0000\u0000)/\u0001\u0000"+
		"\u0000\u0000*+\n\u0005\u0000\u0000+,\u0005\u0012\u0000\u0000,.\u0003\u0002"+
		"\u0001\u0006-*\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000023\u0003\u0000\u0000\u000034\u0005\u0014"+
		"\u0000\u00004=\u0005\u0003\u0000\u00005:\u0003\u0006\u0003\u000067\u0005"+
		"\u0006\u0000\u000079\u0003\u0006\u0003\u000086\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=5\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0004\u0000\u0000@A\u0003\n\u0005\u0000A\u0005\u0001\u0000\u0000\u0000"+
		"BC\u0003\u0000\u0000\u0000CD\u0005\u0014\u0000\u0000D\u0007\u0001\u0000"+
		"\u0000\u0000EF\u0005\u0007\u0000\u0000F\t\u0001\u0000\u0000\u0000GH\u0005"+
		"\b\u0000\u0000HI\u0003\u0002\u0001\u0000IJ\u0003\b\u0004\u0000Ju\u0001"+
		"\u0000\u0000\u0000KL\u0003\u0000\u0000\u0000LO\u0005\u0014\u0000\u0000"+
		"MN\u0005\t\u0000\u0000NP\u0003\u0002\u0001\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0003\b\u0004\u0000"+
		"Ru\u0001\u0000\u0000\u0000ST\u0005\u0014\u0000\u0000TU\u0005\t\u0000\u0000"+
		"UV\u0003\u0002\u0001\u0000VW\u0003\b\u0004\u0000Wu\u0001\u0000\u0000\u0000"+
		"XY\u0005\n\u0000\u0000YZ\u0005\u0003\u0000\u0000Z[\u0003\u0002\u0001\u0000"+
		"[\\\u0005\u0004\u0000\u0000\\]\u0003\b\u0004\u0000]u\u0001\u0000\u0000"+
		"\u0000^_\u0005\u000b\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0003\u0002"+
		"\u0001\u0000ab\u0005\u0004\u0000\u0000bc\u0003\n\u0005\u0000cd\u0005\f"+
		"\u0000\u0000de\u0003\n\u0005\u0000eu\u0001\u0000\u0000\u0000fg\u0005\r"+
		"\u0000\u0000gh\u0005\u0003\u0000\u0000hi\u0003\u0002\u0001\u0000ij\u0005"+
		"\u0004\u0000\u0000jk\u0003\n\u0005\u0000ku\u0001\u0000\u0000\u0000lp\u0005"+
		"\u000e\u0000\u0000mo\u0003\n\u0005\u0000nm\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0005\u000f\u0000"+
		"\u0000tG\u0001\u0000\u0000\u0000tK\u0001\u0000\u0000\u0000tS\u0001\u0000"+
		"\u0000\u0000tX\u0001\u0000\u0000\u0000t^\u0001\u0000\u0000\u0000tf\u0001"+
		"\u0000\u0000\u0000tl\u0001\u0000\u0000\u0000u\u000b\u0001\u0000\u0000"+
		"\u0000vy\u0003\n\u0005\u0000wy\u0003\u0004\u0002\u0000xv\u0001\u0000\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\r\u0001\u0000\u0000\u0000\u000b"+
		"\"%(/:=Optxz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}