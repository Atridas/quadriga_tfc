package cat.quadriga.runtime.qvm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.runtime.ComponentInstance;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeComponent;

public class VirtualComponent implements ComponentInstance {
  public final RuntimeComponent component;
  public final Map<String,ComputedValue> values = new HashMap<String, ComputedValue>();
  
  public VirtualComponent(RuntimeComponent comp) {
    if(!comp.isValid()) {
      throw new IllegalArgumentException("Component must be valid");
    }
    component = comp;
  }

  @Override
  public RuntimeComponent getComponent() {
    return component;
  }

  @Override
  public ComputedValue getFieldValue(String field) {
    return values.get(field);
  }

  @Override
  public void setFieldValue(String field, ComputedValue value) {
    BaseType fieldType = component.getFieldType(field);
    
    if(fieldType == null) {
      throw new IllegalArgumentException("Field " + field + " does not exist "
          + "in component " + component.getBinaryName());
    }
    if(!fieldType.isAssignableFrom(value.getType())) {
      throw new IllegalArgumentException("Can not assign " 
          + value.getType().getBinaryName() + " to " + fieldType.getBinaryName());
    }
    
    values.put(field, value);
  }
  
  @Override
  public String toString() {
    StringBuilder str = new StringBuilder(component.getBinaryName());
    for(Entry<String, ComputedValue> field : values.entrySet()) {
      str.append("\n  ");
      str.append(field.getKey());
      str.append(" = ");
      str.append(field.getValue().getStringValue());
    }
    return str.toString();
  }

  @Override
  public void copy(ComponentInstance other) {
    // TODO Auto-generated method stub
    throw new IllegalStateException("Not implemented");
  }

  @Override
  public void commitChanges() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Map<String, ComputedValue> getFieldValues() {
    return values;
  }
}
