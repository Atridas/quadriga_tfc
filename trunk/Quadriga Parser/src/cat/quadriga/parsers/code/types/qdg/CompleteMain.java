package cat.quadriga.parsers.code.types.qdg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.runtime.Clock;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimeMain;
import cat.quadriga.runtime.RuntimeThread;

public class CompleteMain extends BaseTypeClass implements RuntimeMain {
  
  public final List<QuadrigaThread> threads;
  public final BlockCode init;

  public CompleteMain(String binaryName, List<QuadrigaThread> threads, BlockCode block) {
    super(binaryName);
    this.threads = Collections.unmodifiableList(new ArrayList<QuadrigaThread>(threads));
    this.init = block;
  }

  public CompleteMain(String pack, String binaryName, List<QuadrigaThread> threads, BlockCode block) {
    this((pack.length()>0)? (pack + "." + binaryName) : binaryName, threads, block);
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return null;
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return false;
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  private boolean valid = false;
  private CompleteMain validVersion = null;
  @Override
  public CompleteMain getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(valid) {
      return this;
    } else if(validVersion == null) {
      
      List<QuadrigaThread> newThreads = new ArrayList<QuadrigaThread>(threads.size());
      for(QuadrigaThread thread : threads) {
        if(thread.isValid()) {
          newThreads.add(thread);
        } else {
          thread = thread.getValid(symbolTable, errorLog);
          if(thread == null) {
            return null;
          }
          newThreads.add(thread);
        }
      }
      
      BlockCode nBlock;
      if(init == null || init.isCorrectlyLinked()) {
        nBlock = init;
      } else {
        nBlock = init.getLinkedVersion(symbolTable, errorLog);
        if(nBlock == null) {
          return null;
        }
      }
      validVersion = new CompleteMain(getBinaryName(), newThreads, nBlock);
      validVersion.valid = true;
      validVersion.validVersion = validVersion;
    }
    return validVersion;
  }
  
  @Override
  public boolean isValid() {
    return valid;
  }
  
  @Override
  public String treeStringRepresentation() {
    List<String> aux = new LinkedList<String>();
    
    for(QuadrigaThread qt : threads) {
      aux.add("thread: " + qt.getBinaryName());
    }
    
    if(init != null) {
      aux.add(init.treeStringRepresentation());
    }
    
    return Utils.treeStringRepresentation("main", aux);
  }

  @Override
  public boolean isSerializable() {
    return false;
  }
  
  public static boolean PARALLEL = false;
  
  @Override
  public void execute(RuntimeEnvironment runtime) {
    if(init != null) {
      try {
        init.execute(runtime);
      } catch(BreakOrContinueException e) {
        throw new IllegalStateException(e);
      }
    }
    
    
    if(!PARALLEL) {
      for(QuadrigaThread qt: threads) {
        RuntimeThread thread = (RuntimeThread) qt;
        thread.init(runtime);
      }
      
      Clock fpsClock = new Clock();
      fpsClock.update();
      
      while(runtime.keepRunning) {
        float fps = 1.0f / fpsClock.update();
        RenderManager.instance.setFPS(getBinaryName(), fps);
        
        
        for(QuadrigaThread qt: threads) {
          RuntimeThread thread = (RuntimeThread) qt;
          thread.execute(runtime);
        }
      }
      
      for(QuadrigaThread qt: threads) {
        RuntimeThread thread = (RuntimeThread) qt;
        thread.cleanUp(runtime);
      }
    } else {
      //Parallel version
      Thread[] threads = new Thread[this.threads.size()];
      
      int i = 0;
      for(QuadrigaThread qt: this.threads) {
        CompleteThread thread = (CompleteThread) qt;
        thread.runtime = runtime;
        threads[i] = new Thread(thread);
        threads[i].setName(thread.getBinaryName());
        threads[i].start();
        ++i;
      }
      
      for(Thread t : threads) {
        try {
          t.join();
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      
    }
  }

}
