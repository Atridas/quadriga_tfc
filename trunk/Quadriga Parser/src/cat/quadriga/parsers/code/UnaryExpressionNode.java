package cat.quadriga.parsers.code;

public abstract class UnaryExpressionNode extends ExpressionNode {

  private ExpressionNode operand;

  public UnaryExpressionNode(ExpressionNode operand, int beginLine, int beginColumn, int endLine, int endColumn) {
    super(beginLine, beginColumn, endLine, endColumn);
    this.operand = operand;
  }

  @Override
  protected String[] getOperands() {
    String out[] = { operand.treeStringRepresentation() };
    return out;
  }
  
  public ExpressionNode getOperant() {
    return operand;
  }

}
