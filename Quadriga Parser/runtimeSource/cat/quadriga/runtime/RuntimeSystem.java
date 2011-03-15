package cat.quadriga.runtime;

import java.util.Set;

import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaSystem;

public interface RuntimeSystem extends QuadrigaSystem {
  Set<QuadrigaComponent> neededComponents();
  boolean hasUpdate();
  void update(Entity entity, RuntimeEnvironment runtime);
}
