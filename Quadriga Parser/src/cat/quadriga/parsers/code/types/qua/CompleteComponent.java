package cat.quadriga.parsers.code.types.qua;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class CompleteComponent extends BaseTypeClass implements Component {

  public final Set<Component> dependencies;
  public final Set<ComponentField> fields;
  
  public CompleteComponent(IncompleteComponent iComponent) {
    super(iComponent.getBinaryName());
    dependencies = Collections.unmodifiableSet(new HashSet<Component>(iComponent.dependencies));
    fields = Collections.unmodifiableSet(new HashSet<ComponentField>(iComponent.fields));
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
