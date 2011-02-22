package cat.quadriga.parsers.code.types;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.StaticAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.StaticFieldAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.StaticMethodAccess;

public class ReferenceTypeRef extends JavaType {
  
  private final Map<String, List<AccessibleObject>> ambiguousNames = new HashMap<String, List<AccessibleObject>>();
  private final Map<String, Field> fields = new HashMap<String, Field>(),
                             staticFields = new HashMap<String, Field>();
  private final Map<String, List<Method>> methods = new HashMap<String, List<Method>>(),
                              staticMethods = new HashMap<String, List<Method>>();
  private final List<Constructor<?>> constructors = new LinkedList<Constructor<?>>();
  
  //TODO inner classes...
  
  public ReferenceTypeRef(Class<?> c, String binaryName) {
    super(c, "L" + c.getCanonicalName() + ";");
    
    Field[] fields = c.getFields();
    for(int i = 0; i < fields.length; i++) {
      addField(fields[i]);
    }
    
    Method[] methods = c.getMethods();
    for(int i = 0; i < methods.length; i++) {
      addMethod(methods[i]);
    }
    
    Constructor<?>[] constructors = c.getConstructors();
    for(int i = 0; i < constructors.length; i++) {
      addConstructor(constructors[i]);
    }
  }
  
  
  public DataAccess getStaticAccess(String name, CodeZone cz) {
    List<AccessibleObject> ambiguous = ambiguousNames.get(name);
    if(ambiguous != null) {
      //TODO millorable
      return new StaticAccess(name,this.classObject,cz);
    }
    
    Field field = staticFields.get(name);
    if(field != null) {
      return new StaticFieldAccess(field,cz);
    }
    
    List<Method> methodList = staticMethods.get(name);
    if(methodList != null) {
      return new StaticMethodAccess(methodList.toArray(new Method[methodList.size()]),cz);
    }
    
    return new StaticAccess("Proxy access to " + name, this.classObject,cz);
  }

  private boolean searchAndDeleteRedundant(String objectName, boolean fields, boolean isStatic) {
    if(ambiguousNames.containsKey(objectName)) {
      return true;
    }
    if(fields) {
      if(isStatic) {
        if(staticMethods.remove(objectName) != null) {
          ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
          return true;
        }
      } else {
        if(methods.remove(objectName) != null) {
          ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
          return true;
        }
      }
    } else {
      if(isStatic) {
        if(staticFields.remove(objectName) != null) {
          ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
          return true;
        }
      } else {
        if(this.fields.remove(objectName) != null) {
          ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
          return true;
        }
      }
    }
    return false;
  }

  private void addField(Field field) {
    if((field.getModifiers() & Utils.STATIC) > 0) {
      if(field.getDeclaringClass().equals(this.classObject) ) {
        if(searchAndDeleteRedundant(field.getName(),true,true)) {
          ambiguousNames.get(field.getName()).add(field);
        } else {
          staticFields.put(field.getName(), field);
        }
      }
    } else {
      if(searchAndDeleteRedundant(field.getName(), true, false)) {
        ambiguousNames.get(field.getName()).add(field);
      } else {
        fields.put(field.getName(), field);
      }
    }
  }

  private void addMethod(Method method) {
    if((method.getModifiers() & Utils.STATIC) > 0) {
      if(method.getDeclaringClass().equals(this.classObject) ) {
        if(searchAndDeleteRedundant(method.getName(),false,true)) {
          ambiguousNames.get(method.getName()).add(method);
        } else {
          List<Method> methods = staticMethods.get(method.getName());
          if(methods == null) {
            methods = new LinkedList<Method>();
            staticMethods.put(method.getName(), methods);
          }
          methods.add(method);
        }
      }
    } else {
      if(searchAndDeleteRedundant(method.getName(),false, false)) {
        ambiguousNames.get(method.getName()).add(method);
      } else {
        List<Method> methods = this.methods.get(method.getName());
        if(methods == null) {
          methods = new LinkedList<Method>();
          this.methods.put(method.getName(), methods);
        }
        methods.add(method);
      }
    }
  }

  private void addConstructor(Constructor<?> constructor) {
    constructors.add(constructor);
  }
}
