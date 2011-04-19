package cat.quadriga.parsers.code.statements.qdg;

import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.StatementNodeClass;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.runtime.ComponentInstance;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;

public class AddComponentNode extends StatementNodeClass {

  public final ExpressionNode component;
  public final ExpressionNode entity;

  public AddComponentNode(ExpressionNode component, ExpressionNode entity, CodeZone cz) {
    super(cz);
    this.entity    = entity;
    this.component = component;
  }

  @Override
  public String[] getOperands() {
    String[] aux = {
        component.treeStringRepresentation(),
        entity.treeStringRepresentation()};
    return aux;
  }

  @Override
  public String getOperation() {
    return "Add Component";
  }

  private boolean linked = false;
  private AddComponentNode linkedVersion = null;
  @Override
  public AddComponentNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode comp, ent;
      if(component.isCorrectlyLinked()) {
        comp = component;
      } else {
        comp = component.getLinkedVersion(symbolTable, errorLog);
        if(comp == null) {
          return null;
        }
      }
      if(entity.isCorrectlyLinked()) {
        ent = entity;
      } else {
        ent = entity.getLinkedVersion(symbolTable, errorLog);
        if(ent == null) {
          return null;
        }
      }

      if(!(comp.getType() instanceof QuadrigaComponent)) {
        errorLog.insertError("Necessita un component", comp);
        return null;
      }
      if(!(ent.getType() instanceof QuadrigaEntity)) {
        errorLog.insertError("Necessita una entitat", ent);
        return null;
      }
      linkedVersion = new AddComponentNode(comp, ent, this);
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
  
      Entity entity = (Entity)this.entity.compute(runtime);
      ComponentInstance component = (ComponentInstance)this.component.compute(runtime);
      
      runtime.entitySystem.addComponent(entity, component, runtime);
    } catch (Exception e) {
      throw new RuntimeException("Error in " 
          + beginLine + ":" + beginColumn + " "
          + endLine + ":" + endColumn + " " + file, e);
    }
  }
}
