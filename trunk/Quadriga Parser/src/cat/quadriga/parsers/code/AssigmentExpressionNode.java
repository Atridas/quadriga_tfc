package cat.quadriga.parsers.code;

import cat.quadriga.parsers.code.AssigmentStatementNode.Operator;

public class AssigmentExpressionNode extends BinaryExpressionNode {

  private final AssigmentStatementNode statementEquivalent;
  
  public AssigmentExpressionNode(Operator operator, ExpressionNode left, ExpressionNode right) {
    super(left, right);

    statementEquivalent = new AssigmentStatementNode(operator, left, right);
  }

  @Override
  protected String getOperation() {
    return statementEquivalent.getOperator().toString();
  }

}
