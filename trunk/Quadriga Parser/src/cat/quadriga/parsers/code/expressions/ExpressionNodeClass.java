package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.NoType;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeEnvironment;

public abstract class ExpressionNodeClass extends CodeZoneClass implements ExpressionNode {
  
  private String treeStringRepresentation = null;
  
  public ExpressionNodeClass(CodeZone cz) {
    super(cz);
  }

  private static SymbolTable symbolTable = new SymbolTable();
  private static ErrorLog    errorLog    = new ErrorLog();
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
  
    if(!isCorrectlyLinked()) {
      ExpressionNode enc = getLinkedVersion(symbolTable, errorLog);
      if(enc != null) {
        //typeName += " <+>";
      } else {
        typeName += " <->";
      }
    } else {
      //typeName += " <+>";
    }
    
    treeStringRepresentation = "Op: " + Utils.treeStringRepresentation(operation + typeName, operands);
    return treeStringRepresentation;
  }
  
  @Override
  public String toString() {
    return treeStringRepresentation();
  }
  
  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    //TODO
    throw new IllegalStateException("Not yet implemented! " + this.getClass().getCanonicalName());
  }
}
