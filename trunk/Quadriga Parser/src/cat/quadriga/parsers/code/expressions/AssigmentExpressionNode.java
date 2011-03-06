package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.statements.AssigmentStatementNode;
import cat.quadriga.parsers.code.statements.AssigmentStatementNode.Operator;
import cat.quadriga.parsers.code.types.BaseType;

public final class AssigmentExpressionNode extends BinaryExpressionNode {

  public final AssigmentStatementNode statementEquivalent;
  
  public AssigmentExpressionNode(Operator operator, ExpressionNode left, ExpressionNode right) {
    super(left, right);

    statementEquivalent = new AssigmentStatementNode(operator, left, right);
  }

  @Override
  public String getOperation() {
    return statementEquivalent.getOperator().toString();
  }

  @Override
  public BaseType getType() {
    return statementEquivalent.leftOperand.getType();
  }

  @Override
  public AssigmentExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

}
