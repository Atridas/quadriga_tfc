package cat.quadriga.runtime;

public interface ComponentObject {

  RuntimeComponent getComponent();
  
  ComputedValue getFieldValue(String field);
  
  void setFieldValue(String field, ComputedValue value);
  
  void copy(ComponentObject other);
}
