package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.QuadrigaFunction;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class CompleteSystem extends BaseTypeClass implements QuadrigaSystem {

  public final Set<QuadrigaComponent> components;
  public final Set<QuadrigaComponent> specialComponents;
  public final Set<QuadrigaComponent> specialExternComponents;
  public final Set<QuadrigaSystem> systemDependencies;
  public final QuadrigaFunction update;
  public final QuadrigaFunction newEntity;
  public final QuadrigaFunction removeEntity;
  public final QuadrigaFunction changeEntity;
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
    
    Set<QuadrigaComponent> components = new HashSet<QuadrigaComponent>();
    for(QuadrigaComponent component: original.components) {
      if(!component.isValid()) {
        component = component.getValid(symbolTable, errorLog);
        if(component == null) {
          validated = false;
          break;
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
          break;
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
          break;
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
          break;
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
          break;
        }
      }
      if(!fun.isCorrectlyLinked()) {
        fun = fun.getLinkedVersion(symbolTable, errorLog);
        if(fun == null) {
          validated = false;
          break;
        }
      }
      eventHandlers.put(event,fun);
    }

    if(original.update == null || original.update.isCorrectlyLinked()) {
      update = original.update;
    } else {
      update = original.update.getLinkedVersion(symbolTable, errorLog);
      if(update == null) {
        validated = false;
      }
    }
    if(original.changeEntity == null || original.changeEntity.isCorrectlyLinked()) {
      changeEntity = original.changeEntity;
    } else {
      changeEntity = original.changeEntity.getLinkedVersion(symbolTable, errorLog);
      if(changeEntity == null) {
        validated = false;
      }
    }
    if(original.newEntity == null || original.newEntity.isCorrectlyLinked()) {
      newEntity = original.newEntity;
    } else {
      newEntity = original.newEntity.getLinkedVersion(symbolTable, errorLog);
      if(newEntity == null) {
        validated = false;
      }
    }
    if(original.removeEntity == null || original.removeEntity.isCorrectlyLinked()) {
      removeEntity = original.removeEntity;
    } else {
      removeEntity = original.removeEntity.getLinkedVersion(symbolTable, errorLog);
      if(removeEntity == null) {
        validated = false;
      }
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
}
