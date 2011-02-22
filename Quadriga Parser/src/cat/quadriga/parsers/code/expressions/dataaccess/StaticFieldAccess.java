package cat.quadriga.parsers.code.expressions.dataaccess;

import java.lang.reflect.Field;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;

public class StaticFieldAccess extends StaticAccess {
  
  public final Field field;
  private final BaseType type;

  public StaticFieldAccess(Field field, Class<?> type, int beginLine,
      int beginColumn, int endLine, int endColumn) {
    super(field.getName(), type, beginLine, beginColumn, endLine, endColumn);
    this.field = field;
    this.type = Utils.createType(type);
  }

  public StaticFieldAccess(Field field, Class<?> type, CodeZone cz) {
    super(field.getName(), type, cz);
    this.field = field;
    this.type = Utils.createType(type);
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
