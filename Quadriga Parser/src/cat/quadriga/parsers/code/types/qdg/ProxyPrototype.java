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

public class ProxyPrototype extends BaseTypeClass implements QuadrigaPrototype {

  public ProxyPrototype(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public ProxyPrototype(String name) {
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
    return Utils.treeStringRepresentation(">> Proxy Prototype " + getBinaryName() + " <<");
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
  public CompletePrototype getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    CodeZone cz = new CodeZoneClass(0,0,0,0,"Linkage");
    
    BaseSymbol symbol = symbolTable.findSymbol(getInstanceableName());
    if(symbol != null) {
      if( symbol instanceof TypeSymbol) {
        if(((TypeSymbol)symbol).type instanceof CompletePrototype) {
          CompletePrototype cp = (CompletePrototype)((TypeSymbol)symbol).type;
          if(cp.isValid()) {
            return cp;
          } else {
            return cp.getValid(symbolTable, errorLog);
          }
        } else if(!(((TypeSymbol)symbol).type instanceof QuadrigaPrototype)) {
          errorLog.insertError("El simbol " + getInstanceableName() + " no és un prototip",cz);
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
