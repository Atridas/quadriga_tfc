package cat.quadriga.parsers.code.types.qdg;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.runtime.RuntimeSystem;

public interface QuadrigaSystem extends BaseType, TreeRepresentable {

  @Override
  public RuntimeSystem getValid(SymbolTable symbolTable, ErrorLog errorLog);
}
