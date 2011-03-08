package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public interface DataAccess extends ExpressionNode {
  public boolean isAssignable();
  public boolean isReadable();
  WriteAccess getWriteVersion();
  @Override
  DataAccess getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog);
}
