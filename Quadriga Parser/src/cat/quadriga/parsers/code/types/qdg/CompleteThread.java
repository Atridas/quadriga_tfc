package cat.quadriga.parsers.code.types.qdg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimeSystem;
import cat.quadriga.runtime.RuntimeThread;

public class CompleteThread extends BaseTypeClass implements RuntimeThread {
  
  public final List<QuadrigaSystem> systems;
  public final BlockCode init;

  public CompleteThread(String binaryName, List<QuadrigaSystem> systems, BlockCode init, String file) {
    super(binaryName);
    this.systems = Collections.unmodifiableList(new ArrayList<QuadrigaSystem>(systems));
    if(init == null) {
      this.init = new BlockCode.TmpBlockCode(file).transformToBlockCode();
    } else {
      this.init = init;
    }
  }
  
  public CompleteThread(String pack, String name, List<QuadrigaSystem> systems, BlockCode init, String file) {
    this((pack.length()>0)? (pack + "." + name) : name, systems, init, file);
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return UnknownType.empty;
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  @Override
  public String treeStringRepresentation() {
    List<String> aux = new ArrayList<String>(systems.size());
    for(QuadrigaSystem s : systems) {
      aux.add(s.getBinaryName());
    }
    String linkedStatus; 
    if(!isValid()) {
      linkedStatus = " <->";
    } else {
      linkedStatus = " <+>";
    }
    return Utils.treeStringRepresentation("thread" + linkedStatus, aux);
  }

  private boolean valid = false;
  private CompleteThread validVersion = null;
  @Override
  public CompleteThread getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(valid) {
      return this;
    } else if(validVersion == null) {
      List<QuadrigaSystem> qs = new ArrayList<QuadrigaSystem>();
      for(QuadrigaSystem s : systems) {
        if(s.isValid()) {
          qs.add(s);
        } else {
          QuadrigaSystem aux = s.getValid(symbolTable, errorLog);
          if(aux == null) {
            break;
          } else {
            qs.add(aux);
          }
        }
      }
      if(qs.size() != systems.size()) {
        return null;
      }
      BlockCode bc;
      if(init.isCorrectlyLinked()) {
        bc = init;
      } else {
        bc = init.getLinkedVersion(symbolTable, errorLog);
        if(bc == null) {
          return null;
        }
      }
      
      validVersion = new CompleteThread(getBinaryName(), qs, bc, bc.file);
      validVersion.validVersion = validVersion;
      validVersion.valid = true;
    }
    return validVersion;
  }

  @Override
  public boolean isValid() {
    return valid;
  }


  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }

  @Override
  public boolean isSerializable() {
    return true;
  }

  @Override
  public void init(RuntimeEnvironment runtime) {
    assert isValid();
    for(QuadrigaSystem qs : systems) {
      init.execute(runtime);
    }
  }

  @Override
  public void execute(RuntimeEnvironment runtime) {
    assert isValid();
    for(QuadrigaSystem qs : systems) {
      RuntimeSystem system = (RuntimeSystem) qs;
      List<Entity> entities = runtime.entitySystem.getAllEntitiesWithComponents(
                                                  system.neededComponents(),
                                                  runtime);

      for(Entity entity : entities) {
        system.update(entity, runtime);
      }
      for(Entity entity : entities) {
        entity.commitChanges();
      }
      
    }
  }
}
