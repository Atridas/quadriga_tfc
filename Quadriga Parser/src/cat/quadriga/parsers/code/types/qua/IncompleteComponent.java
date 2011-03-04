package cat.quadriga.parsers.code.types.qua;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.SymbolTable;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class IncompleteComponent extends BaseTypeClass implements Component {

  public final Set<Component> dependencies = new HashSet<Component>();
  public final Set<ComponentField> fields  = new HashSet<ComponentField>();

  public IncompleteComponent(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public IncompleteComponent(String name) {
    super(name);
  }
  
  public void addDependency(List<Token> name, SymbolTable symbolTable, ErrorLog errorLog) {
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
      if(type instanceof Component) {
        dependencies.add((Component)type);
      } else {
        errorLog.insertError("El símbol " + res + " no és un component",
                         new CodeZoneClass(name.get(0),name.get(name.size()-1)));
      }
    } else {
      errorLog.insertError("El símbol " + res + " no és un component",
                         new CodeZoneClass(name.get(0),name.get(name.size()-1)));
    }
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
