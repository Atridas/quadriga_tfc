package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;

public class MathematicOperation extends BinaryExpressionNode {

  public final Operator operator;
  public MathematicOperation( Operator operator,
                              ExpressionNode operant1, 
                              ExpressionNode operant2) {
    super(operant1,  operant2);
    this.operator = operator;
  }
  
  @Override
  public String getOperation() {
    return operator.toString();
  }

  public static enum Operator {
    ADD("+"),SUB("-"),
    MUL("*"),DIV("/"), MOD("%"),
    BIT_OR("|"),BIT_AND("&"),BIT_XOR("^"),
    LEFT_SHIFT("<<"), RIGHT_SHIFT(">>"), RIGHT_UNSIGNED_SHIFT(">>>");
    
    private String representation;
    private Operator(String r) {
      representation = r;
    }
    @Override
    public String toString() {
      return representation;
    }
  }

  @Override
  public BaseType getType() {
    switch(operator) {
    case BIT_OR:
    case BIT_AND:
    case BIT_XOR:
    case LEFT_SHIFT:
    case RIGHT_SHIFT:
    case RIGHT_UNSIGNED_SHIFT:
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.INT);
    case ADD: 
    case SUB: 
    case MUL: 
    case DIV: 
    case MOD:
      //TODO currar-s'ho una mica
      return leftOperand.getType();
    default:
      return UnknownType.empty;
    }
  }
}
