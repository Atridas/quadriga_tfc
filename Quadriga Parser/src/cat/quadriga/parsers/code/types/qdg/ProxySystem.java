package cat.quadriga.parsers.code.types.qdg;

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

public class ProxySystem extends BaseTypeClass implements QuadrigaSystem {

  public ProxySystem(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public ProxySystem(String name) {
    super(name);
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
    return Utils.treeStringRepresentation(">> Proxy System " + getBinaryName() + " <<");
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
  public CompleteSystem getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    CodeZone cz = new CodeZoneClass(0,0,0,0,"Linkage");
    
    BaseSymbol symbol = symbolTable.findSymbol(getInstanceableName());
    if(symbol != null) {
      if( symbol instanceof TypeSymbol) {
        if(((TypeSymbol)symbol).type instanceof CompleteSystem) {
          return (CompleteSystem)((TypeSymbol)symbol).type;
        } else if(!(((TypeSymbol)symbol).type instanceof QuadrigaSystem)) {
          errorLog.insertError("El simbol " + getInstanceableName() + " no és un sistema",cz);
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
}
