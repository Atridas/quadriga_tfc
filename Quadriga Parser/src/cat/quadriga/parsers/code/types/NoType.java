package cat.quadriga.parsers.code.types;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;

public class NoType extends BaseTypeClass {
  
  public static NoType instance = new NoType();

  private NoType() {
    super("No type");
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return UnknownType.empty;
  }

  @Override
  public NoType getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    return this;
  }

  @Override
  public boolean isValid() {
    return true;
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return false;
  }

  @Override
  public boolean isSerializable() {
    return false;
  }
  
}
