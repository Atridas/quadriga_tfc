package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.NoType;

public abstract class ExpressionNodeClass extends CodeZoneClass implements ExpressionNode {
  
  private String treeStringRepresentation = null;
  
  public ExpressionNodeClass(CodeZone cz) {
    super(cz);
  }

  public final String treeStringRepresentation() {
    if(treeStringRepresentation != null) {
      return treeStringRepresentation;
    }
  
    String operation = getOperation();
    String operands[] = getOperands();
    
    String typeName;
    
    if(getType() instanceof NoType) {
      typeName = "";
    } else {
      typeName = " {" + getType().toString() + "}";
    }    
  
    treeStringRepresentation = "Op: " + Utils.treeStringRepresentation(operation + typeName, operands);
    return treeStringRepresentation;
  }
  
  @Override
  public String toString() {
    return treeStringRepresentation();
  }
}
