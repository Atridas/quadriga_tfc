package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class ReturnStatementNode extends StatementNodeClass {
  
  public final ExpressionNode returnExpression;

  public ReturnStatementNode(ExpressionNode returnExpression, CodeZone cz) {
    super(cz);
    this.returnExpression = returnExpression;
  }

  public ReturnStatementNode(CodeZone cz) {
    super(cz);
    this.returnExpression = null;
  }

  @Override
  public String[] getOperands() {
    if(returnExpression == null) {
      String[] aux = {};
      return aux;
    } else {
      String[] aux = {returnExpression.treeStringRepresentation()};
      return aux;
    }
  }

  @Override
  public String getOperation() {
    return "Return";
  }
  
  //TODO trobar la funcio actual i el tipus de retorn, no???
  @Override
  public ReturnStatementNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(isCorrectlyLinked()) {
      return this;
    }
    ExpressionNode en = returnExpression.getLinkedVersion(symbolTable, errorLog);
    if(en == null)
      return null;
    else
      return new ReturnStatementNode(en, this);
  }

  @Override
  public boolean isCorrectlyLinked() {
    if(returnExpression == null) return true;
    else return returnExpression.isCorrectlyLinked();
  }

}
