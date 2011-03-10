package cat.quadriga.runtime;

import java.util.HashMap;
import java.util.Map.Entry;

public class ComponentArray {
  private RuntimeComponent component;
  
  private final HashMap<Integer, Integer> entityPositions = new HashMap<Integer, Integer>();
  
  private final int innerSize;
  private ComponentRow[][] arrayOfComponents;
  
  private int firstFreeSpace;
  
  public ComponentArray(RuntimeComponent comp, int stepSize, int numArrays) {
    if(stepSize < 10) {
      innerSize = 10;
    } else {
      innerSize = stepSize;
    }
    
    arrayOfComponents = new ComponentRow[numArrays][innerSize];
    for(int i = 0; i < arrayOfComponents.length; i++) {
      for(int j = 0; j < innerSize; j++) {
        arrayOfComponents[i][j] = new ComponentRow(i * innerSize + j + 1);
      }
    }
  }
  
  private ComponentRow getComponent(int position) {
    if(position > innerSize * arrayOfComponents.length) {
      synchronized (this) {
        if(position > innerSize * arrayOfComponents.length) {
          ComponentRow[][] newArray = new ComponentRow[arrayOfComponents.length+1][];
          for(int i = 0; i < arrayOfComponents.length; i++) {
            newArray[i] = arrayOfComponents[i];
          }
          newArray[arrayOfComponents.length] = new ComponentRow[innerSize];
          for(int j = 0; j < innerSize; j++) {
            arrayOfComponents[arrayOfComponents.length][j] = new ComponentRow(arrayOfComponents.length * innerSize + j + 1);
          }
          
          arrayOfComponents = newArray;
        }
      }
    }
    
    int firstCoord = position / innerSize;
    int seconCoord = position % innerSize;
    
    return arrayOfComponents[firstCoord][seconCoord];
  }
  
  public synchronized void setNewComponent(int entity, ComponentObject comp) {
    assert comp.getComponent().equals(component);
    assert !entityPositions.keySet().contains(entity);
    int position = firstFreeSpace;
    ComponentRow component = getComponent(position);
    firstFreeSpace = component.entity;
    
    component.entity = entity;
    entityPositions.put(entity, position);
    component.copy(comp);
    component.flush();
  }
  
  public synchronized void removeComponent(int entity) {
    Integer position = entityPositions.get(entity);
    assert position != null;
    
    ComponentRow component = getComponent(position);
    component.entity = firstFreeSpace;
    firstFreeSpace = position;
  }
  
  public synchronized ComponentObject accessToComponent(int entity) {
    Integer position = entityPositions.get(entity);
    assert position != null;
    
    return getComponent(position);
  }
  
  private class ComponentRow implements ComponentObject {
    int entity;
    
    HashMap<String,ComputedValue> fields = new HashMap<String, ComputedValue>();
    HashMap<String,ComputedValue> modifiedValues = new HashMap<String, ComputedValue>();
    
    ComponentRow(int entity) {
      this.entity = entity;
      for(String field: component.getAllFields()) {
        fields.put(field, component.getFieldType(field).getDefaultValue());
      }
    }

    @Override
    public RuntimeComponent getComponent() {
      return component;
    }

    @Override
    public ComputedValue getFieldValue(String field) {
      ComputedValue value = modifiedValues.get(field);
      if(value == null) {
        return fields.get(field);
      }
      return value;
    }

    @Override
    public void setFieldValue(String field, ComputedValue value) {
      assert fields.keySet().contains(field);
      modifiedValues.put(field, value);
    }

    @Override
    public void copy(ComponentObject other) {
      for(String field : component.getAllFields()) {
        modifiedValues.put(field, other.getFieldValue(field));
      }
    }
    
    void flush() {
      for(Entry<String, ComputedValue> field : modifiedValues.entrySet()) {
        fields.get(field.getKey()).set(field.getValue());
      }
    }
  }
}
