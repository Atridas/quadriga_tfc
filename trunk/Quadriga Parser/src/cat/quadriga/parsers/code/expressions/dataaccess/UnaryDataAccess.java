package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.UnaryExpressionNode;

public abstract class UnaryDataAccess extends UnaryExpressionNode implements DataAccess {

  public UnaryDataAccess(ExpressionNode operand, CodeZone cz) {
    super(operand, cz);
  }
  
  @Override
  public abstract UnaryDataAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog);

}
