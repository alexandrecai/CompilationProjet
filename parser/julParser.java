// Generated from java-escape by ANTLR 4.11.1
package parser;
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, WS=24, INT=25, 
		Op=26, Const=27, ID=28;
	public static final int
		RULE_type = 0, RULE_exp = 1, RULE_function = 2, RULE_param = 3, RULE_calcu = 4, 
		RULE_pv = 5, RULE_inst = 6, RULE_program = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "exp", "function", "param", "calcu", "pv", "inst", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'int'", "'tab'", "'('", "')'", "'read()'", "','", "'['", 
			"']'", "'++'", "'--'", "'='", "';'", "'return'", "'] = '", "'print'", 
			"'if'", "'else'", "'while'", "'for'", "'{'", "'}'", "'int[]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS", "INT", "Op", "Const", "ID"
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
			setState(16);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) ) {
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
	public static class ExpTabValueContext extends ExpContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public TerminalNode INT() { return getToken(julParser.INT, 0); }
		public ExpTabValueContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterExpTabValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitExpTabValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitExpTabValue(this);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ExpIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new ExpIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExpConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(Const);
				}
				break;
			case 4:
				{
				_localctx = new ExpUnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(Op);
				setState(23);
				exp(5);
				}
				break;
			case 5:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__3);
				setState(25);
				exp(0);
				setState(26);
				match(T__4);
				}
				break;
			case 6:
				{
				_localctx = new ExpReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(T__5);
				}
				break;
			case 7:
				{
				_localctx = new ExpCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(ID);
				setState(30);
				match(T__3);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 503316560L) != 0) {
					{
					setState(31);
					exp(0);
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(32);
						match(T__6);
						setState(33);
						exp(0);
						}
						}
						setState(38);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(41);
				match(T__4);
				}
				break;
			case 8:
				{
				_localctx = new ExpTabValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(ID);
				setState(43);
				match(T__7);
				setState(44);
				match(INT);
				setState(45);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
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
					setState(48);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(49);
					match(Op);
					setState(50);
					exp(7);
					}
					} 
				}
				setState(55);
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
			setState(56);
			type();
			setState(57);
			match(ID);
			setState(58);
			match(T__3);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) {
				{
				setState(59);
				param();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(60);
					match(T__6);
					setState(61);
					param();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(69);
			match(T__4);
			setState(70);
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
			setState(72);
			type();
			setState(73);
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
	public static class CalcuContext extends ParserRuleContext {
		public CalcuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcu; }
	 
		public CalcuContext() { }
		public void copyFrom(CalcuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcuAffContext extends CalcuContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CalcuAffContext(CalcuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterCalcuAff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitCalcuAff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitCalcuAff(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcuIncrContext extends CalcuContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public CalcuIncrContext(CalcuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterCalcuIncr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitCalcuIncr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitCalcuIncr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcuDecrContext extends CalcuContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public CalcuDecrContext(CalcuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterCalcuDecr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitCalcuDecr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitCalcuDecr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcuContext calcu() throws RecognitionException {
		CalcuContext _localctx = new CalcuContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_calcu);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new CalcuIncrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ID);
				setState(76);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new CalcuDecrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(ID);
				setState(78);
				match(T__10);
				}
				break;
			case 3:
				_localctx = new CalcuAffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(ID);
				setState(80);
				match(T__11);
				setState(81);
				exp(0);
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
		enterRule(_localctx, 10, RULE_pv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__12);
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
	public static class InstrAffTabContext extends InstContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public TerminalNode INT() { return getToken(julParser.INT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PvContext pv() {
			return getRuleContext(PvContext.class,0);
		}
		public InstrAffTabContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstrAffTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstrAffTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstrAffTab(this);
			else return visitor.visitChildren(this);
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
	public static class InstCalcuContext extends InstContext {
		public CalcuContext calcu() {
			return getRuleContext(CalcuContext.class,0);
		}
		public PvContext pv() {
			return getRuleContext(PvContext.class,0);
		}
		public InstCalcuContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstCalcu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstCalcu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstCalcu(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class InstDeclTabContext extends InstContext {
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public PvContext pv() {
			return getRuleContext(PvContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(julParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(julParser.INT, i);
		}
		public InstDeclTabContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstDeclTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstDeclTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstDeclTab(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstForContext extends InstContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(julParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CalcuContext calcu() {
			return getRuleContext(CalcuContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public InstForContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).enterInstFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof julListener ) ((julListener)listener).exitInstFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof julVisitor ) return ((julVisitor<? extends T>)visitor).visitInstFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inst);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new InstReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__13);
				setState(87);
				exp(0);
				setState(88);
				pv();
				}
				break;
			case 2:
				_localctx = new InstrAffTabContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				setState(91);
				match(T__7);
				setState(92);
				match(INT);
				setState(93);
				match(T__14);
				setState(94);
				exp(0);
				setState(95);
				pv();
				}
				break;
			case 3:
				_localctx = new InstCalcuContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				calcu();
				setState(98);
				pv();
				}
				break;
			case 4:
				_localctx = new InstDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				type();
				setState(101);
				match(ID);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(102);
					match(T__11);
					setState(103);
					exp(0);
					}
				}

				setState(106);
				pv();
				}
				break;
			case 5:
				_localctx = new InstPrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(T__15);
				setState(109);
				match(T__3);
				setState(110);
				exp(0);
				setState(111);
				match(T__4);
				setState(112);
				pv();
				}
				break;
			case 6:
				_localctx = new InstIfContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(T__16);
				setState(115);
				match(T__3);
				setState(116);
				exp(0);
				setState(117);
				match(T__4);
				setState(118);
				inst();
				setState(119);
				match(T__17);
				setState(120);
				inst();
				}
				break;
			case 7:
				_localctx = new InstWhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(T__18);
				setState(123);
				match(T__3);
				setState(124);
				exp(0);
				setState(125);
				match(T__4);
				setState(126);
				inst();
				}
				break;
			case 8:
				_localctx = new InstForContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				match(T__19);
				setState(129);
				match(T__3);
				setState(130);
				type();
				setState(131);
				match(ID);
				setState(132);
				match(T__11);
				setState(133);
				exp(0);
				setState(134);
				match(T__12);
				setState(135);
				exp(0);
				setState(136);
				match(T__12);
				setState(137);
				calcu();
				setState(138);
				match(T__4);
				setState(139);
				inst();
				}
				break;
			case 9:
				_localctx = new InstListContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				match(T__20);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 280707086L) != 0) {
					{
					{
					setState(142);
					inst();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__21);
				}
				break;
			case 10:
				_localctx = new InstDeclTabContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				match(T__22);
				setState(150);
				match(ID);
				setState(151);
				match(T__11);
				setState(152);
				match(T__7);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(153);
					match(INT);
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(154);
						match(T__6);
						setState(155);
						match(INT);
						}
						}
						setState(160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(163);
				match(T__8);
				setState(164);
				pv();
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
		enterRule(_localctx, 14, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(167);
					inst();
					}
					break;
				case 2:
					{
					setState(168);
					function();
					}
					break;
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 280707086L) != 0 );
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
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001#\b\u0001\n\u0001\f\u0001&\t\u0001\u0003\u0001(\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00014\b\u0001\n\u0001"+
		"\f\u00017\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0003"+
		"\u0002D\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006i\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0090\b\u0006\n"+
		"\u0006\f\u0006\u0093\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009d"+
		"\b\u0006\n\u0006\f\u0006\u00a0\t\u0006\u0003\u0006\u00a2\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00a6\b\u0006\u0001\u0007\u0001\u0007\u0004"+
		"\u0007\u00aa\b\u0007\u000b\u0007\f\u0007\u00ab\u0001\u0007\u0000\u0001"+
		"\u0002\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\u0001"+
		"\u0003\u00c2\u0000\u0010\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000"+
		"\u0000\u00048\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\b"+
		"R\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\f\u00a5\u0001\u0000"+
		"\u0000\u0000\u000e\u00a9\u0001\u0000\u0000\u0000\u0010\u0011\u0007\u0000"+
		"\u0000\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0006\u0001"+
		"\uffff\uffff\u0000\u0013/\u0005\u0019\u0000\u0000\u0014/\u0005\u001c\u0000"+
		"\u0000\u0015/\u0005\u001b\u0000\u0000\u0016\u0017\u0005\u001a\u0000\u0000"+
		"\u0017/\u0003\u0002\u0001\u0005\u0018\u0019\u0005\u0004\u0000\u0000\u0019"+
		"\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005\u0005\u0000\u0000\u001b"+
		"/\u0001\u0000\u0000\u0000\u001c/\u0005\u0006\u0000\u0000\u001d\u001e\u0005"+
		"\u001c\u0000\u0000\u001e\'\u0005\u0004\u0000\u0000\u001f$\u0003\u0002"+
		"\u0001\u0000 !\u0005\u0007\u0000\u0000!#\u0003\u0002\u0001\u0000\" \u0001"+
		"\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"$%\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000\'\u001f\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)/\u0005\u0005\u0000\u0000*+\u0005\u001c\u0000\u0000"+
		"+,\u0005\b\u0000\u0000,-\u0005\u0019\u0000\u0000-/\u0005\t\u0000\u0000"+
		".\u0012\u0001\u0000\u0000\u0000.\u0014\u0001\u0000\u0000\u0000.\u0015"+
		"\u0001\u0000\u0000\u0000.\u0016\u0001\u0000\u0000\u0000.\u0018\u0001\u0000"+
		"\u0000\u0000.\u001c\u0001\u0000\u0000\u0000.\u001d\u0001\u0000\u0000\u0000"+
		".*\u0001\u0000\u0000\u0000/5\u0001\u0000\u0000\u000001\n\u0006\u0000\u0000"+
		"12\u0005\u001a\u0000\u000024\u0003\u0002\u0001\u000730\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0003\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"89\u0003\u0000\u0000\u00009:\u0005\u001c\u0000\u0000:C\u0005\u0004\u0000"+
		"\u0000;@\u0003\u0006\u0003\u0000<=\u0005\u0007\u0000\u0000=?\u0003\u0006"+
		"\u0003\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000C;\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0005\u0005\u0000\u0000FG\u0003\f\u0006"+
		"\u0000G\u0005\u0001\u0000\u0000\u0000HI\u0003\u0000\u0000\u0000IJ\u0005"+
		"\u001c\u0000\u0000J\u0007\u0001\u0000\u0000\u0000KL\u0005\u001c\u0000"+
		"\u0000LS\u0005\n\u0000\u0000MN\u0005\u001c\u0000\u0000NS\u0005\u000b\u0000"+
		"\u0000OP\u0005\u001c\u0000\u0000PQ\u0005\f\u0000\u0000QS\u0003\u0002\u0001"+
		"\u0000RK\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000RO\u0001\u0000"+
		"\u0000\u0000S\t\u0001\u0000\u0000\u0000TU\u0005\r\u0000\u0000U\u000b\u0001"+
		"\u0000\u0000\u0000VW\u0005\u000e\u0000\u0000WX\u0003\u0002\u0001\u0000"+
		"XY\u0003\n\u0005\u0000Y\u00a6\u0001\u0000\u0000\u0000Z[\u0005\u001c\u0000"+
		"\u0000[\\\u0005\b\u0000\u0000\\]\u0005\u0019\u0000\u0000]^\u0005\u000f"+
		"\u0000\u0000^_\u0003\u0002\u0001\u0000_`\u0003\n\u0005\u0000`\u00a6\u0001"+
		"\u0000\u0000\u0000ab\u0003\b\u0004\u0000bc\u0003\n\u0005\u0000c\u00a6"+
		"\u0001\u0000\u0000\u0000de\u0003\u0000\u0000\u0000eh\u0005\u001c\u0000"+
		"\u0000fg\u0005\f\u0000\u0000gi\u0003\u0002\u0001\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0003\n\u0005"+
		"\u0000k\u00a6\u0001\u0000\u0000\u0000lm\u0005\u0010\u0000\u0000mn\u0005"+
		"\u0004\u0000\u0000no\u0003\u0002\u0001\u0000op\u0005\u0005\u0000\u0000"+
		"pq\u0003\n\u0005\u0000q\u00a6\u0001\u0000\u0000\u0000rs\u0005\u0011\u0000"+
		"\u0000st\u0005\u0004\u0000\u0000tu\u0003\u0002\u0001\u0000uv\u0005\u0005"+
		"\u0000\u0000vw\u0003\f\u0006\u0000wx\u0005\u0012\u0000\u0000xy\u0003\f"+
		"\u0006\u0000y\u00a6\u0001\u0000\u0000\u0000z{\u0005\u0013\u0000\u0000"+
		"{|\u0005\u0004\u0000\u0000|}\u0003\u0002\u0001\u0000}~\u0005\u0005\u0000"+
		"\u0000~\u007f\u0003\f\u0006\u0000\u007f\u00a6\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000"+
		"\u0082\u0083\u0003\u0000\u0000\u0000\u0083\u0084\u0005\u001c\u0000\u0000"+
		"\u0084\u0085\u0005\f\u0000\u0000\u0085\u0086\u0003\u0002\u0001\u0000\u0086"+
		"\u0087\u0005\r\u0000\u0000\u0087\u0088\u0003\u0002\u0001\u0000\u0088\u0089"+
		"\u0005\r\u0000\u0000\u0089\u008a\u0003\b\u0004\u0000\u008a\u008b\u0005"+
		"\u0005\u0000\u0000\u008b\u008c\u0003\f\u0006\u0000\u008c\u00a6\u0001\u0000"+
		"\u0000\u0000\u008d\u0091\u0005\u0015\u0000\u0000\u008e\u0090\u0003\f\u0006"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u00a6\u0005\u0016\u0000\u0000\u0095\u0096\u0005\u0017\u0000"+
		"\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097\u0098\u0005\f\u0000\u0000"+
		"\u0098\u00a1\u0005\b\u0000\u0000\u0099\u009e\u0005\u0019\u0000\u0000\u009a"+
		"\u009b\u0005\u0007\u0000\u0000\u009b\u009d\u0005\u0019\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u0099\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\t\u0000\u0000\u00a4\u00a6"+
		"\u0003\n\u0005\u0000\u00a5V\u0001\u0000\u0000\u0000\u00a5Z\u0001\u0000"+
		"\u0000\u0000\u00a5a\u0001\u0000\u0000\u0000\u00a5d\u0001\u0000\u0000\u0000"+
		"\u00a5l\u0001\u0000\u0000\u0000\u00a5r\u0001\u0000\u0000\u0000\u00a5z"+
		"\u0001\u0000\u0000\u0000\u00a5\u0080\u0001\u0000\u0000\u0000\u00a5\u008d"+
		"\u0001\u0000\u0000\u0000\u00a5\u0095\u0001\u0000\u0000\u0000\u00a6\r\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0003\f\u0006\u0000\u00a8\u00aa\u0003\u0004"+
		"\u0002\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u000f\u0001\u0000"+
		"\u0000\u0000\u000e$\'.5@CRh\u0091\u009e\u00a1\u00a5\u00a9\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}