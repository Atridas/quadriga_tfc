package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.runtime.RuntimeEnvironment;

public class StatementFromExpresion extends StatementNodeClass {

  public final ExpressionNode expression;
  
  public StatementFromExpresion(ExpressionNode expression) {
    super(expression);

    this.expression = expression;
  }

  @Override
  public String[] getOperands() {
    return expression.getOperands();
  }

  @Override
  public String getOperation() {
    return "Statement From Expression : " + expression.getOperation();
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
  
  @Override
  public void execute(RuntimeEnvironment runtime) {
    assert isCorrectlyLinked();
    expression.compute(runtime);
  }

}
