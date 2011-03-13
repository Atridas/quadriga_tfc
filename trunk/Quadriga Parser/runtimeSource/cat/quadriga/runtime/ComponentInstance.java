package cat.quadriga.runtime;

import java.util.Map;

public interface ComponentInstance extends ComputedValue {

  RuntimeComponent getComponent();
  
  ComputedValue getFieldValue(String field);
  
  Map<String, ComputedValue> getFieldValues();
  
  void setFieldValue(String field, ComputedValue value);
  
  void copy(ComponentInstance other);
  
  void commitChanges();
}
