package cat.quadriga.parsers.code.expressions.dataaccess;

import java.lang.reflect.Field;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;

public class FieldAccess extends MemberAccess {
  
  public final Field field;
  public final BaseType type;
  
  public final ExpressionNode reference;

  public FieldAccess(Field field, CodeZone cz) {
    super(field.getName(), field.getDeclaringClass(), cz);
    this.field = field;
    this.type = Utils.createType(field.getType());
    reference = null;
  }

  public FieldAccess(ExpressionNode reference, Field field, CodeZone cz) {
    super(field.getName(), field.getDeclaringClass(), cz);
    this.field = field;
    this.type = Utils.createType(field.getType());
    this.reference = reference;
  }
  
  public boolean isStatic() {
    return 0 < (field.getModifiers() & Utils.STATIC);
  }
  
  @Override
  public String getOperation() {
    if(isStatic())
      return "Static Field:";
    else 
      return "Field:";
  }
  
  @Override
  public String[] getOperands() {
    if(reference == null) {
      String[] aux = { clazz.getCanonicalName() + " -> " + staticMember }; 
      return aux;
    } else {
      String[] aux = { clazz.getCanonicalName() + " -> " + staticMember,
                       reference.treeStringRepresentation()}; 
      return aux;
    }
  }

  @Override
  public BaseType getType() {
    return type;
  }

}
