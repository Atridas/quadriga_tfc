package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeEnvironment;

public interface WriteAccess extends DataAccess {
  void setValue(ComputedValue value, RuntimeEnvironment runtime);
}
