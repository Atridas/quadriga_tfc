package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.types.ArrayType;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;

public class ArrayOrComponentAccess extends ExpressionNodeClass {

  public ExpressionNode array;
  public ExpressionNode access;
  
  public ArrayOrComponentAccess(ExpressionNode array, ExpressionNode access, Token t) {
    super(new CodeZoneClass(array, t));
    this.array = array;
    this.access = access;
  }

  @Override
  public String[] getOperands() {
    String[] aux = { array.treeStringRepresentation(), access.treeStringRepresentation() };
    return aux;
  }

  @Override
  public String getOperation() {
    // TODO comprovar si és un array o una entitat
    return "Array Access";
  }

  @Override
  public BaseType getType() {
    if(array.getType() instanceof ArrayType) {
      return ((ArrayType)array.getType()).base;
    }
    // TODO entitats i components
    return UnknownType.empty;
  }

}
