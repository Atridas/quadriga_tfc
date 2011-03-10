package cat.quadriga.parsers.code.types.qdg;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.types.BaseType;

public interface QuadrigaMain extends BaseType, TreeRepresentable {

  @Override
  public QuadrigaMain getValid(SymbolTable symbolTable, ErrorLog errorLog);

}
