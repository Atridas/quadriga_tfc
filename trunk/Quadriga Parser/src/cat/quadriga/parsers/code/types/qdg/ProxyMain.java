package cat.quadriga.parsers.code.types.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;

public class ProxyMain extends BaseTypeClass implements QuadrigaMain {

  public ProxyMain(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
  }

  public ProxyMain(String name) {
    super(name);
  }
  
  @Override
  public ProxyMain getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    CodeZone cz = new CodeZoneClass(0,0,0,0,"Linkage");
    
    BaseSymbol symbol = symbolTable.findSymbol(getInstanceableName());
    if(symbol != null) {
      if( symbol instanceof TypeSymbol) {
        if(((TypeSymbol)symbol).type instanceof ProxyMain) {
          return (ProxyMain)((TypeSymbol)symbol).type;
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
  public BaseType getMathematicResultType(BaseType other) {
    return null;
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return false;
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  @Override
  public boolean isValid() {
    return false;
  }

  @Override
  public boolean isSerializable() {
    return false;
  }

}
