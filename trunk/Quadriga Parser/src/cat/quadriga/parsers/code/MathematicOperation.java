package cat.quadriga.parsers.code;

public class MathematicOperation extends BinaryExpressionNode {

  private Operator operator;
  public MathematicOperation( Operator operator,
                              ExpressionNode operant1, 
                              ExpressionNode operant2) {
    super(operant1,  operant2);
    this.operator = operator;
  }
  
  @Override
  protected String getOperation() {
    return operator.toString();
  }

  public static enum Operator {
    ADD("+"),SUBTRACT("-"),
    MULT("*"),DIV("/"), MOD("%"),
    BIT_OR("|"),BIT_AND("&"),BIT_XOR("^"),
    LEFT_SHIFT("<<"), RIGHT_SHIFT(">>"), RIGHT_UNSIGNED_SHIFT(">>>");
    
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
