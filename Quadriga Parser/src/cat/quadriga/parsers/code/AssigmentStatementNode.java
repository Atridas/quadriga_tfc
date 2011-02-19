package cat.quadriga.parsers.code;

public class AssigmentStatementNode extends StatementNode {
  
  private final ExpressionNode leftOperand, rightOperand;
  private final Operator operator;

  public AssigmentStatementNode(Operator operator, 
                                ExpressionNode left, 
                                ExpressionNode right) {
    super(left.getBeginLine(), 
          left.getBeginColumn(), 
          right.getEndLine(), 
          right.getEndColumn());
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
