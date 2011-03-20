package cat.quadriga.runtime;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NullType;

public class JavaReference implements ComputedValue {
  
  public Object reference;
  
  public JavaReference(Object ref) {
    reference = ref;
  }

  @Override
  public BaseType getType() {
    if(reference == null) return NullType.instance;
    return Utils.createType(reference.getClass());
  }

  @Override
  public String getStringValue() {
    if(reference == null) return "null";
    return reference.toString();
  }

  @Override
  public void set(ComputedValue other) {
    if(other instanceof JavaReference) {
      reference = ((JavaReference) other).reference;
    }
  }

  
  public boolean getAsBool() {
    if(reference instanceof Boolean) {
      return ((Boolean)reference).booleanValue();
    }
    throw new IllegalStateException();
  }
  public char getAsChar() {
    if(reference instanceof Character) {
      return ((Character)reference).charValue();
    }
    throw new IllegalStateException();
  }
  
  public byte getAsByte() { //TODO copiar lo de dalt
    throw new IllegalStateException();
  }
  public short getAsShort() {
    throw new IllegalStateException();
  }
  public int getAsInt() {
    throw new IllegalStateException();
  }
  public long getAsLong() {
    throw new IllegalStateException();
  }
  public float getAsFloat() {
    throw new IllegalStateException();
  }
  public double getAsDouble() {
    throw new IllegalStateException();
  }
  public Object getAsObject() {
    return reference;
  }
}
