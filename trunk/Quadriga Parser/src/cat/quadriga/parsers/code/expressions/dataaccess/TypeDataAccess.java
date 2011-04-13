package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NoType;

public final class TypeDataAccess extends DirectDataAccess {

  public BaseType type;

  public TypeDataAccess(BaseType type, CodeZone cz) {
    super(cz);
    this.type = type;
  }

  @Override
  public String[] getOperands() {
    return new String[0];
  }

  @Override
  public String getOperation() {
    return "Type Access: " + type.getBinaryName();
  }

  @Override
  public BaseType getType() {
    return NoType.instance;
  }

  @Override
  public boolean isAssignable() {
    return false;
  }

  @Override
  public boolean isReadable() {
    return false;
  }

  @Override
  public TypeDataAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(isCorrectlyLinked()) {
      return this;
    }
    BaseSymbol symbol = symbolTable.findSymbol(type.getInstanceableName());
    if(symbol != null) {
      if(symbol instanceof TypeSymbol) {
        BaseType t = ((TypeSymbol)symbol).type;
        if(!t.isValid()) {
          t = t.getValid(symbolTable, errorLog);
          if(t == null) {
            errorLog.insertError("El tipus " + type.getInstanceableName() + " no és vàlid.", this);
            return null;
          }
        }
        type = t;
        return this;
      } else {
        errorLog.insertError("El símbol " + type.getInstanceableName() + " no és un tipus.", this);
        return null;
      }
    } else {
      errorLog.insertError("No s'ha trobat el símbol " + type.getInstanceableName(), this);
      return null;
    }
  }

  @Override
  public boolean isCorrectlyLinked() {
    return type.isValid();
  }

  @Override
  public WriteAccess getWriteVersion(SymbolTable symbolTable) {
    return null;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return new LiteralData.ClassLiteral(type,this);
  }

}
