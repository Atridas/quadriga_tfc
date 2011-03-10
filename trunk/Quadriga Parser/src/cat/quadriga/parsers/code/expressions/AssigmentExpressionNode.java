package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
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

  private AssigmentExpressionNode(AssigmentStatementNode asn) {
    super(asn.leftOperand, asn.rightOperand);
    statementEquivalent = asn;
  }
  
  private AssigmentExpressionNode linkedVersion = null;
  @Override
  public AssigmentExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(isCorrectlyLinked()) {
      return this;
    } else if(linkedVersion == null) {
      AssigmentStatementNode asn = statementEquivalent.getLinkedVersion(symbolTable, errorLog);
      if(asn == null) {
        return null;
      }
      linkedVersion = new AssigmentExpressionNode(asn);
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return statementEquivalent.isCorrectlyLinked();
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }

}
