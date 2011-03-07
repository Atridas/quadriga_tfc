package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;

public final class MathematicOperation extends BinaryExpressionNode {

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
      if("Ljava.lang.String;".compareTo(leftOperand.getType().getBinaryName()) == 0) {
        return leftOperand.getType();
      } else if("Ljava.lang.String;".compareTo(rightOperand.getType().getBinaryName()) == 0) {
        return rightOperand.getType();
      }
    case SUB: 
    case MUL: 
    case DIV: 
    case MOD:
      if(!leftOperand.getType().isMathematicallyOperable()) {
        return UnknownType.empty;
      } else {
        return leftOperand.getType().getMathematicResultType(rightOperand.getType());
      }
    default:
      return UnknownType.empty;
    }
  }

  private boolean linked = false;
  private MathematicOperation linkedVersion = null;
  @Override
  public MathematicOperation getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode left, right;
      if(leftOperand.isCorrectlyLinked()) {
        left = leftOperand;
      } else {
        left = leftOperand.getLinkedVersion(symbolTable, errorLog);
        if(left == null) {
          return null;
        }
      }
      if(rightOperand.isCorrectlyLinked()) {
        right = rightOperand;
      } else {
        right = rightOperand.getLinkedVersion(symbolTable, errorLog);
        if(right == null) {
          return null;
        }
      }
      BaseType type = getType();
      if(!type.isValid()) {
        errorLog.insertError("Operadors invàlids", this);
        return null;
      }
      
      linkedVersion = new MathematicOperation(operator, left, right);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
      
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }
}
