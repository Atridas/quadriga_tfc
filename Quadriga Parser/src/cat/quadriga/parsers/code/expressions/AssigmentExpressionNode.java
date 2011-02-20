package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.statements.AssigmentStatementNode;
import cat.quadriga.parsers.code.statements.AssigmentStatementNode.Operator;

public class AssigmentExpressionNode extends BinaryExpressionNode {

  public final AssigmentStatementNode statementEquivalent;
  
  public AssigmentExpressionNode(Operator operator, ExpressionNode left, ExpressionNode right) {
    super(left, right);

    statementEquivalent = new AssigmentStatementNode(operator, left, right);
  }

  @Override
  public String getOperation() {
    return statementEquivalent.getOperator().toString();
  }

}
