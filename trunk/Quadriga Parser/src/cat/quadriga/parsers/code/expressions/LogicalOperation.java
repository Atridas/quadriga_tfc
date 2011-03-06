package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;

public final class LogicalOperation extends BinaryExpressionNode {

  public final Operator operator;
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

  @Override
  public LogicalOperation getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }
}
