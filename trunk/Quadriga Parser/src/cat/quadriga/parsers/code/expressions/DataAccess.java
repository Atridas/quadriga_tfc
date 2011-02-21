package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.types.BaseType;

public interface DataAccess {
  boolean isReadable();
  boolean isAssignable();
  BaseType getType();
}
