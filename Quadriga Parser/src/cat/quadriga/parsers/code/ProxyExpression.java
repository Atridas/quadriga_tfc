package cat.quadriga.parsers.code;

public class ProxyExpression extends ExpressionNode {

  @Override
  protected String[] getOperants() {
    return new String[0];
  }

  @Override
  protected String getOperation() {
    return ">> proxy <<";
  }

  
  private static ProxyExpression instance = new ProxyExpression();
  
  private ProxyExpression() {}
  
  public static ProxyExpression getInstance() {
    return instance;
  }
}
