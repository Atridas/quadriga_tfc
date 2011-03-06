package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.expressions.dataaccess.TypeDataAccess;
import cat.quadriga.parsers.code.types.ArrayType;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;

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
    if(array.getType() instanceof QuadrigaEntity) {
      if(access.getType() == ClassOrInterfaceTypeRef.getFromClass(String.class)) {
        return "Child Access";
      } else {
        if(access instanceof TypeDataAccess) {
          BaseType type = ((TypeDataAccess)access).type;
          if(type instanceof QuadrigaComponent) {
            return "Component Access";
          }
        }
      }
      return "Unknown Array Access";
    }
    return "Array Access";
  }

  @Override
  public BaseType getType() {
    if(array.getType() instanceof ArrayType) {
      return ((ArrayType)array.getType()).base;
    }
    if(array.getType() instanceof QuadrigaEntity) {
      if(access.getType() == ClassOrInterfaceTypeRef.getFromClass(String.class)) {
        return QuadrigaEntity.baseEntity;
      } else {
        if(access instanceof TypeDataAccess) {
          BaseType type = ((TypeDataAccess)access).type;
          if(type instanceof QuadrigaComponent) {
            return type;
          }
        }
      }
    }
    return UnknownType.empty;
  }

}
