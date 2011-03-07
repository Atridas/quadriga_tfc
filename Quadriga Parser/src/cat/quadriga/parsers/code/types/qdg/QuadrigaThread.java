package cat.quadriga.parsers.code.types.qdg;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;

public interface QuadrigaThread extends BaseType {

  @Override
  public QuadrigaThread getValid(SymbolTable symbolTable, ErrorLog errorLog);
}
