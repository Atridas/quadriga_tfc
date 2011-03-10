package cat.quadriga.parsers.code.types;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.runtime.ComputedValue;

public abstract class JavaType extends BaseTypeClass {

  public final Class<?> classObject;
  
  public JavaType(Class<?> c, String binaryName) {
    super(binaryName);
    classObject = c;
  }
  
  public final Class<?> getClassObject() {
    return classObject;
  }
  
  @Override
  public abstract JavaType getValid(SymbolTable symbolTable, ErrorLog errorLog);
  
  public abstract ComputedValue getDefaultValue();
}
