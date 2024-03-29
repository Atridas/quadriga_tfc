package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;

public abstract class UnaryExpressionNode extends ExpressionNodeClass {

  public ExpressionNode operand;

  public UnaryExpressionNode(ExpressionNode operand, CodeZone cz) {
    super(cz);
    this.operand = operand;
  }

  @Override
  public String[] getOperands() {
    String out[] = { operand.treeStringRepresentation() };
    return out;
  }
  
  public ExpressionNode getOperant() {
    return operand;
  }
  
  @Override
  public abstract UnaryExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog);
}
