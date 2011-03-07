package cat.quadriga.parsers.code.statements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.BaseType;

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
    
    this.localVariables = Collections.unmodifiableList(new ArrayList<LocalVariableSymbol>(localVariables));
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
  
  private ClassicFor(List<LocalVariableSymbol> localVariables, 
      StatementNode init, 
      ExpressionNode condition, 
      StatementNode update, 
      StatementNode execution, 
      SymbolTable symbolTable,
      ErrorLog errorLog,
      CodeZone cz) 
  {
    super(cz);
    symbolTable.newContext();
    linked = true;
    linkedVersion = this;
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
            localVariableSymbol.name
            );
        newVars.add(lvs);
        symbolTable.addSymbol(lvs);
      }
    }
    
    this.localVariables = Collections.unmodifiableList(newVars);
    
    if(linked) {
      if(init.isCorrectlyLinked()) {
        this.init = init;
      } else {
        this.init = init.getLinkedVersion(symbolTable, errorLog);
        if(this.init == null) {
          linked = false;
        }
      }
      if(update.isCorrectlyLinked()) {
        this.update = update;
      } else {
        this.update = update.getLinkedVersion(symbolTable, errorLog);
        if(this.update == null) {
          linked = false;
        }
      }
      if(execution.isCorrectlyLinked()) {
        this.execution = execution;
      } else {
        this.execution = execution.getLinkedVersion(symbolTable, errorLog);
        if(this.execution == null) {
          linked = false;
        }
      }
      if(condition.isCorrectlyLinked()) {
        this.condition = condition;
      } else {
        this.condition = condition.getLinkedVersion(symbolTable, errorLog);
        if(this.condition == null) {
          linked = false;
        }
      }
    } else {
      this.init = this.update = this.execution = null;
      this.condition = null;
    }
    
    symbolTable.closestBucleOrSwitch = prev;
    symbolTable.deleteContext();
  }
  
  private boolean linked = false;
  private ClassicFor linkedVersion = null;
  @Override
  public ClassicFor getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      linkedVersion = new ClassicFor(localVariables, init, condition, update, execution, symbolTable, errorLog, this);
      if(!linkedVersion.isCorrectlyLinked()) {
        linkedVersion = null;
      }
    }
    return linkedVersion;
  }
  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}
