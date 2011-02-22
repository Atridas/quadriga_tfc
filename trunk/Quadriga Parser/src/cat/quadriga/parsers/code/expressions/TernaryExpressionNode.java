package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZoneClass;

public final class TernaryExpressionNode extends ExpressionNodeClass {
  
  public final ExpressionNode boolValue, resultTrue, resultFalse;

  public TernaryExpressionNode(ExpressionNode boolValue, 
                              ExpressionNode resultTrue,
                              ExpressionNode resultFalse)
  {
    super( new CodeZoneClass(boolValue,resultFalse) );
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
