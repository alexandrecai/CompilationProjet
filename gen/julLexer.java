// Generated from java-escape by ANTLR 4.11.1
package gen;
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, WS=16, INT=17, 
		Op=18, Const=19, ID=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "WS", "INT", "Op", 
			"Const", "ID"
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
		"\u0004\u0000\u0014\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004"+
		"\u0010h\b\u0010\u000b\u0010\f\u0010i\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011{\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0086\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u008a\b\u0013\n\u0013"+
		"\f\u0013\u008d\t\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0001\u0000"+
		"09\u0002\u0000*+--\u0002\u0000AZaz\u0003\u000009AZaz\u0097\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003.\u0001"+
		"\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000"+
		"\u0000\t6\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\r?\u0001"+
		"\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000"+
		"\u0000\u0013J\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017"+
		"S\u0001\u0000\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001b^\u0001"+
		"\u0000\u0000\u0000\u001d`\u0001\u0000\u0000\u0000\u001fb\u0001\u0000\u0000"+
		"\u0000!g\u0001\u0000\u0000\u0000#z\u0001\u0000\u0000\u0000%\u0085\u0001"+
		"\u0000\u0000\u0000\'\u0087\u0001\u0000\u0000\u0000)*\u0005b\u0000\u0000"+
		"*+\u0005o\u0000\u0000+,\u0005o\u0000\u0000,-\u0005l\u0000\u0000-\u0002"+
		"\u0001\u0000\u0000\u0000./\u0005i\u0000\u0000/0\u0005n\u0000\u000001\u0005"+
		"t\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0005(\u0000\u00003\u0006"+
		"\u0001\u0000\u0000\u000045\u0005)\u0000\u00005\b\u0001\u0000\u0000\u0000"+
		"67\u0005r\u0000\u000078\u0005e\u0000\u000089\u0005a\u0000\u00009:\u0005"+
		"d\u0000\u0000:;\u0005(\u0000\u0000;<\u0005)\u0000\u0000<\n\u0001\u0000"+
		"\u0000\u0000=>\u0005,\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005;"+
		"\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005r\u0000\u0000BC\u0005"+
		"e\u0000\u0000CD\u0005t\u0000\u0000DE\u0005u\u0000\u0000EF\u0005r\u0000"+
		"\u0000FG\u0005n\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005=\u0000"+
		"\u0000I\u0012\u0001\u0000\u0000\u0000JK\u0005p\u0000\u0000KL\u0005r\u0000"+
		"\u0000LM\u0005i\u0000\u0000MN\u0005n\u0000\u0000NO\u0005t\u0000\u0000"+
		"O\u0014\u0001\u0000\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005f\u0000\u0000"+
		"R\u0016\u0001\u0000\u0000\u0000ST\u0005e\u0000\u0000TU\u0005l\u0000\u0000"+
		"UV\u0005s\u0000\u0000VW\u0005e\u0000\u0000W\u0018\u0001\u0000\u0000\u0000"+
		"XY\u0005w\u0000\u0000YZ\u0005h\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005"+
		"l\u0000\u0000\\]\u0005e\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0005"+
		"{\u0000\u0000_\u001c\u0001\u0000\u0000\u0000`a\u0005}\u0000\u0000a\u001e"+
		"\u0001\u0000\u0000\u0000bc\u0007\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0006\u000f\u0000\u0000e \u0001\u0000\u0000\u0000fh\u0007\u0001"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\"\u0001\u0000\u0000\u0000"+
		"k{\u0007\u0002\u0000\u0000lm\u0005&\u0000\u0000m{\u0005&\u0000\u0000n"+
		"o\u0005|\u0000\u0000o{\u0005|\u0000\u0000pq\u0005=\u0000\u0000q{\u0005"+
		"=\u0000\u0000r{\u0005<\u0000\u0000st\u0005n\u0000\u0000tu\u0005o\u0000"+
		"\u0000u{\u0005t\u0000\u0000vw\u0005a\u0000\u0000wx\u0005b\u0000\u0000"+
		"x{\u0005s\u0000\u0000y{\u0005/\u0000\u0000zk\u0001\u0000\u0000\u0000z"+
		"l\u0001\u0000\u0000\u0000zn\u0001\u0000\u0000\u0000zp\u0001\u0000\u0000"+
		"\u0000zr\u0001\u0000\u0000\u0000zs\u0001\u0000\u0000\u0000zv\u0001\u0000"+
		"\u0000\u0000zy\u0001\u0000\u0000\u0000{$\u0001\u0000\u0000\u0000|}\u0005"+
		"t\u0000\u0000}~\u0005r\u0000\u0000~\u007f\u0005u\u0000\u0000\u007f\u0086"+
		"\u0005e\u0000\u0000\u0080\u0081\u0005f\u0000\u0000\u0081\u0082\u0005a"+
		"\u0000\u0000\u0082\u0083\u0005l\u0000\u0000\u0083\u0084\u0005s\u0000\u0000"+
		"\u0084\u0086\u0005e\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085\u0080"+
		"\u0001\u0000\u0000\u0000\u0086&\u0001\u0000\u0000\u0000\u0087\u008b\u0007"+
		"\u0003\u0000\u0000\u0088\u008a\u0007\u0004\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c(\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u0005\u0000iz\u0085\u008b"+
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