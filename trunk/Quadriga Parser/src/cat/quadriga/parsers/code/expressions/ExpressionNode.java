package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.TreeRepresentable;

public interface ExpressionNode extends CodeZone, TreeRepresentable {
  String   getOperation();
  String[] getOperands();
}
