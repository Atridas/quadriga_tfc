package cat.quadriga.runtime;

import java.util.Map;
import java.util.Set;

import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEvent;

public interface RuntimeEvent extends QuadrigaEvent {
  public EventInstance createInstance(Map<String, ComputedValue> arguments, RuntimeEnvironment runtime);
  public JavaType getFieldType(String field);
  public Set<String> getAllFields();
}
