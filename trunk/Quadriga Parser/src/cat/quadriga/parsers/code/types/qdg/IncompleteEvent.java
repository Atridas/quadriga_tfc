package cat.quadriga.parsers.code.types.qdg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class IncompleteEvent extends BaseTypeClass implements QuadrigaEvent {

  public String description = "";
  public final Map<String,QuadrigaField> fields  = new HashMap<String,QuadrigaField>();

  public IncompleteEvent(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public IncompleteEvent(String name) {
    super(name);
  }
  
  public void addField(QuadrigaField field, ErrorLog errorLog, CodeZone cz) {
    if(fields.containsKey(field.name)) {
      errorLog.insertError("Nom " + field.name + " duplicat", cz);
    } else {
      fields.put(field.name, field);
    }
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
    
    return Utils.treeStringRepresentation("Incomplete Component", fieldsTree);
  }

  @Override
  public String toString() {
    return treeStringRepresentation();
  }
  
  @Override
  public boolean isValid() {
    return false;
  }

  @Override
  public CompleteEvent getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    return new CompleteEvent(this).getValid(symbolTable, errorLog);
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }

  @Override
  public boolean isSerializable() {
    return false;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Set<String> getAllFields() {
    return fields.keySet();
  }
}
