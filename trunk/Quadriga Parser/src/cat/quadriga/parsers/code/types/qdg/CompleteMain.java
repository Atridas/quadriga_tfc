package cat.quadriga.parsers.code.types.qdg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;

public class CompleteMain extends BaseTypeClass implements QuadrigaMain {
  
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

}
