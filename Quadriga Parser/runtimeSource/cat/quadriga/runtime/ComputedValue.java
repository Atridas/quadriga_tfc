package cat.quadriga.runtime;

import cat.quadriga.parsers.code.types.BaseType;

public interface ComputedValue {
  BaseType getType();
  String getStringValue();
  void set(ComputedValue other);
  
  boolean getAsBool();
  char getAsChar();
  byte getAsByte();
  short getAsShort();
  int getAsInt();
  long getAsLong();
  float getAsFloat();
  double getAsDouble();
  Object getAsObject();
}
