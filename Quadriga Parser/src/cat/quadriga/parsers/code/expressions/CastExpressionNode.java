package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.types.BaseType;

public class CastExpressionNode extends UnaryExpressionNode {

  public final BaseType newType;
  
  private final String operation;
  
  public CastExpressionNode(Token t, BaseType type, ExpressionNode castableExpresion) {
    super(castableExpresion, 
          t.beginLine, t.beginColumn, 
          castableExpresion.endLine(), castableExpresion.endColumn());
    newType = type;
    
    operation = "cast " + newType.getBinaryName();
  }

  @Override
  public String getOperation() {
    return operation;
  }

}
