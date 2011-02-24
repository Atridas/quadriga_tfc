package cat.quadriga.parsers.code.proxy;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.UnaryExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;

public class UnaryProxy extends UnaryExpressionNode {
  
  private final String operation;

  public UnaryProxy(ExpressionNode operator, CodeZone cz) {
    super(operator, cz);
    operation = ">> unary proxy <<";
  }

  public UnaryProxy(ExpressionNode operator) {
    super(operator, new CodeZoneClass(0,0,0,0));
    operation = ">> unary proxy <<";
  }

  public UnaryProxy(String operation, ExpressionNode operator, CodeZone cz) {
    super(operator,cz);
    this.operation = operation;
  }

  public UnaryProxy(String operation, ExpressionNode operator) {
    super(operator, new CodeZoneClass(0,0,0,0));
    this.operation = operation;
  }
  
  @Override
  public String getOperation() {
    return operation;
  }

  @Override
  public BaseType getType() {
    return UnknownType.empty;
  }
}