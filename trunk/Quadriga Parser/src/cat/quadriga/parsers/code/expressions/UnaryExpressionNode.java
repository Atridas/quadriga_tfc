package cat.quadriga.parsers.code.expressions;

public abstract class UnaryExpressionNode extends ExpressionNode {

  public final ExpressionNode operand;

  public UnaryExpressionNode(ExpressionNode operand, int beginLine, int beginColumn, int endLine, int endColumn) {
    super(beginLine, beginColumn, endLine, endColumn);
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
