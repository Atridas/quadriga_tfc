package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NullType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.JavaReference;
import cat.quadriga.runtime.RuntimeEnvironment;

public class FindEntity extends ExpressionNodeClass {
  
  public final ExpressionNode name;

  public FindEntity(ExpressionNode name, CodeZone cz) {
    super(cz);
    this.name = name;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }

  
  private boolean linked = false;
  private FindEntity linkedVersion = null;
  @Override
  public ExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode newName;
      if(name.isCorrectlyLinked()) {
        newName = name;
      } else {
        newName = name.getLinkedVersion(symbolTable, errorLog);
        if(newName == null) {
          return null;
        }
      }
      if(!Utils.aplicableBySubtyping(newName.getType(), String.class)) {
        errorLog.insertError("name must be a string", name);
        return null;
      }
      linkedVersion = new FindEntity(newName, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public String[] getOperands() {
    String aux[] = {name.treeStringRepresentation()};
    return aux;
  }

  @Override
  public String getOperation() {
    return "Find Entity";
  }

  @Override
  public BaseType getType() {
    return QuadrigaEntity.baseEntity;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }
  
  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    ComputedValue e = runtime.findEntity(name.compute(runtime).getStringValue());
    if(e == null) {
      return new JavaReference(null);
    } else {
      return e;
    }
  }

}
