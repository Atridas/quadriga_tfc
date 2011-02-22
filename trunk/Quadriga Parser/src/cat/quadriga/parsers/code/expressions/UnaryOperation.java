package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;

public class UnaryOperation extends UnaryExpressionNode {

  public final Operator operator;
  public UnaryOperation( Operator operator,
                         ExpressionNode operant,
                         Token t) {
    super(operant, (operator.isPost())? new CodeZoneClass(operant, t) :
                                        new CodeZoneClass(t, operant));
    this.operator = operator;
  }
  
  @Override
  public String getOperation() {
    return operator.toString();
  }

  public static enum Operator {
    NEGATE("-", false),
    BIT_COMP("~", false),
    NOT("!", false),
    PRE_INC("++X", false),
    PRE_DEC("--X", false),
    POST_INC("X++", true),
    POST_DEC("X--", true);
    
    private String representation;
    private boolean post;
    private Operator(String r, boolean p) {
      representation = r;
      post = p;
    }
    @Override
    public String toString() {
      return representation;
    }
    
    public boolean isPost() {
      return post;
    }
  }
}
