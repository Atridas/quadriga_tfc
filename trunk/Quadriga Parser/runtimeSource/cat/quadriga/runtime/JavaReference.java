package cat.quadriga.runtime;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NullType;

public class JavaReference implements ComputedValue {
  
  public Object reference;
  
  public JavaReference(Object ref) {
    assert ref != null;
    reference = ref;
  }

  @Override
  public BaseType getType() {
    if(reference == null) return NullType.instance;
    return Utils.createType(reference.getClass());
  }

  @Override
  public String getStringValue() {
    if(reference == null) return "null";
    return reference.toString();
  }

  @Override
  public void set(ComputedValue other) {
    if(other instanceof JavaReference) {
      reference = ((JavaReference) other).reference;
    }
  }

}
