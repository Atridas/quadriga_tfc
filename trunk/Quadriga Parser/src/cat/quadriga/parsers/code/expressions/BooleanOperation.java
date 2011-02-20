package cat.quadriga.parsers.code.expressions;

public class BooleanOperation extends BinaryExpressionNode {

  public final Operator operator;
  public BooleanOperation( Operator operator,
                              ExpressionNode operant1, 
                              ExpressionNode operant2) {
    super(operant1,  operant2);
    this.operator = operator;
  }
  
  @Override
  public String getOperation() {
    return operator.toString();
  }

  public static enum Operator {
    LT("<"),  GT(">"),
    LE("<="), GE(">="),
    EQ("=="), NEQ("!="),
    INSTANCEOF("instanceof");
    
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
