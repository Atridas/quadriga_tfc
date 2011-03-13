package cat.quadriga.runtime;

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
}
