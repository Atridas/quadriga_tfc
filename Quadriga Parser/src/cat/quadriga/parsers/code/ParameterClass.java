package cat.quadriga.parsers.code;

import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;

public class ParameterClass {
  public final CodeZone cz;
  public final BaseType type;
  public final String name;
  public final boolean varargs;
  public final int modifiers;
  public final ExpressionNode init;
  public final String semantic;
  
  public ParameterClass(CodeZone cz, BaseType type, String name, boolean varargs, int modifiers, ExpressionNode init, String semantic) {
    this.cz = cz;
    this.type = type;
    this.name = name;
    this.varargs = varargs;
    this.modifiers = modifiers;
    this.init = init;
    this.semantic = semantic;
  }
}
