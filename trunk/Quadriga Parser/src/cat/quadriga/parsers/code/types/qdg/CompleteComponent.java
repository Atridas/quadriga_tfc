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
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.runtime.ComponentInstance;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeComponent;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.qvm.VirtualComponent;

public class CompleteComponent extends BaseTypeClass implements RuntimeComponent {

  public final String description;
  public final Set<QuadrigaComponent> dependencies;
  public final Map<String,ComponentField> fields;
  
  public CompleteComponent(IncompleteComponent iComponent) {
    super(iComponent.getBinaryName());
    dependencies = Collections.unmodifiableSet(new HashSet<QuadrigaComponent>(iComponent.dependencies));
    fields = Collections.unmodifiableMap(new HashMap<String,ComponentField>(iComponent.fields));
    description = iComponent.description;
  }
  
  private CompleteComponent(
      String binaryName,
      Set<QuadrigaComponent> dependencies,
      Map<String,ComponentField> fields,
      String desc) {
    super(binaryName);
    this.dependencies = Collections.unmodifiableSet(dependencies);
    this.fields = Collections.unmodifiableMap(fields);
    description = desc;
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
    
    String linkedStatus; 
    if(!isValid()) {
      linkedStatus = " <->";
    } else {
      linkedStatus = " <+>";
    }
    
    return Utils.treeStringRepresentation("Component" + linkedStatus, dependencyTree, fieldsTree);
  }

  private boolean valid = false;
  private CompleteComponent validVersion = null;
  @Override
  public boolean isValid() {
    return valid;
  }

  @Override
  public CompleteComponent getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(valid) {
      return this;
    } else if(validVersion == null) {
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
        JavaType newType;
        ExpressionNode newInit;
        if(cf.type.isValid()) {
          newType = cf.type;
        } else {
          newType = cf.type.getValid(symbolTable, errorLog);
          if(newType == null) {
            return null;
          }
        }
        
        if(!newType.isSerializable()) {
          errorLog.insertError("El tipus " + newType.getBinaryName() + " al component " + getBinaryName() + " no és serializable", CodeZoneClass.linking);
          return null;
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
        
        if(newInit != null && !newType.isAssignableFrom(newInit.getType())) {
          errorLog.insertError("Field " + field.getKey() + " type and "
              + " its init are not compatible.", newInit);
          return null;
        }
        
        newFields.put(field.getKey(), new ComponentField(newType, field.getKey(), newInit));
      }
      validVersion = new CompleteComponent(
                              getBinaryName(),
                              dependencies,
                              newFields,
                              description);
      validVersion.validVersion = validVersion;
      validVersion.valid = true;
    }
    return validVersion;
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }

  @Override
  public ComponentInstance createInstance(Map<String, ComputedValue> arguments, RuntimeEnvironment runtime) {
    assert isValid();
    Set<String> usedArguments = new HashSet<String>();
    VirtualComponent newComponent = new VirtualComponent(this);
    
    for(Entry<String, ComponentField> field: fields.entrySet()) {
      ComponentField cf = field.getValue();
      String fieldName  = field.getKey();
      ComputedValue value = arguments.get(fieldName);
      if(value == null) {
        if(cf.initialization == null) {
          throw new IllegalArgumentException("To initialize component " 
              + getBinaryName() + " you need field " + fieldName);
        } else {
          value = cf.initialization.compute(runtime);
        }
      } else {
        usedArguments.add(fieldName);
      }
      newComponent.values.put(fieldName, value);
    }
    
    if(usedArguments.size() != arguments.size()) {
      Set<String> unusedArguments = arguments.keySet();
      unusedArguments.removeAll(usedArguments);
      String aux = "Arguments \"";
      boolean first = true;
      for(String arg : unusedArguments) {
        if(first) {
          aux += arg;
          first = false;
        } else {
          aux += ", " + arg;
        }
      }
      aux += "\" not used";
      throw new IllegalArgumentException(aux);
    }
    
    return newComponent;
  }

  @Override
  public JavaType getFieldType(String field) {
    ComponentField cF = fields.get(field);
    if(cF == null) {
      return null;
    }
    return cF.type;
  }

  @Override
  public Set<String> getAllFields() {
    return fields.keySet();
  }
  
  public Set<QuadrigaComponent> getDependencies() {
    return dependencies;
  }

  @Override
  public boolean isSerializable() {
    return true;
  }

  @Override
  public String getDescription() {
    return description;
  }
}
