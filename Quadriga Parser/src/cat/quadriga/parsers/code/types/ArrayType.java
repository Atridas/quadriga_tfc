package cat.quadriga.parsers.code.types;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.JavaReference;

public final class ArrayType extends ReferenceTypeRef {
  
  public final BaseType base;

  public ArrayType(BaseType base) {
    super(createArrayClass(base), "[" + base.getBinaryName());
    
    this.base = base;
  }
  
  private static Class<?> createArrayClass(BaseType base) {
    String arrayClassName;
    if(base instanceof UnknownType) {
      arrayClassName = "[Lcat.quadriga.parsers.code.types.UnknownType;";
    } else {
      arrayClassName = "[" + base.getInstanceableName();
    }
    
    try {
      return Class.forName(arrayClassName);
    } catch (ClassNotFoundException e) {
      throw new IllegalArgumentException("No es pot instanciar la classe " + arrayClassName);
    }
  }

  @Override
  public boolean isValid() {
    return base.isValid();
  }

  @Override
  public ArrayType getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(base.isValid()) {
      return this;
    }
    BaseType base = this.base.getValid(symbolTable, errorLog);
    if(base == null) {
      return null;
    }
    return new ArrayType(base);
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    if(rightOperand instanceof ArrayType) {
      return base.isAssignableFrom(((ArrayType)rightOperand).base);
    } else if(rightOperand instanceof NullType) {
      return true;
    }
    return false;
  }

  @Override
  public ComputedValue getDefaultValue() {
    return new JavaReference(null);
  }

  @Override
  public boolean isSerializable() {
    return base.isSerializable();
  }

}
