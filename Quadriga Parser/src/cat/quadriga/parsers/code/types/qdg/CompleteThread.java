package cat.quadriga.parsers.code.types.qdg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class CompleteThread extends BaseTypeClass implements QuadrigaThread {
  
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
    //TODO
    return null;
  }

}
