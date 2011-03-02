package cat.quadriga.parsers.code.types;

public final class PrimitiveTypeRef extends JavaType {

  public final Type type;
  
  private PrimitiveTypeRef(Type t) {
    super(t.getClassObject(), t.getBinaryName());
    type = t;
  }
  
  public Type getType() {
    return type;
  }
  
  public static PrimitiveTypeRef getFromClass(Class<?> c) {
    for(Type t: Type.values()) {
      if(t.getClassObject() == c) {
        return t.pt;
      }
    }
    throw new IllegalArgumentException("Not a Primitive type: " + c.toString()); 
  }
  
  public static PrimitiveTypeRef getFromType(Type t) {
    return t.pt;
  }
  
  public static PrimitiveTypeRef getFromName(String name) {
    if(name.compareTo("void") == 0) {
      return Type.VOID.pt;
    } else if(name.compareTo("int") == 0) {
      return Type.INT.pt;
    } else if(name.compareTo("long") == 0) {
      return Type.LONG.pt;
    } else if(name.compareTo("short") == 0) {
      return Type.SHORT.pt;
    } else if(name.compareTo("char") == 0) {
      return Type.CHAR.pt;
    } else if(name.compareTo("byte") == 0) {
      return Type.BYTE.pt;
    } else if(name.compareTo("float") == 0) {
      return Type.FLOAT.pt;
    } else if(name.compareTo("double") == 0) {
      return Type.DOUBLE.pt;
    } else if(name.compareTo("boolean") == 0) {
      return Type.BOOLEAN.pt;
    }
    throw new IllegalArgumentException("Tipus no primitiu: " + name);
  }
  
  public static enum Type {
    VOID(void.class, "V"),
    INT(int.class, "I"),
    LONG(long.class, "J"),
    SHORT(short.class, "S"),
    CHAR(char.class, "C"),
    BYTE(byte.class, "B"),
    FLOAT(float.class, "F"),
    DOUBLE(double.class, "D"),
    BOOLEAN(boolean.class, "Z");
    
    private Class<?> cl;
    private String   binaryName;
    PrimitiveTypeRef pt;
    private Type(Class<?> c, String bn) {
      cl = c;
      binaryName = bn;
      pt = new PrimitiveTypeRef(this);
    }
    public Class<?> getClassObject() {
      return cl;
    }
    public String getBinaryName() {
      return binaryName;
    }
  }

  @Override
  public boolean isMathematicallyOperable() {
    switch(type) {
    case VOID:
    case BOOLEAN:
      return false;
    case INT:
    case LONG:
    case SHORT:
    case CHAR:
    case BYTE:
    case FLOAT:
    case DOUBLE:
      return true;
    default:
      assert false : "No s'hauria d'arribar mai aqui";
    }
    
    return false;
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    //Trobar el tipus de l'altre
    PrimitiveTypeRef prim;
    if(other instanceof PrimitiveTypeRef) {
      prim = (PrimitiveTypeRef)other;
    } else if(other instanceof ReferenceTypeRef) {
      other = ((ReferenceTypeRef)other).toPrimitiveType();
      if(other instanceof PrimitiveTypeRef) {
        prim = (PrimitiveTypeRef)other;
      } else {
        return UnknownType.empty;
      }
    } else {
      return UnknownType.empty;
    }
    
    switch(type) {
    case BYTE:
      switch(prim.type) {
      case BYTE:
        return this;
      case CHAR:
      case SHORT:
      case INT:
      case FLOAT:
      case DOUBLE:
        return prim;
      }
      break;
    case CHAR:
      switch(prim.type) {
      case BYTE:
      case CHAR:
        return this;
      case SHORT:
      case INT:
      case FLOAT:
      case DOUBLE:
        return prim;
      }
      break;
    case SHORT:
      switch(prim.type) {
      case BYTE:
      case CHAR:
      case SHORT:
        return this;
      case INT:
      case FLOAT:
      case DOUBLE:
        return prim;
      }
      break;
    case INT:
      switch(prim.type) {
      case BYTE:
      case CHAR:
      case SHORT:
      case INT:
        return this;
      case FLOAT:
      case DOUBLE:
        return prim;
      }
      break;
    case FLOAT:
      switch(prim.type) {
      case BYTE:
      case CHAR:
      case SHORT:
      case INT:
      case FLOAT:
        return this;
      case DOUBLE:
        return prim;
      }
      break;
    case DOUBLE:
      switch(prim.type) {
      case BYTE:
      case CHAR:
      case SHORT:
      case INT:
      case FLOAT:
      case DOUBLE:
        return this;
      }
      break;
    }
    return UnknownType.empty;
  }
}

/*case INT:
    case LONG:
    case SHORT:
    case CHAR:
    case BYTE:
    case FLOAT:
    case DOUBLE:*/