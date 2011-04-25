package cat.quadriga.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;

public class RuntimeEnvironment {
  public SymbolTable symbolTable;
  public EntitySystem entitySystem;
  public boolean keepRunning = true;
  
  public long timeMilis;
  public float dt;
  
  public final ThreadLocal<Random> rnd = new ThreadLocal<Random> () { @Override protected Random initialValue() { return new Random(); } };
  
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
  

  private final ThreadLocal<Map<Integer,Entity>> guidEntities = new ThreadLocal<Map<Integer,Entity>> () { @Override protected Map<Integer,Entity> initialValue() { return new TreeMap<Integer,Entity>(); } };
  private final ThreadLocal<Map<String,Entity>> namedEntities = new ThreadLocal<Map<String,Entity>> () { @Override protected Map<String,Entity> initialValue() { return new HashMap<String,Entity>(); } };
  private final ThreadLocal<Map<Integer,Map<String,Entity>>> parentEntities = new ThreadLocal<Map<Integer,Map<String,Entity>>> () { @Override protected Map<Integer,Map<String,Entity>> initialValue() { return new TreeMap<Integer,Map<String,Entity>>(); } };

  public Entity addToCache(Entity entity) {
    Map<Integer,Entity> entities = guidEntities.get();
    
    if(entities.containsKey(entity.getGUID())) {
      return entities.get(entity.getGUID());
    } else {
      entities.put(entity.getGUID(), entity);
    }
    return entity;
  }
  
  public Entity findEntity(int guid) {
    Entity entity = guidEntities.get().get(guid);
    if(entity == null) {
      entity = entitySystem.findEntity(guid);
      if(entity == null) return null;
      guidEntities.get().put(guid, entity);
    }
    
    return entity;
  }
  
  public Entity findEntity(String name) {
    Entity entity = namedEntities.get().get(name);
    if(entity == null) {
      entity = entitySystem.findEntity(name);
      if(entity == null) return null;
      namedEntities.get().put(name, entity);
      Entity entity2 = guidEntities.get().get(entity.getGUID());
      if(entity2 == null) {
        guidEntities.get().put(entity.getGUID(), entity);
      } else {
        entity = entity2;
      }
    }
    
    return entity;
  }
  
  public Entity findEntity(String name, Entity parent) {
    Map<String,Entity> mapChilds = parentEntities.get().get(parent.getGUID());
    if(mapChilds == null) {
      mapChilds = new HashMap<String, Entity>();
      parentEntities.get().put(parent.getGUID(), mapChilds);
    }
    
    Entity entity = mapChilds.get(name);
    if(entity == null) {
      entity = entitySystem.findEntity(name, parent);
      if(entity == null) return null;
      mapChilds.put(name, entity);
      Entity entity2 = guidEntities.get().get(entity.getGUID());
      if(entity2 == null) {
        guidEntities.get().put(entity.getGUID(), entity);
      } else {
        entity = entity2;
      }
    }
    
    return entity;
  }
  
  public void commitEntities() {
    Map<Integer,Entity> entities = guidEntities.get();
    for(Entity entity : entities.values()) {
      entity.commitChanges();
    }
    guidEntities.get().clear();
    namedEntities.get().clear();
    parentEntities.get().clear();
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
