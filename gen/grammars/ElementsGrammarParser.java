// Generated from C:/Users/melle/IdeaProjects/OES-in-ArchiMate/src/grammars/ElementsGrammar.g4 by ANTLR 4.13.1
package grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ElementsGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ASSESSMENT=3, CONSTRAINT=4, VALUE=5, ARCHIMATEMODEL=6, 
		RESOURCE=7, BUSINESSOBJECT=8, CONTRACT=9, PRODUCT=10, DATAOBJECT=11, COMMUNICATIONNETWORK=12, 
		DEVICE=13, DISTRIBUTIONNETWORK=14, EQUIPMENT=15, FACILITY=16, NODE=17, 
		SYSTEMSOFTWARE=18, BUSINESSCOLLABORATION=19, BUSNESSEVENT=20, BUSSINESSFUNCTION=21, 
		BUSINESSINTERACTION=22, BUSINESSPROCESS=23, BUSINESSSERVICE=24, APPLICATIONCOLLABORATION=25, 
		APPLICATIONPROCESS=26, APPLICATIONSERVICE=27, TECHNOLOGYCOLLABORATION=28, 
		TECHNOLOGYEVENT=29, TECHNOLOGYFUNCTION=30, TECHNOLOGYINTERACTION=31, TECHNOLOGYPROCESS=32, 
		TECHNOLOGYSERVICE=33, OUTCOME=34, PAR=35, COM=36, ID=37, IDENTIFIER=38, 
		STRING=39, NUMBER=40;
	public static final int
		RULE_csvFile = 0, RULE_hdr = 1, RULE_row = 2, RULE_field = 3, RULE_name = 4, 
		RULE_type = 5, RULE_object = 6, RULE_event = 7, RULE_other = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"csvFile", "hdr", "row", "field", "name", "type", "object", "event", 
			"other"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\r'", "'\\n'", "'\"Assessment\"'", "'\"Constraint\"'", "'\"Value\"'", 
			"'\"ArchimateModel\"'", "'\"Resource\"'", "'\"BusinessObject\"'", "'\"Contract\"'", 
			"'\"Product\"'", "'\"DataObject\"'", "'\"CommunicationNetwork\"'", "'\"Device\"'", 
			"'\"DistributionNetwork\"'", "'\"Equipment\"'", "'\"Facility\"'", "'\"Node\"'", 
			"'\"SystemSoftware\"'", "'\"BusinessCollaboration\"'", "'\"BusinessEvent\"'", 
			"'\"BusinessFunction\"'", "'\"BusinessInteraction\"'", "'\"BusinessProcess\"'", 
			"'\"BusinessService\"'", "'\"ApplicationCollaboration\"'", "'\"ApplicationProcess\"'", 
			"'\"ApplicationService\"'", "'\"TechnologyCollaboration\"'", "'\"TechnologyEvent\"'", 
			"'\"TechnologyFunction\"'", "'\"TechnologyInteraction\"'", "'\"TechnologyProcess\"'", 
			"'\"TechnologyService\"'", "'\"Outcome\"'", "'\"'", "','", "'id-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ASSESSMENT", "CONSTRAINT", "VALUE", "ARCHIMATEMODEL", 
			"RESOURCE", "BUSINESSOBJECT", "CONTRACT", "PRODUCT", "DATAOBJECT", "COMMUNICATIONNETWORK", 
			"DEVICE", "DISTRIBUTIONNETWORK", "EQUIPMENT", "FACILITY", "NODE", "SYSTEMSOFTWARE", 
			"BUSINESSCOLLABORATION", "BUSNESSEVENT", "BUSSINESSFUNCTION", "BUSINESSINTERACTION", 
			"BUSINESSPROCESS", "BUSINESSSERVICE", "APPLICATIONCOLLABORATION", "APPLICATIONPROCESS", 
			"APPLICATIONSERVICE", "TECHNOLOGYCOLLABORATION", "TECHNOLOGYEVENT", "TECHNOLOGYFUNCTION", 
			"TECHNOLOGYINTERACTION", "TECHNOLOGYPROCESS", "TECHNOLOGYSERVICE", "OUTCOME", 
			"PAR", "COM", "ID", "IDENTIFIER", "STRING", "NUMBER"
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
	public String getGrammarFileName() { return "ElementsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ElementsGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CsvFileContext extends ParserRuleContext {
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ElementsGrammarParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public CsvFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterCsvFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitCsvFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitCsvFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsvFileContext csvFile() throws RecognitionException {
		CsvFileContext _localctx = new CsvFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_csvFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			hdr();
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				row();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(24);
			match(EOF);
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
	public static class HdrContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(ElementsGrammarParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(ElementsGrammarParser.COM, i);
		}
		public HdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterHdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitHdr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitHdr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HdrContext hdr() throws RecognitionException {
		HdrContext _localctx = new HdrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hdr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			field();
			setState(27);
			match(COM);
			setState(28);
			field();
			setState(29);
			match(COM);
			setState(30);
			field();
			setState(31);
			match(COM);
			setState(32);
			field();
			setState(33);
			match(COM);
			setState(34);
			field();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(35);
				match(T__0);
				}
			}

			setState(38);
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
	public static class RowContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ElementsGrammarParser.IDENTIFIER, 0); }
		public List<TerminalNode> COM() { return getTokens(ElementsGrammarParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(ElementsGrammarParser.COM, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(IDENTIFIER);
			setState(41);
			match(COM);
			setState(42);
			type();
			setState(43);
			match(COM);
			setState(44);
			name();
			setState(45);
			match(COM);
			setState(46);
			field();
			setState(47);
			match(COM);
			setState(48);
			field();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(49);
				match(T__0);
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
				match(T__1);
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ElementsGrammarParser.STRING, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(STRING);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ElementsGrammarParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(STRING);
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
	public static class TypeContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public TerminalNode ARCHIMATEMODEL() { return getToken(ElementsGrammarParser.ARCHIMATEMODEL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESOURCE:
			case BUSINESSOBJECT:
			case CONTRACT:
			case PRODUCT:
			case DATAOBJECT:
			case COMMUNICATIONNETWORK:
			case DEVICE:
			case DISTRIBUTIONNETWORK:
			case EQUIPMENT:
			case FACILITY:
			case NODE:
			case SYSTEMSOFTWARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				object();
				}
				break;
			case BUSINESSCOLLABORATION:
			case BUSNESSEVENT:
			case BUSSINESSFUNCTION:
			case BUSINESSINTERACTION:
			case BUSINESSPROCESS:
			case BUSINESSSERVICE:
			case APPLICATIONCOLLABORATION:
			case APPLICATIONPROCESS:
			case APPLICATIONSERVICE:
			case TECHNOLOGYCOLLABORATION:
			case TECHNOLOGYEVENT:
			case TECHNOLOGYFUNCTION:
			case TECHNOLOGYINTERACTION:
			case TECHNOLOGYPROCESS:
			case TECHNOLOGYSERVICE:
			case OUTCOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				event();
				}
				break;
			case ASSESSMENT:
			case CONSTRAINT:
			case VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				other();
				}
				break;
			case ARCHIMATEMODEL:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(ARCHIMATEMODEL);
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode RESOURCE() { return getToken(ElementsGrammarParser.RESOURCE, 0); }
		public TerminalNode BUSINESSOBJECT() { return getToken(ElementsGrammarParser.BUSINESSOBJECT, 0); }
		public TerminalNode CONTRACT() { return getToken(ElementsGrammarParser.CONTRACT, 0); }
		public TerminalNode PRODUCT() { return getToken(ElementsGrammarParser.PRODUCT, 0); }
		public TerminalNode DATAOBJECT() { return getToken(ElementsGrammarParser.DATAOBJECT, 0); }
		public TerminalNode COMMUNICATIONNETWORK() { return getToken(ElementsGrammarParser.COMMUNICATIONNETWORK, 0); }
		public TerminalNode DEVICE() { return getToken(ElementsGrammarParser.DEVICE, 0); }
		public TerminalNode DISTRIBUTIONNETWORK() { return getToken(ElementsGrammarParser.DISTRIBUTIONNETWORK, 0); }
		public TerminalNode EQUIPMENT() { return getToken(ElementsGrammarParser.EQUIPMENT, 0); }
		public TerminalNode FACILITY() { return getToken(ElementsGrammarParser.FACILITY, 0); }
		public TerminalNode NODE() { return getToken(ElementsGrammarParser.NODE, 0); }
		public TerminalNode SYSTEMSOFTWARE() { return getToken(ElementsGrammarParser.SYSTEMSOFTWARE, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524160L) != 0)) ) {
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
	public static class EventContext extends ParserRuleContext {
		public TerminalNode BUSINESSCOLLABORATION() { return getToken(ElementsGrammarParser.BUSINESSCOLLABORATION, 0); }
		public TerminalNode BUSNESSEVENT() { return getToken(ElementsGrammarParser.BUSNESSEVENT, 0); }
		public TerminalNode BUSSINESSFUNCTION() { return getToken(ElementsGrammarParser.BUSSINESSFUNCTION, 0); }
		public TerminalNode BUSINESSINTERACTION() { return getToken(ElementsGrammarParser.BUSINESSINTERACTION, 0); }
		public TerminalNode BUSINESSPROCESS() { return getToken(ElementsGrammarParser.BUSINESSPROCESS, 0); }
		public TerminalNode BUSINESSSERVICE() { return getToken(ElementsGrammarParser.BUSINESSSERVICE, 0); }
		public TerminalNode APPLICATIONCOLLABORATION() { return getToken(ElementsGrammarParser.APPLICATIONCOLLABORATION, 0); }
		public TerminalNode APPLICATIONPROCESS() { return getToken(ElementsGrammarParser.APPLICATIONPROCESS, 0); }
		public TerminalNode APPLICATIONSERVICE() { return getToken(ElementsGrammarParser.APPLICATIONSERVICE, 0); }
		public TerminalNode TECHNOLOGYCOLLABORATION() { return getToken(ElementsGrammarParser.TECHNOLOGYCOLLABORATION, 0); }
		public TerminalNode TECHNOLOGYEVENT() { return getToken(ElementsGrammarParser.TECHNOLOGYEVENT, 0); }
		public TerminalNode TECHNOLOGYFUNCTION() { return getToken(ElementsGrammarParser.TECHNOLOGYFUNCTION, 0); }
		public TerminalNode TECHNOLOGYINTERACTION() { return getToken(ElementsGrammarParser.TECHNOLOGYINTERACTION, 0); }
		public TerminalNode TECHNOLOGYPROCESS() { return getToken(ElementsGrammarParser.TECHNOLOGYPROCESS, 0); }
		public TerminalNode TECHNOLOGYSERVICE() { return getToken(ElementsGrammarParser.TECHNOLOGYSERVICE, 0); }
		public TerminalNode OUTCOME() { return getToken(ElementsGrammarParser.OUTCOME, 0); }
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359214080L) != 0)) ) {
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
	public static class OtherContext extends ParserRuleContext {
		public TerminalNode ASSESSMENT() { return getToken(ElementsGrammarParser.ASSESSMENT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ElementsGrammarParser.CONSTRAINT, 0); }
		public TerminalNode VALUE() { return getToken(ElementsGrammarParser.VALUE, 0); }
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElementsGrammarListener ) ((ElementsGrammarListener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElementsGrammarVisitor ) return ((ElementsGrammarVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_other);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001(H\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b\u0000\f\u0000"+
		"\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001\u0002\u0003"+
		"\u00026\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005@\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000"+
		"\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0003\u0001\u0000"+
		"\u0007\u0012\u0001\u0000\u0013\"\u0001\u0000\u0003\u0005E\u0000\u0012"+
		"\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004(\u0001"+
		"\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000"+
		"\u0000\n?\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eC\u0001"+
		"\u0000\u0000\u0000\u0010E\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002"+
		"\u0001\u0000\u0013\u0015\u0003\u0004\u0002\u0000\u0014\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u001c\u0005$\u0000"+
		"\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e\u0005$\u0000\u0000"+
		"\u001e\u001f\u0003\u0006\u0003\u0000\u001f \u0005$\u0000\u0000 !\u0003"+
		"\u0006\u0003\u0000!\"\u0005$\u0000\u0000\"$\u0003\u0006\u0003\u0000#%"+
		"\u0005\u0001\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0002\u0000\u0000\'\u0003\u0001"+
		"\u0000\u0000\u0000()\u0005&\u0000\u0000)*\u0005$\u0000\u0000*+\u0003\n"+
		"\u0005\u0000+,\u0005$\u0000\u0000,-\u0003\b\u0004\u0000-.\u0005$\u0000"+
		"\u0000./\u0003\u0006\u0003\u0000/0\u0005$\u0000\u000002\u0003\u0006\u0003"+
		"\u000013\u0005\u0001\u0000\u000021\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000035\u0001\u0000\u0000\u000046\u0005\u0002\u0000\u000054\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000"+
		"\u000078\u0005\'\u0000\u00008\u0007\u0001\u0000\u0000\u00009:\u0005\'"+
		"\u0000\u0000:\t\u0001\u0000\u0000\u0000;@\u0003\f\u0006\u0000<@\u0003"+
		"\u000e\u0007\u0000=@\u0003\u0010\b\u0000>@\u0005\u0006\u0000\u0000?;\u0001"+
		"\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000@\u000b\u0001\u0000\u0000\u0000AB\u0007\u0000"+
		"\u0000\u0000B\r\u0001\u0000\u0000\u0000CD\u0007\u0001\u0000\u0000D\u000f"+
		"\u0001\u0000\u0000\u0000EF\u0007\u0002\u0000\u0000F\u0011\u0001\u0000"+
		"\u0000\u0000\u0005\u0016$25?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}