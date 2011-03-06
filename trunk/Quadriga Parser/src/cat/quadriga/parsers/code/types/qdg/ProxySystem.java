package cat.quadriga.parsers.code.types.qdg;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class ProxySystem extends BaseTypeClass implements QuadrigaSystem {

  public ProxySystem(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public ProxySystem(String name) {
    super(name);
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return UnknownType.empty;
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  @Override
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation(">> Proxy System " + getBinaryName() + " <<");
  }

  @Override
  public boolean isValid() {
    return false;
  }

  @Override
  public String toString() {
    return treeStringRepresentation();
  }

}
