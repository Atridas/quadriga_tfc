package cat.quadriga.parsers.code.expressions;

public final class TernaryExpressionNode extends ExpressionNode {
  
  public final ExpressionNode boolValue, resultTrue, resultFalse;

  public TernaryExpressionNode(ExpressionNode boolValue, 
                              ExpressionNode resultTrue,
                              ExpressionNode resultFalse)
  {
    super(
        boolValue.beginLine,
        boolValue.beginColumn,
        resultTrue.endLine,
        resultFalse.endColumn
         );
    this.boolValue = boolValue;
    this.resultTrue = resultTrue;
    this.resultFalse = resultFalse;
  }

  @Override
  public String[] getOperands() {
    String out[] = {  boolValue.treeStringRepresentation(),
                      resultTrue.treeStringRepresentation(), 
                      resultFalse.treeStringRepresentation() 
                   };
    return out;
  }

  @Override
  public String getOperation() {
    return "?";
  }
}
