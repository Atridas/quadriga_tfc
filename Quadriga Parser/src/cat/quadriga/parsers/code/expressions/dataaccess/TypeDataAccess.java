package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.types.BaseType;

public class TypeDataAccess extends DirectDataAccess {

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
    return type;//TODO ??
  }

  @Override
  public boolean isAssignable() {
    return false;
  }

  @Override
  public boolean isReadable() {
    return false;
  }

}
