package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NoType;

public final class TypeDataAccess extends DirectDataAccess {

  public final BaseType type;

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
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public WriteAccess getWriteVersion() {
    return null;
  }

}
