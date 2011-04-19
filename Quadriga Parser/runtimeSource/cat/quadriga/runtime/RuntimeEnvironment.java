package cat.quadriga.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;

public class RuntimeEnvironment {
  public SymbolTable symbolTable;
  public EntitySystem entitySystem;
  public boolean keepRunning = true;
  
  public long timeMilis;
  public float dt;
  
  
  public Stack<ComputedValue> stack = new Stack<ComputedValue>();
  
  public void executeEvent(EventInstance event, Entity entity) {
    
    String eventName = event.getEvent().getBinaryName();

    if("cat.quadriga.base.Exit".compareTo(eventName) == 0) {
      keepRunning = false;
      return;
    }
    
    Set<RuntimeSystem> systems = entitySystem.getSystemsWithEvent(event.getEvent());
    for(RuntimeSystem system : systems) {
      
      if(entity != null) {
        if(entitySystem.isEntityInSystem(entity, system)) {
          system.executeEvent(event, entity, this);
        }
      } else {
        List<Entity> entities = entitySystem.getSystemEntities(system);
        for(Entity e : entities) {
          system.executeEvent(event, e, this);
        }
      }
      
    }
  }
  
  public void enqueueEvent(EventInstance event, Entity entity, float time) {
    throw new IllegalStateException("Not yet implemented");
  }
  
  

  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  
  private Stack<ArrayList<ComputedValue>> localVariables = new Stack<ArrayList<ComputedValue>>();
  
  //private int dent = -1;
  
  public void enterFunction(int numLocalVariables) {
    /*dent++;
    for(int i=0;i<dent;i++)System.out.print(' ');
    System.out.println("+ " + numLocalVariables);*/
    
    
    ArrayList<ComputedValue> aux = new ArrayList<ComputedValue>(numLocalVariables);
    for(int i = 0; i < numLocalVariables; ++i) aux.add(null);
    localVariables.push(aux);
  }
  
  public void exitFunction() {
    localVariables.pop();
    /*for(int i=0;i<dent;i++)System.out.print(' ');
    System.out.println("-");
    dent--;*/
  }
  
  public void newLocalContext() {
  }
  
  public void deleteLocalContext() {
  }
  
  public ComputedValue getLocalVariable(LocalVariableSymbol lvs) {
    ArrayList<ComputedValue> aux = localVariables.peek(); 
    
    try{
      //for(int i=0;i<dent;i++)System.out.print(' ');
      //System.out.println("< " + lvs.position);
      return aux.get(lvs.position);
    } catch(RuntimeException e) {
      throw e;
    }
  }
  
  public void putLocalVariable(LocalVariableSymbol lvs, ComputedValue cv) {
    ArrayList<ComputedValue> al = localVariables.peek();
    
    //for(int i=0;i<dent;i++)System.out.print(' ');
    //System.out.println("> " + lvs.position);
    al.set(lvs.position, cv);
  }
  

  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  /*
  private Stack<Map<LocalVariableSymbol, ComputedValue>> localVariables = new Stack<Map<LocalVariableSymbol, ComputedValue>>();
  
  
  public void enterFunction(int numLocalVariables) {
  }
  
  public void exitFunction() {
  }
  
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
      if(map.containsKey(lvs)) {
        cv = map.get(lvs);
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
  
  */

  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////
  
}
