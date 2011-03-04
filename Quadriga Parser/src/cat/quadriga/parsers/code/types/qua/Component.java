package cat.quadriga.parsers.code.types.qua;

import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;

public interface Component extends BaseType {

  public static class ComponentField {
    public final BaseType type;
    public final String name;
    public final ExpressionNode initialization;
    
    public ComponentField(BaseType type, String name, ExpressionNode initialization) {
      this.type = type;
      this.name = name;
      this.initialization = initialization;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result
          + ((initialization == null) ? 0 : initialization.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((type == null) ? 0 : type.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      ComponentField other = (ComponentField) obj;
      if (initialization == null) {
        if (other.initialization != null)
          return false;
      } else if (!initialization.equals(other.initialization))
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (type == null) {
        if (other.type != null)
          return false;
      } else if (!type.equals(other.type))
        return false;
      return true;
    }
  }
}
