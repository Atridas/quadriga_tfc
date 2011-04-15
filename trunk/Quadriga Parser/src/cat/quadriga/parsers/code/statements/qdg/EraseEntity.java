package cat.quadriga.parsers.code.statements.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.StatementNodeClass;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;

public class EraseEntity extends StatementNodeClass {
  public final ExpressionNode entity;

  public EraseEntity(ExpressionNode entity, CodeZone cz) {
    super(cz);
    this.entity    = entity;
  }

  @Override
  public String[] getOperands() {
    String[] aux = {
        entity.treeStringRepresentation()};
    return aux;
  }

  @Override
  public String getOperation() {
    return "Erase Entity";
  }

  private boolean linked = false;
  private EraseEntity linkedVersion = null;
  @Override
  public EraseEntity getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode ent;
      if(entity.isCorrectlyLinked()) {
        ent = entity;
      } else {
        ent = entity.getLinkedVersion(symbolTable, errorLog);
        if(ent == null) {
          return null;
        }
      }

      if(!(ent.getType() instanceof QuadrigaEntity)) {
        errorLog.insertError("Necessita una entitat", ent);
        return null;
      }
      linkedVersion = new EraseEntity(ent, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public void execute(RuntimeEnvironment runtime) {
    try {
      assert isCorrectlyLinked();
  
      ComputedValue cv = this.entity.compute(runtime);
      Entity entity = (Entity)cv;
      
      runtime.entitySystem.deleteEntity(entity);
    } catch (Exception e) {
      throw new RuntimeException("Error in line " + beginLine + " column " + beginColumn + " file " + file, e);
    }
  }
}
