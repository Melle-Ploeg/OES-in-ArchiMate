// Generated from C:/Users/melle/IdeaProjects/OES-in-ArchiMate/src/grammars/RelationsGrammar.g4 by ANTLR 4.13.1
package grammars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RelationsGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ASSOCIATIONRELATIONSHIP=4, INFLUENCERELATIONSHIP=5, 
		TRIGGERINGRELATIONSHIP=6, PLUS=7, MINUS=8, MULT=9, DIV=10, ASS=11, ID=12, 
		IDENTIFIER=13, STRING=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ASSOCIATIONRELATIONSHIP", "INFLUENCERELATIONSHIP", 
			"TRIGGERINGRELATIONSHIP", "PLUS", "MINUS", "MULT", "DIV", "ASS", "ID", 
			"IDENTIFIER", "STRING", "LOWERCASE", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\r'", "'\\n'", "'\"AssociationRelationship\"'", "'\"InfluenceRelationship\"'", 
			"'\"TriggeringRelationship\"'", "'+'", "'-'", "'*'", "'/'", "'='", "'id-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ASSOCIATIONRELATIONSHIP", "INFLUENCERELATIONSHIP", 
			"TRIGGERINGRELATIONSHIP", "PLUS", "MINUS", "MULT", "DIV", "ASS", "ID", 
			"IDENTIFIER", "STRING"
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


	public RelationsGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RelationsGrammar.g4"; }

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
		"\u0004\u0000\u000e\u0099\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u0085\b\f\u000b\f\f\f\u0086\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u008f\b\r\n\r\f\r\u0092\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u0000\u001f\u0000\u0001\u0000\u0003\u0001\u0000\"\"\u0001\u0000"+
		"az\u0001\u000009\u009a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000"+
		"\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\tA\u0001"+
		"\u0000\u0000\u0000\u000bY\u0001\u0000\u0000\u0000\rr\u0001\u0000\u0000"+
		"\u0000\u000ft\u0001\u0000\u0000\u0000\u0011v\u0001\u0000\u0000\u0000\u0013"+
		"x\u0001\u0000\u0000\u0000\u0015z\u0001\u0000\u0000\u0000\u0017|\u0001"+
		"\u0000\u0000\u0000\u0019\u0080\u0001\u0000\u0000\u0000\u001b\u008a\u0001"+
		"\u0000\u0000\u0000\u001d\u0095\u0001\u0000\u0000\u0000\u001f\u0097\u0001"+
		"\u0000\u0000\u0000!\"\u0005,\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000"+
		"#$\u0005\r\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005\n\u0000"+
		"\u0000&\u0006\u0001\u0000\u0000\u0000\'(\u0005\"\u0000\u0000()\u0005A"+
		"\u0000\u0000)*\u0005s\u0000\u0000*+\u0005s\u0000\u0000+,\u0005o\u0000"+
		"\u0000,-\u0005c\u0000\u0000-.\u0005i\u0000\u0000./\u0005a\u0000\u0000"+
		"/0\u0005t\u0000\u000001\u0005i\u0000\u000012\u0005o\u0000\u000023\u0005"+
		"n\u0000\u000034\u0005R\u0000\u000045\u0005e\u0000\u000056\u0005l\u0000"+
		"\u000067\u0005a\u0000\u000078\u0005t\u0000\u000089\u0005i\u0000\u0000"+
		"9:\u0005o\u0000\u0000:;\u0005n\u0000\u0000;<\u0005s\u0000\u0000<=\u0005"+
		"h\u0000\u0000=>\u0005i\u0000\u0000>?\u0005p\u0000\u0000?@\u0005\"\u0000"+
		"\u0000@\b\u0001\u0000\u0000\u0000AB\u0005\"\u0000\u0000BC\u0005I\u0000"+
		"\u0000CD\u0005n\u0000\u0000DE\u0005f\u0000\u0000EF\u0005l\u0000\u0000"+
		"FG\u0005u\u0000\u0000GH\u0005e\u0000\u0000HI\u0005n\u0000\u0000IJ\u0005"+
		"c\u0000\u0000JK\u0005e\u0000\u0000KL\u0005R\u0000\u0000LM\u0005e\u0000"+
		"\u0000MN\u0005l\u0000\u0000NO\u0005a\u0000\u0000OP\u0005t\u0000\u0000"+
		"PQ\u0005i\u0000\u0000QR\u0005o\u0000\u0000RS\u0005n\u0000\u0000ST\u0005"+
		"s\u0000\u0000TU\u0005h\u0000\u0000UV\u0005i\u0000\u0000VW\u0005p\u0000"+
		"\u0000WX\u0005\"\u0000\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005\"\u0000"+
		"\u0000Z[\u0005T\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005i\u0000\u0000"+
		"]^\u0005g\u0000\u0000^_\u0005g\u0000\u0000_`\u0005e\u0000\u0000`a\u0005"+
		"r\u0000\u0000ab\u0005i\u0000\u0000bc\u0005n\u0000\u0000cd\u0005g\u0000"+
		"\u0000de\u0005R\u0000\u0000ef\u0005e\u0000\u0000fg\u0005l\u0000\u0000"+
		"gh\u0005a\u0000\u0000hi\u0005t\u0000\u0000ij\u0005i\u0000\u0000jk\u0005"+
		"o\u0000\u0000kl\u0005n\u0000\u0000lm\u0005s\u0000\u0000mn\u0005h\u0000"+
		"\u0000no\u0005i\u0000\u0000op\u0005p\u0000\u0000pq\u0005\"\u0000\u0000"+
		"q\f\u0001\u0000\u0000\u0000rs\u0005+\u0000\u0000s\u000e\u0001\u0000\u0000"+
		"\u0000tu\u0005-\u0000\u0000u\u0010\u0001\u0000\u0000\u0000vw\u0005*\u0000"+
		"\u0000w\u0012\u0001\u0000\u0000\u0000xy\u0005/\u0000\u0000y\u0014\u0001"+
		"\u0000\u0000\u0000z{\u0005=\u0000\u0000{\u0016\u0001\u0000\u0000\u0000"+
		"|}\u0005i\u0000\u0000}~\u0005d\u0000\u0000~\u007f\u0005-\u0000\u0000\u007f"+
		"\u0018\u0001\u0000\u0000\u0000\u0080\u0081\u0005\"\u0000\u0000\u0081\u0084"+
		"\u0003\u0017\u000b\u0000\u0082\u0085\u0003\u001d\u000e\u0000\u0083\u0085"+
		"\u0003\u001f\u000f\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\"\u0000\u0000\u0089\u001a\u0001"+
		"\u0000\u0000\u0000\u008a\u0090\u0005\"\u0000\u0000\u008b\u008c\u0005\""+
		"\u0000\u0000\u008c\u008f\u0005\"\u0000\u0000\u008d\u008f\b\u0000\u0000"+
		"\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\"\u0000\u0000"+
		"\u0094\u001c\u0001\u0000\u0000\u0000\u0095\u0096\u0007\u0001\u0000\u0000"+
		"\u0096\u001e\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0002\u0000\u0000"+
		"\u0098 \u0001\u0000\u0000\u0000\u0005\u0000\u0084\u0086\u008e\u0090\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}