package cat.quadriga.runtime;

import java.io.Serializable;

public interface Entity extends Serializable {
  Entity getParent();
}
