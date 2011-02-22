package cat.quadriga.parsers.code.expressions.dataaccess;

import java.lang.reflect.Field;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;

public class StaticFieldAccess extends StaticAccess implements FieldAccess {
  
  public final Field field;
  private final BaseType type;

  public StaticFieldAccess(Field field, CodeZone cz) {
    super(field.getName(), field.getDeclaringClass(), cz);
    this.field = field;
    this.type = Utils.createType(field.getDeclaringClass());
  }
  
  
  
  @Override
  public String getOperation() {
    return "Static Field:";
  }

  @Override
  public BaseType getType() {
    return type;
  }

}
