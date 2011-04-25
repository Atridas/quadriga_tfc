package cat.quadriga.runtime;

import java.io.Serializable;

import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;

public interface Entity extends Serializable, ComputedValue, Comparable<Entity> {
  Entity getParent();
  ComponentInstance getComponent(QuadrigaComponent type);
  void cacheComponent(QuadrigaComponent component);
  void commitChanges();
  int getGUID();
}
