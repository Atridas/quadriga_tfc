package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections;
import java.util.Set;

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

public class ProxyComponent extends BaseTypeClass implements QuadrigaComponent {

  public ProxyComponent(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public ProxyComponent(String name) {
    super(name);
  }

  @Override
  public ComponentField getField(String name) {
    return null;
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
    return Utils.treeStringRepresentation(">> Proxy Component " + getBinaryName() + " <<");
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
    CodeZone cz = new CodeZoneClass(0,0,0,0,"Linkage");
    
    BaseSymbol symbol = symbolTable.findSymbol(getInstanceableName());
    if(symbol != null) {
      if( symbol instanceof TypeSymbol) {
        if(((TypeSymbol)symbol).type instanceof CompleteComponent) {
          return (CompleteComponent)((TypeSymbol)symbol).type;
        } else if(!(((TypeSymbol)symbol).type instanceof QuadrigaComponent)) {
          errorLog.insertError("El simbol " + getInstanceableName() + " no és un component",cz);
          return null;
        }
      } else {
        errorLog.insertError("El simbol " + getInstanceableName() + " no és un tipus",cz);
        return null;
      }
    } else {
      errorLog.insertError("No s'ha trobat el simbol " + getInstanceableName(),cz);
      return null;
    }
    return null;
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
    return "";
  }

  @Override
  public Set<String> getAllFields() {
    return Collections.emptySet();
  }
  
  public Set<QuadrigaComponent> getDependencies() {
    return Collections.emptySet();
  }
}
