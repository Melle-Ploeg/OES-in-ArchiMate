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
		TRIGGERINGRELATIONSHIP=6, ID=7, IDENTIFIER=8, STRING=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ASSOCIATIONRELATIONSHIP", "INFLUENCERELATIONSHIP", 
			"TRIGGERINGRELATIONSHIP", "ID", "IDENTIFIER", "STRING", "LOWERCASE", 
			"DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\r'", "'\\n'", "'\"AssociationRelationship\"'", "'\"InfluenceRelationship\"'", 
			"'\"TriggeringRelationship\"'", "'id-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ASSOCIATIONRELATIONSHIP", "INFLUENCERELATIONSHIP", 
			"TRIGGERINGRELATIONSHIP", "ID", "IDENTIFIER", "STRING"
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
		"\u0004\u0000\t\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007q\b\u0007"+
		"\u000b\u0007\f\u0007r\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b{\b\b\n\b\f\b~\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015\u0000"+
		"\u0001\u0000\u0003\u0001\u0000\"\"\u0001\u0000az\u0001\u000009\u0086\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019"+
		"\u0001\u0000\u0000\u0000\u0005\u001b\u0001\u0000\u0000\u0000\u0007\u001d"+
		"\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000bO\u0001\u0000"+
		"\u0000\u0000\rh\u0001\u0000\u0000\u0000\u000fl\u0001\u0000\u0000\u0000"+
		"\u0011v\u0001\u0000\u0000\u0000\u0013\u0081\u0001\u0000\u0000\u0000\u0015"+
		"\u0083\u0001\u0000\u0000\u0000\u0017\u0018\u0005,\u0000\u0000\u0018\u0002"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005\r\u0000\u0000\u001a\u0004\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005\n\u0000\u0000\u001c\u0006\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005\"\u0000\u0000\u001e\u001f\u0005A\u0000"+
		"\u0000\u001f \u0005s\u0000\u0000 !\u0005s\u0000\u0000!\"\u0005o\u0000"+
		"\u0000\"#\u0005c\u0000\u0000#$\u0005i\u0000\u0000$%\u0005a\u0000\u0000"+
		"%&\u0005t\u0000\u0000&\'\u0005i\u0000\u0000\'(\u0005o\u0000\u0000()\u0005"+
		"n\u0000\u0000)*\u0005R\u0000\u0000*+\u0005e\u0000\u0000+,\u0005l\u0000"+
		"\u0000,-\u0005a\u0000\u0000-.\u0005t\u0000\u0000./\u0005i\u0000\u0000"+
		"/0\u0005o\u0000\u000001\u0005n\u0000\u000012\u0005s\u0000\u000023\u0005"+
		"h\u0000\u000034\u0005i\u0000\u000045\u0005p\u0000\u000056\u0005\"\u0000"+
		"\u00006\b\u0001\u0000\u0000\u000078\u0005\"\u0000\u000089\u0005I\u0000"+
		"\u00009:\u0005n\u0000\u0000:;\u0005f\u0000\u0000;<\u0005l\u0000\u0000"+
		"<=\u0005u\u0000\u0000=>\u0005e\u0000\u0000>?\u0005n\u0000\u0000?@\u0005"+
		"c\u0000\u0000@A\u0005e\u0000\u0000AB\u0005R\u0000\u0000BC\u0005e\u0000"+
		"\u0000CD\u0005l\u0000\u0000DE\u0005a\u0000\u0000EF\u0005t\u0000\u0000"+
		"FG\u0005i\u0000\u0000GH\u0005o\u0000\u0000HI\u0005n\u0000\u0000IJ\u0005"+
		"s\u0000\u0000JK\u0005h\u0000\u0000KL\u0005i\u0000\u0000LM\u0005p\u0000"+
		"\u0000MN\u0005\"\u0000\u0000N\n\u0001\u0000\u0000\u0000OP\u0005\"\u0000"+
		"\u0000PQ\u0005T\u0000\u0000QR\u0005r\u0000\u0000RS\u0005i\u0000\u0000"+
		"ST\u0005g\u0000\u0000TU\u0005g\u0000\u0000UV\u0005e\u0000\u0000VW\u0005"+
		"r\u0000\u0000WX\u0005i\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005g\u0000"+
		"\u0000Z[\u0005R\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005l\u0000\u0000"+
		"]^\u0005a\u0000\u0000^_\u0005t\u0000\u0000_`\u0005i\u0000\u0000`a\u0005"+
		"o\u0000\u0000ab\u0005n\u0000\u0000bc\u0005s\u0000\u0000cd\u0005h\u0000"+
		"\u0000de\u0005i\u0000\u0000ef\u0005p\u0000\u0000fg\u0005\"\u0000\u0000"+
		"g\f\u0001\u0000\u0000\u0000hi\u0005i\u0000\u0000ij\u0005d\u0000\u0000"+
		"jk\u0005-\u0000\u0000k\u000e\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000"+
		"mp\u0003\r\u0006\u0000nq\u0003\u0013\t\u0000oq\u0003\u0015\n\u0000pn\u0001"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0005\"\u0000\u0000u\u0010\u0001\u0000\u0000\u0000v|\u0005\""+
		"\u0000\u0000wx\u0005\"\u0000\u0000x{\u0005\"\u0000\u0000y{\b\u0000\u0000"+
		"\u0000zw\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\""+
		"\u0000\u0000\u0080\u0012\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0001"+
		"\u0000\u0000\u0082\u0014\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0002"+
		"\u0000\u0000\u0084\u0016\u0001\u0000\u0000\u0000\u0005\u0000prz|\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}