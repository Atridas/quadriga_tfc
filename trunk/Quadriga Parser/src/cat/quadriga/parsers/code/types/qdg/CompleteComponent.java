package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
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
  
  private CompleteComponent(
      String binaryName,
      Set<QuadrigaComponent> dependencies,
      Map<String,ComponentField> fields) {
    super(binaryName);
    this.dependencies = Collections.unmodifiableSet(dependencies);
    this.fields = Collections.unmodifiableMap(fields);
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

  @Override
  public boolean isValid() {
    for(QuadrigaComponent component: dependencies) {
      if(!(component instanceof CompleteComponent)) {
        return false;
      }
    }
    
    for(Entry<String, ComponentField> field: fields.entrySet()) {
      ComponentField cf = field.getValue();
      if(!cf.type.isValid()) {
        return false;
      }
      if(cf.initialization != null && !cf.initialization.isCorrectlyLinked()) {
        return false;
      }
    }
    
    return true;
  }

  @Override
  public CompleteComponent getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(isValid()) {
      return this;
    }
    CodeZone cz = new CodeZoneClass(0,0,0,0,"Linkage");
    
    Set<QuadrigaComponent> dependencies = new HashSet<QuadrigaComponent>();
    for(QuadrigaComponent component: this.dependencies) {
      if(component instanceof CompleteComponent) {
        dependencies.add(component);
      } if(component instanceof IncompleteComponent || component instanceof ProxyComponent) {
        BaseSymbol symbol = symbolTable.findSymbol(component.getInstanceableName());
        if(symbol != null) {
          if( symbol instanceof TypeSymbol) {
            if(((TypeSymbol)symbol).type instanceof CompleteComponent) {
              dependencies.add((CompleteComponent)((TypeSymbol)symbol).type);
            } else if(!(((TypeSymbol)symbol).type instanceof QuadrigaComponent)) {
              errorLog.insertError("El simbol " + component.getInstanceableName() + " no és un component",cz);
              return null;
            }
          } else {
            errorLog.insertError("El simbol " + component.getInstanceableName() + " no és un tipus",cz);
            return null;
          }
        } else if(component instanceof IncompleteComponent) {
          dependencies.add(new CompleteComponent((IncompleteComponent)component));
        } else {
          errorLog.insertError("No s'ha trobat el simbol " + component.getInstanceableName(),cz);
          return null;
        }
      }
    }
    
    Map<String, ComponentField> newFields = new HashMap<String, ComponentField>();
    for(Entry<String, ComponentField> field: fields.entrySet()) {
      ComponentField cf = field.getValue();
      BaseType newType;
      ExpressionNode newInit;
      if(cf.type.isValid()) {
        newType = cf.type;
      } else {
        newType = cf.type.getValid(symbolTable, errorLog);
        if(newType == null) {
          return null;
        }
      }
      if(cf.initialization == null) {
        newInit = null;
      } else if(cf.initialization.isCorrectlyLinked()) {
        newInit = cf.initialization;
      } else {
        newInit = cf.initialization.getLinkedVersion(symbolTable, errorLog);
        if(newInit == null) {
          return null;
        }
      }
      newFields.put(field.getKey(), new ComponentField(newType, field.getKey(), newInit));
    }
    return new CompleteComponent(getBinaryName(),dependencies,newFields);
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }
}
