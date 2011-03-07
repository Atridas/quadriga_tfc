package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;

public final class NewEntity extends ExpressionNodeClass {
  
  public final ExpressionNode parent;
  public final ExpressionNode name;

  public NewEntity(ExpressionNode parent, ExpressionNode name, CodeZone cz) {
    super(cz);
    this.parent = parent;
    this.name = name;
  }
  public NewEntity(CodeZone cz) {
    super(cz);
    this.parent = null;
    this.name = null;
  }

  @Override
  public String[] getOperands() {
    String[] aux = {(parent==null)?null:parent.treeStringRepresentation(), 
                    (name==null)?null:name.treeStringRepresentation()};
    return aux;
  }

  @Override
  public String getOperation() {
    return "New Entity";
  }

  @Override
  public BaseType getType() {
    return QuadrigaEntity.baseEntity;
  }
  @Override
  public NewEntity getLinkedVersion(SymbolTable symbolTable,
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
}
