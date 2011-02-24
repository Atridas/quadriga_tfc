package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.types.BaseType;

public class CastExpressionNode extends UnaryExpressionNode {

  public final BaseType newType;
  
  private final String operation;
  
  public CastExpressionNode(Token t, BaseType type, ExpressionNode castableExpression) {
    super(castableExpression, new CodeZoneClass(t, castableExpression));
    newType = type;
    
    operation = "cast " + newType.getBinaryName();
  }

  @Override
  public String getOperation() {
    return operation;
  }

  @Override
  public BaseType getType() {
    return newType;
  }

}
