package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.EventInstance;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimeEvent;
import cat.quadriga.runtime.qvm.VirtualEvent;

public class CompleteEvent extends BaseTypeClass implements RuntimeEvent {

  public final String description;
  public final Map<String,QuadrigaField> fields;
  
  public CompleteEvent(IncompleteEvent iEvent) {
    super(iEvent.getBinaryName());
    fields = Collections.unmodifiableMap(new HashMap<String,QuadrigaField>(iEvent.fields));
    description = iEvent.description;
  }
  
  private CompleteEvent(
      String binaryName,
      Map<String,QuadrigaField> fields,
      String desc) {
    super(binaryName);
    this.fields = Collections.unmodifiableMap(fields);
    description = desc;
  }

  @Override
  public QuadrigaField getField(String name) {
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
    String fieldsTree = null;
    String[] aux = new String[fields.size()];
    int i = 0;
    for(Entry<String,QuadrigaField> componentField : fields.entrySet()) {
      aux[i] = componentField.getValue().treeStringRepresentation();
      i++;
    }
    fieldsTree = Utils.treeStringRepresentation("fields", aux);
    
    String linkedStatus; 
    if(!isValid()) {
      linkedStatus = " <->";
    } else {
      linkedStatus = " <+>";
    }
    
    return Utils.treeStringRepresentation("Component" + linkedStatus, fieldsTree);
  }

  private boolean valid = false;
  private CompleteEvent validVersion = null;
  @Override
  public boolean isValid() {
    return valid;
  }

  @Override
  public CompleteEvent getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(valid) {
      return this;
    } else if(validVersion == null) {     
    
      Map<String, QuadrigaField> newFields = new HashMap<String, QuadrigaField>();
      for(Entry<String, QuadrigaField> field: fields.entrySet()) {
        QuadrigaField cf = field.getValue();
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
        
        newFields.put(field.getKey(), new QuadrigaField(newType, field.getKey(), newInit));
      }
      validVersion = new CompleteEvent(
                              getBinaryName(),
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
  public EventInstance createInstance(Map<String, ComputedValue> arguments, RuntimeEnvironment runtime) {
    assert isValid();
    Set<String> usedArguments = new HashSet<String>();
    VirtualEvent newComponent = new VirtualEvent(this);
    
    for(Entry<String, QuadrigaField> field: fields.entrySet()) {
      QuadrigaField cf = field.getValue();
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
    QuadrigaField cF = fields.get(field);
    if(cF == null) {
      return null;
    }
    return cF.type;
  }

  @Override
  public Set<String> getAllFields() {
    return fields.keySet();
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
