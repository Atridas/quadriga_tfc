package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;

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
    errorLog.insertError("Not yet implemented [" + this.getClass().getCanonicalName() + "]", this);
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    LiteralData lit = operand.getCompileTimeConstant();
    if(lit == null) {
      return null;
    }
    if(newType instanceof PrimitiveTypeRef) {
      if(lit.getType() instanceof PrimitiveTypeRef) {
        switch(((PrimitiveTypeRef)newType).type) {
        case CHAR:
          switch(((PrimitiveTypeRef)lit.getType()).type) {
          case CHAR:
            return lit;
          case DOUBLE:
            return new LiteralData.CharacterLiteral(
                (char)((LiteralData.DoubleLiteral)lit).d,
                this);
          case FLOAT:
            return new LiteralData.CharacterLiteral(
                (char)((LiteralData.FloatLiteral)lit).f,
                this);
          case INT:
            return new LiteralData.CharacterLiteral(
                (char)((LiteralData.IntegerLiteral)lit).i,
                this);
          case LONG:
            return new LiteralData.CharacterLiteral(
                (char)((LiteralData.LongLiteral)lit).l,
                this);
          case SHORT:
          case BYTE:
          case BOOLEAN:
          case VOID:
          default:
            return null;
          }
        case DOUBLE:
          switch(((PrimitiveTypeRef)lit.getType()).type) {
          case CHAR:
            return new LiteralData.DoubleLiteral(
                (double)((LiteralData.CharacterLiteral)lit).c,
                this);
          case DOUBLE:
            return lit;
          case FLOAT:
            return new LiteralData.DoubleLiteral(
                (double)((LiteralData.FloatLiteral)lit).f,
                this);
          case INT:
            return new LiteralData.DoubleLiteral(
                (double)((LiteralData.IntegerLiteral)lit).i,
                this);
          case LONG:
            return new LiteralData.DoubleLiteral(
                (double)((LiteralData.LongLiteral)lit).l,
                this);
          case SHORT:
          case BYTE:
          case BOOLEAN:
          case VOID:
          default:
            return null;
          }
        }
      }
      //TODO
    }
    return null;
  }

}
