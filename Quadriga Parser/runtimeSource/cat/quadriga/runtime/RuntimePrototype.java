package cat.quadriga.runtime;

import java.util.Map;

import cat.quadriga.parsers.code.statements.CallToNamedArguments;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaPrototype;

public interface RuntimePrototype extends QuadrigaPrototype {
  
  void apply(
      Entity entity, 
      CallToNamedArguments arguments,
      Map<QuadrigaComponent, CallToNamedArguments> componentArguments,
      RuntimeEnvironment runtime);
}
