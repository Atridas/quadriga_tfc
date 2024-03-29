package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData.BooleanLiteral;
import cat.quadriga.parsers.code.types.BaseType;

public final class TernaryExpressionNode extends ExpressionNodeClass {
  
  public final ExpressionNode boolValue, resultTrue, resultFalse;

  public TernaryExpressionNode(ExpressionNode boolValue, 
                              ExpressionNode resultTrue,
                              ExpressionNode resultFalse)
  {
    super( new CodeZoneClass(boolValue,resultFalse) );
    this.boolValue = boolValue;
    this.resultTrue = resultTrue;
    this.resultFalse = resultFalse;
  }

  @Override
  public String[] getOperands() {
    String out[] = {  boolValue.treeStringRepresentation(),
                      resultTrue.treeStringRepresentation(), 
                      resultFalse.treeStringRepresentation() 
                   };
    return out;
  }

  @Override
  public String getOperation() {
    return "?";
  }

  @Override
  public BaseType getType() {
    // TODO currar-s'ho una mica
    return resultTrue.getType();
  }

  @Override
  public TernaryExpressionNode getLinkedVersion(SymbolTable symbolTable,
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
    LiteralData bool = boolValue.getCompileTimeConstant();
    if(bool == null) {
      return null;
    }
    if(((BooleanLiteral)bool).z) {
      return resultTrue.getCompileTimeConstant();
    } else {
      return resultFalse.getCompileTimeConstant();
    }
  }
}
