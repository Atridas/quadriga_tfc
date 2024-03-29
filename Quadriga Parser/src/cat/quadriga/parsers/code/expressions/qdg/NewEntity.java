package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NullType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;

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
  
  private boolean linked = false;
  private NewEntity linkedVersion = null;
  @Override
  public NewEntity getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(isCorrectlyLinked()) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode nParent, nName;
      if(parent == null || parent.isCorrectlyLinked()) {
        nParent = parent;
      } else {
        nParent = parent.getLinkedVersion(symbolTable, errorLog);
        if(nParent == null) {
          return null;
        }
      }
      if(name == null || name.isCorrectlyLinked()) {
        nName = name;
      } else {
        nName = name.getLinkedVersion(symbolTable, errorLog);
        if(nParent == null) {
          return null;
        }
      }
      linkedVersion = new NewEntity(nParent, nName, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }
  @Override
  public boolean isCorrectlyLinked() {
    return linked || ( parent == null &&  name == null );
  }
  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }
  
  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    
    String entityName = null;
    if(name != null && !(name.getType() instanceof NullType)) {
      entityName = name.compute(runtime).getStringValue();
    }
    ComputedValue entityParent = parent.compute(runtime);
    Entity realParent;
    if(entityParent instanceof Entity) {
      realParent = (Entity) entityParent;
    } else if(entityParent instanceof LiteralData.NullLiteral) {
      realParent = null;
    } else {
      throw new IllegalStateException("Needed a entity, found: " + entityParent);
    }
    
    return runtime.entitySystem.createEntity(
        entityName, 
        null, //TODO 
        realParent,
        runtime);
  }
}
