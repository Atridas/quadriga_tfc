package cat.quadriga.parsers.code;

public class UnaryProxy extends UnaryExpressionNode {

  private UnaryProxy() {
    super(ProxyExpression.getInstance());
  }
  
  @Override
  protected String getOperation() {
    return ">> unary proxy <<";
  }

  private static UnaryProxy instance = new UnaryProxy();
  
  public static UnaryProxy getInstance() {
    return instance;
  }
}
