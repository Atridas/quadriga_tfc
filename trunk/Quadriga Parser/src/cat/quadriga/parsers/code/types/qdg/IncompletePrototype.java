package cat.quadriga.parsers.code.types.qdg;

import java.util.List;

import cat.quadriga.parsers.code.ParameterClass;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class IncompletePrototype extends BaseTypeClass implements Prototype {

  public List<ParameterClass> parameters;
  public BlockCode initializations; 
  
  public IncompletePrototype(String name) {
    super(name);
  }
  
  public IncompletePrototype(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
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
  public boolean isValid() {
    return false;
  }

  @Override
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation("Incomplete Prototype " + getBinaryName(), 
        initializations.treeStringRepresentation());
  }

}
