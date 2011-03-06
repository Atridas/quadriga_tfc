package cat.quadriga.parsers.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.statements.BlockCode;

public class QuadrigaFunction extends CodeZoneClass implements TreeRepresentable{

  public final List<ParameterClass> parameters;
  public final BlockCode code;
  
  public QuadrigaFunction(List<ParameterClass> parameters, BlockCode code, CodeZone cd) {
    super(cd);
    this.parameters = Collections.unmodifiableList(new ArrayList<ParameterClass>(parameters));
    this.code = code;
  }

  @Override
  public String treeStringRepresentation() {
    String params = Utils.parametersRepresentation(parameters);
    return Utils.treeStringRepresentation("Quadriga function",params,code.treeStringRepresentation());
  }

}
