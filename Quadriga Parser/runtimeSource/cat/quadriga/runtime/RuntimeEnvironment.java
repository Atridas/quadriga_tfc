package cat.quadriga.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;

public class RuntimeEnvironment {
  public SymbolTable symbolTable;
  public EntitySystem entitySystem;
  public boolean keepRunning = true;
  
  
  public Stack<ComputedValue> stack = new Stack<ComputedValue>();
  
  private Stack<Map<LocalVariableSymbol, ComputedValue>> localVariables = new Stack<Map<LocalVariableSymbol, ComputedValue>>();
  
  public void newLocalContext() {
    localVariables.push(new HashMap<LocalVariableSymbol, ComputedValue>());
  }
  
  public void deleteLocalContext() {
    localVariables.pop();
  }
  
  public ComputedValue getLocalVariable(LocalVariableSymbol lvs) {
    Stack<Map<LocalVariableSymbol, ComputedValue>> auxiliarStack = new Stack<Map<LocalVariableSymbol,ComputedValue>>();
    
    ComputedValue cv = null;
    while(localVariables.size() > 0) {
      Map<LocalVariableSymbol, ComputedValue> map = localVariables.pop();
      auxiliarStack.push(map);
      cv = map.get(lvs);
      if(cv != null) {
        break;
      }
    }
    
    while(auxiliarStack.size() > 0) {
      Map<LocalVariableSymbol, ComputedValue> map = auxiliarStack.pop();
      localVariables.push(map);
    }
    
    return cv;
  }
  
  public void putLocalVariable(LocalVariableSymbol lvs, ComputedValue cv) {
    localVariables.peek().put(lvs, cv);
  }

}
