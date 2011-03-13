package cat.quadriga.runtime;

import java.io.Serializable;

public interface Entity extends Serializable, ComputedValue {
  Entity getParent();
}
