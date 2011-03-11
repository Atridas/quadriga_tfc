package cat.quadriga.parsers.code.types;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;

public class UnknownType extends BaseTypeClass {

  public static final UnknownType empty = new UnknownType();

  private UnknownType() {
    super("#unknown#");
  }
  
  public UnknownType(String name) {
    super("#unknown " + name + " #");
  }

  public boolean isValid() {
    return false;
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return this;
  }

  @Override
  public BaseType getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(getBinaryName().compareTo("#unknown#") == 0) {
      return null;
    }
    String aux = getBinaryName();
    aux = aux.substring(9,aux.length()-2);
    
    BaseSymbol symbol = symbolTable.findSymbol(aux);
    
    if(symbol == null) {
      errorLog.insertError("No s'ha trobat el símbol " + aux, new CodeZoneClass(0,0,0,0,"Linkage"));
      return null;
    }
    if(symbol instanceof TypeSymbol) {
      BaseType type = ((TypeSymbol)symbol).type;
      if(type.isValid()) {
        return type;
      } else {
        return type.getValid(symbolTable, errorLog);
      }
    }
    errorLog.insertError("El simbol " + aux + " no és un tipus", new CodeZoneClass(0,0,0,0,"Linkage"));
    return null;
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return false;
  }

  @Override
  public boolean isSerializable() {
    return false;
  }
}
