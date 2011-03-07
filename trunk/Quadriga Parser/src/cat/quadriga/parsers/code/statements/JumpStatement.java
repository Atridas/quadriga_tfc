package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.symbols.BaseSymbol;

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


  private boolean linked = false;
  private JumpStatement linkedVersion = null;
  @Override
  public JumpStatement getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      StatementNode dest;
      if(label != null) {
        BaseSymbol symbol = symbolTable.findSymbol(label);
        if(symbol != null) {
          if(symbol instanceof LabeledStatementNode.LabelSymbol) {
            dest = ((LabeledStatementNode.LabelSymbol)symbol).getOuter();
          } else {
            errorLog.insertError("El símbol " + label + " no és una Label.",this);
            return null;
          }
        } else {
          errorLog.insertError("No s'ha trobat la label " + label,this);
          return null;
        }
      } else {
        dest = symbolTable.closestBucleOrSwitch;
        if(dest == null) {
          errorLog.insertError("Break/Continue fora de switch o bucle.",this);
          return null;
        }
      }
      if(dest instanceof BucleOrSwitchInterface) {
        if(operator == Operator.CONTINUE) {
          if(!(dest instanceof BucleInterface)) {
            errorLog.insertError("Label no apunta ni a bucle",this);
            return null;
          }
        }

        linkedVersion = new JumpStatement(operator,label,(BucleOrSwitchInterface)dest,this);
        linkedVersion.linked = true;
        linkedVersion.linkedVersion = linkedVersion;

      } else {
        errorLog.insertError("Label no apunta ni a switch ni a bucle",this);
        return null;
      }
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}
