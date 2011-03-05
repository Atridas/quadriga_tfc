package cat.quadriga.parsers.code.types.qdg;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

import cat.quadriga.parsers.code.ParameterClass;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class CompletePrototype extends BaseTypeClass implements Prototype {

  public final List<ParameterClass> parameters;
  public final BlockCode initializations; 
  
  public CompletePrototype(IncompletePrototype original) {
    super(original.getBinaryName());
    initializations = original.initializations;
    parameters = Collections.unmodifiableList(new Vector<ParameterClass>(original.parameters));
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
    return true;
  }

  @Override
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation("Prototype", initializations.treeStringRepresentation());
  }
}
