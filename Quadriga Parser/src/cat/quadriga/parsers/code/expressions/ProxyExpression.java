package cat.quadriga.parsers.code.expressions;

import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.printers.MegaPrinter;
import cat.quadriga.parsers.code.printers.PrintInfo;

public class ProxyExpression extends ExpressionNodeClass {
  
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
  
  public ProxyExpression(List<PrintInfo> in)
  {
    super(0,0,0,0);
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
  
  public ProxyExpression(String in)
  {
    super(0,0,0,0);
    
    
    operator = ">> proxy [ " + in + " ]";
    operands = new String[0];
    
  }
  
  public ProxyExpression(String in, Token firstToken, Token lastToken)
  {
    super(
        firstToken.beginLine,
        firstToken.beginColumn,
        lastToken.endLine,
        lastToken.endColumn
        );
    
    
    operator = ">> proxy [ " + in + " ]";
    operands = new String[0];
  }
  
  public ProxyExpression(String in, CodeZone firstZone, CodeZone lastZone)
  {
    super(
        firstZone.beginLine(),
        firstZone.beginColumn(),
        lastZone.endLine(),
        lastZone.endColumn()
        );
    
    
    operator = ">> proxy [ " + in + " ]";
    operands = new String[0];
  }
  
  public ProxyExpression(String in, int beginLine, int beginColumn, int endLine, int endColumn)
  {
    super(
        beginLine,
        beginColumn,
        endLine,
        endColumn
        );
    
    
    operator = ">> proxy [ " + in + " ]";
    operands = new String[0];
  }

  @Override
  public String[] getOperands() {
    return operands.clone();
  }

  @Override
  public String getOperation() {
    return operator;
  }
}
