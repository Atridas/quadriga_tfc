package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZoneClass;

public abstract class BinaryExpressionNode extends ExpressionNodeClass {

  public ExpressionNode leftOperand, rightOperand;

  public BinaryExpressionNode(ExpressionNode left, ExpressionNode right) {
    super(new CodeZoneClass(left,right));
    leftOperand = left;
    rightOperand = right;
  }

  @Override
  public String[] getOperands() {
    String out[] = {  leftOperand.treeStringRepresentation(), 
                      rightOperand.treeStringRepresentation() 
                   };
    return out;
  }
  
  public ExpressionNode getLeftOperand() {
    return leftOperand;
  }
  
  public ExpressionNode getRightOperand() {
    return rightOperand ;
  }
}
