package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData.BooleanLiteral;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.JavaReference;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class LogicalOperation extends BinaryExpressionNode {

  public Operator operator;
  public LogicalOperation( Operator operator,
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
    AND("&&"),
    OR ("||");
    
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
    return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.BOOLEAN);
  }

  private boolean linked = false;
  @Override
  public LogicalOperation getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) return this;
    linked = true;

    if(!leftOperand.isCorrectlyLinked()) {
      ExpressionNode en = leftOperand.getLinkedVersion(symbolTable, errorLog);
      if(en == null) {
        linked = false;
      } else {
        leftOperand = en;
      }
    }
    if(!rightOperand.isCorrectlyLinked()) {
      ExpressionNode en = rightOperand.getLinkedVersion(symbolTable, errorLog);
      if(en == null) {
        linked = false;
      } else {
        rightOperand = en;
      }
    }

    if(linked) return this;
    else       return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    LiteralData left = leftOperand.getCompileTimeConstant();
    if(left == null) {
      return null;
    }
    assert left instanceof BooleanLiteral;
    if((((BooleanLiteral) left).z)) {
      if(operator == Operator.OR) {
        return left;
      } else {
        return rightOperand.getCompileTimeConstant();
      }
    } else {
      if(operator == Operator.AND) {
        return left;
      } else {
        return rightOperand.getCompileTimeConstant();
      }
    }
  }
  

  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    ComputedValue left = leftOperand.compute(runtime);
    switch(operator) {
    case OR:
      if(left.getAsBool()) {
        return left;
      } else {
        return rightOperand.compute(runtime);
      }
    case AND:
      if(!left.getAsBool()) {
        return left;
      } else {
        return rightOperand.compute(runtime);
      }
    default:
      throw new IllegalStateException();
    }
  }
}
