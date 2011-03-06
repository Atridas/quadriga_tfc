package cat.quadriga.parsers.code.types.qdg;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class ProxyThread extends BaseTypeClass implements QuadrigaThread {

  public ProxyThread(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public ProxyThread(String name) {
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
    return Utils.treeStringRepresentation(">> Proxy Thread " + getBinaryName() + " <<");
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
