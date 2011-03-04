package cat.quadriga.parsers.code.types;

public interface BaseType {

  String getBinaryName();
  
  String getInstanceableName();
  
  boolean isValid();
  
  boolean isMathematicallyOperable();
  
  BaseType getMathematicResultType(BaseType other);
}
