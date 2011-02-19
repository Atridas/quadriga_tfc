package cat.quadriga.parsers.code;

import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.printers.MegaPrinter;
import cat.quadriga.parsers.code.printers.PrintInfo;

public class ProxyExpression extends ExpressionNode {
  
  private final String operator;
  private final String[] operands;
  
  public ProxyExpression(List<PrintInfo> in, Token firstToken, Token lastToken)
  {
    super(
        firstToken.beginLine,
        firstToken.beginColumn,
        lastToken.endLine,
        lastToken.endColumn
         );
    MegaPrinter printer = MegaPrinter.getInstance();
    
    String aux = printer.print(in);
    
    String aux2[] = aux.split("\n");

    if(aux2.length == 1) {
      operator = ">> proxy [ " + aux2[0] + " ]";
      operands = new String[0];
    } else {
      operator = ">> proxy <<";
      operands = aux2;
    }
  }
  
  public ProxyExpression(List<PrintInfo> in, int beginLine, int beginColumn, int endLine, int endColumn)
  {
    super(
        beginLine,
        beginColumn,
        endLine,
        endColumn
         );
    MegaPrinter printer = MegaPrinter.getInstance();
    
    String aux = printer.print(in);
    
    String aux2[] = aux.split("\n");
    
    if(aux2.length == 1) {
      operator = ">> proxy [ " + aux2[0] + " ]";
      operands = new String[0];
    } else {
      operator = ">> proxy <<";
      operands = aux2;
    }
  }

  @Override
  protected String[] getOperands() {
    return operands;
  }

  @Override
  protected String getOperation() {
    return operator;
  }
}
