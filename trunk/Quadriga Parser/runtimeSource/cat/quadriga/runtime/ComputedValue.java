package cat.quadriga.runtime;

import cat.quadriga.parsers.code.types.BaseType;

public interface ComputedValue {
  BaseType getType();
  String getStringValue();
  void set(ComputedValue other);
}
