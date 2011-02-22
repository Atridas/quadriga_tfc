package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;

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
}
