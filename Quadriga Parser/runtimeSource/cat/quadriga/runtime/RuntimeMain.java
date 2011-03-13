package cat.quadriga.runtime;

import cat.quadriga.parsers.code.types.qdg.QuadrigaMain;

public interface RuntimeMain extends QuadrigaMain {
  void execute(RuntimeEnvironment runtime);
}
