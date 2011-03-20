package cat.quadriga.parsers.code.types.qdg;

import java.util.Set;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.types.BaseType;

public interface QuadrigaEvent extends BaseType, TreeRepresentable {

  public QuadrigaField getField(String name);
  
  public String getDescription();
  
  public Set<String> getAllFields();
  
  @Override
  public QuadrigaEvent getValid(SymbolTable symbolTable, ErrorLog errorLog);
}
