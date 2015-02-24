package parser;

// Generated from C:\Users\User1\Downloads\Calc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, IDENTIFIER=20, LITERAL=21, BOOLEAN=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'+'", "'*'", "'-'", "'define'", "'('", "':'", "'<'", 
		"'='", "'!='", "'<='", "'&&'", "'?'", "'||'", "'>'", "'/'", "'=='", "'>='", 
		"'!'", "IDENTIFIER", "LITERAL", "BOOLEAN", "WS"
	};
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_head = 2, RULE_body = 3, RULE_definition = 4, 
		RULE_expression = 5, RULE_variableId = 6, RULE_functionId = 7;
	public static final String[] ruleNames = {
		"program", "function", "head", "body", "definition", "expression", "variableId", 
		"functionId"
	};

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(16); function();
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(22); body();
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

	public static class FunctionContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(6);
			setState(25); match(5);
			setState(26); head();
			setState(27); body();
			setState(28); match(1);
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

	public static class HeadContext extends ParserRuleContext {
		public List<VariableIdContext> variableId() {
			return getRuleContexts(VariableIdContext.class);
		}
		public FunctionIdContext functionId() {
			return getRuleContext(FunctionIdContext.class,0);
		}
		public VariableIdContext variableId(int i) {
			return getRuleContext(VariableIdContext.class,i);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(6);
			setState(31); functionId();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(32); variableId();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38); match(1);
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

	public static class BodyContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(40); definition();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(46); expression(0);
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

	public static class DefinitionContext extends ParserRuleContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(6);
			setState(49); match(9);
			setState(50); variableId();
			setState(51); expression(0);
			setState(52); match(1);
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
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class CondExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CondExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitCondExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunCallContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionIdContext functionId() {
			return getRuleContext(FunctionIdContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends ExpressionContext {
		public TerminalNode LITERAL() { return getToken(CalcParser.LITERAL, 0); }
		public LiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(55);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==19) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(56); expression(10);
				}
				break;

			case 2:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57); functionId();
				setState(58); match(6);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 6) | (1L << 19) | (1L << IDENTIFIER) | (1L << LITERAL))) != 0)) {
					{
					{
					setState(59); expression(0);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65); match(1);
				}
				break;

			case 3:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67); match(6);
				setState(68); expression(0);
				setState(69); match(1);
				}
				break;

			case 4:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71); match(LITERAL);
				}
				break;

			case 5:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72); variableId();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(76);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==16) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(77); expression(10);
						}
						break;

					case 2:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(79);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==4) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(80); expression(9);
						}
						break;

					case 3:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(82);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15) | (1L << 18))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(83); expression(8);
						}
						break;

					case 4:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(85);
						_la = _input.LA(1);
						if ( !(_la==10 || _la==17) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(86); expression(7);
						}
						break;

					case 5:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						{
						setState(88); match(12);
						}
						setState(89); expression(6);
						}
						break;

					case 6:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						{
						setState(91); match(14);
						}
						setState(92); expression(5);
						}
						break;

					case 7:
						{
						_localctx = new CondExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(94); match(13);
						setState(95); expression(0);
						setState(96); match(7);
						setState(97); expression(3);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class VariableIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CalcParser.IDENTIFIER, 0); }
		public VariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitVariableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdContext variableId() throws RecognitionException {
		VariableIdContext _localctx = new VariableIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(IDENTIFIER);
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

	public static class FunctionIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CalcParser.IDENTIFIER, 0); }
		public FunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdContext functionId() throws RecognitionException {
		FunctionIdContext _localctx = new FunctionIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(IDENTIFIER);
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
		case 5: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 9 >= _localctx._p;

		case 1: return 8 >= _localctx._p;

		case 2: return 7 >= _localctx._p;

		case 3: return 6 >= _localctx._p;

		case 4: return 5 >= _localctx._p;

		case 5: return 4 >= _localctx._p;

		case 6: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\31o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4$\n\4\f\4"+
		"\16\4\'\13\4\3\4\3\4\3\5\7\5,\n\5\f\5\16\5/\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7f\n\7\f\7"+
		"\16\7i\13\7\3\b\3\b\3\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\7\4\2\6\6\25\25"+
		"\4\2\5\5\22\22\4\2\4\4\6\6\6\2\n\n\r\r\21\21\24\24\4\2\f\f\23\23u\2\25"+
		"\3\2\2\2\4\32\3\2\2\2\6 \3\2\2\2\b-\3\2\2\2\n\62\3\2\2\2\fK\3\2\2\2\16"+
		"j\3\2\2\2\20l\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\5\b\5\2\31\3"+
		"\3\2\2\2\32\33\7\b\2\2\33\34\7\7\2\2\34\35\5\6\4\2\35\36\5\b\5\2\36\37"+
		"\7\3\2\2\37\5\3\2\2\2 !\7\b\2\2!%\5\20\t\2\"$\5\16\b\2#\"\3\2\2\2$\'\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\3\2\2)\7\3\2\2\2*"+
		",\5\n\6\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2"+
		"\2\60\61\5\f\7\2\61\t\3\2\2\2\62\63\7\b\2\2\63\64\7\13\2\2\64\65\5\16"+
		"\b\2\65\66\5\f\7\2\66\67\7\3\2\2\67\13\3\2\2\289\b\7\1\29:\t\2\2\2:L\5"+
		"\f\7\2;<\5\20\t\2<@\7\b\2\2=?\5\f\7\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A"+
		"\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\3\2\2DL\3\2\2\2EF\7\b\2\2FG\5\f\7\2G"+
		"H\7\3\2\2HL\3\2\2\2IL\7\27\2\2JL\5\16\b\2K8\3\2\2\2K;\3\2\2\2KE\3\2\2"+
		"\2KI\3\2\2\2KJ\3\2\2\2Lg\3\2\2\2MN\6\7\2\3NO\t\3\2\2Of\5\f\7\2PQ\6\7\3"+
		"\3QR\t\4\2\2Rf\5\f\7\2ST\6\7\4\3TU\t\5\2\2Uf\5\f\7\2VW\6\7\5\3WX\t\6\2"+
		"\2Xf\5\f\7\2YZ\6\7\6\3Z[\7\16\2\2[f\5\f\7\2\\]\6\7\7\3]^\7\20\2\2^f\5"+
		"\f\7\2_`\6\7\b\3`a\7\17\2\2ab\5\f\7\2bc\7\t\2\2cd\5\f\7\2df\3\2\2\2eM"+
		"\3\2\2\2eP\3\2\2\2eS\3\2\2\2eV\3\2\2\2eY\3\2\2\2e\\\3\2\2\2e_\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\r\3\2\2\2ig\3\2\2\2jk\7\26\2\2k\17\3\2"+
		"\2\2lm\7\26\2\2m\21\3\2\2\2\t\25%-@Keg";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}