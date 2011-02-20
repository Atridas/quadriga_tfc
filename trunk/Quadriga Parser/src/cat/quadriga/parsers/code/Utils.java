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
}
