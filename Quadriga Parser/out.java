package cat.quadriga.parsers.code;


public abstract class ExpressionNode {
  private String treeStringRepresentation = ;
  private final int beginLine;
  private final int beginColumn;
  private final int endLine;
  private final int endColumn;
  public ExpressionNode(int beginLine, int beginColumn, int endLine, int endColumn) {
    St: =
    +- Op: >> unary proxy <<
    |  +- Op: >> proxy [ this.beginLine ]
    +- Op: >> unary proxy <<
       +- Op: >> proxy [ beginLine ];
    St: =
    +- Op: >> unary proxy <<
    |  +- Op: >> proxy [ this.beginColumn ]
    +- Op: >> unary proxy <<
       +- Op: >> proxy [ beginColumn ];
    St: =
    +- Op: >> unary proxy <<
    |  +- Op: >> proxy [ this.endLine ]
    +- Op: >> unary proxy <<
       +- Op: >> proxy [ endLine ];
    St: =
    +- Op: >> unary proxy <<
    |  +- Op: >> proxy [ this.endColumn ]
    +- Op: >> unary proxy <<
       +- Op: >> proxy [ endColumn ];
  }
  public final String treeStringRepresentation(){
    if( ) {
      return ;
    }
    Stringoperation = ;
    Stringoperands[] = ;
    return ;
  }
  protected abstract String getOperation();
  protected abstract String[] getOperands();
  @Overridepublic String toString(){
    return ;
  }
  public int getBeginLine(){
    return ;
  }
  public int getBeginColumn(){
    return ;
  }
  public int getEndLine(){
    return ;
  }
  public int getEndColumn(){
    return ;
  }
  
}
