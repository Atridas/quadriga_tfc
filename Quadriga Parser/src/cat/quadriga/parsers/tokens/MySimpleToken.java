package cat.quadriga.parsers.tokens;


import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.QuadrigaSimple;

public class MySimpleToken extends Token
{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * Constructs a new token for the specified Image and Kind.
   */
  public MySimpleToken(int kind, String image)
  {
     this.kind = kind;
     this.image = image;
  }

  public int realKind = QuadrigaSimple.GT;

  /**
   * Returns a new Token object.
  */

  public static final Token newToken(int ofKind, String tokenImage)
  {
    return new MySimpleToken(ofKind, tokenImage);
  }
}
