package cat.quadriga.parsers.code.statements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.BreakException;
import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.runtime.RuntimeEnvironment;

public class ClassicFor extends StatementNodeClass implements BucleInterface {
  
  public StatementNode init, update, execution;
  public ExpressionNode condition;
  public List<LocalVariableSymbol> localVariables;

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
    
    this.localVariables = Collections.unmodifiableList(new ArrayList<LocalVariableSymbol>(localVariables));
  }

  public String[] getOperands() {
    String varr[] = new String[localVariables.size()];
    int i = 0;
    for(LocalVariableSymbol v : localVariables) {
      varr[i++] = v.treeStringRepresentation();
    }
    
    String vars = Utils.treeStringRepresentation("Local Variables:", 
                                                  varr);
    
    if(localVariables.size() == 0) {
      String[] aux = {
                    init.treeStringRepresentation(),
                    condition.treeStringRepresentation(),
                    update.treeStringRepresentation(),
                    execution.treeStringRepresentation()};
      return aux;
    } else {
      String[] aux = {
                    vars,
                    init.treeStringRepresentation(),
                    condition.treeStringRepresentation(),
                    update.treeStringRepresentation(),
                    execution.treeStringRepresentation()};
      return aux;
    }
  }

  public String getOperation() {
    return "for";
  }
  
  
  private boolean linked = false;
  @Override
  public ClassicFor getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) return this;
    linked = true;


    symbolTable.newContext();
    
    BucleOrSwitchInterface prev = symbolTable.closestBucleOrSwitch;
    symbolTable.closestBucleOrSwitch = this;
    
    List<LocalVariableSymbol> newVars = new ArrayList<LocalVariableSymbol>(localVariables.size());
    for(LocalVariableSymbol localVariableSymbol : localVariables) {
      if(localVariableSymbol.type.isValid()) {
        newVars.add(localVariableSymbol);
        symbolTable.addSymbol(localVariableSymbol);
      } else {
        BaseType type = localVariableSymbol.type.getValid(symbolTable, errorLog);
        if(type != null) {
          linked = false;
          break;
        }
        LocalVariableSymbol lvs = new LocalVariableSymbol(
            localVariableSymbol.modifiers, 
            type, 
            localVariableSymbol.name,
            symbolTable.getNumLocalVariables(),
            this
            );
        newVars.add(lvs);
        symbolTable.addLocalVariable(lvs);
      }
    }
    
    this.localVariables = Collections.unmodifiableList(newVars);
    
    if(!init.isCorrectlyLinked()) {
      StatementNode aux = init.getLinkedVersion(symbolTable, errorLog);
      if(aux == null) {
        linked = false;
      } else {
        init = aux;
      }
    }
    if(!update.isCorrectlyLinked()) {
      StatementNode aux = update.getLinkedVersion(symbolTable, errorLog);
      if(aux == null) {
        linked = false;
      } else {
        update = aux;
      }
    }
    if(!execution.isCorrectlyLinked()) {
      StatementNode aux = execution.getLinkedVersion(symbolTable, errorLog);
      if(aux == null) {
        linked = false;
      } else {
        execution = aux;
      }
    }
    if(!condition.isCorrectlyLinked()) {
      ExpressionNode aux = condition.getLinkedVersion(symbolTable, errorLog);
      if(aux == null) {
        linked = false;
      } else {
        condition = aux;
      }
    }
    
    symbolTable.closestBucleOrSwitch = prev;
    symbolTable.deleteContext();
    
    if(linked) return this;
    else       return null;
  }
  
  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public void execute(RuntimeEnvironment runtime) throws BreakOrContinueException {
    try {
      assert isCorrectlyLinked();
      
      runtime.newLocalContext();
      
      for(LocalVariableSymbol lvs : localVariables) {
        runtime.putLocalVariable(lvs, null);
      }
      
      try {
        init.execute(runtime);
        while(condition.compute(runtime).getAsBool()) {
          execution.execute(runtime);
          
          update.execute(runtime);
        }
      } catch (BreakException e) {
        if(e.tobreak != this) {
          runtime.deleteLocalContext();
          throw e;
        }
      }
      
      runtime.deleteLocalContext();
    } catch (BreakOrContinueException e) {
      throw e;
    } catch (Exception e) {
      throw new RuntimeException("Error in " 
          + beginLine + ":" + beginColumn + " "
          + endLine + ":" + endColumn + " " + file, e);
    }
  }
}
