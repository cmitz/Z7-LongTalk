// Generated from /Users/casper/src/saxion/2.3CompOSs/Z7LongTalk/src/LongTalk.g4 by ANTLR 4.7.2
package nl.caspersmits.cos;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LongTalkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, NEGATION=23, MATHOP=24, 
		LOGICOP=25, BOOLEAN=26, INT=27, STRING=28, IDENTIFIER=29, WS=30, COMMENT=31;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "NEGATION", "MATHOP", "LOGICOP", 
			"BOOLEAN", "INT", "STRING", "IDENTIFIER", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program do'", "'stop'", "'if'", "'else'", "'else if'", "'indexed loop from'", 
			"'to'", "'as'", "'do'", "'loop while'", "'remember that'", "'is a'", 
			"'is an'", "'int'", "'string'", "'boolean'", "'is now'", "'print'", "'('", 
			"')'", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NEGATION", 
			"MATHOP", "LOGICOP", "BOOLEAN", "INT", "STRING", "IDENTIFIER", "WS", 
			"COMMENT"
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


	public LongTalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LongTalk.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00d9\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00e4\n\33\3\34\3\34\3\34\7\34"+
		"\u00e9\n\34\f\34\16\34\u00ec\13\34\5\34\u00ee\n\34\3\35\3\35\7\35\u00f2"+
		"\n\35\f\35\16\35\u00f5\13\35\3\35\3\35\3\36\3\36\7\36\u00fb\n\36\f\36"+
		"\16\36\u00fe\13\36\3\37\6\37\u0101\n\37\r\37\16\37\u0102\3\37\3\37\3 "+
		"\3 \7 \u0109\n \f \16 \u010c\13 \3 \6 \u010f\n \r \16 \u0110\3 \3 \3\u010a"+
		"\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!\3\2\t\5\2,-//\61\61\3\2\63;\3\2\62;\4\2\f\f\17\17\4\2C\\c|\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3"+
		"A\3\2\2\2\5L\3\2\2\2\7Q\3\2\2\2\tT\3\2\2\2\13Y\3\2\2\2\ra\3\2\2\2\17s"+
		"\3\2\2\2\21v\3\2\2\2\23y\3\2\2\2\25|\3\2\2\2\27\u0087\3\2\2\2\31\u0095"+
		"\3\2\2\2\33\u009a\3\2\2\2\35\u00a0\3\2\2\2\37\u00a4\3\2\2\2!\u00ab\3\2"+
		"\2\2#\u00b3\3\2\2\2%\u00ba\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00c4"+
		"\3\2\2\2-\u00c7\3\2\2\2/\u00ca\3\2\2\2\61\u00cc\3\2\2\2\63\u00d8\3\2\2"+
		"\2\65\u00e3\3\2\2\2\67\u00ed\3\2\2\29\u00ef\3\2\2\2;\u00f8\3\2\2\2=\u0100"+
		"\3\2\2\2?\u0106\3\2\2\2AB\7r\2\2BC\7t\2\2CD\7q\2\2DE\7i\2\2EF\7t\2\2F"+
		"G\7c\2\2GH\7o\2\2HI\7\"\2\2IJ\7f\2\2JK\7q\2\2K\4\3\2\2\2LM\7u\2\2MN\7"+
		"v\2\2NO\7q\2\2OP\7r\2\2P\6\3\2\2\2QR\7k\2\2RS\7h\2\2S\b\3\2\2\2TU\7g\2"+
		"\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\n\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\"+
		"]\7g\2\2]^\7\"\2\2^_\7k\2\2_`\7h\2\2`\f\3\2\2\2ab\7k\2\2bc\7p\2\2cd\7"+
		"f\2\2de\7g\2\2ef\7z\2\2fg\7g\2\2gh\7f\2\2hi\7\"\2\2ij\7n\2\2jk\7q\2\2"+
		"kl\7q\2\2lm\7r\2\2mn\7\"\2\2no\7h\2\2op\7t\2\2pq\7q\2\2qr\7o\2\2r\16\3"+
		"\2\2\2st\7v\2\2tu\7q\2\2u\20\3\2\2\2vw\7c\2\2wx\7u\2\2x\22\3\2\2\2yz\7"+
		"f\2\2z{\7q\2\2{\24\3\2\2\2|}\7n\2\2}~\7q\2\2~\177\7q\2\2\177\u0080\7r"+
		"\2\2\u0080\u0081\7\"\2\2\u0081\u0082\7y\2\2\u0082\u0083\7j\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7n\2\2\u0085\u0086\7g\2\2\u0086\26\3\2\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7o\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\7o\2\2\u008c\u008d\7d\2\2\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2"+
		"\u008f\u0090\7\"\2\2\u0090\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092\u0093"+
		"\7c\2\2\u0093\u0094\7v\2\2\u0094\30\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097"+
		"\7u\2\2\u0097\u0098\7\"\2\2\u0098\u0099\7c\2\2\u0099\32\3\2\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7u\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7c\2"+
		"\2\u009e\u009f\7p\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7i\2\2\u00aa \3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7q\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2"+
		"\u00b1\u00b2\7p\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7u"+
		"\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9"+
		"\7y\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf&\3\2\2\2\u00c0\u00c1"+
		"\7*\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7+\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7"+
		"(\2\2\u00c5\u00c6\7(\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7~\2\2\u00c8\u00c9"+
		"\7~\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\60\3\2\2\2\u00cc\u00cd"+
		"\t\2\2\2\u00cd\62\3\2\2\2\u00ce\u00d9\7>\2\2\u00cf\u00d0\7>\2\2\u00d0"+
		"\u00d9\7?\2\2\u00d1\u00d9\7@\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d9\7?\2\2"+
		"\u00d4\u00d5\7?\2\2\u00d5\u00d9\7?\2\2\u00d6\u00d7\7#\2\2\u00d7\u00d9"+
		"\7?\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8"+
		"\u00d2\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\64\3\2\2"+
		"\2\u00da\u00db\7V\2\2\u00db\u00dc\7T\2\2\u00dc\u00dd\7W\2\2\u00dd\u00e4"+
		"\7G\2\2\u00de\u00df\7H\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7N\2\2\u00e1"+
		"\u00e2\7U\2\2\u00e2\u00e4\7G\2\2\u00e3\u00da\3\2\2\2\u00e3\u00de\3\2\2"+
		"\2\u00e4\66\3\2\2\2\u00e5\u00ee\7\62\2\2\u00e6\u00ea\t\3\2\2\u00e7\u00e9"+
		"\t\4\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00e5\3\2"+
		"\2\2\u00ed\u00e6\3\2\2\2\u00ee8\3\2\2\2\u00ef\u00f3\7$\2\2\u00f0\u00f2"+
		"\n\5\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7$"+
		"\2\2\u00f7:\3\2\2\2\u00f8\u00fc\t\6\2\2\u00f9\u00fb\t\7\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"<\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\t\b\2\2\u0100\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\b\37\2\2\u0105>\3\2\2\2\u0106\u010a\7%\2\2\u0107"+
		"\u0109\13\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u010b\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010f\t\5\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b \2\2\u0113"+
		"@\3\2\2\2\f\2\u00d8\u00e3\u00ea\u00ed\u00f3\u00fc\u0102\u010a\u0110\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}