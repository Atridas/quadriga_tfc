package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;

public interface DataAccess extends ExpressionNode {
  boolean isReadable();
  boolean isAssignable();
  BaseType getType();
}
