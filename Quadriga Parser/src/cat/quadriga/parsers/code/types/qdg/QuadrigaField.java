package cat.quadriga.parsers.code.types.qdg;

import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.JavaType;

public class QuadrigaField implements TreeRepresentable {
  public final JavaType type;
  public final String name;
  public final ExpressionNode initialization;
  
  public QuadrigaField(JavaType type, String name, ExpressionNode initialization) {
    this.type = type;
    this.name = name;
    this.initialization = initialization;
  }

  @Override
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation("Quadriga Field", 
                                          type.treeStringRepresentation(),
                                          "\"" + name +"\"",
                                          (initialization == null)? null : initialization.treeStringRepresentation());
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
    QuadrigaField other = (QuadrigaField) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
}
