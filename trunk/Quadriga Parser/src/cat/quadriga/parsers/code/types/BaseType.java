package cat.quadriga.parsers.code.types;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.TreeRepresentable;

public interface BaseType extends TreeRepresentable {
  
  boolean isAssignableFrom(BaseType rightOperand);

  String getBinaryName();
  
  String getInstanceableName();
  
  boolean isValid();
  
  BaseType getValid(SymbolTable symbolTable, ErrorLog errorLog);
  
  boolean isMathematicallyOperable();
  
  BaseType getMathematicResultType(BaseType other);
}
