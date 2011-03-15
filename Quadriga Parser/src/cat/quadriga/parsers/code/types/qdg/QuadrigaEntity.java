package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ReferenceTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;

public class QuadrigaEntity extends ReferenceTypeRef {
  
  public static final QuadrigaEntity baseEntity = new QuadrigaEntity();
  
  public final Set<QuadrigaComponent> catchedComponents;

  private QuadrigaEntity() {
    super(Entity.class,"Lcat/quadriga/runtime/Entity;");
    catchedComponents = Collections.emptySet();
    valid = true;
    validVersion = this;
  }
  
  private QuadrigaEntity(Set<QuadrigaComponent> catchedComponents) {
    super(Entity.class,"Lcat/quadriga/runtime/Entity;");
    this.catchedComponents = Collections.unmodifiableSet(new HashSet<QuadrigaComponent>(catchedComponents));
  }
  
  private static Map<Set<QuadrigaComponent>, QuadrigaEntity> cachedEntities = new HashMap<Set<QuadrigaComponent>, QuadrigaEntity>();
  public static QuadrigaEntity getEntity(Set<QuadrigaComponent> components) {
    QuadrigaEntity entity = cachedEntities.get(components);
    if(entity == null) {
      entity = new QuadrigaEntity(components);
      cachedEntities.put(components, entity);
    }
    return entity;
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return UnknownType.empty;
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  
  private boolean valid;
  private QuadrigaEntity validVersion;
  @Override
  public QuadrigaEntity getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(valid) {
      return this;
    } else if(validVersion == null) {
      Set<QuadrigaComponent> newCached = new HashSet<QuadrigaComponent>();
      for(QuadrigaComponent qc : catchedComponents) {
        if(qc.isValid()) {
          newCached.add(qc);
        } else {
          QuadrigaComponent aux = qc.getValid(symbolTable, errorLog);
          if(aux == null) {
            return null;
          } else {
            newCached.add(aux);
          }
        }
      }
      validVersion = new QuadrigaEntity(newCached);
      validVersion.valid = true;
      validVersion.validVersion = validVersion;
    }
    return validVersion;
  }

  @Override
  public boolean isValid() {
    return true;
  }


  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }

  @Override
  public ComputedValue getDefaultValue() {
    // TODO Auto-generated method stub
    throw new IllegalStateException("Not yet implemented");
  }

  @Override
  public boolean isSerializable() {
    return true;
  }
}
