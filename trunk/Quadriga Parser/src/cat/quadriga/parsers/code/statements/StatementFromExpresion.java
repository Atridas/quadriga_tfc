package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class StatementFromExpresion extends StatementNodeClass {

  public final ExpressionNode expression;
  
  public StatementFromExpresion(ExpressionNode expression) {
    super(expression);

    this.expression = expression;
  }

  @Override
  public String treeStringRepresentation() {
    return "St: " + Utils.treeStringRepresentation(expression.getOperation(), 
                                                   expression.getOperands());
  }
  
  @Override
  public StatementFromExpresion getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(isCorrectlyLinked()) {
      return this;
    }
    ExpressionNode en = expression.getLinkedVersion(symbolTable, errorLog);
    if(en == null)
      return null;
    else
      return new StatementFromExpresion(en);
  }

  @Override
  public boolean isCorrectlyLinked() {
    return expression.isCorrectlyLinked();
  }

}
