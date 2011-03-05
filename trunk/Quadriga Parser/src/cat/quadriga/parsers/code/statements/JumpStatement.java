package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;

public class JumpStatement extends StatementNodeClass {

  public final String label;
  public final Operator operator;
  public final BucleOrSwitchInterface direction;
  
  public JumpStatement(Operator operator, String label, BucleOrSwitchInterface direction, CodeZone cz) {
    super(cz);
    this.operator = operator;
    this.label = label;
    this.direction = direction;
  }

  public JumpStatement(Operator operator, String label, CodeZone cz) {
    this(operator, label, null, cz);
  }

  public JumpStatement(Operator operator, CodeZone cz) {
    this(operator, null, null, cz);
  }

  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      String operator;
      if(direction == null) {
        operator = "Proxy " + this.operator;
      } else if(this.operator == Operator.CONTINUE && !(direction instanceof BucleInterface)) {
        operator = "Invalid Continue";
      } else {
        operator = this.operator.toString();
      }
      if(label != null) {
        operator += ": " + label;
      }
      treeStringRepresentation = Utils.treeStringRepresentation(operator);
    }
    return treeStringRepresentation;
  }
  
  
  public enum Operator {
    BREAK("break"), CONTINUE("continue");
    
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
