package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.types.BaseType;

public interface DataAccess extends TreeRepresentable, CodeZone {
  boolean isReadable();
  boolean isAssignable();
  BaseType getType();
}
