package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.ParameterClass;
import cat.quadriga.parsers.code.QuadrigaFunction;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.EventInstance;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimeSystem;

public class CompleteSystem extends BaseTypeClass implements RuntimeSystem {

  public final Set<QuadrigaComponent> components;
  public final Set<QuadrigaComponent> specialComponents;
  public final Set<QuadrigaComponent> specialExternComponents;
  public final Set<QuadrigaSystem> systemDependencies;
  public final QuadrigaFunction update;
  public final QuadrigaFunction newEntity;
  public final QuadrigaFunction removeEntity;
  public final QuadrigaFunction changeEntity;
  public final QuadrigaFunction init, cleanUp;
  public final Map<QuadrigaEvent, QuadrigaFunction> eventHandlers;
  
  public CompleteSystem(IncompleteSystem original) {
    super(original.getBinaryName());
    components = Collections.unmodifiableSet(new HashSet<QuadrigaComponent>(original.components));
    specialComponents = Collections.unmodifiableSet(new HashSet<QuadrigaComponent>(original.specialComponents));
    specialExternComponents = Collections.unmodifiableSet(new HashSet<QuadrigaComponent>(original.specialExternComponents));
    systemDependencies = Collections.unmodifiableSet(new HashSet<QuadrigaSystem>(original.systemDependencies));
    update       = original.update;
    newEntity    = original.newEntity;
    removeEntity = original.removeEntity;
    changeEntity = original.changeEntity;
    init         = original.init;
    cleanUp      = original.cleanUp;
    eventHandlers = Collections.unmodifiableMap(new HashMap<QuadrigaEvent, QuadrigaFunction>(original.eventHandlers));
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return UnknownType.empty;
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  @Override
  public String treeStringRepresentation() {
    String comp, special, extern, systems, upd, newE, remE, change, events;
    comp=special=extern=systems=upd=newE=remE=change=events=null;
    List<String> aux = new LinkedList<String>();
    if(components.size() > 0) {
      aux.clear();
      for(QuadrigaComponent component: components) {
        aux.add(component.getBinaryName());
      }
      comp = Utils.treeStringRepresentation("needed components", aux);
    }
    
    if(specialComponents.size() > 0) {
      aux.clear();
      for(QuadrigaComponent component: specialComponents) {
        aux.add(component.treeStringRepresentation());
      }
      special = Utils.treeStringRepresentation("special components", aux);
    }
    
    if(specialExternComponents.size() > 0) {
      aux.clear();
      for(QuadrigaComponent component: specialExternComponents) {
        aux.add(component.treeStringRepresentation());
      }
      extern = Utils.treeStringRepresentation("special extern components", aux);
    }
    
    if(update != null) {
      upd = Utils.treeStringRepresentation("Update: ", update.treeStringRepresentation());
    }
    
    if(newEntity != null) {
      newE = Utils.treeStringRepresentation("New Entity: ", newEntity.treeStringRepresentation());
    }
    
    if(removeEntity != null) {
      remE = Utils.treeStringRepresentation("Remove Entity: ", removeEntity.treeStringRepresentation());
    }
    
    if(changeEntity != null) {
      change = Utils.treeStringRepresentation("Change Entity: ", changeEntity.treeStringRepresentation());
    }
    
    if(eventHandlers.size() > 0) {
      aux.clear();
      for(Entry<QuadrigaEvent,QuadrigaFunction> event: eventHandlers.entrySet()) {
        aux.add(Utils.treeStringRepresentation(event.getKey().getBinaryName(),event.getValue().treeStringRepresentation()));
      }
      events = Utils.treeStringRepresentation("EventHandlers", aux);
    }
    String linkedStatus; 
    if(!isValid()) {
      linkedStatus = " <->";
    } else {
      linkedStatus = " <+>";
    }
    return Utils.treeStringRepresentation("System" + linkedStatus, comp, special, extern, systems, upd, newE, remE, change, events);
  }
  
  private boolean validated = false;
  @Override
  public boolean isValid() {
    if(validated) return true;
    for(QuadrigaComponent component: components) {
      if(!component.isValid()) {
        return false;
      }
    }
    for(QuadrigaComponent component: specialComponents) {
      if(!component.isValid()) {
        return false;
      }
    }
    for(QuadrigaComponent component: specialExternComponents) {
      if(!component.isValid()) {
        return false;
      }
    }
    validated = true;
    for(QuadrigaSystem system: systemDependencies) {
      if(!system.isValid()) {
        validated = false;
        return false;
      }
    }
    validated = false;
    for(Entry<QuadrigaEvent,QuadrigaFunction> eventHandle: eventHandlers.entrySet()) {
      if(!eventHandle.getKey().isValid()) {
        return false;
      }
      if(!eventHandle.getValue().isCorrectlyLinked()) {
        return false;
      }
    }
    return (update == null         || update.isCorrectlyLinked())
          && (newEntity == null    || newEntity.isCorrectlyLinked())
          && (removeEntity == null || removeEntity.isCorrectlyLinked())
          && (changeEntity == null || changeEntity.isCorrectlyLinked());
  }

  private CompleteSystem(CompleteSystem original, Aux aux, SymbolTable symbolTable, ErrorLog errorLog) {
    super(original.getBinaryName());
    aux.aux = this;
    validated = true;
    
    symbolTable.accesses.clear();
    symbolTable.writes.clear();
    
    Set<QuadrigaComponent> components = new HashSet<QuadrigaComponent>();
    for(QuadrigaComponent component: original.components) {
      if(!component.isValid()) {
        component = component.getValid(symbolTable, errorLog);
        if(component == null) {
          validated = false;
        }
      }
      components.add(component);
    }
    Set<QuadrigaComponent> specialComponents = new HashSet<QuadrigaComponent>();
    for(QuadrigaComponent component: original.specialComponents) {
      if(!component.isValid()) {
        component = component.getValid(symbolTable, errorLog);
        if(component == null) {
          validated = false;
        }
      }
      specialComponents.add(component);
    }
    Set<QuadrigaComponent> specialExternComponents = new HashSet<QuadrigaComponent>();
    for(QuadrigaComponent component: original.specialExternComponents) {
      if(!component.isValid()) {
        component = component.getValid(symbolTable, errorLog);
        if(component == null) {
          validated = false;
        }
      }
      specialExternComponents.add(component);
    }
    Set<QuadrigaSystem> systemDependencies = new HashSet<QuadrigaSystem>();
    for(QuadrigaSystem system: original.systemDependencies) {
      if(!system.isValid()) {
        system = system.getValid(symbolTable, errorLog);
        if(system == null) {
          validated = false;
        }
      }
      systemDependencies.add(system);
    }
    Map<QuadrigaEvent,QuadrigaFunction> eventHandlers = new HashMap<QuadrigaEvent, QuadrigaFunction>();
    for(Entry<QuadrigaEvent,QuadrigaFunction> eventHandle: original.eventHandlers.entrySet()) {
      QuadrigaEvent event = eventHandle.getKey();
      QuadrigaFunction fun = eventHandle.getValue();
      if(!event.isValid()) {
        event = event.getValid(symbolTable, errorLog);
        if(event == null) {
          validated = false;
        }
      }
      if(!fun.isCorrectlyLinked()) {
        symbolTable.resetLocalVariables();
        fun = fun.getLinkedVersion(symbolTable, errorLog);
        if(fun == null) {
          validated = false;
        }
        symbolTable.closeLocalVariables();
      }
      eventHandlers.put(event,fun);
    }

    if(original.update == null || original.update.isCorrectlyLinked()) {
      update = original.update;
    } else {
      symbolTable.resetLocalVariables();
      update = original.update.getLinkedVersion(symbolTable, errorLog);
      if(update == null) {
        validated = false;
      }
      symbolTable.closeLocalVariables();
    }
    if(original.changeEntity == null || original.changeEntity.isCorrectlyLinked()) {
      changeEntity = original.changeEntity;
    } else {
      symbolTable.resetLocalVariables();
      changeEntity = original.changeEntity.getLinkedVersion(symbolTable, errorLog);
      if(changeEntity == null) {
        validated = false;
      }
      symbolTable.closeLocalVariables();
    }
    if(original.newEntity == null || original.newEntity.isCorrectlyLinked()) {
      newEntity = original.newEntity;
    } else {
      symbolTable.resetLocalVariables();
      newEntity = original.newEntity.getLinkedVersion(symbolTable, errorLog);
      if(newEntity == null) {
        validated = false;
      }
      symbolTable.closeLocalVariables();
    }
    if(original.removeEntity == null || original.removeEntity.isCorrectlyLinked()) {
      removeEntity = original.removeEntity;
    } else {
      symbolTable.resetLocalVariables();
      removeEntity = original.removeEntity.getLinkedVersion(symbolTable, errorLog);
      if(removeEntity == null) {
        validated = false;
      }
      symbolTable.closeLocalVariables();
    }
    if(original.init == null || original.init.isCorrectlyLinked()) {
      init = original.init;
    } else {
      symbolTable.resetLocalVariables();
      init = original.init.getLinkedVersion(symbolTable, errorLog);
      if(init == null) {
        validated = false;
      }
      symbolTable.closeLocalVariables();
    }
    if(original.cleanUp == null || original.cleanUp.isCorrectlyLinked()) {
      cleanUp = original.cleanUp;
    } else {
      symbolTable.resetLocalVariables();
      cleanUp = original.cleanUp.getLinkedVersion(symbolTable, errorLog);
      if(cleanUp == null) {
        validated = false;
      }
      symbolTable.closeLocalVariables();
    }
    
    

    this.components = Collections.unmodifiableSet(components);
    this.specialComponents = Collections.unmodifiableSet(specialComponents);
    this.specialExternComponents = Collections.unmodifiableSet(specialExternComponents);
    this.systemDependencies = Collections.unmodifiableSet(systemDependencies);
    
    this.eventHandlers = Collections.unmodifiableMap(eventHandlers);
  }
  
  private Aux aux = new Aux();
  @Override
  public CompleteSystem getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(validated)
      return this;
    if(aux.aux != null)
      return aux.aux;
    CompleteSystem cp = new CompleteSystem(this, aux, symbolTable, errorLog);
    aux.aux = null;
    if(cp.validated) {
      return cp;
    } else {
      return null;
    }
  }
  
