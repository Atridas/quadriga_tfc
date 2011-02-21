package cat.quadriga.parsers.code;

abstract public class Utils {
  public static final String treeStringRepresentation( String operation, String operands[]) {
    String out = operation;
  
    if(operands.length == 0)
      return out;
  
    for(int i = 0; i < operands.length-1; i++)
    {
      out += "\n+- " + operands[i].replace("\n", "\n|  ");
  
    }
  
    return out += "\n+- " + operands[operands.length-1].replace("\n", "\n   ");
  }

  
  public static final char convertImageToChar(String image) {
    image = image.substring(1, image.length() - 1);
    if(image.length() == 1) { //Cas 'x'
      return image.charAt(0);
    } else {
      //Cas '\\x'
      return convertFirstScapeChar(image.substring(1)).charAt(0);
    }
  }
  
  public static final String convertImageToString(String image) {
    image = image.substring(1, image.length() - 1);
    String aux[] = image.replaceAll("\\\\", "\\ ").split("\\\\");
    String result = aux[0];
    for(int i = 1; i < aux.length; i++) {
      result += convertFirstScapeChar(aux[i].substring(1));
    }
    return image;
  }
  
//["n","t","b","r","f","\\","'","\""]
  private static String convertFirstScapeChar(String scape) {
    char aux;
    int len = 1;
    switch(scape.charAt(0)) {
    case 'n': aux = '\n'; break;
    case 't': aux = '\t'; break;
    case 'b': aux = '\b'; break;
    case 'r': aux = '\r'; break;
    case 'f': aux = '\f'; break;
    case '\\': aux = '\\'; break;
    case '\'': aux = '\''; break;
    case '"': aux = '"'; break;
    case 'u': 
      int hex = Integer.decode("0x" + scape.substring(1, 5));
      aux = (char) hex;
      len = 5;
      break;
    case '0':
    default: aux = '\0'; break;
    }
    
    return aux + scape.substring(len);
    
  }
  
  public static final int PUBLIC = 0x0001;
  public static final int PROTECTED = 0x0002;
  public static final int PRIVATE = 0x0004;
  public static final int ABSTRACT = 0x0008;
  public static final int STATIC = 0x0010;
  public static final int FINAL = 0x0020;
  public static final int SYNCHRONIZED = 0x0040;
  public static final int NATIVE = 0x0080;
  public static final int TRANSIENT = 0x0100;
  public static final int VOLATILE = 0x0200;
  public static final int STRICTFP = 0x1000;
}
