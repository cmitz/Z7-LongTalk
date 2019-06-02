// Generated from /Users/casper/src/saxion/2.3CompOSs/Z7LongTalk/src/LongTalk.g4 by ANTLR 4.7.2
package nl.caspersmits.cos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LongTalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, NEGATION=23, MATHOP=24, 
		LOGICOP=25, BOOLEAN=26, INT=27, STRING=28, IDENTIFIER=29, WS=30, COMMENT=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_ifstatement = 2, RULE_elseifstatement = 3, 
		RULE_indexedloopstatement = 4, RULE_whileloopstatement = 5, RULE_declaration = 6, 
		RULE_assignment = 7, RULE_printstatement = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "ifstatement", "elseifstatement", "indexedloopstatement", 
			"whileloopstatement", "declaration", "assignment", "printstatement", 
			"expression"
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

	@Override
	public String getGrammarFileName() { return "LongTalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LongTalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LongTalkParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(21);
				statement();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(T__1);
			setState(28);
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

	public static class StatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IndexedloopstatementContext indexedloopstatement() {
			return getRuleContext(IndexedloopstatementContext.class,0);
		}
		public WhileloopstatementContext whileloopstatement() {
			return getRuleContext(WhileloopstatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintstatementContext printstatement() {
			return getRuleContext(PrintstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				ifstatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				indexedloopstatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				whileloopstatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				declaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				assignment();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				printstatement();
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

	public static class IfstatementContext extends ParserRuleContext {
		public ExpressionContext compareExpression;
		public StatementContext statement;
		public List<StatementContext> thenstatements = new ArrayList<StatementContext>();
		public List<StatementContext> elsestatements = new ArrayList<StatementContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(LongTalkParser.NEGATION, 0); }
		public List<ElseifstatementContext> elseifstatement() {
			return getRuleContexts(ElseifstatementContext.class);
		}
		public ElseifstatementContext elseifstatement(int i) {
			return getRuleContext(ElseifstatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__2);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(39);
				match(NEGATION);
				}
			}

			setState(42);
			((IfstatementContext)_localctx).compareExpression = expression(0);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(43);
				((IfstatementContext)_localctx).statement = statement();
				((IfstatementContext)_localctx).thenstatements.add(((IfstatementContext)_localctx).statement);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(49);
				elseifstatement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(55);
				match(T__3);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(56);
					((IfstatementContext)_localctx).statement = statement();
					((IfstatementContext)_localctx).elsestatements.add(((IfstatementContext)_localctx).statement);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(64);
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

	public static class ElseifstatementContext extends ParserRuleContext {
		public ExpressionContext compareExpression;
		public StatementContext statement;
		public List<StatementContext> thenstatements = new ArrayList<StatementContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(LongTalkParser.NEGATION, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseifstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitElseifstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstatementContext elseifstatement() throws RecognitionException {
		ElseifstatementContext _localctx = new ElseifstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elseifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__4);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(67);
				match(NEGATION);
				}
			}

			setState(70);
			((ElseifstatementContext)_localctx).compareExpression = expression(0);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(71);
				((ElseifstatementContext)_localctx).statement = statement();
				((ElseifstatementContext)_localctx).thenstatements.add(((ElseifstatementContext)_localctx).statement);
				}
				}
				setState(76);
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

	public static class IndexedloopstatementContext extends ParserRuleContext {
		public ExpressionContext from;
		public ExpressionContext to;
		public StatementContext statement;
		public List<StatementContext> thenstatements = new ArrayList<StatementContext>();
		public TerminalNode IDENTIFIER() { return getToken(LongTalkParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IndexedloopstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexedloopstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitIndexedloopstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexedloopstatementContext indexedloopstatement() throws RecognitionException {
		IndexedloopstatementContext _localctx = new IndexedloopstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_indexedloopstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__5);
			setState(78);
			((IndexedloopstatementContext)_localctx).from = expression(0);
			setState(79);
			match(T__6);
			setState(80);
			((IndexedloopstatementContext)_localctx).to = expression(0);
			setState(81);
			match(T__7);
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(T__8);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(84);
				((IndexedloopstatementContext)_localctx).statement = statement();
				((IndexedloopstatementContext)_localctx).thenstatements.add(((IndexedloopstatementContext)_localctx).statement);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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

	public static class WhileloopstatementContext extends ParserRuleContext {
		public ExpressionContext compareExpression;
		public StatementContext statement;
		public List<StatementContext> thenstatements = new ArrayList<StatementContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileloopstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloopstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitWhileloopstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopstatementContext whileloopstatement() throws RecognitionException {
		WhileloopstatementContext _localctx = new WhileloopstatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileloopstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__9);
			setState(93);
			((WhileloopstatementContext)_localctx).compareExpression = expression(0);
			setState(94);
			match(T__8);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(95);
				((WhileloopstatementContext)_localctx).statement = statement();
				((WhileloopstatementContext)_localctx).thenstatements.add(((WhileloopstatementContext)_localctx).statement);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token declaredType;
		public TerminalNode IDENTIFIER() { return getToken(LongTalkParser.IDENTIFIER, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__10);
			setState(104);
			match(IDENTIFIER);
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			((DeclarationContext)_localctx).declaredType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				((DeclarationContext)_localctx).declaredType = (Token)_errHandler.recoverInline(this);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LongTalkParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(T__16);
			setState(110);
			expression(0);
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

	public static class PrintstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitPrintstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstatementContext printstatement() throws RecognitionException {
		PrintstatementContext _localctx = new PrintstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__17);
			setState(113);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExIdentifierContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(LongTalkParser.IDENTIFIER, 0); }
		public ExIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitExIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMathOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MATHOP() { return getToken(LongTalkParser.MATHOP, 0); }
		public ExMathOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitExMathOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExLogicOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICOP() { return getToken(LongTalkParser.LOGICOP, 0); }
		public ExLogicOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitExLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExBooleanLiteralContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(LongTalkParser.BOOLEAN, 0); }
		public ExBooleanLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitExBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExAndOrOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token and;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExAndOrOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitExAndOrOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExParenthesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitExParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIntegerLiteralContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(LongTalkParser.INT, 0); }
		public ExIntegerLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitExIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExStringLiteralContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(LongTalkParser.STRING, 0); }
		public ExStringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LongTalkVisitor ) return ((LongTalkVisitor<? extends T>)visitor).visitExStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				_localctx = new ExParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(116);
				match(T__18);
				setState(117);
				expression(0);
				setState(118);
				match(T__19);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new ExIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new ExBooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(BOOLEAN);
				}
				break;
			case INT:
				{
				_localctx = new ExIntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new ExStringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExMathOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExMathOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(127);
						((ExMathOpContext)_localctx).op = match(MATHOP);
						setState(128);
						((ExMathOpContext)_localctx).right = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExLogicOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExLogicOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						((ExLogicOpContext)_localctx).op = match(LOGICOP);
						setState(131);
						((ExLogicOpContext)_localctx).right = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExAndOrOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExAndOrOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						((ExAndOrOpContext)_localctx).and = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((ExAndOrOpContext)_localctx).and = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						((ExAndOrOpContext)_localctx).right = expression(6);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\'\n\3\3\4\3\4\5\4+\n\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3"+
		"\4\7\4\65\n\4\f\4\16\48\13\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\5\4A\n\4"+
		"\3\4\3\4\3\5\3\5\5\5G\n\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7"+
		"\7c\n\7\f\7\16\7f\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13"+
		"\u008d\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\16\17\3\2\20"+
		"\22\3\2\27\30\2\u009a\2\26\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\bD\3\2\2\2\n"+
		"O\3\2\2\2\f^\3\2\2\2\16i\3\2\2\2\20n\3\2\2\2\22r\3\2\2\2\24~\3\2\2\2\26"+
		"\32\7\3\2\2\27\31\5\4\3\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32"+
		"\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7\4\2\2\36\37\7\2\2\3\37"+
		"\3\3\2\2\2 \'\5\6\4\2!\'\5\n\6\2\"\'\5\f\7\2#\'\5\16\b\2$\'\5\20\t\2%"+
		"\'\5\22\n\2& \3\2\2\2&!\3\2\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2"+
		"\2\'\5\3\2\2\2(*\7\5\2\2)+\7\31\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,\60"+
		"\5\24\13\2-/\5\4\3\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\66\3\2\2\2\62\60\3\2\2\2\63\65\5\b\5\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\67@\3\2\2\28\66\3\2\2\29=\7\6\2\2:<\5\4\3\2;:\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@9\3\2\2\2@A\3"+
		"\2\2\2AB\3\2\2\2BC\7\4\2\2C\7\3\2\2\2DF\7\7\2\2EG\7\31\2\2FE\3\2\2\2F"+
		"G\3\2\2\2GH\3\2\2\2HL\5\24\13\2IK\5\4\3\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2\2OP\7\b\2\2PQ\5\24\13\2QR\7\t\2\2RS\5"+
		"\24\13\2ST\7\n\2\2TU\7\37\2\2UY\7\13\2\2VX\5\4\3\2WV\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\4\2\2]\13\3\2\2\2^_\7\f"+
		"\2\2_`\5\24\13\2`d\7\13\2\2ac\5\4\3\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de"+
		"\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\4\2\2h\r\3\2\2\2ij\7\r\2\2jk\7\37\2\2"+
		"kl\t\2\2\2lm\t\3\2\2m\17\3\2\2\2no\7\37\2\2op\7\23\2\2pq\5\24\13\2q\21"+
		"\3\2\2\2rs\7\24\2\2st\5\24\13\2t\23\3\2\2\2uv\b\13\1\2vw\7\25\2\2wx\5"+
		"\24\13\2xy\7\26\2\2y\177\3\2\2\2z\177\7\37\2\2{\177\7\34\2\2|\177\7\35"+
		"\2\2}\177\7\36\2\2~u\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177"+
		"\u008b\3\2\2\2\u0080\u0081\f\t\2\2\u0081\u0082\7\32\2\2\u0082\u008a\5"+
		"\24\13\n\u0083\u0084\f\b\2\2\u0084\u0085\7\33\2\2\u0085\u008a\5\24\13"+
		"\t\u0086\u0087\f\7\2\2\u0087\u0088\t\4\2\2\u0088\u008a\5\24\13\b\u0089"+
		"\u0080\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\20\32&*\60\66=@FLYd~\u0089\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}