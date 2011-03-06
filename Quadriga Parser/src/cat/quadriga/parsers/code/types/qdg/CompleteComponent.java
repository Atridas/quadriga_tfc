package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class CompleteComponent extends BaseTypeClass implements QuadrigaComponent {

  public final Set<QuadrigaComponent> dependencies;
  public final Map<String,ComponentField> fields;
  
  public CompleteComponent(IncompleteComponent iComponent) {
    super(iComponent.getBinaryName());
    dependencies = Collections.unmodifiableSet(new HashSet<QuadrigaComponent>(iComponent.dependencies));
    fields = Collections.unmodifiableMap(new HashMap<String,ComponentField>(iComponent.fields));
  }

  @Override
  public ComponentField getField(String name) {
    return fields.get(name);
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
  public boolean isValid() {
    return true;
  }

  @Override
  public String treeStringRepresentation() {
    String dependencyTree = null;
    if(dependencies.size() > 0) {
      String[] aux = new String[dependencies.size()];
      int i = 0;
      for(QuadrigaComponent dependency : dependencies) {
        aux[i] = dependency.treeStringRepresentation();
        i++;
      }
      dependencyTree = Utils.treeStringRepresentation("dependencies", aux);
    }
    String fieldsTree = null;
    String[] aux = new String[fields.size()];
    int i = 0;
    for(Entry<String,ComponentField> componentField : fields.entrySet()) {
      aux[i] = componentField.getValue().treeStringRepresentation();
      i++;
    }
    dependencyTree = Utils.treeStringRepresentation("fields", aux);
    
    return Utils.treeStringRepresentation("Component", dependencyTree, fieldsTree);
  }

}
