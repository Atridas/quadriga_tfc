package cat.quadriga.runtime;

import java.util.Set;

import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEvent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaSystem;

public interface RuntimeSystem extends QuadrigaSystem {
  Set<QuadrigaComponent> neededComponents();
  Set<QuadrigaEvent> receivedEvents();
  
  boolean hasUpdate();
  boolean hasNewOrDelete();
  boolean hasNew();
  boolean hasDelete();
  
  void update(Entity entity, RuntimeEnvironment runtime);
  void newEntity(Entity entity, RuntimeEnvironment runtime);
  void deleteEntity(Entity entity, RuntimeEnvironment runtime);
  
  void executeEvent(EventInstance event, Entity entity, RuntimeEnvironment runtime);
  
  void executeInit(RuntimeEnvironment runtime);
  void executeCleanUp(RuntimeEnvironment runtime);
}