  private static class Aux { CompleteSystem aux; };


  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }

  @Override
  public boolean isSerializable() {
    return true;
  }

  @Override
  public Set<QuadrigaComponent> neededComponents() {
    return components;
  }

  @Override
  public Set<QuadrigaEvent> receivedEvents() {
    return eventHandlers.keySet();
  }

  @Override
  public boolean hasUpdate() {
    return update != null;
  }

  @Override
  public boolean hasNewOrDelete() {
    return newEntity != null || removeEntity != null;
  }

  @Override
  public boolean hasDelete() {
    return removeEntity != null;
  }

  @Override
  public boolean hasNew() {
    return newEntity != null;
  }
  
  @Override
  public void executeInit(RuntimeEnvironment runtime) {
    if(init != null) {
      try {
        runtime.enterFunction(init.numLocalVariables);
        init.code.execute(runtime);
      } catch (BreakOrContinueException e) {
        throw new IllegalStateException(e);
      } finally {
        runtime.exitFunction();
        runtime.commitEntities();
      }
    }
  }

  @Override
  public void executeCleanUp(RuntimeEnvironment runtime) {
    if(cleanUp != null) {
      try {
        runtime.enterFunction(cleanUp.numLocalVariables);
        cleanUp.code.execute(runtime);
      } catch (BreakOrContinueException e) {
        throw new IllegalStateException(e);
      } finally {
        runtime.exitFunction();
        runtime.commitEntities();
      }
    }
  }
  
  private void prepareParams(Entity entity, EventInstance event, List<ParameterClass> params, RuntimeEnvironment runtime) {
    for(ParameterClass param : params) {
      if(param.semantic == null) {
        throw new IllegalStateException("All update params must have a semantic " + getBinaryName());
      } else {
        if("ENTITY".compareToIgnoreCase( param.semantic ) == 0) {
          runtime.putLocalVariable(
              new LocalVariableSymbol(
                  param.modifiers, 
                  param.type, 
                  param.name,
                  param.position,
                  param.cz), 
              entity);
        } else if("DELTA_TIME".compareToIgnoreCase( param.semantic ) == 0) {
          runtime.putLocalVariable(
              new LocalVariableSymbol(
                  param.modifiers, 
                  param.type, 
                  param.name,
                  param.position,
                  param.cz), 
              new LiteralData.FloatLiteral(runtime.dt, CodeZoneClass.runtime));
        } else if("EVENT".compareToIgnoreCase( param.semantic ) == 0) {
          runtime.putLocalVariable(
              new LocalVariableSymbol(
                  param.modifiers, 
                  param.type, 
                  param.name,
                  param.position,
                  param.cz), 
              event);
        } else {
          throw new IllegalArgumentException("Semantic " + param.semantic + " not suported.");
        }
      }
    }
  }
  
  @Override
  public void update(Entity entity, RuntimeEnvironment runtime) {
    assert isValid();
    
    runtime.newLocalContext();
    runtime.enterFunction(update.numLocalVariables);
    
    prepareParams(entity, null, update.parameters, runtime);
    
    try {
      update.code.execute(runtime);
    } catch (BreakOrContinueException e) {
      throw new IllegalStateException(e);
    } finally {
      runtime.exitFunction();
      runtime.deleteLocalContext();
      runtime.commitEntities();
    }
  }

  @Override
  public void deleteEntity(Entity entity, RuntimeEnvironment runtime) {
    assert isValid();
    
    runtime.newLocalContext();
    runtime.enterFunction(removeEntity.numLocalVariables);
    
    prepareParams(entity, null, removeEntity.parameters, runtime);
    
    try {
      removeEntity.code.execute(runtime);
    } catch (BreakOrContinueException e) {
      throw new IllegalStateException(e);
    } finally {
      runtime.exitFunction();
      runtime.deleteLocalContext();
      runtime.commitEntities();
    }
  }

  @Override
  public void newEntity(Entity entity, RuntimeEnvironment runtime) {
    assert isValid();
    
    runtime.newLocalContext();
    runtime.enterFunction(newEntity.numLocalVariables);
    
    prepareParams(entity, null, newEntity.parameters, runtime);
    
    try {
      newEntity.code.execute(runtime);
    } catch (BreakOrContinueException e) {
      throw new IllegalStateException(e);
    } finally {
      runtime.exitFunction();
      runtime.deleteLocalContext();
      runtime.commitEntities();
    }
  }

  @Override
  public void executeEvent(EventInstance event, Entity entity,
      RuntimeEnvironment runtime) {
    QuadrigaFunction fun = eventHandlers.get(event.getType());
    if(fun == null) {
      throw new IllegalStateException("Event " + event.getType().getBinaryName() + 
          " is not handled on system " + getBinaryName());
    }
    
    entity = runtime.addToCache(entity);
    
    runtime.newLocalContext();
    runtime.enterFunction(fun.numLocalVariables);
    
    prepareParams(entity, event, fun.parameters, runtime);
    
    try {
      fun.code.execute(runtime);
    } catch (BreakOrContinueException e) {
      throw new IllegalStateException(e);
    } finally {
      runtime.exitFunction();
      runtime.deleteLocalContext();
      runtime.commitEntities();
    }
  }
}
