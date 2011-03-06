package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;

public final class ArrayLengthAccess extends UnaryDataAccess {

  public ArrayLengthAccess(ExpressionNode operand, CodeZone cz) {
    super(operand, cz);
  }

  @Override
  public BaseType getType() {
    return PrimitiveTypeRef.getFromName("int");
  }

  @Override
  public boolean isAssignable() {
    return false;
  }

  @Override
  public boolean isReadable() {
    return true;
  }

  @Override
  public String getOperation() {
    return "Array Length";
  }

  @Override
  public ArrayLengthAccess getLinkedVersion(SymbolTable symbolTable,
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
