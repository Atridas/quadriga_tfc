package cat.quadriga.parsers.code.types.qdg;

import java.util.List;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.ParameterClass;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class IncompletePrototype extends BaseTypeClass implements QuadrigaPrototype {

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
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation("Incomplete Prototype " + getBinaryName(),
        (parameters == null || parameters.size() == 0)? null : Utils.parametersRepresentation(parameters),
        initializations.treeStringRepresentation());
  }
  
  @Override
  public boolean isValid() {
    return false;
  }

  @Override
  public CompletePrototype getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    return new CompletePrototype(this).getValid(symbolTable, errorLog);
  }


  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }

  @Override
  public boolean isSerializable() {
    return false;
  }
}
