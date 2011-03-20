package cat.quadriga.parsers.code.types.qdg;

import java.util.Set;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.types.BaseType;

public interface QuadrigaComponent extends BaseType, TreeRepresentable {
  
  public QuadrigaField getField(String name);
  
  public String getDescription();
  
  public Set<String> getAllFields();
  
  public Set<QuadrigaComponent> getDependencies();
  
  @Override
  public QuadrigaComponent getValid(SymbolTable symbolTable, ErrorLog errorLog);
}
