package cat.quadriga.parsers.code.expressions;

public abstract class BinaryExpressionNode extends ExpressionNode {

  public final ExpressionNode leftOperand, rightOperand;

  public BinaryExpressionNode(ExpressionNode left, ExpressionNode right) {
    super(
        left.beginLine,
        left.beginColumn,
        right.endLine,
        right.endColumn
         );
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
