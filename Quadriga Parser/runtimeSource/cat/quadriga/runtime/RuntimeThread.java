package cat.quadriga.runtime;

import cat.quadriga.parsers.code.types.qdg.QuadrigaThread;

public interface RuntimeThread extends QuadrigaThread {
  void init(RuntimeEnvironment re);
  void cleanUp(RuntimeEnvironment runtime);
  void execute(RuntimeEnvironment re);
}
