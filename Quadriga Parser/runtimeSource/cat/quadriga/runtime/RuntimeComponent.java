package cat.quadriga.runtime;

import java.util.Map;
import java.util.Set;

import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;

public interface RuntimeComponent extends QuadrigaComponent {
  public ComponentObject createObject(Map<String, ComputedValue> arguments);
  public JavaType getFieldType(String field);
  public Set<String> getAllFields();
  public Set<QuadrigaComponent> getDependencies();
}
