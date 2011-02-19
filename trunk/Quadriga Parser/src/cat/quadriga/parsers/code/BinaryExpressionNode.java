package cat.quadriga.parsers.code;

public abstract class BinaryExpressionNode extends ExpressionNode {

  private ExpressionNode leftOperand, rightOperand;

  public BinaryExpressionNode(ExpressionNode left, ExpressionNode right) {
    super(
        left.getBeginLine(),
        left.getBeginColumn(),
        right.getEndLine(),
        right.getEndColumn()
         );
    leftOperand = left;
    rightOperand = right;
  }

  @Override
  protected String[] getOperands() {
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
