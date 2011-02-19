package cat.quadriga.parsers.code;

public abstract class BinaryExpressionNode extends ExpressionNode {

  private ExpressionNode operant1, operant2;

  public BinaryExpressionNode(ExpressionNode operant1, ExpressionNode operant2) {
    this.operant1 = operant1;
    this.operant2 = operant2;
  }

  @Override
  protected String[] getOperants() {
    String out[] = {  operant1.treeStringRepresentation(), 
                      operant2.treeStringRepresentation() 
                   };
    return out;
  }
  
  public ExpressionNode getOperant1() {
    return operant1;
  }
  
  public ExpressionNode getOperant2() {
    return operant2;
  }
}
