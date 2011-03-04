package cat.quadriga.parsers.code.types.qua;

import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class ProxyComponent extends BaseTypeClass implements Component {

  public ProxyComponent(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public ProxyComponent(String name) {
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

}
