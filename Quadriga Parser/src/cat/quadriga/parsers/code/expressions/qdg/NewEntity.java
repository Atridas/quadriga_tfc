package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;

public class NewEntity extends ExpressionNodeClass {
  
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

}
