package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.NullType;

public class MemberAccess extends DirectDataAccess {
  
  public final String staticMember;
  public final Class<?> clazz;

  public MemberAccess(String staticMember, Class<?> type, CodeZone cz) {
    super(cz);
    this.staticMember = staticMember;
    this.clazz = type;
  }

  @Override
  public String getOperation() {
    return "Static Access:";
  }

  @Override
  public BaseType getType() {
    // TODO ¿?
    return NullType.instance;
  }

  @Override
  public boolean isAssignable() {
    return true;
  }

  @Override
  public boolean isReadable() {
    return true;
  }

}
