package cat.quadriga.runtime;

import java.util.Map;

public interface EventInstance extends ComputedValue {

  RuntimeEvent getEvent();
  
  ComputedValue getFieldValue(String field);
  
  Map<String, ComputedValue> getFieldValues();
  
  void setFieldValue(String field, ComputedValue value);
  
  void copy(EventInstance other);

}
