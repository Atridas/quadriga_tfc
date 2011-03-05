package cat.quadriga.parsers.code.statements.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.StatementNodeClass;

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

}
