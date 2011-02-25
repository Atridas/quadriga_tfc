package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;

public abstract class MemberAccess extends DirectDataAccess {
  
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
  public boolean isAssignable() {
    return true;
  }

  @Override
  public boolean isReadable() {
    return true;
  }

}
