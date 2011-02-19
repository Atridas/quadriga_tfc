package cat.quadriga.parsers.code;

public final class TernaryExpressionNode extends ExpressionNode {
  
  private ExpressionNode boolValue, result1, result2;

  public TernaryExpressionNode(ExpressionNode boolValue, 
                              ExpressionNode result1,
                              ExpressionNode result2)
  {
    this.boolValue = boolValue;
    this.result1 = result1;
    this.result2 = result2;
  }

  @Override
  protected String[] getOperants() {
    String out[] = {  boolValue.treeStringRepresentation(),
                      result1.treeStringRepresentation(), 
                      result2.treeStringRepresentation() 
                   };
    return out;
  }

  @Override
  protected String getOperation() {
    return "?";
  }
}
