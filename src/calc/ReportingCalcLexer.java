package calc;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

import parser.CalcLexer;
import error.ErrorFlag;

public class ReportingCalcLexer extends CalcLexer {
  public ReportingCalcLexer(CharStream input) { 
    super(input); 
  } 
  public void recover(LexerNoViableAltException e) {
    ErrorFlag.set();
    super.recover(e);
  }
}

