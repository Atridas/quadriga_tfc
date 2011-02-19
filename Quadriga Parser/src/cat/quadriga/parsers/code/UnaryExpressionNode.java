package cat.quadriga.parsers.code;

public abstract class UnaryExpressionNode extends ExpressionNode {

  private ExpressionNode operant;

  public UnaryExpressionNode(ExpressionNode operant) {
    this.operant = operant;
  }

  @Override
  protected String[] getOperants() {
    String out[] = { operant.treeStringRepresentation() };
    return out;
  }
  
  public ExpressionNode getOperant() {
    return operant;
  }

}
