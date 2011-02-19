package cat.quadriga.parsers.code;

public final class TernaryExpressionNode extends ExpressionNode {
  
  private ExpressionNode boolValue, resultTrue, resultFalse;

  public TernaryExpressionNode(ExpressionNode boolValue, 
                              ExpressionNode resultTrue,
                              ExpressionNode resultFalse)
  {
    super(
        boolValue.getBeginLine(),
        boolValue.getBeginColumn(),
        resultTrue.getEndLine(),
        resultFalse.getEndColumn()
         );
    this.boolValue = boolValue;
    this.resultTrue = resultTrue;
    this.resultFalse = resultFalse;
  }

  @Override
  protected String[] getOperands() {
    String out[] = {  boolValue.treeStringRepresentation(),
                      resultTrue.treeStringRepresentation(), 
                      resultFalse.treeStringRepresentation() 
                   };
    return out;
  }

  @Override
  protected String getOperation() {
    return "?";
  }
}
