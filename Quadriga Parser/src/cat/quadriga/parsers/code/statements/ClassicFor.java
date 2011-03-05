package cat.quadriga.parsers.code.statements;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;

public class ClassicFor extends StatementNodeClass implements BucleInterface {
  
  public final StatementNode init, update, execution;
  public final ExpressionNode condition;
  public final List<LocalVariableSymbol> localVariables;

  public ClassicFor(List<LocalVariableSymbol> localVariables, 
                    StatementNode init, 
                    ExpressionNode condition, 
                    StatementNode update, 
                    StatementNode execution, 
                    CodeZone cz) {
    super(cz);
    this.init = init;
    this.condition = condition;
    this.update = update;
    this.execution = execution;
    
    this.localVariables = Collections.unmodifiableList(new Vector<LocalVariableSymbol>(localVariables));
  }

  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      String varr[] = new String[localVariables.size()];
      int i = 0;
      for(LocalVariableSymbol v : localVariables) {
        varr[i++] = v.treeStringRepresentation();
      }
      
      String vars = Utils.treeStringRepresentation("Local Variables:", 
                                                    varr);
      
      if(localVariables.size() == 0) {
        treeStringRepresentation = Utils.treeStringRepresentation("for", 
                      init.treeStringRepresentation(),
                      condition.treeStringRepresentation(),
                      update.treeStringRepresentation(),
                      execution.treeStringRepresentation());
      } else {
        treeStringRepresentation = Utils.treeStringRepresentation("for", 
                      vars,
                      init.treeStringRepresentation(),
                      condition.treeStringRepresentation(),
                      update.treeStringRepresentation(),
                      execution.treeStringRepresentation());
      }
    }
    return treeStringRepresentation;
  }

}
