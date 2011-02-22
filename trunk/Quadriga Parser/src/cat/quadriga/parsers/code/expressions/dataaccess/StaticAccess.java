package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.NullType;

public class StaticAccess extends DirectDataAccess {
  
  public final String staticMember;
  public final Class<?> clazz;
  
  protected final String binaryClassName;

  public StaticAccess(String staticMember, JavaType type, CodeZone cz) {
    super(cz);
    this.staticMember = staticMember;
    this.clazz = type.classObject;
    binaryClassName = type.getBinaryName();
  }

  public StaticAccess(String staticMember, Class<?> type, CodeZone cz) {
    super(cz);
    this.staticMember = staticMember;
    this.clazz = type;
    binaryClassName = "L" + type.getCanonicalName() + ";";
  }

  @Override
  public String getOperation() {
    return "Static Access:";
  }

  @Override
  public String[] getOperands() {
    String[] aux = { binaryClassName + " -> " + staticMember }; 
    return aux;
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
