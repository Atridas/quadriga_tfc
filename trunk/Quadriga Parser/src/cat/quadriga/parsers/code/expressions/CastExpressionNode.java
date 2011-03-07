package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;

public final class CastExpressionNode extends UnaryExpressionNode {

  public final BaseType newType;
  
  private final String operation;

  public CastExpressionNode(Token t, BaseType type, ExpressionNode castableExpression) {
    super(castableExpression, new CodeZoneClass(t, castableExpression));
    newType = type;
    
    operation = "cast " + newType.getBinaryName();
  }
  
  public CastExpressionNode(BaseType type, ExpressionNode castableExpression, CodeZone cz) {
    super(castableExpression,cz);
    newType = type;
    
    operation = "cast " + newType.getBinaryName();
  }

  @Override
  public String getOperation() {
    return operation;
  }

  @Override
  public BaseType getType() {
    return newType;
  }

  @Override
  public CastExpressionNode getLinkedVersion(SymbolTable symbolTable,
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
