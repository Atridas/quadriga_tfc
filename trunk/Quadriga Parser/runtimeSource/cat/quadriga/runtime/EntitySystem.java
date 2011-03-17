package cat.quadriga.runtime;

import java.util.List;
import java.util.Set;

import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;

public interface EntitySystem {
  Entity createEntity(
              String entityName, 
              String entityDebugInfo, 
              Entity father,
              RuntimeEnvironment runtime);
  RuntimeComponent createComponent(
              RuntimeComponent qc, 
              String tableName,
              RuntimeEnvironment runtime);
  void addComponent(
              Entity entity, 
              ComponentInstance component,
              RuntimeEnvironment runtime);
  /*
  ComponentInstance getComponent(
              Entity entity, 
              QuadrigaComponent type);
  */
  Entity findEntity(int guid);
  Entity findEntity(String name);
  Entity findEntity(String name, Entity parent);
  
  List<Entity> getAllEntitiesWithComponents(
              Set<QuadrigaComponent> components,
              RuntimeEnvironment re);
}
