package cat.quadriga.parsers.code;

public abstract class ExpressionNode {
  
  private String treeStringRepresentation = null;

  public final String treeStringRepresentation() {
    if(treeStringRepresentation != null) {
      return treeStringRepresentation;
    }
  
    String operation = getOperation();
    String operants[] = getOperants();
  
    String out = "Op: " + operation;
  
    if(operants.length == 0)
      return out;
  
    for(int i = 0; i < operants.length-1; i++)
    {
      out += "+- " + operants[i].replace("\n", "\n|  ");
  
    }
  
    return out += "+- " + operants[operants.length-1].replace("\n", "\n   ");
  }

  protected abstract String   getOperation();
  protected abstract String[] getOperants();
	
}
