package cat.quadriga.parsers.code.statements.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.StatementNodeClass;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;

public class AddComponentNode extends StatementNodeClass {

  public final ExpressionNode component;
  public final ExpressionNode entity;

  public AddComponentNode(ExpressionNode component, ExpressionNode entity, CodeZone cz) {
    super(cz);
    this.entity    = entity;
    this.component = component;
  }

  @Override
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation("Add Component",
    		component.treeStringRepresentation(),
        entity.treeStringRepresentation());
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
      linkedVersion = new AddComponentNode(component, entity, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}
