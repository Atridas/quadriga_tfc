package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.QuadrigaFunction;
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
    
    return Utils.treeStringRepresentation("System", comp, special, extern, systems, upd, newE, remE, change, events);
  }

}
