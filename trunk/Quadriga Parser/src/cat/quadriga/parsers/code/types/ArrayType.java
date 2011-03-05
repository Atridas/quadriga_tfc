package cat.quadriga.parsers.code.types;

public final class ArrayType extends ReferenceTypeRef {
  
  public final BaseType base;
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((base == null) ? 0 : base.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    ArrayType other = (ArrayType) obj;
    if (base == null) {
      if (other.base != null)
        return false;
    } else if (!base.equals(other.base))
      return false;
    return true;
  }

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

}
