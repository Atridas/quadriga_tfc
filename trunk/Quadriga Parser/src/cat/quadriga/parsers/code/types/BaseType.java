package cat.quadriga.parsers.code.types;

import cat.quadriga.parsers.code.TreeRepresentable;

public interface BaseType extends TreeRepresentable {

  String getBinaryName();
  
  String getInstanceableName();
  
  boolean isValid();
  
  boolean isMathematicallyOperable();
  
  BaseType getMathematicResultType(BaseType other);
}
