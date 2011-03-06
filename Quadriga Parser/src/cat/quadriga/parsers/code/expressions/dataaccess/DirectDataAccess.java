package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;

public abstract class DirectDataAccess extends ExpressionNodeClass implements DataAccess {
  
  public DirectDataAccess(CodeZone cz) {
    super(cz);
  }
  
  @Override
  public String[] getOperands() {
    return new String[0];
  }

  @Override
  public abstract DirectDataAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog);
}
