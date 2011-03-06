package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;

public final class UnaryOperation extends UnaryExpressionNode {

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

  @Override
  public BaseType getType() {
    switch(operator) {
    case NOT:
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.BOOLEAN);
    case BIT_COMP:
    case NEGATE:
    case PRE_INC:
    case PRE_DEC:
    case POST_INC:
    case POST_DEC:
      return operand.getType();
    default:
      return UnknownType.empty;
    }
  }

  @Override
  public UnaryOperation getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }
}
