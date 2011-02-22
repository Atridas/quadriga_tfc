package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;

public abstract class UnaryExpressionNode extends ExpressionNodeClass {

  public final ExpressionNode operand;

  public UnaryExpressionNode(ExpressionNode operand, CodeZone cz) {
    super(cz);
    this.operand = operand;
  }

  @Override
  public String[] getOperands() {
    String out[] = { operand.treeStringRepresentation() };
    return out;
  }
  
  public ExpressionNode getOperant() {
    return operand;
  }

}
