package parser;

// Generated from C:\Users\User1\Downloads\Calc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, IDENTIFIER=20, LITERAL=21, BOOLEAN=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'+'", "'*'", "'-'", "'define'", "'('", "':'", "'<'", "'='", "'!='", 
		"'<='", "'&&'", "'?'", "'||'", "'>'", "'/'", "'=='", "'>='", "'!'", "IDENTIFIER", 
		"LITERAL", "BOOLEAN", "WS"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "IDENTIFIER", "LITERAL", "BOOLEAN", "WS"
	};


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 22: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\7\25e\n\25\f\25\16\25h\13\25\3\26\3\26\3\26\7\26m\n\26\f"+
		"\26\16\26p\13\26\5\26r\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27}\n\27\3\30\3\30\3\30\3\30\2\31\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1"+
		"\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\2\3\2\4\4\2\62;c"+
		"|\5\2\13\f\17\17\"\"\u0085\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67"+
		"\3\2\2\2\139\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25"+
		"H\3\2\2\2\27K\3\2\2\2\31N\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37V\3\2\2\2"+
		"!X\3\2\2\2#Z\3\2\2\2%]\3\2\2\2\'`\3\2\2\2)b\3\2\2\2+q\3\2\2\2-|\3\2\2"+
		"\2/~\3\2\2\2\61\62\7+\2\2\62\4\3\2\2\2\63\64\7-\2\2\64\6\3\2\2\2\65\66"+
		"\7,\2\2\66\b\3\2\2\2\678\7/\2\28\n\3\2\2\29:\7f\2\2:;\7g\2\2;<\7h\2\2"+
		"<=\7k\2\2=>\7p\2\2>?\7g\2\2?\f\3\2\2\2@A\7*\2\2A\16\3\2\2\2BC\7<\2\2C"+
		"\20\3\2\2\2DE\7>\2\2E\22\3\2\2\2FG\7?\2\2G\24\3\2\2\2HI\7#\2\2IJ\7?\2"+
		"\2J\26\3\2\2\2KL\7>\2\2LM\7?\2\2M\30\3\2\2\2NO\7(\2\2OP\7(\2\2P\32\3\2"+
		"\2\2QR\7A\2\2R\34\3\2\2\2ST\7~\2\2TU\7~\2\2U\36\3\2\2\2VW\7@\2\2W \3\2"+
		"\2\2XY\7\61\2\2Y\"\3\2\2\2Z[\7?\2\2[\\\7?\2\2\\$\3\2\2\2]^\7@\2\2^_\7"+
		"?\2\2_&\3\2\2\2`a\7#\2\2a(\3\2\2\2bf\4c|\2ce\t\2\2\2dc\3\2\2\2eh\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2g*\3\2\2\2hf\3\2\2\2ir\7\62\2\2jn\4\63;\2km\4\62"+
		";\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qi\3\2"+
		"\2\2qj\3\2\2\2r,\3\2\2\2st\7v\2\2tu\7t\2\2uv\7w\2\2v}\7g\2\2wx\7h\2\2"+
		"xy\7c\2\2yz\7n\2\2z{\7u\2\2{}\7g\2\2|s\3\2\2\2|w\3\2\2\2}.\3\2\2\2~\177"+
		"\t\3\2\2\177\u0080\3\2\2\2\u0080\u0081\b\30\2\2\u0081\60\3\2\2\2\7\2f"+
		"nq|";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}