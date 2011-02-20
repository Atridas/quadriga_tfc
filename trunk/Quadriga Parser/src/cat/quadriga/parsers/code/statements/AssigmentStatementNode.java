package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class AssigmentStatementNode extends StatementNode {
  
  public final ExpressionNode leftOperand, rightOperand;
  public final Operator operator;

  public AssigmentStatementNode(Operator operator, 
                                ExpressionNode left, 
                                ExpressionNode right) {
    super(left.beginLine, 
          left.beginColumn, 
          right.endLine, 
          right.endColumn);
    leftOperand  = left;
    rightOperand = right;
    this.operator = operator;
  }

  @Override
  public String treeStringRepresentation() {
    String operation = operator.toString();
    String operands[] = { leftOperand.treeStringRepresentation(),
                         rightOperand.treeStringRepresentation() 
                        };
    return "St: " + Utils.treeStringRepresentation(operation, operands);
  }
  
  public Operator getOperator() {
    return operator;
  }

  public static enum Operator {
    ASSIGN("="),
    PLUSASSIGN("+="),
    MINUSASSIGN("-="),
    STARASSIGN("*="),
    SLASHASSIGN("/="),
    ANDASSIGN("&="),
    ORASSIGN("|="),
    XORASSIGN("^="),
    REMASSIGN("%="),
    LSHIFTASSIGN("<<="),
    RSIGNEDSHIFTASSIGN(">>="),
    RUNSIGNEDSHIFTASSIGN(">>>=");
    
    private String representation;
    private Operator(String r) {
      representation = r;
    }
    @Override
    public String toString() {
      return representation;
    }
  }
}
