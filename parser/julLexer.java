// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class julLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, WS=19, INT=20, Op=21, Const=22, ID=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "WS", "INT", "Op", "Const", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'int'", "'('", "')'", "'read()'", "','", "'++'", "'--'", 
			"'='", "';'", "'return'", "'print'", "'if'", "'else'", "'while'", "'for'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WS", "INT", "Op", "Const", 
			"ID"
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


	public julLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013x\b\u0013"+
		"\u000b\u0013\f\u0013y\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u008b\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0096\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u009a\b\u0016\n\u0016\f\u0016\u009d"+
		"\t\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0001"+
		"\u000009\u0002\u0000*+--\u0002\u0000AZaz\u0003\u000009AZaz\u00a7\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u00058\u0001\u0000"+
		"\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000"+
		"\u000bC\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fH\u0001"+
		"\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000"+
		"\u0000\u0015O\u0001\u0000\u0000\u0000\u0017V\u0001\u0000\u0000\u0000\u0019"+
		"\\\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000\u001dd\u0001"+
		"\u0000\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!n\u0001\u0000\u0000"+
		"\u0000#p\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000\u0000\'w\u0001\u0000"+
		"\u0000\u0000)\u008a\u0001\u0000\u0000\u0000+\u0095\u0001\u0000\u0000\u0000"+
		"-\u0097\u0001\u0000\u0000\u0000/0\u0005b\u0000\u000001\u0005o\u0000\u0000"+
		"12\u0005o\u0000\u000023\u0005l\u0000\u00003\u0002\u0001\u0000\u0000\u0000"+
		"45\u0005i\u0000\u000056\u0005n\u0000\u000067\u0005t\u0000\u00007\u0004"+
		"\u0001\u0000\u0000\u000089\u0005(\u0000\u00009\u0006\u0001\u0000\u0000"+
		"\u0000:;\u0005)\u0000\u0000;\b\u0001\u0000\u0000\u0000<=\u0005r\u0000"+
		"\u0000=>\u0005e\u0000\u0000>?\u0005a\u0000\u0000?@\u0005d\u0000\u0000"+
		"@A\u0005(\u0000\u0000AB\u0005)\u0000\u0000B\n\u0001\u0000\u0000\u0000"+
		"CD\u0005,\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005+\u0000\u0000"+
		"FG\u0005+\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005-\u0000\u0000"+
		"IJ\u0005-\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005=\u0000\u0000"+
		"L\u0012\u0001\u0000\u0000\u0000MN\u0005;\u0000\u0000N\u0014\u0001\u0000"+
		"\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005t\u0000"+
		"\u0000RS\u0005u\u0000\u0000ST\u0005r\u0000\u0000TU\u0005n\u0000\u0000"+
		"U\u0016\u0001\u0000\u0000\u0000VW\u0005p\u0000\u0000WX\u0005r\u0000\u0000"+
		"XY\u0005i\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005t\u0000\u0000[\u0018"+
		"\u0001\u0000\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005f\u0000\u0000^\u001a"+
		"\u0001\u0000\u0000\u0000_`\u0005e\u0000\u0000`a\u0005l\u0000\u0000ab\u0005"+
		"s\u0000\u0000bc\u0005e\u0000\u0000c\u001c\u0001\u0000\u0000\u0000de\u0005"+
		"w\u0000\u0000ef\u0005h\u0000\u0000fg\u0005i\u0000\u0000gh\u0005l\u0000"+
		"\u0000hi\u0005e\u0000\u0000i\u001e\u0001\u0000\u0000\u0000jk\u0005f\u0000"+
		"\u0000kl\u0005o\u0000\u0000lm\u0005r\u0000\u0000m \u0001\u0000\u0000\u0000"+
		"no\u0005{\u0000\u0000o\"\u0001\u0000\u0000\u0000pq\u0005}\u0000\u0000"+
		"q$\u0001\u0000\u0000\u0000rs\u0007\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0006\u0012\u0000\u0000u&\u0001\u0000\u0000\u0000vx\u0007\u0001"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z(\u0001\u0000\u0000\u0000"+
		"{\u008b\u0007\u0002\u0000\u0000|}\u0005&\u0000\u0000}\u008b\u0005&\u0000"+
		"\u0000~\u007f\u0005|\u0000\u0000\u007f\u008b\u0005|\u0000\u0000\u0080"+
		"\u0081\u0005=\u0000\u0000\u0081\u008b\u0005=\u0000\u0000\u0082\u008b\u0005"+
		"<\u0000\u0000\u0083\u0084\u0005n\u0000\u0000\u0084\u0085\u0005o\u0000"+
		"\u0000\u0085\u008b\u0005t\u0000\u0000\u0086\u0087\u0005a\u0000\u0000\u0087"+
		"\u0088\u0005b\u0000\u0000\u0088\u008b\u0005s\u0000\u0000\u0089\u008b\u0005"+
		"/\u0000\u0000\u008a{\u0001\u0000\u0000\u0000\u008a|\u0001\u0000\u0000"+
		"\u0000\u008a~\u0001\u0000\u0000\u0000\u008a\u0080\u0001\u0000\u0000\u0000"+
		"\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u0083\u0001\u0000\u0000\u0000"+
		"\u008a\u0086\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b*\u0001\u0000\u0000\u0000\u008c\u008d\u0005t\u0000\u0000\u008d\u008e"+
		"\u0005r\u0000\u0000\u008e\u008f\u0005u\u0000\u0000\u008f\u0096\u0005e"+
		"\u0000\u0000\u0090\u0091\u0005f\u0000\u0000\u0091\u0092\u0005a\u0000\u0000"+
		"\u0092\u0093\u0005l\u0000\u0000\u0093\u0094\u0005s\u0000\u0000\u0094\u0096"+
		"\u0005e\u0000\u0000\u0095\u008c\u0001\u0000\u0000\u0000\u0095\u0090\u0001"+
		"\u0000\u0000\u0000\u0096,\u0001\u0000\u0000\u0000\u0097\u009b\u0007\u0003"+
		"\u0000\u0000\u0098\u009a\u0007\u0004\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c.\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u0005\u0000y\u008a\u0095\u009b"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}