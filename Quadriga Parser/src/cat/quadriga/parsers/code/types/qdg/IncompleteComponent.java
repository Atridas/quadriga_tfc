package cat.quadriga.parsers.code.types.qdg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Map.Entry;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class IncompleteComponent extends BaseTypeClass implements QuadrigaComponent {

  public String description = "";
  public final Set<QuadrigaComponent> dependencies = new HashSet<QuadrigaComponent>();
  public final Map<String,QuadrigaField> fields  = new HashMap<String,QuadrigaField>();

  public IncompleteComponent(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public IncompleteComponent(String name) {
    super(name);
  }
  
  public void addDependency(List<Token> name, SymbolTable symbolTable, ErrorLog errorLog, String file) {
    String res = "";
    for(int i = 0; i < name.size(); i++) {
      if(i != 0) {
        res += "." + name.get(i).image;
      } else {
        res = name.get(i).image;
      }
    }
    BaseSymbol symbol = symbolTable.findSymbol(res);
    if(symbol instanceof TypeSymbol) {
      BaseType type = ((TypeSymbol) symbol).type;
      if(type instanceof QuadrigaComponent) {
        dependencies.add((QuadrigaComponent)type);
      } else {
        errorLog.insertError("El símbol " + res + " no és un component",
                         new CodeZoneClass(name.get(0),name.get(name.size()-1), file));
      }
    } else {
      errorLog.insertError("El símbol " + res + " no és un component",
                         new CodeZoneClass(name.get(0),name.get(name.size()-1), file));
    }
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
    for(Entry<String,QuadrigaField> componentField : fields.entrySet()) {
      aux[i] = componentField.getValue().treeStringRepresentation();
      i++;
    }
    dependencyTree = Utils.treeStringRepresentation("fields", aux);
    
    return Utils.treeStringRepresentation("Incomplete Component", dependencyTree, fieldsTree);
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
  public CompleteComponent getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    return new CompleteComponent(this).getValid(symbolTable, errorLog);
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
  
  public Set<QuadrigaComponent> getDependencies() {
    return dependencies;
  }
}
