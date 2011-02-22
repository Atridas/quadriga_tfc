package cat.quadriga.parsers;
import java.io.*;import java.util.*;import cat.quadriga.parsers.code.*;import cat.quadriga.parsers.code.statements.*;import cat.quadriga.parsers.code.expressions.*;import cat.quadriga.parsers.code.expressions.dataaccess.*;import cat.quadriga.parsers.code.printers.*;import cat.quadriga.parsers.code.symbols.*;import cat.quadriga.parsers.code.types.*;
@ ()public class QuadrigaSimple implements {
  static public final class ModifierSet {
    public static final I ;
    public static final I ;
    public static final I ;
    public static final I ;
    public static final I ;
    public static final I ;
    public static final I ;
    public static final I ;
    public static final I ;
    public static final I ;
    public static final I ;
    public Z isPublic
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isProtected
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isPrivate
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isStatic
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isAbstract
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isFinal
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isNative
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isStrictfp
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isSynchronized
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isTransient
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    public Z isVolatile
    Params
    modifiers: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    static I removeModifier
    Params
    modifiers: I
    mod: I
    Block:
    +- Local Variables:
    +- Code:
       +- >> Proxy Statement: 
          +- return ;
          <<
    
  }
  
  private I ;
  private I getNewId
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Lcat.quadriga.parsers.code.ErrorLog; ;
  private Lcat.quadriga.parsers.code.symbols.SymbolTable; ;
  private Lcat.quadriga.parsers.code.statements.StatementNode; ;
  private #unknown BlockCode.TmpBlockCode # ;
  public QuadrigaSimple
  Params
  fileName: Ljava.lang.String;
  {
    this();
    >> Proxy Statement: 
    +- try 
    +- Block:
    +- +- Local Variables:
    +- +- Code:
    +-    +- St: Method Call
    +-       +- Op: >> Proxy Data Access [ReInit] << catch() 
    +- Block:
    +- +- Local Variables:
    +- +- Code:
    +-    +- St: Method Call
    +-       +- Op: >> Proxy Data Access [e.printStackTrace] <<
    <<
  }
  public static main
  Params
  args: [Ljava.lang.String;
  Block:
  +- Local Variables:
  |  +- Symbol Var [ parser ] Type [ Lcat.quadriga.parsers.QuadrigaSimple; ]
  +- Code:
     +- Statements:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: ==
     |  |     +- Op: Array Length
     |  |     |  +- Op: Local variable access: args
     |  |     +- Op: Literal
     |  |        +- Integer: 0
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: Method Call
     |  |        |  +- Op: Method:
     |  |        |     +- java.io.PrintStream -> println
     |  |        |     +- Op: Static Field:
     |  |        |        +- java.lang.System -> out
     |  |        +- St: =
     |  |           +- Op: Local variable access: parser
     |  |           +- Op: >> proxy [ new something ]
     |  +- Else Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: ==
     |        |     +- Op: >> Proxy Data Access [args.length] <<
     |        |     +- Op: Literal
     |        |        +- Integer: 1
     |        +- If Code:
     |        |  +- Block:
     |        |     +- Local Variables:
     |        |     +- Code:
     |        |        +- St: Method Call
     |        |        |  +- Op: Method:
     |        |        |     +- java.io.PrintStream -> println
     |        |        |     +- Op: Static Field:
     |        |        |        +- java.lang.System -> out
     |        |        +- >> Proxy Statement: 
     |        |           +- try 
     |        |           +- Block:
     |        |           +- +- Local Variables:
     |        |           +- +- Code:
     |        |           +-    +- St: =
     |        |           +-       +- Op: >> Proxy Data Access [parser] <<
     |        |           +-       +- Op: >> proxy [ new something ] catch() 
     |        |           +- Block:
     |        |           +- +- Local Variables:
     |        |           +- +- Code:
     |        |           +-    +- St: Method Call
     |        |           +-    |  +- Op: Method:
     |        |           +-    |     +- java.io.PrintStream -> println
     |        |           +-    |     +- Op: Static Field:
     |        |           +-    |        +- java.lang.System -> out
     |        |           +-    +- >> Proxy Statement: 
     |        |           +-       +- return ;
     |        |           +-       <<
     |        |           <<
     |        +- Else Code:
     |           +- Block:
     |              +- Local Variables:
     |              +- Code:
     |                 +- St: Method Call
     |                 |  +- Op: Method:
     |                 |     +- java.io.PrintStream -> println
     |                 |     +- Op: Static Field:
     |                 |        +- java.lang.System -> out
     |                 +- St: Method Call
     |                 |  +- Op: Method:
     |                 |     +- java.io.PrintStream -> println
     |                 |     +- Op: Static Field:
     |                 |        +- java.lang.System -> out
     |                 +- St: Method Call
     |                 |  +- Op: Method:
     |                 |     +- java.io.PrintStream -> println
     |                 |     +- Op: Static Field:
     |                 |        +- java.lang.System -> out
     |                 +- St: Method Call
     |                 |  +- Op: Method:
     |                 |     +- java.io.PrintStream -> println
     |                 |     +- Op: Static Field:
     |                 |        +- java.lang.System -> out
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- |  +- Symbol Var [ info ] Type [ Ljava.util.List; ]
        +- |  +- Symbol Var [ mp ] Type [ Lcat.quadriga.parsers.code.printers.MegaPrinter; ]
        +- +- Code:
        +-    +- Statements:
        +-    |  +- St: =
        +-    |     +- Op: Local variable access: info
        +-    |     +- Op: Method Call
        +-    |        +- Op: >> Proxy Data Access [parser.CompilationUnit] <<
        +-    +- St: Method Call
        +-    |  +- Op: Method:
        +-    |     +- java.io.PrintStream -> println
        +-    |     +- Op: Static Field:
        +-    |        +- java.lang.System -> out
        +-    +- Statements:
        +-    |  +- St: =
        +-    |     +- Op: Local variable access: mp
        +-    |     +- Op: Method Call
        +-    |        +- Op: Method:
        +-    |           +- cat.quadriga.parsers.code.printers.MegaPrinter -> getInstance
        +-    +- St: Method Call
        +-    |  +- Op: Method:
        +-    |     +- java.io.PrintStream -> println
        +-    |     +- Op: Static Field:
        +-    |        +- java.lang.System -> out
        +-    +- St: Method Call
        +-       +- Op: Method:
        +-          +- cat.quadriga.parsers.code.printers.MegaPrinter -> printToFile
        +-          +- Op: Local variable access: mp catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- St: Method Call
        +-    |  +- Op: Method:
        +-    |     +- java.io.PrintStream -> println
        +-    |     +- Op: Static Field:
        +-    |        +- java.lang.System -> out
        +-    +- St: Method Call
        +-       +- Op: Method:
        +-          +- java.io.PrintStream -> println
        +-          +- Op: Static Field:
        +-             +- java.lang.System -> out
        <<
  final public <>Ljava.util.List; CompilationUnit
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_1] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [PackageDeclaration] <<
     |  |        +- St: Method Call
     |  |           +- Op: Method:
     |  |              +- java.util.List -> add
     |  |              +- Op: Local variable access: out
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: No operation
     +- LABEL: label_1
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_1;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [ImportDeclaration] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_1;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [ImportDeclaration] <<
     |     <<
     +- LABEL: label_2
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [TypeDeclaration] <<
     |     +-    +- >> Proxy Statement: 
     |     +-       +- switch() {
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +-   St: No operation
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- default:
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break label_2;
     |     +-       +-   <<
     |     +-       +- }
     |     +-       <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [TypeDeclaration] <<
     |     +-    +- >> Proxy Statement: 
     |     +-       +- switch() {
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +- case :
     |     +-       +-   St: No operation
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- default:
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break label_2;
     |     +-       +-   <<
     |     +-       +- }
     |     +-       <<
     |     <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public PackageDeclaration
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ tokens ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ aux ] Type [ Ljava.lang.String; ]
  |  +- Symbol Var [ i ] Type [ I ]
  +- Code:
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Modifiers] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: Local variable access: tokens
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Name] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: aux
     |     +- Op: >> Proxy Data Access [image] <<
     |        +- Op: Method Call
     |           +- Op: Method:
     |              +- java.util.List -> get
     |              +- Op: Local variable access: tokens
     +- >> Proxy Statement: 
     |  +- for( Statements:
     |  +- +- St: =
     |  +-    +- Op: Local variable access: i
     |  +-    +- Op: Literal
     |  +-       +- Integer: 1; ; Statements:
     |  +- +- St: ++X
     |  +-    +- Op: Local variable access: i) 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: +=
     |  +-       +- Op: Local variable access: aux
     |  +-       +- Op: +
     |  +-          +- Op: Literal
     |  +-          |  +- String: "."
     |  +-          +- Op: >> Proxy Data Access [image] <<
     |  +-             +- Op: Method Call
     |  +-                +- Op: Method:
     |  +-                   +- java.util.List -> get
     |  +-                   +- Op: Local variable access: tokensBlock:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: +=
     |  +-       +- Op: Local variable access: aux
     |  +-       +- Op: +
     |  +-          +- Op: Literal
     |  +-          |  +- String: "."
     |  +-          +- Op: >> Proxy Data Access [image] <<
     |  +-             +- Op: Method Call
     |  +-                +- Op: Method:
     |  +-                   +- java.util.List -> get
     |  +-                   +- Op: Local variable access: tokens
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [symbolTable.addPackage] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public ImportDeclaration
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ stat ] Type [ Z ]
  |  +- Symbol Var [ tokens ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ aux ] Type [ Ljava.lang.String; ]
  |  +- Symbol Var [ i ] Type [ I ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: stat
     |     +- Op: Literal
     |        +- Boolean: false
     +- Statements:
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: stat
     |  +-   +- Op: Literal
     |  +-      +- Boolean: true
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: =
     |  +- Op: Local variable access: tokens
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Name] <<
     +- St: =
     |  +- Op: Local variable access: aux
     |  +- Op: >> Proxy Data Access [image] <<
     |     +- Op: Method Call
     |        +- Op: Method:
     |           +- java.util.List -> get
     |           +- Op: Local variable access: tokens
     +- >> Proxy Statement: 
     |  +- for( Statements:
     |  +- +- St: =
     |  +-    +- Op: Local variable access: i
     |  +-    +- Op: Literal
     |  +-       +- Integer: 1; ; Statements:
     |  +- +- St: ++X
     |  +-    +- Op: Local variable access: i) 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: +=
     |  +-       +- Op: Local variable access: aux
     |  +-       +- Op: +
     |  +-          +- Op: Literal
     |  +-          |  +- String: "."
     |  +-          +- Op: >> Proxy Data Access [image] <<
     |  +-             +- Op: Method Call
     |  +-                +- Op: Method:
     |  +-                   +- java.util.List -> get
     |  +-                   +- Op: Local variable access: tokensBlock:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: +=
     |  +-       +- Op: Local variable access: aux
     |  +-       +- Op: +
     |  +-          +- Op: Literal
     |  +-          |  +- String: "."
     |  +-          +- Op: >> Proxy Data Access [image] <<
     |  +-             +- Op: Method Call
     |  +-                +- Op: Method:
     |  +-                   +- java.util.List -> get
     |  +-                   +- Op: Local variable access: tokens
     |  <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [symbolTable.addPackage] <<
     |  +-   St: +=
     |  +-   +- Op: >> Proxy Data Access [aux] <<
     |  +-   +- Op: Literal
     |  +-      +- String: ".*"
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   >> Proxy Statement: 
     |  +-   +- try 
     |  +-   +- Block:
     |  +-   +- +- Local Variables:
     |  +-   +- |  +- Symbol Var [ clazz ] Type [ Ljava.lang.Class; ]
     |  +-   +- |  +- Symbol Var [ symbol ] Type [ Lcat.quadriga.parsers.code.symbols.BaseSymbol; ]
     |  +-   +- +- Code:
     |  +-   +-    +- Statements:
     |  +-   +-    |  +- St: =
     |  +-   +-    |     +- Op: Local variable access: clazz
     |  +-   +-    |     +- Op: Method Call
     |  +-   +-    |        +- Op: Method:
     |  +-   +-    |           +- java.lang.Class -> forName
     |  +-   +-    +- Statements:
     |  +-   +-    |  +- St: =
     |  +-   +-    |     +- Op: Local variable access: symbol
     |  +-   +-    |     +- Op: >> proxy [ new something ]
     |  +-   +-    +- St: Method Call
     |  +-   +-       +- Op: >> Proxy Data Access [symbolTable.addGlobalSymbol] << catch() 
     |  +-   +- Block:
     |  +-   +- +- Local Variables:
     |  +-   +- |  +- Symbol Var [ symbol ] Type [ Lcat.quadriga.parsers.code.symbols.BaseSymbol; ]
     |  +-   +- +- Code:
     |  +-   +-    +- Statements:
     |  +-   +-    |  +- St: =
     |  +-   +-    |     +- Op: Local variable access: symbol
     |  +-   +-    |     +- Op: >> proxy [ new something ]
     |  +-   +-    +- St: Method Call
     |  +-   +-       +- Op: >> Proxy Data Access [symbolTable.addGlobalSymbol] <<
     |  +-   <<
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public I Modifiers
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ modifiers ] Type [ I ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: modifiers
     |     +- Op: Literal
     |        +- Integer: 0
     +- LABEL: label_3
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_2] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_3;
     |     +-    |              <<
     |     +-    +- >> Proxy Statement: 
     |     +-       +- switch() {
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.PUBLIC] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.STATIC] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.PROTECTED] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.PRIVATE] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.FINAL] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.ABSTRACT] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.SYNCHRONIZED] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.NATIVE] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.TRANSIENT] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.VOLATILE] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.STRICTFP] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [Annotation] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- default:
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- throw ;
     |     +-       +-   <<
     |     +-       +- }
     |     +-       <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_2] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_3;
     |     +-    |              <<
     |     +-    +- >> Proxy Statement: 
     |     +-       +- switch() {
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.PUBLIC] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.STATIC] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.PROTECTED] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.PRIVATE] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.FINAL] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.ABSTRACT] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.SYNCHRONIZED] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.NATIVE] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.TRANSIENT] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.VOLATILE] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   St: |=
     |     +-       +-   +- Op: >> Proxy Data Access [modifiers] <<
     |     +-       +-   +- Op: >> Proxy Data Access [ModifierSet.STRICTFP] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [out.add] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- case :
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [Annotation] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- break;
     |     +-       +-   <<
     |     +-       +- default:
     |     +-       +-   St: Method Call
     |     +-       +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-       +-   >> Proxy Statement: 
     |     +-       +-   +- throw ;
     |     +-       +-   <<
     |     +-       +- }
     |     +-       <<
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public TypeDeclaration
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ modifiers ] Type [ I ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
        +- switch() {
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +-   St: =
        +-   +- Op: Local variable access: modifiers
        +-   +- Op: Method Call
        +-      +- Op: >> Proxy Data Access [Modifiers] <<
        +-   >> Proxy Statement: 
        +-   +- switch() {
        +-   +- case :
        +-   +- case :
        +-   +-   St: Method Call
        +-   +-   +- Op: >> Proxy Data Access [ClassOrInterfaceDeclaration] <<
        +-   +-   >> Proxy Statement: 
        +-   +-   +- break;
        +-   +-   <<
        +-   +- case :
        +-   +-   St: Method Call
        +-   +-   +- Op: >> Proxy Data Access [EnumDeclaration] <<
        +-   +-   >> Proxy Statement: 
        +-   +-   +- break;
        +-   +-   <<
        +-   +- case :
        +-   +-   St: Method Call
        +-   +-   +- Op: >> Proxy Data Access [AnnotationTypeDeclaration] <<
        +-   +-   >> Proxy Statement: 
        +-   +-   +- break;
        +-   +-   <<
        +-   +- default:
        +-   +-   St: Method Call
        +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   +-   >> Proxy Statement: 
        +-   +-   +- throw ;
        +-   +-   <<
        +-   +- }
        +-   <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- default:
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   >> Proxy Statement: 
        +-   +- throw ;
        +-   <<
        +- }
        <<
  final public ClassOrInterfaceDeclaration
  Params
  modifiers: I
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ isInterface ] Type [ Z ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: isInterface
     |     +- Op: Literal
     |        +- Boolean: false
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: isInterface
     |  +-   +- Op: Literal
     |  +-      +- Boolean: true
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [TypeParameters] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [ExtendsList] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [ImplementsList] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [ClassOrInterfaceBody] <<
  final public ExtendsList
  Params
  isInterface: Z
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ extendsMoreThanOne ] Type [ Z ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: extendsMoreThanOne
     |     +- Op: Literal
     |        +- Boolean: false
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
     +- LABEL: label_4
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_4;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: extendsMoreThanOne
     |     +-       +- Op: Literal
     |     +-          +- Boolean: trueBlock:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_4;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: extendsMoreThanOne
     |     +-       +- Op: Literal
     |     +-          +- Boolean: true
     |     <<
     +- If Statement:
        +- Condition:
        |  +- Op: &&
        |     +- Op: >> Proxy Data Access [extendsMoreThanOne] <<
        |     +- Op: !
        |        +- Op: >> Proxy Data Access [isInterface] <<
        +- If Code:
           +- Block:
              +- Local Variables:
              +- Code:
                 +- If Statement:
                    +- Condition:
                    |  +- Op: Literal
                    |     +- Boolean: true
                    +- If Code:
                       +- >> Proxy Statement: 
                          +- throw ;
                          <<
  final public ImplementsList
  Params
  isInterface: Z
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
     +- LABEL: label_5
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_5;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_5;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
     |     <<
     +- If Statement:
        +- Condition:
        |  +- Op: >> Proxy Data Access [isInterface] <<
        +- If Code:
           +- Block:
              +- Local Variables:
              +- Code:
                 +- If Statement:
                    +- Condition:
                    |  +- Op: Literal
                    |     +- Boolean: true
                    +- If Code:
                       +- >> Proxy Statement: 
                          +- throw ;
                          <<
  final public EnumDeclaration
  Params
  modifiers: I
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [ImplementsList] <<
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: out
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [EnumBody] <<
  final public EnumBody
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [EnumConstant] <<
     |  +-   LABEL: label_6
     |  +-   +- >> Proxy Statement: 
     |  +-      +- while( )
     |  +-      +- Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- If Statement:
     |  +-      +-    |  +- Condition:
     |  +-      +-    |  |  +- Op: Method Call
     |  +-      +-    |  |     +- Op: >> Proxy Data Access [jj_2_3] <<
     |  +-      +-    |  +- If Code:
     |  +-      +-    |  |  +- Block:
     |  +-      +-    |  |     +- Local Variables:
     |  +-      +-    |  |     +- Code:
     |  +-      +-    |  |        +- St: No operation
     |  +-      +-    |  +- Else Code:
     |  +-      +-    |     +- Block:
     |  +-      +-    |        +- Local Variables:
     |  +-      +-    |        +- Code:
     |  +-      +-    |           +- >> Proxy Statement: 
     |  +-      +-    |              +- break label_6;
     |  +-      +-    |              <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: >> Proxy Data Access [EnumConstant] <<Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- If Statement:
     |  +-      +-    |  +- Condition:
     |  +-      +-    |  |  +- Op: Method Call
     |  +-      +-    |  |     +- Op: >> Proxy Data Access [jj_2_3] <<
     |  +-      +-    |  +- If Code:
     |  +-      +-    |  |  +- Block:
     |  +-      +-    |  |     +- Local Variables:
     |  +-      +-    |  |     +- Code:
     |  +-      +-    |  |        +- St: No operation
     |  +-      +-    |  +- Else Code:
     |  +-      +-    |     +- Block:
     |  +-      +-    |        +- Local Variables:
     |  +-      +-    |        +- Code:
     |  +-      +-    |           +- >> Proxy Statement: 
     |  +-      +-    |              +- break label_6;
     |  +-      +-    |              <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: >> Proxy Data Access [EnumConstant] <<
     |  +-      <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   LABEL: label_7
     |  +-   +- >> Proxy Statement: 
     |  +-      +- while( )
     |  +-      +- Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- >> Proxy Statement: 
     |  +-      +-    |  +- switch() {
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +-   St: No operation
     |  +-      +-    |  +-   >> Proxy Statement: 
     |  +-      +-    |  +-   +- break;
     |  +-      +-    |  +-   <<
     |  +-      +-    |  +- default:
     |  +-      +-    |  +-   >> Proxy Statement: 
     |  +-      +-    |  +-   +- break label_7;
     |  +-      +-    |  +-   <<
     |  +-      +-    |  +- }
     |  +-      +-    |  <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: >> Proxy Data Access [ClassOrInterfaceBodyDeclaration] <<Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- >> Proxy Statement: 
     |  +-      +-    |  +- switch() {
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +- case :
     |  +-      +-    |  +-   St: No operation
     |  +-      +-    |  +-   >> Proxy Statement: 
     |  +-      +-    |  +-   +- break;
     |  +-      +-    |  +-   <<
     |  +-      +-    |  +- default:
     |  +-      +-    |  +-   >> Proxy Statement: 
     |  +-      +-    |  +-   +- break label_7;
     |  +-      +-    |  +-   <<
     |  +-      +-    |  +- }
     |  +-      +-    |  <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: >> Proxy Data Access [ClassOrInterfaceBodyDeclaration] <<
     |  +-      <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public EnumConstant
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Modifiers] <<
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [Arguments] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- >> Proxy Statement: 
        +- switch() {
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [ClassOrInterfaceBody] <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- default:
        +-   St: No operation
        +- }
        <<
  final public TypeParameters
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [TypeParameter] <<
     +- LABEL: label_8
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_8;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [TypeParameter] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_8;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [TypeParameter] <<
     |     <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public TypeParameter
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
        +- switch() {
        +- case :
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [TypeBound] <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- default:
        +-   St: No operation
        +- }
        <<
  final public TypeBound
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
     +- LABEL: label_9
        +- >> Proxy Statement: 
           +- while( )
           +- Block:
           +- +- Local Variables:
           +- +- Code:
           +-    +- >> Proxy Statement: 
           +-    |  +- switch() {
           +-    |  +- case :
           +-    |  +-   St: No operation
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break;
           +-    |  +-   <<
           +-    |  +- default:
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break label_9;
           +-    |  +-   <<
           +-    |  +- }
           +-    |  <<
           +-    +- St: Method Call
           +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-       +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<Block:
           +- +- Local Variables:
           +- +- Code:
           +-    +- >> Proxy Statement: 
           +-    |  +- switch() {
           +-    |  +- case :
           +-    |  +-   St: No operation
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break;
           +-    |  +-   <<
           +-    |  +- default:
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break label_9;
           +-    |  +-   <<
           +-    |  +- }
           +-    |  <<
           +-    +- St: Method Call
           +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-       +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
           <<
  final public ClassOrInterfaceBody
  Params
  isInterface: Z
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- LABEL: label_10
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_10;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [ClassOrInterfaceBodyDeclaration] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: Method:
     |     +-          +- java.util.List -> add
     |     +-          +- Op: Local variable access: outBlock:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_10;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [ClassOrInterfaceBodyDeclaration] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: Method:
     |     +-          +- java.util.List -> add
     |     +-          +- Op: Local variable access: out
     |     <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public ClassOrInterfaceBodyDeclaration
  Params
  isInterface: Z
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ isNestedInterface ] Type [ Z ]
  |  +- Symbol Var [ modifiers ] Type [ I ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: isNestedInterface
     |     +- Op: Literal
     |        +- Boolean: false
     +- Statements:
     +- If Statement:
        +- Condition:
        |  +- Op: Method Call
        |     +- Op: >> Proxy Data Access [jj_2_6] <<
        +- If Code:
        |  +- Block:
        |     +- Local Variables:
        |     +- Code:
        |        +- St: Method Call
        |        |  +- Op: >> Proxy Data Access [Initializer] <<
        |        +- If Statement:
        |           +- Condition:
        |           |  +- Op: Local variable access: isInterface
        |           +- If Code:
        |              +- Block:
        |                 +- Local Variables:
        |                 +- Code:
        |                    +- If Statement:
        |                       +- Condition:
        |                       |  +- Op: Literal
        |                       |     +- Boolean: true
        |                       +- If Code:
        |                          +- >> Proxy Statement: 
        |                             +- throw ;
        |                             <<
        +- Else Code:
           +- Block:
              +- Local Variables:
              +- Code:
                 +- >> Proxy Statement: 
                    +- switch() {
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +- case :
                    +-   St: =
                    +-   +- Op: >> Proxy Data Access [modifiers] <<
                    +-   +- Op: Method Call
                    +-      +- Op: >> Proxy Data Access [Modifiers] <<
                    +-   >> Proxy Statement: 
                    +-   +- switch() {
                    +-   +- case :
                    +-   +- case :
                    +-   +-   St: Method Call
                    +-   +-   +- Op: >> Proxy Data Access [ClassOrInterfaceDeclaration] <<
                    +-   +-   >> Proxy Statement: 
                    +-   +-   +- break;
                    +-   +-   <<
                    +-   +- case :
                    +-   +-   St: Method Call
                    +-   +-   +- Op: >> Proxy Data Access [EnumDeclaration] <<
                    +-   +-   >> Proxy Statement: 
                    +-   +-   +- break;
                    +-   +-   <<
                    +-   +- default:
                    +-   +-   If Statement:
                    +-   +-   +- Condition:
                    +-   +-   |  +- Op: Method Call
                    +-   +-   |     +- Op: >> Proxy Data Access [jj_2_4] <<
                    +-   +-   +- If Code:
                    +-   +-   |  +- Block:
                    +-   +-   |     +- Local Variables:
                    +-   +-   |     +- Code:
                    +-   +-   |        +- St: Method Call
                    +-   +-   |           +- Op: >> Proxy Data Access [ConstructorDeclaration] <<
                    +-   +-   +- Else Code:
                    +-   +-      +- If Statement:
                    +-   +-         +- Condition:
                    +-   +-         |  +- Op: Method Call
                    +-   +-         |     +- Op: >> Proxy Data Access [jj_2_5] <<
                    +-   +-         +- If Code:
                    +-   +-         |  +- Block:
                    +-   +-         |     +- Local Variables:
                    +-   +-         |     +- Code:
                    +-   +-         |        +- St: Method Call
                    +-   +-         |           +- Op: >> Proxy Data Access [FieldDeclaration] <<
                    +-   +-         +- Else Code:
                    +-   +-            +- Block:
                    +-   +-               +- Local Variables:
                    +-   +-               +- Code:
                    +-   +-                  +- >> Proxy Statement: 
                    +-   +-                     +- switch() {
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +- case :
                    +-   +-                     +-   St: Method Call
                    +-   +-                     +-   +- Op: >> Proxy Data Access [MethodDeclaration] <<
                    +-   +-                     +-   >> Proxy Statement: 
                    +-   +-                     +-   +- break;
                    +-   +-                     +-   <<
                    +-   +-                     +- case :
                    +-   +-                     +-   St: Method Call
                    +-   +-                     +-   +- Op: >> Proxy Data Access [AnnotationTypeDeclaration] <<
                    +-   +-                     +-   >> Proxy Statement: 
                    +-   +-                     +-   +- break;
                    +-   +-                     +-   <<
                    +-   +-                     +- default:
                    +-   +-                     +-   St: Method Call
                    +-   +-                     +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-   +-                     +-   >> Proxy Statement: 
                    +-   +-                     +-   +- throw ;
                    +-   +-                     +-   <<
                    +-   +-                     +- }
                    +-   +-                     <<
                    +-   +- }
                    +-   <<
                    +-   >> Proxy Statement: 
                    +-   +- break;
                    +-   <<
                    +- case :
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-   >> Proxy Statement: 
                    +-   +- break;
                    +-   <<
                    +- default:
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-   >> Proxy Statement: 
                    +-   +- throw ;
                    +-   <<
                    +- }
                    <<
  final public FieldDeclaration
  Params
  modifiers: I
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ v ] Type [ Lcat.quadriga.parsers.VarAndInit; ]
  |  +- Symbol Var [ tipus ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: tipus
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Type] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: =
     |  +- Op: Local variable access: v
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [VariableDeclarator] <<
     +- LABEL: label_11
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_11;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: v
     |     +-       +- Op: Method Call
     |     +-          +- Op: >> Proxy Data Access [VariableDeclarator] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_11;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: v
     |     +-       +- Op: Method Call
     |     +-          +- Op: >> Proxy Data Access [VariableDeclarator] <<
     |     <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public Lcat.quadriga.parsers.VarAndInit; VariableDeclarator
  Params
  modifiers: I
  type: Lcat.quadriga.parsers.code.types.BaseType;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ vai ] Type [ Lcat.quadriga.parsers.VarAndInit; ]
  |  +- Symbol Var [ initialization ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ leftHand ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: vai
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [VariableDeclaratorId] <<
     +- St: =
     |  +- Op: Static Access:
     |  +- Op: Local variable access: modifiers
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: >> Proxy Data Access [localBlock] <<
     |  |     +- Op: Literal
     |  |        +- Null
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     |  +- Symbol Var [ localVar ] Type [ Lcat.quadriga.parsers.code.symbols.LocalVariableSymbol; ]
     |  |     +- Code:
     |  |        +- Statements:
     |  |        |  +- St: =
     |  |        |     +- Op: Local variable access: localVar
     |  |        |     +- Op: >> proxy [ new something ]
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [symbolTable.addSymbol] <<
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [localBlock.addLocalVariable] <<
     |  |        +- St: =
     |  |           +- Op: Local variable access: leftHand
     |  |           +- Op: >> proxy [ new something ]
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |              +- Op: >> Proxy Data Access [leftHand] <<
     |              +- Op: >> proxy [ new something ]
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: >> Proxy Data Access [initialization] <<
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [VariableInitializer] <<
     |  +-   St: =
     |  +-   +- Op: >> Proxy Data Access [vai.init] <<
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.VarAndInit; VariableDeclaratorId
  Params
  type: Lcat.quadriga.parsers.code.types.BaseType;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ vai ] Type [ Lcat.quadriga.parsers.VarAndInit; ]
  +- Code:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: vai
     |     +- Op: >> proxy [ new something ]
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: Static Access:
     |  +- Op: Local variable access: t
     +- St: =
     |  +- Op: Static Access:
     |  +- Op: Local variable access: type
     +- LABEL: label_12
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_12;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-       +- Op: Static Access:
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_12;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-       +- Op: Static Access:
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; VariableInitializer
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ result ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: result
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [ArrayInitializer] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: result
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [Expression] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; ArrayInitializer
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ aux ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ listOfInits ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: listOfInits
     |     +- Op: >> proxy [ new something ]
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: aux
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [VariableInitializer] <<
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: listOfInits
     |  +-   LABEL: label_13
     |  +-   +- >> Proxy Statement: 
     |  +-      +- while( )
     |  +-      +- Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- If Statement:
     |  +-      +-    |  +- Condition:
     |  +-      +-    |  |  +- Op: Method Call
     |  +-      +-    |  |     +- Op: >> Proxy Data Access [jj_2_7] <<
     |  +-      +-    |  +- If Code:
     |  +-      +-    |  |  +- Block:
     |  +-      +-    |  |     +- Local Variables:
     |  +-      +-    |  |     +- Code:
     |  +-      +-    |  |        +- St: No operation
     |  +-      +-    |  +- Else Code:
     |  +-      +-    |     +- Block:
     |  +-      +-    |        +- Local Variables:
     |  +-      +-    |        +- Code:
     |  +-      +-    |           +- >> Proxy Statement: 
     |  +-      +-    |              +- break label_13;
     |  +-      +-    |              <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: =
     |  +-      +-    |  +- Op: >> Proxy Data Access [aux] <<
     |  +-      +-    |  +- Op: Method Call
     |  +-      +-    |     +- Op: >> Proxy Data Access [VariableInitializer] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: >> Proxy Data Access [listOfInits.add] <<Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- If Statement:
     |  +-      +-    |  +- Condition:
     |  +-      +-    |  |  +- Op: Method Call
     |  +-      +-    |  |     +- Op: >> Proxy Data Access [jj_2_7] <<
     |  +-      +-    |  +- If Code:
     |  +-      +-    |  |  +- Block:
     |  +-      +-    |  |     +- Local Variables:
     |  +-      +-    |  |     +- Code:
     |  +-      +-    |  |        +- St: No operation
     |  +-      +-    |  +- Else Code:
     |  +-      +-    |     +- Block:
     |  +-      +-    |        +- Local Variables:
     |  +-      +-    |        +- Code:
     |  +-      +-    |           +- >> Proxy Statement: 
     |  +-      +-    |              +- break label_13;
     |  +-      +-    |              <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: =
     |  +-      +-    |  +- Op: >> Proxy Data Access [aux] <<
     |  +-      +-    |  +- Op: Method Call
     |  +-      +-    |     +- Op: >> Proxy Data Access [VariableInitializer] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: >> Proxy Data Access [listOfInits.add] <<
     |  +-      <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: ==
     |  |     +- Op: Method Call
     |  |     |  +- Op: >> Proxy Data Access [listOfInits.size] <<
     |  |     +- Op: Literal
     |  |        +- Integer: 0
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- Block:
     |  |           +- Local Variables:
     |  |           +- Code:
     |  |              +- If Statement:
     |  |                 +- Condition:
     |  |                 |  +- Op: Literal
     |  |                 |     +- Boolean: true
     |  |                 +- If Code:
     |  |                    +- >> Proxy Statement: 
     |  |                       +- return ;
     |  |                       <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- Block:
     |              +- Local Variables:
     |              +- Code:
     |                 +- If Statement:
     |                    +- Condition:
     |                    |  +- Op: Literal
     |                    |     +- Boolean: true
     |                    +- If Code:
     |                       +- >> Proxy Statement: 
     |                          +- return ;
     |                          <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public MethodDeclaration
  Params
  modifiers: I
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ bc ] Type [ Lcat.quadriga.parsers.code.statements.BlockCode; ]
  |  +- Symbol Var [ other ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
  +- Code:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: other
     |     +- Op: >> proxy [ new something ]
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [symbolTable.newContext] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [TypeParameters] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [ResultType] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [MethodDeclarator] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: out
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: out
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: out
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [NameList] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: bc
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [Block] <<
     |  +-   Statements:
     |  +-   +- St: =
     |  +-      +- Op: Local variable access: treeString
     |  +-      +- Op: Method Call
     |  +-         +- Op: Method:
     |  +-            +- cat.quadriga.parsers.code.statements.BlockCode -> treeStringRepresentation
     |  +-            +- Op: Local variable access: bc
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> addAll
     |  +-      +- Op: Local variable access: out
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: out
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [symbolTable.deleteContext] <<
  final public MethodDeclarator
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ params ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: =
     |  +- Op: Local variable access: params
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [FormalParameters] <<
     +- >> Proxy Statement: 
     |  +- for( Lcat.quadriga.parsers.ParameterClass; param: ) 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [symbolTable.addSymbol] <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [symbolTable.addSymbol] <<
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- >> Proxy Statement: 
     |  +- for( Lcat.quadriga.parsers.ParameterClass; param: ) 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [out.add] <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [out.add] <<
     |  <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public <>Ljava.util.List; FormalParameters
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ params ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ param ] Type [ Lcat.quadriga.parsers.ParameterClass; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: params
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: param
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [FormalParameter] <<
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: params
     |  +-   LABEL: label_14
     |  +-   +- >> Proxy Statement: 
     |  +-      +- while( )
     |  +-      +- Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- >> Proxy Statement: 
     |  +-      +-    |  +- switch() {
     |  +-      +-    |  +- case :
     |  +-      +-    |  +-   St: No operation
     |  +-      +-    |  +-   >> Proxy Statement: 
     |  +-      +-    |  +-   +- break;
     |  +-      +-    |  +-   <<
     |  +-      +-    |  +- default:
     |  +-      +-    |  +-   >> Proxy Statement: 
     |  +-      +-    |  +-   +- break label_14;
     |  +-      +-    |  +-   <<
     |  +-      +-    |  +- }
     |  +-      +-    |  <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: =
     |  +-      +-    |  +- Op: Local variable access: param
     |  +-      +-    |  +- Op: Method Call
     |  +-      +-    |     +- Op: >> Proxy Data Access [FormalParameter] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: Method:
     |  +-      +-          +- java.util.List -> add
     |  +-      +-          +- Op: Local variable access: paramsBlock:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- >> Proxy Statement: 
     |  +-      +-    |  +- switch() {
     |  +-      +-    |  +- case :
     |  +-      +-    |  +-   St: No operation
     |  +-      +-    |  +-   >> Proxy Statement: 
     |  +-      +-    |  +-   +- break;
     |  +-      +-    |  +-   <<
     |  +-      +-    |  +- default:
     |  +-      +-    |  +-   >> Proxy Statement: 
     |  +-      +-    |  +-   +- break label_14;
     |  +-      +-    |  +-   <<
     |  +-      +-    |  +- }
     |  +-      +-    |  <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: =
     |  +-      +-    |  +- Op: Local variable access: param
     |  +-      +-    |  +- Op: Method Call
     |  +-      +-    |     +- Op: >> Proxy Data Access [FormalParameter] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: Method:
     |  +-      +-          +- java.util.List -> add
     |  +-      +-          +- Op: Local variable access: params
     |  +-      <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.ParameterClass; FormalParameter
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ modifiers ] Type [ I ]
  |  +- Symbol Var [ type ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  |  +- Symbol Var [ param ] Type [ Lcat.quadriga.parsers.ParameterClass; ]
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ vai ] Type [ Lcat.quadriga.parsers.VarAndInit; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: param
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: modifiers
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Modifiers] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +-   >> Proxy Statement: 
     |  +-   +- switch() {
     |  +-   +- case :
     |  +-   +-   St: Method Call
     |  +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   St: &=
     |  +-   +-   +- Op: Local variable access: modifiers
     |  +-   +-   +- Op: >> Proxy Data Access [FINAL] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- case :
     |  +-   +-   St: Method Call
     |  +-   +-   +- Op: >> Proxy Data Access [Annotation] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- default:
     |  +-   +-   St: Method Call
     |  +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- throw ;
     |  +-   +-   <<
     |  +-   +- }
     |  +-   <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: =
     |  +- Op: Local variable access: type
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Type] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: type
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   St: =
     |  +-   +- Op: Static Access:
     |  +-   +- Op: Literal
     |  +-      +- Boolean: true
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: =
     |  +- Op: Local variable access: vai
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [VariableDeclaratorId] <<
     +- St: =
     |  +- Op: Static Access:
     |  +- Op: Static Access:
     +- St: =
     |  +- Op: Static Access:
     |  +- Op: >> proxy [ new something ]
     +- St: =
     |  +- Op: Static Access:
     |  +- Op: Local variable access: modifiers
     +- St: =
     |  +- Op: Static Access:
     |  +- Op: Static Access:
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public ConstructorDeclaration
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ bsn ] Type [ Lcat.quadriga.parsers.code.statements.BlockStatementNode; ]
  |  +- Symbol Var [ params ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- Statements:
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [symbolTable.newContext] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [TypeParameters] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: =
     |  +- Op: Local variable access: params
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [FormalParameters] <<
     +- >> Proxy Statement: 
     |  +- for( Lcat.quadriga.parsers.ParameterClass; param: ) 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [symbolTable.addSymbol] <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [symbolTable.addSymbol] <<
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- >> Proxy Statement: 
     |  +- for( Lcat.quadriga.parsers.ParameterClass; param: ) 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [out.add] <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [out.add] <<
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [out.add] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [out.add] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [out.add] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [NameList] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_8] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: Method Call
     |  |           +- Op: >> Proxy Data Access [ExplicitConstructorInvocation] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: No operation
     +- LABEL: label_15
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_15;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [bsn] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [BlockStatement] <<
     |     +-    +- Statements:
     |     +-    |  +- St: =
     |     +-    |     +- Op: Local variable access: treeString
     |     +-    |     +- Op: Method Call
     |     +-    |        +- Op: >> Proxy Data Access [bsn.treeStringRepresentation] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [out.addAll] <<Block:
     |     +- +- Local Variables:
     |     +- |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_15;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [bsn] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [BlockStatement] <<
     |     +-    +- Statements:
     |     +-    |  +- St: =
     |     +-    |     +- Op: Local variable access: treeString
     |     +-    |     +- Op: Method Call
     |     +-    |        +- Op: >> Proxy Data Access [bsn.treeStringRepresentation] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [out.addAll] <<
     |     <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- >> Proxy Statement: 
     |  +- while( )St: Method Call
     |  +- +- Op: >> Proxy Data Access [out.remove] <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: Method Call
     |  |     |  +- Op: >> Proxy Data Access [out.get] <<
     |  |     +- Op: Method Call
     |  |        +- Op: Method:
     |  |           +- cat.quadriga.parsers.code.printers.PrintInitTab -> getInstance
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [out.add] <<
     |  |        +- St: Method Call
     |  |           +- Op: >> Proxy Data Access [out.add] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: Method Call
     |              +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [symbolTable.deleteContext] <<
  final public ExplicitConstructorInvocation
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- LABEL: label_16
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_16;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: t
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: Method:
     |     +-          +- java.util.List -> add
     |     +-          +- Op: Local variable access: outBlock:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_16;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: t
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: Method:
     |     +-          +- java.util.List -> add
     |     +-          +- Op: Local variable access: out
     |     <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_9] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [out.add] <<
     |  |        +- St: Method Call
     |  |           +- Op: >> Proxy Data Access [out.add] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: No operation
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [TypeArguments] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [out.add] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [out.add] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Arguments] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public Initializer
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   Block:
     |  +-   +- Local Variables:
     |  +-   +- Code:
     |  +-      +- St: Method Call
     |  +-      |  +- Op: Method:
     |  +-      |     +- java.util.List -> add
     |  +-      |     +- Op: Local variable access: out
     |  +-      +- St: Method Call
     |  +-         +- Op: Method:
     |  +-            +- java.util.List -> add
     |  +-            +- Op: Local variable access: out
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [Block] <<
  final public Lcat.quadriga.parsers.code.types.BaseType; Type
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  +- Code:
     +- Statements:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_10] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: =
     |  |           +- Op: Local variable access: t
     |  |           +- Op: Method Call
     |  |              +- Op: >> Proxy Data Access [ReferenceType] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- >> Proxy Statement: 
     |              +- switch() {
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [t] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [PrimitiveType] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- default:
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- throw ;
     |              +-   <<
     |              +- }
     |              <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.types.BaseType; ReferenceType
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ type ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: type
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [PrimitiveType] <<
     |  +-   LABEL: label_17
     |  +-   +- >> Proxy Statement: 
     |  +-      +- while( )
     |  +-      +- Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: =
     |  +-      +-    |  +- Op: Local variable access: type
     |  +-      +-    |  +- Op: >> proxy [ new something ]
     |  +-      +-    +- If Statement:
     |  +-      +-       +- Condition:
     |  +-      +-       |  +- Op: Method Call
     |  +-      +-       |     +- Op: >> Proxy Data Access [jj_2_11] <<
     |  +-      +-       +- If Code:
     |  +-      +-       |  +- Block:
     |  +-      +-       |     +- Local Variables:
     |  +-      +-       |     +- Code:
     |  +-      +-       |        +- St: No operation
     |  +-      +-       +- Else Code:
     |  +-      +-          +- Block:
     |  +-      +-             +- Local Variables:
     |  +-      +-             +- Code:
     |  +-      +-                +- >> Proxy Statement: 
     |  +-      +-                   +- break label_17;
     |  +-      +-                   <<Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: =
     |  +-      +-    |  +- Op: Local variable access: type
     |  +-      +-    |  +- Op: >> proxy [ new something ]
     |  +-      +-    +- If Statement:
     |  +-      +-       +- Condition:
     |  +-      +-       |  +- Op: Method Call
     |  +-      +-       |     +- Op: >> Proxy Data Access [jj_2_11] <<
     |  +-      +-       +- If Code:
     |  +-      +-       |  +- Block:
     |  +-      +-       |     +- Local Variables:
     |  +-      +-       |     +- Code:
     |  +-      +-       |        +- St: No operation
     |  +-      +-       +- Else Code:
     |  +-      +-          +- Block:
     |  +-      +-             +- Local Variables:
     |  +-      +-             +- Code:
     |  +-      +-                +- >> Proxy Statement: 
     |  +-      +-                   +- break label_17;
     |  +-      +-                   <<
     |  +-      <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: >> Proxy Data Access [type] <<
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
     |  +-   LABEL: label_18
     |  +-   +- >> Proxy Statement: 
     |  +-      +- while( )
     |  +-      +- Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- If Statement:
     |  +-      +-    |  +- Condition:
     |  +-      +-    |  |  +- Op: Method Call
     |  +-      +-    |  |     +- Op: >> Proxy Data Access [jj_2_12] <<
     |  +-      +-    |  +- If Code:
     |  +-      +-    |  |  +- Block:
     |  +-      +-    |  |     +- Local Variables:
     |  +-      +-    |  |     +- Code:
     |  +-      +-    |  |        +- St: No operation
     |  +-      +-    |  +- Else Code:
     |  +-      +-    |     +- Block:
     |  +-      +-    |        +- Local Variables:
     |  +-      +-    |        +- Code:
     |  +-      +-    |           +- >> Proxy Statement: 
     |  +-      +-    |              +- break label_18;
     |  +-      +-    |              <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: =
     |  +-      +-       +- Op: >> Proxy Data Access [type] <<
     |  +-      +-       +- Op: >> proxy [ new something ]Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- If Statement:
     |  +-      +-    |  +- Condition:
     |  +-      +-    |  |  +- Op: Method Call
     |  +-      +-    |  |     +- Op: >> Proxy Data Access [jj_2_12] <<
     |  +-      +-    |  +- If Code:
     |  +-      +-    |  |  +- Block:
     |  +-      +-    |  |     +- Local Variables:
     |  +-      +-    |  |     +- Code:
     |  +-      +-    |  |        +- St: No operation
     |  +-      +-    |  +- Else Code:
     |  +-      +-    |     +- Block:
     |  +-      +-    |        +- Local Variables:
     |  +-      +-    |        +- Code:
     |  +-      +-    |           +- >> Proxy Statement: 
     |  +-      +-    |              +- break label_18;
     |  +-      +-    |              <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: =
     |  +-      +-       +- Op: >> Proxy Data Access [type] <<
     |  +-      +-       +- Op: >> proxy [ new something ]
     |  +-      <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.types.BaseType; ClassOrInterfaceType
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ first ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ last ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ aux ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ type ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  |  +- Symbol Var [ cz ] Type [ Lcat.quadriga.parsers.code.CodeZone; ]
  |  +- Symbol Var [ name ] Type [ Ljava.lang.String; ]
  |  +- Symbol Var [ i ] Type [ I ]
  |  +- Symbol Var [ symbol ] Type [ Lcat.quadriga.parsers.code.symbols.BaseSymbol; ]
  +- Code:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: aux
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: aux
     +- St: =
     |  +- Op: Local variable access: first
     |  +- Op: =
     |     +- Op: Local variable access: last
     |     +- Op: Local variable access: t
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_13] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: Method Call
     |  |           +- Op: >> Proxy Data Access [TypeArguments] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: No operation
     +- LABEL: label_19
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_14] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_19;
     |     +-    |              <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [t] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [aux.add] <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [last] <<
     |     +-    |  +- Op: >> Proxy Data Access [t] <<
     |     +-    +- If Statement:
     |     +-       +- Condition:
     |     +-       |  +- Op: Method Call
     |     +-       |     +- Op: >> Proxy Data Access [jj_2_15] <<
     |     +-       +- If Code:
     |     +-       |  +- Block:
     |     +-       |     +- Local Variables:
     |     +-       |     +- Code:
     |     +-       |        +- St: Method Call
     |     +-       |           +- Op: >> Proxy Data Access [TypeArguments] <<
     |     +-       +- Else Code:
     |     +-          +- Block:
     |     +-             +- Local Variables:
     |     +-             +- Code:
     |     +-                +- St: No operationBlock:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_14] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_19;
     |     +-    |              <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [t] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [aux.add] <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [last] <<
     |     +-    |  +- Op: >> Proxy Data Access [t] <<
     |     +-    +- If Statement:
     |     +-       +- Condition:
     |     +-       |  +- Op: Method Call
     |     +-       |     +- Op: >> Proxy Data Access [jj_2_15] <<
     |     +-       +- If Code:
     |     +-       |  +- Block:
     |     +-       |     +- Local Variables:
     |     +-       |     +- Code:
     |     +-       |        +- St: Method Call
     |     +-       |           +- Op: >> Proxy Data Access [TypeArguments] <<
     |     +-       +- Else Code:
     |     +-          +- Block:
     |     +-             +- Local Variables:
     |     +-             +- Code:
     |     +-                +- St: No operation
     |     <<
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: cz
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: name
     |     +- Op: Method Call
     |        +- Op: >> Proxy Data Access [aux.get] <<
     +- >> Proxy Statement: 
     |  +- for( Statements:
     |  +- +- St: =
     |  +-    +- Op: Local variable access: i
     |  +-    +- Op: Literal
     |  +-       +- Integer: 1; ; Statements:
     |  +- +- St: ++X
     |  +-    +- Op: Local variable access: i) 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: +=
     |  +-       +- Op: Local variable access: name
     |  +-       +- Op: +
     |  +-          +- Op: Literal
     |  +-          |  +- String: "."
     |  +-          +- Op: Method Call
     |  +-             +- Op: >> Proxy Data Access [aux.get] <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: +=
     |  +-       +- Op: Local variable access: name
     |  +-       +- Op: +
     |  +-          +- Op: Literal
     |  +-          |  +- String: "."
     |  +-          +- Op: Method Call
     |  +-             +- Op: >> Proxy Data Access [aux.get] <<
     |  <<
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: symbol
     |     +- Op: Method Call
     |        +- Op: >> Proxy Data Access [symbolTable.findSymbol] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: Local variable access: symbol
     |  |     +- Op: Literal
     |  |        +- Null
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- If Statement:
     |  |           +- Condition:
     |  |           |  +- Op: instanceof
     |  |           |     +- Op: Local variable access: symbol
     |  |           |     +- Op: >> proxy [ Lcat.quadriga.parsers.code.symbols.TypeSymbol; ]
     |  |           +- If Code:
     |  |           |  +- Block:
     |  |           |     +- Local Variables:
     |  |           |     +- Code:
     |  |           |        +- Block:
     |  |           |           +- Local Variables:
     |  |           |           +- Code:
     |  |           |              +- If Statement:
     |  |           |                 +- Condition:
     |  |           |                 |  +- Op: Literal
     |  |           |                 |     +- Boolean: true
     |  |           |                 +- If Code:
     |  |           |                    +- >> Proxy Statement: 
     |  |           |                       +- return ;
     |  |           |                       <<
     |  |           +- Else Code:
     |  |              +- Block:
     |  |                 +- Local Variables:
     |  |                 +- Code:
     |  |                    +- St: Method Call
     |  |                    |  +- Op: >> Proxy Data Access [errorLog.insertError] <<
     |  |                    +- Block:
     |  |                       +- Local Variables:
     |  |                       +- Code:
     |  |                          +- If Statement:
     |  |                             +- Condition:
     |  |                             |  +- Op: Literal
     |  |                             |     +- Boolean: true
     |  |                             +- If Code:
     |  |                                +- >> Proxy Statement: 
     |  |                                   +- return ;
     |  |                                   <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- >> Proxy Statement: 
     |              +- try 
     |              +- Block:
     |              +- +- Local Variables:
     |              +- |  +- Symbol Var [ clazz ] Type [ Ljava.lang.Class; ]
     |              +- +- Code:
     |              +-    +- Statements:
     |              +-    |  +- St: =
     |              +-    |     +- Op: Local variable access: clazz
     |              +-    |     +- Op: Method Call
     |              +-    |        +- Op: Method:
     |              +-    |           +- java.lang.Class -> forName
     |              +-    +- Block:
     |              +-       +- Local Variables:
     |              +-       +- Code:
     |              +-          +- If Statement:
     |              +-             +- Condition:
     |              +-             |  +- Op: Literal
     |              +-             |     +- Boolean: true
     |              +-             +- If Code:
     |              +-                +- >> Proxy Statement: 
     |              +-                   +- return ;
     |              +-                   << catch() 
     |              +- Block:
     |              +- +- Local Variables:
     |              +- +- Code:
     |              +-    +- >> Proxy Statement: 
     |              +-       +- try 
     |              +-       +- Block:
     |              +-       +- +- Local Variables:
     |              +-       +- |  +- Symbol Var [ clazz ] Type [ Ljava.lang.Class; ]
     |              +-       +- +- Code:
     |              +-       +-    +- Statements:
     |              +-       +-    |  +- St: =
     |              +-       +-    |     +- Op: Local variable access: clazz
     |              +-       +-    |     +- Op: Method Call
     |              +-       +-    |        +- Op: Method:
     |              +-       +-    |           +- java.lang.Class -> forName
     |              +-       +-    +- Block:
     |              +-       +-       +- Local Variables:
     |              +-       +-       +- Code:
     |              +-       +-          +- If Statement:
     |              +-       +-             +- Condition:
     |              +-       +-             |  +- Op: Literal
     |              +-       +-             |     +- Boolean: true
     |              +-       +-             +- If Code:
     |              +-       +-                +- >> Proxy Statement: 
     |              +-       +-                   +- return ;
     |              +-       +-                   << catch() 
     |              +-       +- Block:
     |              +-       +- +- Local Variables:
     |              +-       +- +- Code:
     |              +-       +-    +- St: Method Call
     |              +-       +-    |  +- Op: >> Proxy Data Access [errorLog.insertWarning] <<
     |              +-       +-    +- Block:
     |              +-       +-       +- Local Variables:
     |              +-       +-       +- Code:
     |              +-       +-          +- If Statement:
     |              +-       +-             +- Condition:
     |              +-       +-             |  +- Op: Literal
     |              +-       +-             |     +- Boolean: true
     |              +-       +-             +- If Code:
     |              +-       +-                +- >> Proxy Statement: 
     |              +-       +-                   +- return ;
     |              +-       +-                   <<
     |              +-       <<
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public TypeArguments
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [TypeArgument] <<
     +- LABEL: label_20
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_20;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [TypeArgument] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_20;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [TypeArgument] <<
     |     <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public TypeArgument
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- >> Proxy Statement: 
        +- switch() {
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [ReferenceType] <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   >> Proxy Statement: 
        +-   +- switch() {
        +-   +- case :
        +-   +- case :
        +-   +-   St: Method Call
        +-   +-   +- Op: Method:
        +-   +-      +- java.util.List -> add
        +-   +-      +- Op: Local variable access: out
        +-   +-   St: Method Call
        +-   +-   +- Op: >> Proxy Data Access [WildcardBounds] <<
        +-   +-   >> Proxy Statement: 
        +-   +-   +- break;
        +-   +-   <<
        +-   +- default:
        +-   +-   St: No operation
        +-   +- }
        +-   <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- default:
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   >> Proxy Statement: 
        +-   +- throw ;
        +-   <<
        +- }
        <<
  final public WildcardBounds
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ other ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: other
     |     +- Op: >> proxy [ new something ]
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [ReferenceType] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [ReferenceType] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> addAll
           +- Op: Local variable access: out
  final public Lcat.quadriga.parsers.code.types.PrimitiveTypeRef; PrimitiveType
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.types.BaseType; ResultType
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ type ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: type
     |  +-   +- Op: Method Call
     |  +-      +- Op: Method:
     |  +-         +- cat.quadriga.parsers.code.types.PrimitiveTypeRef -> getFromName
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: type
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [Type] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public <>Ljava.util.List; Name
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ tokens ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: tokens
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: tokens
     +- LABEL: label_21
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_16] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_21;
     |     +-    |              <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [t] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [tokens.add] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_16] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_21;
     |     +-    |              <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [t] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [tokens.add] <<
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public <<>>Ljava.util.List; NameList
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ aux ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ names ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: names
     |     +- Op: >> proxy [ new something ]
     +- St: =
     |  +- Op: Local variable access: aux
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Name] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: names
     +- LABEL: label_22
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_22;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [Name] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: Method:
     |     +-          +- java.util.List -> add
     |     +-          +- Op: Local variable access: namesBlock:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_22;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [Name] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: Method:
     |     +-          +- java.util.List -> add
     |     +-          +- Op: Local variable access: names
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; Expression
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown AssigmentStatementNode.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [ConditionalExpression] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_17] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: Method Call
     |  |        |  +- Op: Method:
     |  |        |     +- java.util.List -> add
     |  |        |     +- Op: Local variable access: out
     |  |        +- St: =
     |  |        |  +- Op: Local variable access: operator
     |  |        |  +- Op: Method Call
     |  |        |     +- Op: >> Proxy Data Access [AssignmentOperator] <<
     |  |        +- St: Method Call
     |  |        |  +- Op: Method:
     |  |        |     +- java.util.List -> add
     |  |        |     +- Op: Local variable access: out
     |  |        +- St: =
     |  |        |  +- Op: Local variable access: auxNode
     |  |        |  +- Op: Method Call
     |  |        |     +- Op: >> Proxy Data Access [Expression] <<
     |  |        +- St: =
     |  |           +- Op: Local variable access: finalNode
     |  |           +- Op: >> proxy [ new something ]
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: No operation
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public #unknown AssigmentStatementNode.Operator # AssignmentOperator
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ op ] Type [ #unknown AssigmentStatementNode.Operator # ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: op
     |  +-   +- Op: Static Access:
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; ConditionalExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ aux ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxNode1 ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxNode2 ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: aux
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [ConditionalOrExpression] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: auxNode1
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [Expression] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: auxNode2
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [Expression] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: finalNode
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; ConditionalOrExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown LogicalOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [ConditionalAndExpression] <<
     +- LABEL: label_23
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_23;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [ConditionalAndExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_23;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [ConditionalAndExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; ConditionalAndExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown LogicalOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [InclusiveOrExpression] <<
     +- LABEL: label_24
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_24;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [InclusiveOrExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_24;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [InclusiveOrExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; InclusiveOrExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown MathematicOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [ExclusiveOrExpression] <<
     +- LABEL: label_25
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_25;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [ExclusiveOrExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_25;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [ExclusiveOrExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; ExclusiveOrExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown MathematicOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [AndExpression] <<
     +- LABEL: label_26
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_26;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [AndExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_26;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [AndExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; AndExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown MathematicOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [EqualityExpression] <<
     +- LABEL: label_27
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_27;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [EqualityExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_27;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: operator
     |     +-    |  +- Op: Static Access:
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [EqualityExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; EqualityExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown BooleanOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [InstanceOfExpression] <<
     +- LABEL: label_28
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_28;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- throw ;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [InstanceOfExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_28;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- throw ;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [InstanceOfExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; InstanceOfExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown BooleanOperation.Operator # ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [RelationalExpression] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: operator
     |  +-   +- Op: Static Access:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [Type] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: auxiliarNode
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   St: =
     |  +-   +- Op: Local variable access: finalNode
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; RelationalExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown BooleanOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [ShiftExpression] <<
     +- LABEL: label_29
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_29;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- throw ;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [ShiftExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_29;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- throw ;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [ShiftExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; ShiftExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown MathematicOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [AdditiveExpression] <<
     +- LABEL: label_30
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_18] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_30;
     |     +-    |              <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: >> Proxy Data Access [operator] <<
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   If Statement:
     |     +-    |  +-   +- Condition:
     |     +-    |  +-   |  +- Op: Method Call
     |     +-    |  +-   |     +- Op: >> Proxy Data Access [jj_2_19] <<
     |     +-    |  +-   +- If Code:
     |     +-    |  +-   |  +- Block:
     |     +-    |  +-   |     +- Local Variables:
     |     +-    |  +-   |     +- Code:
     |     +-    |  +-   |        +- St: Method Call
     |     +-    |  +-   |        |  +- Op: >> Proxy Data Access [RSIGNEDSHIFT] <<
     |     +-    |  +-   |        +- St: =
     |     +-    |  +-   |           +- Op: >> Proxy Data Access [operator] <<
     |     +-    |  +-   |           +- Op: Static Access:
     |     +-    |  +-   +- Else Code:
     |     +-    |  +-      +- If Statement:
     |     +-    |  +-         +- Condition:
     |     +-    |  +-         |  +- Op: Method Call
     |     +-    |  +-         |     +- Op: >> Proxy Data Access [jj_2_20] <<
     |     +-    |  +-         +- If Code:
     |     +-    |  +-         |  +- Block:
     |     +-    |  +-         |     +- Local Variables:
     |     +-    |  +-         |     +- Code:
     |     +-    |  +-         |        +- St: Method Call
     |     +-    |  +-         |        |  +- Op: >> Proxy Data Access [RUNSIGNEDSHIFT] <<
     |     +-    |  +-         |        +- St: =
     |     +-    |  +-         |           +- Op: >> Proxy Data Access [operator] <<
     |     +-    |  +-         |           +- Op: Static Access:
     |     +-    |  +-         +- Else Code:
     |     +-    |  +-            +- Block:
     |     +-    |  +-               +- Local Variables:
     |     +-    |  +-               +- Code:
     |     +-    |  +-                  +- St: Method Call
     |     +-    |  +-                  |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-                  +- >> Proxy Statement: 
     |     +-    |  +-                     +- throw ;
     |     +-    |  +-                     <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [auxiliarNode] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [AdditiveExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: >> Proxy Data Access [finalNode] <<
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_18] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_30;
     |     +-    |              <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: >> Proxy Data Access [operator] <<
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   If Statement:
     |     +-    |  +-   +- Condition:
     |     +-    |  +-   |  +- Op: Method Call
     |     +-    |  +-   |     +- Op: >> Proxy Data Access [jj_2_19] <<
     |     +-    |  +-   +- If Code:
     |     +-    |  +-   |  +- Block:
     |     +-    |  +-   |     +- Local Variables:
     |     +-    |  +-   |     +- Code:
     |     +-    |  +-   |        +- St: Method Call
     |     +-    |  +-   |        |  +- Op: >> Proxy Data Access [RSIGNEDSHIFT] <<
     |     +-    |  +-   |        +- St: =
     |     +-    |  +-   |           +- Op: >> Proxy Data Access [operator] <<
     |     +-    |  +-   |           +- Op: Static Access:
     |     +-    |  +-   +- Else Code:
     |     +-    |  +-      +- If Statement:
     |     +-    |  +-         +- Condition:
     |     +-    |  +-         |  +- Op: Method Call
     |     +-    |  +-         |     +- Op: >> Proxy Data Access [jj_2_20] <<
     |     +-    |  +-         +- If Code:
     |     +-    |  +-         |  +- Block:
     |     +-    |  +-         |     +- Local Variables:
     |     +-    |  +-         |     +- Code:
     |     +-    |  +-         |        +- St: Method Call
     |     +-    |  +-         |        |  +- Op: >> Proxy Data Access [RUNSIGNEDSHIFT] <<
     |     +-    |  +-         |        +- St: =
     |     +-    |  +-         |           +- Op: >> Proxy Data Access [operator] <<
     |     +-    |  +-         |           +- Op: Static Access:
     |     +-    |  +-         +- Else Code:
     |     +-    |  +-            +- Block:
     |     +-    |  +-               +- Local Variables:
     |     +-    |  +-               +- Code:
     |     +-    |  +-                  +- St: Method Call
     |     +-    |  +-                  |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-                  +- >> Proxy Statement: 
     |     +-    |  +-                     +- throw ;
     |     +-    |  +-                     <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [auxiliarNode] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [AdditiveExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: >> Proxy Data Access [finalNode] <<
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; AdditiveExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown MathematicOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [MultiplicativeExpression] <<
     +- LABEL: label_31
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_31;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- throw ;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [MultiplicativeExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_31;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- throw ;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [MultiplicativeExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; MultiplicativeExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ auxiliarNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown MathematicOperation.Operator # ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [UnaryExpression] <<
     +- LABEL: label_32
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_32;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- throw ;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [UnaryExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_32;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- case :
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   St: =
     |     +-    |  +-   +- Op: Local variable access: operator
     |     +-    |  +-   +- Op: Static Access:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   St: Method Call
     |     +-    |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- throw ;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: auxiliarNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [UnaryExpression] <<
     |     +-    +- St: =
     |     +-       +- Op: Local variable access: finalNode
     |     +-       +- Op: >> proxy [ new something ]
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; UnaryExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown UnaryOperation.Operator # ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +-   >> Proxy Statement: 
     |  +-   +- switch() {
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: t
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: operator
     |  +-   +-   +- Op: Literal
     |  +-   +-      +- Null
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: t
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: operator
     |  +-   +-   +- Op: Static Access:
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- default:
     |  +-   +-   St: Method Call
     |  +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- throw ;
     |  +-   +-   <<
     |  +-   +- }
     |  +-   <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: finalNode
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [UnaryExpression] <<
     |  +-   If Statement:
     |  +-   +- Condition:
     |  +-   |  +- Op: !=
     |  +-   |     +- Op: Local variable access: operator
     |  +-   |     +- Op: Literal
     |  +-   |        +- Null
     |  +-   +- If Code:
     |  +-      +- St: =
     |  +-         +- Op: Local variable access: finalNode
     |  +-         +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: >> Proxy Data Access [finalNode] <<
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [PreIncrementExpression] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: >> Proxy Data Access [finalNode] <<
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [PreDecrementExpression] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: >> Proxy Data Access [finalNode] <<
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [UnaryExpressionNotPlusMinus] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; PreIncrementExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ node ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: Local variable access: node
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [PrimaryExpression] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; PreDecrementExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ node ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: Local variable access: node
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [PrimaryExpression] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; UnaryExpressionNotPlusMinus
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ operator ] Type [ #unknown UnaryOperation.Operator # ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- Statements:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +-   >> Proxy Statement: 
     |  +-   +- switch() {
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: t
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: operator
     |  +-   +-   +- Op: Static Access:
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: t
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: operator
     |  +-   +-   +- Op: Static Access:
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- default:
     |  +-   +-   St: Method Call
     |  +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- throw ;
     |  +-   +-   <<
     |  +-   +- }
     |  +-   <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: finalNode
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [UnaryExpression] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: finalNode
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   If Statement:
     |  +-   +- Condition:
     |  +-   |  +- Op: Method Call
     |  +-   |     +- Op: >> Proxy Data Access [jj_2_21] <<
     |  +-   +- If Code:
     |  +-   |  +- Block:
     |  +-   |     +- Local Variables:
     |  +-   |     +- Code:
     |  +-   |        +- St: =
     |  +-   |           +- Op: Local variable access: finalNode
     |  +-   |           +- Op: Method Call
     |  +-   |              +- Op: >> Proxy Data Access [CastExpression] <<
     |  +-   +- Else Code:
     |  +-      +- Block:
     |  +-         +- Local Variables:
     |  +-         +- Code:
     |  +-            +- >> Proxy Statement: 
     |  +-               +- switch() {
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +- case :
     |  +-               +-   St: =
     |  +-               +-   +- Op: >> Proxy Data Access [finalNode] <<
     |  +-               +-   +- Op: Method Call
     |  +-               +-      +- Op: >> Proxy Data Access [PostfixExpression] <<
     |  +-               +-   >> Proxy Statement: 
     |  +-               +-   +- break;
     |  +-               +-   <<
     |  +-               +- default:
     |  +-               +-   St: Method Call
     |  +-               +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-   >> Proxy Statement: 
     |  +-               +-   +- throw ;
     |  +-               +-   <<
     |  +-               +- }
     |  +-               <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public CastLookahead
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- If Statement:
        +- Condition:
        |  +- Op: Method Call
        |     +- Op: >> Proxy Data Access [jj_2_22] <<
        +- If Code:
        |  +- Block:
        |     +- Local Variables:
        |     +- Code:
        |        +- St: Method Call
        |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |        +- St: Method Call
        |           +- Op: >> Proxy Data Access [PrimitiveType] <<
        +- Else Code:
           +- If Statement:
              +- Condition:
              |  +- Op: Method Call
              |     +- Op: >> Proxy Data Access [jj_2_23] <<
              +- If Code:
              |  +- Block:
              |     +- Local Variables:
              |     +- Code:
              |        +- St: Method Call
              |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
              |        +- St: Method Call
              |        |  +- Op: >> Proxy Data Access [Type] <<
              |        +- St: Method Call
              |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
              |        +- St: Method Call
              |           +- Op: >> Proxy Data Access [jj_consume_token] <<
              +- Else Code:
                 +- Block:
                    +- Local Variables:
                    +- Code:
                       +- >> Proxy Statement: 
                          +- switch() {
                          +- case :
                          +-   St: Method Call
                          +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   St: Method Call
                          +-   +- Op: >> Proxy Data Access [Type] <<
                          +-   St: Method Call
                          +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   >> Proxy Statement: 
                          +-   +- switch() {
                          +-   +- case :
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- break;
                          +-   +-   <<
                          +-   +- case :
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- break;
                          +-   +-   <<
                          +-   +- case :
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- break;
                          +-   +-   <<
                          +-   +- case :
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- break;
                          +-   +-   <<
                          +-   +- case :
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- break;
                          +-   +-   <<
                          +-   +- case :
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- break;
                          +-   +-   <<
                          +-   +- case :
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- break;
                          +-   +-   <<
                          +-   +- case :
                          +-   +- case :
                          +-   +- case :
                          +-   +- case :
                          +-   +- case :
                          +-   +- case :
                          +-   +- case :
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [Literal] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- break;
                          +-   +-   <<
                          +-   +- default:
                          +-   +-   St: Method Call
                          +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   +-   >> Proxy Statement: 
                          +-   +-   +- throw ;
                          +-   +-   <<
                          +-   +- }
                          +-   <<
                          +-   >> Proxy Statement: 
                          +-   +- break;
                          +-   <<
                          +- default:
                          +-   St: Method Call
                          +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   >> Proxy Statement: 
                          +-   +- throw ;
                          +-   <<
                          +- }
                          <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; PostfixExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ operator ] Type [ #unknown UnaryOperation.Operator # ]
  +- Code:
     +- Statements:
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: finalNode
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [PrimaryExpression] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +-   >> Proxy Statement: 
     |  +-   +- switch() {
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: t
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: operator
     |  +-   +-   +- Op: Static Access:
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: t
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: operator
     |  +-   +-   +- Op: Static Access:
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- default:
     |  +-   +-   St: Method Call
     |  +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- throw ;
     |  +-   +-   <<
     |  +-   +- }
     |  +-   <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: finalNode
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; CastExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ finalNode ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ type ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_24] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: =
     |  |        |  +- Op: Local variable access: t
     |  |        |  +- Op: Method Call
     |  |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  |        +- St: =
     |  |        |  +- Op: Local variable access: type
     |  |        |  +- Op: Method Call
     |  |        |     +- Op: >> Proxy Data Access [Type] <<
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  |        +- St: =
     |  |           +- Op: Local variable access: finalNode
     |  |           +- Op: Method Call
     |  |              +- Op: >> Proxy Data Access [UnaryExpression] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- >> Proxy Statement: 
     |              +- switch() {
     |              +- case :
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [t] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [type] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [Type] <<
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [finalNode] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [UnaryExpressionNotPlusMinus] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- default:
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- throw ;
     |              +-   <<
     |              +- }
     |              <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; PrimaryExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ result ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: result
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [PrimaryPrefix] <<
     +- LABEL: label_33
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_25] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_33;
     |     +-    |              <<
     |     +-    +- St: =
     |     +-       +- Op: >> Proxy Data Access [result] <<
     |     +-       +- Op: Method Call
     |     +-          +- Op: >> Proxy Data Access [PrimarySuffix] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- If Statement:
     |     +-    |  +- Condition:
     |     +-    |  |  +- Op: Method Call
     |     +-    |  |     +- Op: >> Proxy Data Access [jj_2_25] <<
     |     +-    |  +- If Code:
     |     +-    |  |  +- Block:
     |     +-    |  |     +- Local Variables:
     |     +-    |  |     +- Code:
     |     +-    |  |        +- St: No operation
     |     +-    |  +- Else Code:
     |     +-    |     +- Block:
     |     +-    |        +- Local Variables:
     |     +-    |        +- Code:
     |     +-    |           +- >> Proxy Statement: 
     |     +-    |              +- break label_33;
     |     +-    |              <<
     |     +-    +- St: =
     |     +-       +- Op: >> Proxy Data Access [result] <<
     |     +-       +- Op: Method Call
     |     +-          +- Op: >> Proxy Data Access [PrimarySuffix] <<
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public MemberSelector
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ other ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: other
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [TypeArguments] <<
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> addAll
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> add
           +- Op: Local variable access: out
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; PrimaryPrefix
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ t2 ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ result ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ tokenList ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ type ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: tokenList
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: result
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [Literal] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   If Statement:
     |  +-   +- Condition:
     |  +-   |  +- Op: Method Call
     |  +-   |     +- Op: >> Proxy Data Access [jj_2_26] <<
     |  +-   +- If Code:
     |  +-   |  +- Block:
     |  +-   |     +- Local Variables:
     |  +-   |     +- Code:
     |  +-   |        +- LABEL: label_34
     |  +-   |        |  +- >> Proxy Statement: 
     |  +-   |        |     +- while( )
     |  +-   |        |     +- Block:
     |  +-   |        |     +- +- Local Variables:
     |  +-   |        |     +- +- Code:
     |  +-   |        |     +-    +- >> Proxy Statement: 
     |  +-   |        |     +-    |  +- switch() {
     |  +-   |        |     +-    |  +- case :
     |  +-   |        |     +-    |  +-   St: No operation
     |  +-   |        |     +-    |  +-   >> Proxy Statement: 
     |  +-   |        |     +-    |  +-   +- break;
     |  +-   |        |     +-    |  +-   <<
     |  +-   |        |     +-    |  +- default:
     |  +-   |        |     +-    |  +-   >> Proxy Statement: 
     |  +-   |        |     +-    |  +-   +- break label_34;
     |  +-   |        |     +-    |  +-   <<
     |  +-   |        |     +-    |  +- }
     |  +-   |        |     +-    |  <<
     |  +-   |        |     +-    +- St: =
     |  +-   |        |     +-    |  +- Op: Local variable access: t
     |  +-   |        |     +-    |  +- Op: Method Call
     |  +-   |        |     +-    |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   |        |     +-    +- St: Method Call
     |  +-   |        |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   |        |     +-    +- St: Method Call
     |  +-   |        |     +-       +- Op: Method:
     |  +-   |        |     +-          +- java.util.List -> add
     |  +-   |        |     +-          +- Op: Local variable access: tokenListBlock:
     |  +-   |        |     +- +- Local Variables:
     |  +-   |        |     +- +- Code:
     |  +-   |        |     +-    +- >> Proxy Statement: 
     |  +-   |        |     +-    |  +- switch() {
     |  +-   |        |     +-    |  +- case :
     |  +-   |        |     +-    |  +-   St: No operation
     |  +-   |        |     +-    |  +-   >> Proxy Statement: 
     |  +-   |        |     +-    |  +-   +- break;
     |  +-   |        |     +-    |  +-   <<
     |  +-   |        |     +-    |  +- default:
     |  +-   |        |     +-    |  +-   >> Proxy Statement: 
     |  +-   |        |     +-    |  +-   +- break label_34;
     |  +-   |        |     +-    |  +-   <<
     |  +-   |        |     +-    |  +- }
     |  +-   |        |     +-    |  <<
     |  +-   |        |     +-    +- St: =
     |  +-   |        |     +-    |  +- Op: Local variable access: t
     |  +-   |        |     +-    |  +- Op: Method Call
     |  +-   |        |     +-    |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   |        |     +-    +- St: Method Call
     |  +-   |        |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   |        |     +-    +- St: Method Call
     |  +-   |        |     +-       +- Op: Method:
     |  +-   |        |     +-          +- java.util.List -> add
     |  +-   |        |     +-          +- Op: Local variable access: tokenList
     |  +-   |        |     <<
     |  +-   |        +- St: =
     |  +-   |        |  +- Op: >> Proxy Data Access [t] <<
     |  +-   |        |  +- Op: Method Call
     |  +-   |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   |        +- If Statement:
     |  +-   |           +- Condition:
     |  +-   |           |  +- Op: >
     |  +-   |           |     +- Op: Method Call
     |  +-   |           |     |  +- Op: >> Proxy Data Access [tokenList.size] <<
     |  +-   |           |     +- Op: Literal
     |  +-   |           |        +- Integer: 0
     |  +-   |           +- If Code:
     |  +-   |           |  +- Block:
     |  +-   |           |     +- Local Variables:
     |  +-   |           |     +- Code:
     |  +-   |           |        +- St: =
     |  +-   |           |           +- Op: >> Proxy Data Access [result] <<
     |  +-   |           |           +- Op: >> proxy [ new something ]
     |  +-   |           +- Else Code:
     |  +-   |              +- Block:
     |  +-   |                 +- Local Variables:
     |  +-   |                 +- Code:
     |  +-   |                    +- St: =
     |  +-   |                       +- Op: >> Proxy Data Access [result] <<
     |  +-   |                       +- Op: >> proxy [ new something ]
     |  +-   +- Else Code:
     |  +-      +- Block:
     |  +-         +- Local Variables:
     |  +-         +- Code:
     |  +-            +- >> Proxy Statement: 
     |  +-               +- switch() {
     |  +-               +- case :
     |  +-               +-   St: =
     |  +-               +-   +- Op: >> Proxy Data Access [t] <<
     |  +-               +-   +- Op: Method Call
     |  +-               +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-   St: Method Call
     |  +-               +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-   St: =
     |  +-               +-   +- Op: >> Proxy Data Access [t2] <<
     |  +-               +-   +- Op: Method Call
     |  +-               +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-   St: =
     |  +-               +-   +- Op: >> Proxy Data Access [result] <<
     |  +-               +-   +- Op: >> proxy [ new something ]
     |  +-               +-   >> Proxy Statement: 
     |  +-               +-   +- break;
     |  +-               +-   <<
     |  +-               +- default:
     |  +-               +-   If Statement:
     |  +-               +-   +- Condition:
     |  +-               +-   |  +- Op: Method Call
     |  +-               +-   |     +- Op: >> Proxy Data Access [jj_2_27] <<
     |  +-               +-   +- If Code:
     |  +-               +-   |  +- Block:
     |  +-               +-   |     +- Local Variables:
     |  +-               +-   |     +- Code:
     |  +-               +-   |        +- St: =
     |  +-               +-   |        |  +- Op: >> Proxy Data Access [type] <<
     |  +-               +-   |        |  +- Op: Method Call
     |  +-               +-   |        |     +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
     |  +-               +-   |        +- St: =
     |  +-               +-   |        |  +- Op: >> Proxy Data Access [t] <<
     |  +-               +-   |        |  +- Op: Method Call
     |  +-               +-   |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-   |        +- St: Method Call
     |  +-               +-   |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-   |        +- St: Method Call
     |  +-               +-   |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-   |        +- St: =
     |  +-               +-   |        |  +- Op: >> Proxy Data Access [t2] <<
     |  +-               +-   |        |  +- Op: Method Call
     |  +-               +-   |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-   |        +- St: =
     |  +-               +-   |           +- Op: >> Proxy Data Access [result] <<
     |  +-               +-   |           +- Op: >> proxy [ new something ]
     |  +-               +-   +- Else Code:
     |  +-               +-      +- Block:
     |  +-               +-         +- Local Variables:
     |  +-               +-         +- Code:
     |  +-               +-            +- >> Proxy Statement: 
     |  +-               +-               +- switch() {
     |  +-               +-               +- case :
     |  +-               +-               +-   St: Method Call
     |  +-               +-               +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-               +-   St: =
     |  +-               +-               +-   +- Op: >> Proxy Data Access [result] <<
     |  +-               +-               +-   +- Op: Method Call
     |  +-               +-               +-      +- Op: >> Proxy Data Access [Expression] <<
     |  +-               +-               +-   St: Method Call
     |  +-               +-               +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-               +-   >> Proxy Statement: 
     |  +-               +-               +-   +- break;
     |  +-               +-               +-   <<
     |  +-               +-               +- case :
     |  +-               +-               +-   St: Method Call
     |  +-               +-               +-   +- Op: >> Proxy Data Access [AllocationExpression] <<
     |  +-               +-               +-   St: =
     |  +-               +-               +-   +- Op: >> Proxy Data Access [result] <<
     |  +-               +-               +-   +- Op: >> proxy [ new something ]
     |  +-               +-               +-   >> Proxy Statement: 
     |  +-               +-               +-   +- break;
     |  +-               +-               +-   <<
     |  +-               +-               +- default:
     |  +-               +-               +-   If Statement:
     |  +-               +-               +-   +- Condition:
     |  +-               +-               +-   |  +- Op: Method Call
     |  +-               +-               +-   |     +- Op: >> Proxy Data Access [jj_2_28] <<
     |  +-               +-               +-   +- If Code:
     |  +-               +-               +-   |  +- Block:
     |  +-               +-               +-   |     +- Local Variables:
     |  +-               +-               +-   |     +- Code:
     |  +-               +-               +-   |        +- St: =
     |  +-               +-               +-   |        |  +- Op: >> Proxy Data Access [type] <<
     |  +-               +-               +-   |        |  +- Op: Method Call
     |  +-               +-               +-   |        |     +- Op: >> Proxy Data Access [ResultType] <<
     |  +-               +-               +-   |        +- St: Method Call
     |  +-               +-               +-   |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-               +-   |        +- St: Method Call
     |  +-               +-               +-   |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-               +-   |        +- St: =
     |  +-               +-               +-   |           +- Op: >> Proxy Data Access [result] <<
     |  +-               +-               +-   |           +- Op: >> proxy [ new something ]
     |  +-               +-               +-   +- Else Code:
     |  +-               +-               +-      +- Block:
     |  +-               +-               +-         +- Local Variables:
     |  +-               +-               +-         |  +- Symbol Var [ aux ] Type [ Ljava.util.List; ]
     |  +-               +-               +-         +- Code:
     |  +-               +-               +-            +- >> Proxy Statement: 
     |  +-               +-               +-               +- switch() {
     |  +-               +-               +-               +- case :
     |  +-               +-               +-               +-   Statements:
     |  +-               +-               +-               +-   St: =
     |  +-               +-               +-               +-   +- Op: Local variable access: aux
     |  +-               +-               +-               +-   +- Op: Method Call
     |  +-               +-               +-               +-      +- Op: >> Proxy Data Access [Name] <<
     |  +-               +-               +-               +-   St: =
     |  +-               +-               +-               +-   +- Op: >> Proxy Data Access [result] <<
     |  +-               +-               +-               +-   +- Op: Method Call
     |  +-               +-               +-               +-      +- Op: Method:
     |  +-               +-               +-               +-         +- cat.quadriga.parsers.code.Utils -> resolveName
     |  +-               +-               +-               +-   >> Proxy Statement: 
     |  +-               +-               +-               +-   +- break;
     |  +-               +-               +-               +-   <<
     |  +-               +-               +-               +- default:
     |  +-               +-               +-               +-   St: Method Call
     |  +-               +-               +-               +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-               +-               +-               +-   >> Proxy Statement: 
     |  +-               +-               +-               +-   +- throw ;
     |  +-               +-               +-               +-   <<
     |  +-               +-               +-               +- }
     |  +-               +-               +-               <<
     |  +-               +-               +- }
     |  +-               +-               <<
     |  +-               +- }
     |  +-               <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.ExpressionNode; PrimarySuffix
  Params
  in: Lcat.quadriga.parsers.code.expressions.ExpressionNode;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ t2 ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ out ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ printAux ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: printAux
     |     +- Op: >> proxy [ new something ]
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_29] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: =
     |  |        |  +- Op: Local variable access: t
     |  |        |  +- Op: Method Call
     |  |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  |        +- St: =
     |  |        |  +- Op: Local variable access: t2
     |  |        |  +- Op: Method Call
     |  |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  |        +- St: =
     |  |           +- Op: Local variable access: out
     |  |           +- Op: >> proxy [ new something ]
     |  +- Else Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Method Call
     |        |     +- Op: >> Proxy Data Access [jj_2_30] <<
     |        +- If Code:
     |        |  +- Block:
     |        |     +- Local Variables:
     |        |     +- Code:
     |        |        +- St: =
     |        |        |  +- Op: >> Proxy Data Access [t] <<
     |        |        |  +- Op: Method Call
     |        |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |        |        +- St: =
     |        |        |  +- Op: >> Proxy Data Access [t2] <<
     |        |        |  +- Op: Method Call
     |        |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |        |        +- St: =
     |        |           +- Op: >> Proxy Data Access [out] <<
     |        |           +- Op: >> proxy [ new something ]
     |        +- Else Code:
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_2_31] <<
     |              +- If Code:
     |              |  +- Block:
     |              |     +- Local Variables:
     |              |     +- Code:
     |              |        +- St: Method Call
     |              |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              |        +- St: Method Call
     |              |        |  +- Op: >> Proxy Data Access [printAux.add] <<
     |              |        +- St: Method Call
     |              |        |  +- Op: >> Proxy Data Access [AllocationExpression] <<
     |              |        +- St: =
     |              |           +- Op: >> Proxy Data Access [out] <<
     |              |           +- Op: >> proxy [ new something ]
     |              +- Else Code:
     |                 +- If Statement:
     |                    +- Condition:
     |                    |  +- Op: Method Call
     |                    |     +- Op: >> Proxy Data Access [jj_2_32] <<
     |                    +- If Code:
     |                    |  +- Block:
     |                    |     +- Local Variables:
     |                    |     +- Code:
     |                    |        +- St: Method Call
     |                    |        |  +- Op: >> Proxy Data Access [MemberSelector] <<
     |                    |        +- St: =
     |                    |           +- Op: >> Proxy Data Access [out] <<
     |                    |           +- Op: >> proxy [ new something ]
     |                    +- Else Code:
     |                       +- Block:
     |                          +- Local Variables:
     |                          +- Code:
     |                             +- >> Proxy Statement: 
     |                                +- switch() {
     |                                +- case :
     |                                +-   St: Method Call
     |                                +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |                                +-   St: Method Call
     |                                +-   +- Op: >> Proxy Data Access [printAux.add] <<
     |                                +-   St: Method Call
     |                                +-   +- Op: >> Proxy Data Access [Expression] <<
     |                                +-   St: Method Call
     |                                +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |                                +-   St: Method Call
     |                                +-   +- Op: >> Proxy Data Access [printAux.add] <<
     |                                +-   St: =
     |                                +-   +- Op: >> Proxy Data Access [out] <<
     |                                +-   +- Op: >> proxy [ new something ]
     |                                +-   >> Proxy Statement: 
     |                                +-   +- break;
     |                                +-   <<
     |                                +- case :
     |                                +-   St: Method Call
     |                                +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |                                +-   St: =
     |                                +-   +- Op: >> Proxy Data Access [t] <<
     |                                +-   +- Op: Method Call
     |                                +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |                                +-   If Statement:
     |                                +-   +- Condition:
     |                                +-   |  +- Op: instanceof
     |                                +-   |     +- Op: >> Proxy Data Access [in] <<
     |                                +-   |     +- Op: >> proxy [ Lcat.quadriga.parsers.code.expressions.dataaccess.DataAccess; ]
     |                                +-   +- If Code:
     |                                +-   |  +- Block:
     |                                +-   |     +- Local Variables:
     |                                +-   |     +- Code:
     |                                +-   |        +- St: =
     |                                +-   |           +- Op: >> Proxy Data Access [out] <<
     |                                +-   |           +- Op: Method Call
     |                                +-   |              +- Op: Method:
     |                                +-   |                 +- cat.quadriga.parsers.code.Utils -> accessToMember
     |                                +-   +- Else Code:
     |                                +-      +- Block:
     |                                +-         +- Local Variables:
     |                                +-         +- Code:
     |                                +-            +- St: =
     |                                +-               +- Op: >> Proxy Data Access [out] <<
     |                                +-               +- Op: >> proxy [ new something ]
     |                                +-   >> Proxy Statement: 
     |                                +-   +- break;
     |                                +-   <<
     |                                +- case :
     |                                +-   St: Method Call
     |                                +-   +- Op: >> Proxy Data Access [Arguments] <<
     |                                +-   St: =
     |                                +-   +- Op: >> Proxy Data Access [out] <<
     |                                +-   +- Op: >> proxy [ new something ]
     |                                +-   >> Proxy Statement: 
     |                                +-   +- break;
     |                                +-   <<
     |                                +- default:
     |                                +-   St: Method Call
     |                                +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |                                +-   >> Proxy Statement: 
     |                                +-   +- throw ;
     |                                +-   <<
     |                                +- }
     |                                <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.dataaccess.LiteralData; Literal
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ data ] Type [ Lcat.quadriga.parsers.code.expressions.dataaccess.LiteralData; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: data
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: data
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: data
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: data
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: data
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [BooleanLiteral] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: data
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [NullLiteral] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.dataaccess.LiteralData; BooleanLiteral
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ lit ] Type [ Lcat.quadriga.parsers.code.expressions.dataaccess.LiteralData; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: lit
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: lit
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.expressions.dataaccess.LiteralData; NullLiteral
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Arguments
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ other ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: other
     |     +- Op: >> proxy [ new something ]
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [ArgumentList] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> addAll
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> add
           +- Op: Local variable access: out
  final public ArgumentList
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Expression] <<
     +- LABEL: label_35
        +- >> Proxy Statement: 
           +- while( )
           +- Block:
           +- +- Local Variables:
           +- +- Code:
           +-    +- >> Proxy Statement: 
           +-    |  +- switch() {
           +-    |  +- case :
           +-    |  +-   St: No operation
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break;
           +-    |  +-   <<
           +-    |  +- default:
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break label_35;
           +-    |  +-   <<
           +-    |  +- }
           +-    |  <<
           +-    +- St: Method Call
           +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-       +- Op: >> Proxy Data Access [Expression] <<Block:
           +- +- Local Variables:
           +- +- Code:
           +-    +- >> Proxy Statement: 
           +-    |  +- switch() {
           +-    |  +- case :
           +-    |  +-   St: No operation
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break;
           +-    |  +-   <<
           +-    |  +- default:
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break label_35;
           +-    |  +-   <<
           +-    |  +- }
           +-    |  <<
           +-    +- St: Method Call
           +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-       +- Op: >> Proxy Data Access [Expression] <<
           <<
  final public AllocationExpression
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ other ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ other2 ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |  |  +- Op: Local variable access: other
     |  |  +- Op: >> proxy [ new something ]
     |  +- St: =
     |     +- Op: Local variable access: other2
     |     +- Op: >> proxy [ new something ]
     +- If Statement:
        +- Condition:
        |  +- Op: Method Call
        |     +- Op: >> Proxy Data Access [jj_2_33] <<
        +- If Code:
        |  +- Block:
        |     +- Local Variables:
        |     +- Code:
        |        +- St: Method Call
        |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |        +- St: Method Call
        |        |  +- Op: >> Proxy Data Access [PrimitiveType] <<
        |        +- St: Method Call
        |        |  +- Op: >> Proxy Data Access [ArrayDimsAndInits] <<
        |        +- St: Method Call
        |        |  +- Op: Method:
        |        |     +- java.util.List -> add
        |        |     +- Op: Local variable access: out
        |        +- St: Method Call
        |        |  +- Op: Method:
        |        |     +- java.util.List -> add
        |        |     +- Op: Local variable access: out
        |        +- St: Method Call
        |        |  +- Op: Method:
        |        |     +- java.util.List -> addAll
        |        |     +- Op: Local variable access: out
        |        +- St: Method Call
        |           +- Op: Method:
        |              +- java.util.List -> addAll
        |              +- Op: Local variable access: out
        +- Else Code:
           +- Block:
              +- Local Variables:
              +- Code:
                 +- >> Proxy Statement: 
                    +- switch() {
                    +- case :
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [out.add] <<
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [out.add] <<
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [ClassOrInterfaceType] <<
                    +-   >> Proxy Statement: 
                    +-   +- switch() {
                    +-   +- case :
                    +-   +-   St: Method Call
                    +-   +-   +- Op: >> Proxy Data Access [TypeArguments] <<
                    +-   +-   >> Proxy Statement: 
                    +-   +-   +- break;
                    +-   +-   <<
                    +-   +- default:
                    +-   +-   St: No operation
                    +-   +- }
                    +-   <<
                    +-   >> Proxy Statement: 
                    +-   +- switch() {
                    +-   +- case :
                    +-   +-   St: Method Call
                    +-   +-   +- Op: >> Proxy Data Access [ArrayDimsAndInits] <<
                    +-   +-   >> Proxy Statement: 
                    +-   +-   +- break;
                    +-   +-   <<
                    +-   +- case :
                    +-   +-   St: Method Call
                    +-   +-   +- Op: >> Proxy Data Access [Arguments] <<
                    +-   +-   >> Proxy Statement: 
                    +-   +-   +- switch() {
                    +-   +-   +- case :
                    +-   +-   +-   St: Method Call
                    +-   +-   +-   +- Op: >> Proxy Data Access [ClassOrInterfaceBody] <<
                    +-   +-   +-   >> Proxy Statement: 
                    +-   +-   +-   +- break;
                    +-   +-   +-   <<
                    +-   +-   +- default:
                    +-   +-   +-   St: No operation
                    +-   +-   +- }
                    +-   +-   <<
                    +-   +-   >> Proxy Statement: 
                    +-   +-   +- break;
                    +-   +-   <<
                    +-   +- default:
                    +-   +-   St: Method Call
                    +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-   +-   >> Proxy Statement: 
                    +-   +-   +- throw ;
                    +-   +-   <<
                    +-   +- }
                    +-   <<
                    +-   >> Proxy Statement: 
                    +-   +- break;
                    +-   <<
                    +- default:
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-   >> Proxy Statement: 
                    +-   +- throw ;
                    +-   <<
                    +- }
                    <<
  final public ArrayDimsAndInits
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
        +- Condition:
        |  +- Op: Method Call
        |     +- Op: >> Proxy Data Access [jj_2_36] <<
        +- If Code:
        |  +- Block:
        |     +- Local Variables:
        |     +- Code:
        |        +- LABEL: label_36
        |        |  +- >> Proxy Statement: 
        |        |     +- while( )
        |        |     +- Block:
        |        |     +- +- Local Variables:
        |        |     +- +- Code:
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: Method:
        |        |     +-    |     +- java.util.List -> add
        |        |     +-    |     +- Op: Local variable access: out
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: >> Proxy Data Access [Expression] <<
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: Method:
        |        |     +-    |     +- java.util.List -> add
        |        |     +-    |     +- Op: Local variable access: out
        |        |     +-    +- If Statement:
        |        |     +-       +- Condition:
        |        |     +-       |  +- Op: Method Call
        |        |     +-       |     +- Op: >> Proxy Data Access [jj_2_34] <<
        |        |     +-       +- If Code:
        |        |     +-       |  +- Block:
        |        |     +-       |     +- Local Variables:
        |        |     +-       |     +- Code:
        |        |     +-       |        +- St: No operation
        |        |     +-       +- Else Code:
        |        |     +-          +- Block:
        |        |     +-             +- Local Variables:
        |        |     +-             +- Code:
        |        |     +-                +- >> Proxy Statement: 
        |        |     +-                   +- break label_36;
        |        |     +-                   <<Block:
        |        |     +- +- Local Variables:
        |        |     +- +- Code:
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: Method:
        |        |     +-    |     +- java.util.List -> add
        |        |     +-    |     +- Op: Local variable access: out
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: >> Proxy Data Access [Expression] <<
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |        |     +-    +- St: Method Call
        |        |     +-    |  +- Op: Method:
        |        |     +-    |     +- java.util.List -> add
        |        |     +-    |     +- Op: Local variable access: out
        |        |     +-    +- If Statement:
        |        |     +-       +- Condition:
        |        |     +-       |  +- Op: Method Call
        |        |     +-       |     +- Op: >> Proxy Data Access [jj_2_34] <<
        |        |     +-       +- If Code:
        |        |     +-       |  +- Block:
        |        |     +-       |     +- Local Variables:
        |        |     +-       |     +- Code:
        |        |     +-       |        +- St: No operation
        |        |     +-       +- Else Code:
        |        |     +-          +- Block:
        |        |     +-             +- Local Variables:
        |        |     +-             +- Code:
        |        |     +-                +- >> Proxy Statement: 
        |        |     +-                   +- break label_36;
        |        |     +-                   <<
        |        |     <<
        |        +- LABEL: label_37
        |           +- >> Proxy Statement: 
        |              +- while( )
        |              +- Block:
        |              +- +- Local Variables:
        |              +- +- Code:
        |              +-    +- If Statement:
        |              +-    |  +- Condition:
        |              +-    |  |  +- Op: Method Call
        |              +-    |  |     +- Op: >> Proxy Data Access [jj_2_35] <<
        |              +-    |  +- If Code:
        |              +-    |  |  +- Block:
        |              +-    |  |     +- Local Variables:
        |              +-    |  |     +- Code:
        |              +-    |  |        +- St: No operation
        |              +-    |  +- Else Code:
        |              +-    |     +- Block:
        |              +-    |        +- Local Variables:
        |              +-    |        +- Code:
        |              +-    |           +- >> Proxy Statement: 
        |              +-    |              +- break label_37;
        |              +-    |              <<
        |              +-    +- St: Method Call
        |              +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |              +-    +- St: Method Call
        |              +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |              +-    +- St: Method Call
        |              +-    |  +- Op: >> Proxy Data Access [out.add] <<
        |              +-    +- St: Method Call
        |              +-       +- Op: >> Proxy Data Access [out.add] <<Block:
        |              +- +- Local Variables:
        |              +- +- Code:
        |              +-    +- If Statement:
        |              +-    |  +- Condition:
        |              +-    |  |  +- Op: Method Call
        |              +-    |  |     +- Op: >> Proxy Data Access [jj_2_35] <<
        |              +-    |  +- If Code:
        |              +-    |  |  +- Block:
        |              +-    |  |     +- Local Variables:
        |              +-    |  |     +- Code:
        |              +-    |  |        +- St: No operation
        |              +-    |  +- Else Code:
        |              +-    |     +- Block:
        |              +-    |        +- Local Variables:
        |              +-    |        +- Code:
        |              +-    |           +- >> Proxy Statement: 
        |              +-    |              +- break label_37;
        |              +-    |              <<
        |              +-    +- St: Method Call
        |              +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |              +-    +- St: Method Call
        |              +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        |              +-    +- St: Method Call
        |              +-    |  +- Op: >> Proxy Data Access [out.add] <<
        |              +-    +- St: Method Call
        |              +-       +- Op: >> Proxy Data Access [out.add] <<
        |              <<
        +- Else Code:
           +- Block:
              +- Local Variables:
              +- Code:
                 +- >> Proxy Statement: 
                    +- switch() {
                    +- case :
                    +-   LABEL: label_38
                    +-   +- >> Proxy Statement: 
                    +-      +- while( )
                    +-      +- Block:
                    +-      +- +- Local Variables:
                    +-      +- +- Code:
                    +-      +-    +- St: Method Call
                    +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-      +-    +- St: Method Call
                    +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-      +-    +- St: Method Call
                    +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
                    +-      +-    +- St: Method Call
                    +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
                    +-      +-    +- >> Proxy Statement: 
                    +-      +-       +- switch() {
                    +-      +-       +- case :
                    +-      +-       +-   St: No operation
                    +-      +-       +-   >> Proxy Statement: 
                    +-      +-       +-   +- break;
                    +-      +-       +-   <<
                    +-      +-       +- default:
                    +-      +-       +-   >> Proxy Statement: 
                    +-      +-       +-   +- break label_38;
                    +-      +-       +-   <<
                    +-      +-       +- }
                    +-      +-       <<Block:
                    +-      +- +- Local Variables:
                    +-      +- +- Code:
                    +-      +-    +- St: Method Call
                    +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-      +-    +- St: Method Call
                    +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-      +-    +- St: Method Call
                    +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
                    +-      +-    +- St: Method Call
                    +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
                    +-      +-    +- >> Proxy Statement: 
                    +-      +-       +- switch() {
                    +-      +-       +- case :
                    +-      +-       +-   St: No operation
                    +-      +-       +-   >> Proxy Statement: 
                    +-      +-       +-   +- break;
                    +-      +-       +-   <<
                    +-      +-       +- default:
                    +-      +-       +-   >> Proxy Statement: 
                    +-      +-       +-   +- break label_38;
                    +-      +-       +-   <<
                    +-      +-       +- }
                    +-      +-       <<
                    +-      <<
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [ArrayInitializer] <<
                    +-   >> Proxy Statement: 
                    +-   +- break;
                    +-   <<
                    +- default:
                    +-   St: Method Call
                    +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                    +-   >> Proxy Statement: 
                    +-   +- throw ;
                    +-   <<
                    +- }
                    <<
  final public Lcat.quadriga.parsers.code.statements.StatementNode; Statement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ statement ] Type [ Lcat.quadriga.parsers.code.statements.StatementNode; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: statement
     |     +- Op: Literal
     |        +- Null
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_37] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: =
     |  |           +- Op: Local variable access: statement
     |  |           +- Op: Method Call
     |  |              +- Op: >> Proxy Data Access [LabeledStatement] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- >> Proxy Statement: 
     |              +- switch() {
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [AssertStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [statement] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [Block] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [statement] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [EmptyStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [statement] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [StatementExpression] <<
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [SwitchStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [statement] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [IfStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [WhileStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [DoStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [ForStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [BreakStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [ContinueStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [ReturnStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [ThrowStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [SynchronizedStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [TryStatement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- default:
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- throw ;
     |              +-   <<
     |              +- }
     |              <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: ==
     |  |     +- Op: >> Proxy Data Access [statement] <<
     |  |     +- Op: Literal
     |  |        +- Null
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: =
     |  |           +- Op: >> Proxy Data Access [statement] <<
     |  |           +- Op: >> proxy [ new something ]
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
     |        +- Code:
     |           +- Statements:
     |           |  +- St: =
     |           |     +- Op: Local variable access: treeString
     |           |     +- Op: Method Call
     |           |        +- Op: >> Proxy Data Access [statement.treeStringRepresentation] <<
     |           +- St: Method Call
     |              +- Op: >> Proxy Data Access [out.addAll] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public AssertStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Expression] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: out
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: out
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [Expression] <<
     |  +-   St: Method Call
     |  +-   +- Op: Method:
     |  +-      +- java.util.List -> add
     |  +-      +- Op: Local variable access: out
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> add
           +- Op: Local variable access: out
  final public Lcat.quadriga.parsers.code.statements.StatementNode; LabeledStatement
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ node ] Type [ Lcat.quadriga.parsers.code.statements.StatementNode; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: Local variable access: node
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Statement] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.statements.BlockCode; Block
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ prevBlock ] Type [ #unknown BlockCode.TmpBlockCode # ]
  |  +- Symbol Var [ blockStatementNode ] Type [ Lcat.quadriga.parsers.code.statements.BlockStatementNode; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ block ] Type [ Lcat.quadriga.parsers.code.statements.BlockCode; ]
  |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: prevBlock
     |     +- Op: >> Proxy Data Access [localBlock] <<
     +- Statements:
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [symbolTable.newContext] <<
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [localBlock] <<
     |  +- Op: >> proxy [ new something ]
     +- LABEL: label_39
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_39;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: blockStatementNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [BlockStatement] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [localBlock.addStatement] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_39;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: blockStatementNode
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [BlockStatement] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [localBlock.addStatement] <<
     |     <<
     +- St: =
     |  +- Op: >> Proxy Data Access [t] <<
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: block
     |     +- Op: Method Call
     |        +- Op: >> Proxy Data Access [localBlock.transformToBlockCode] <<
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: treeString
     |     +- Op: Method Call
     |        +- Op: Method:
     |           +- cat.quadriga.parsers.code.statements.BlockCode -> treeStringRepresentation
     |           +- Op: Local variable access: block
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.addAll] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [localBlock] <<
     |  +- Op: >> Proxy Data Access [prevBlock] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [symbolTable.deleteContext] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.statements.BlockStatementNode; BlockStatement
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ result ] Type [ Lcat.quadriga.parsers.code.statements.BlockStatementNode; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- Statements:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_38] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: =
     |  |        |  +- Op: Local variable access: result
     |  |        |  +- Op: Method Call
     |  |        |     +- Op: >> Proxy Data Access [LocalVariableDeclaration] <<
     |  |        +- St: =
     |  |           +- Op: Local variable access: t
     |  |           +- Op: Method Call
     |  |              +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- >> Proxy Statement: 
     |              +- switch() {
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [result] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [Statement] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- case :
     |              +- case :
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [ClassOrInterfaceDeclaration] <<
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [result] <<
     |              +-   +- Op: >> proxy [ new something ]
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- default:
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- throw ;
     |              +-   <<
     |              +- }
     |              <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.statements.StatementList; LocalVariableDeclaration
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ modifiers ] Type [ I ]
  |  +- Symbol Var [ type ] Type [ Lcat.quadriga.parsers.code.types.BaseType; ]
  |  +- Symbol Var [ var ] Type [ Lcat.quadriga.parsers.VarAndInit; ]
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ initializers ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: initializers
     |     +- Op: >> proxy [ new something ]
     +- St: =
     |  +- Op: Local variable access: modifiers
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Modifiers] <<
     +- St: =
     |  +- Op: Local variable access: type
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Type] <<
     +- St: =
     |  +- Op: Local variable access: var
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [VariableDeclarator] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: Static Access:
     |  |     +- Op: Literal
     |  |        +- Null
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: Method Call
     |              +- Op: Method:
     |                 +- java.util.List -> add
     |                 +- Op: Local variable access: initializers
     +- LABEL: label_40
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_40;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [var] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [VariableDeclarator] <<
     |     +-    +- If Statement:
     |     +-       +- Condition:
     |     +-       |  +- Op: !=
     |     +-       |     +- Op: >> Proxy Data Access [var.init] <<
     |     +-       |     +- Op: Literal
     |     +-       |        +- Null
     |     +-       +- If Code:
     |     +-          +- Block:
     |     +-             +- Local Variables:
     |     +-             +- Code:
     |     +-                +- St: Method Call
     |     +-                   +- Op: >> Proxy Data Access [initializers.add] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_40;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: >> Proxy Data Access [var] <<
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [VariableDeclarator] <<
     |     +-    +- If Statement:
     |     +-       +- Condition:
     |     +-       |  +- Op: !=
     |     +-       |     +- Op: >> Proxy Data Access [var.init] <<
     |     +-       |     +- Op: Literal
     |     +-       |        +- Null
     |     +-       +- If Code:
     |     +-          +- Block:
     |     +-             +- Local Variables:
     |     +-             +- Code:
     |     +-                +- St: Method Call
     |     +-                   +- Op: >> Proxy Data Access [initializers.add] <<
     |     <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.statements.StatementNode; EmptyStatement
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.statements.StatementNode; StatementExpression
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ expression ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ expression2 ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ assignOperator ] Type [ #unknown AssigmentStatementNode.Operator # ]
  |  +- Symbol Var [ statementNode ] Type [ Lcat.quadriga.parsers.code.statements.StatementNode; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     +- Statements:
     +- Statements:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +-   >> Proxy Statement: 
     |  +-   +- switch() {
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: expression
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [PreIncrementExpression] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: expression
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [PreDecrementExpression] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- default:
     |  +-   +-   St: Method Call
     |  +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- throw ;
     |  +-   +-   <<
     |  +-   +- }
     |  +-   <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: statementNode
     |  +-   +- Op: >> proxy [ new something ]
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: expression
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [PrimaryExpression] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- switch() {
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- switch() {
     |  +-   +-   +- case :
     |  +-   +-   +-   St: =
     |  +-   +-   +-   +- Op: Local variable access: t
     |  +-   +-   +-   +- Op: Method Call
     |  +-   +-   +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   +-   >> Proxy Statement: 
     |  +-   +-   +-   +- break;
     |  +-   +-   +-   <<
     |  +-   +-   +- case :
     |  +-   +-   +-   St: =
     |  +-   +-   +-   +- Op: Local variable access: t
     |  +-   +-   +-   +- Op: Method Call
     |  +-   +-   +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   +-   >> Proxy Statement: 
     |  +-   +-   +-   +- break;
     |  +-   +-   +-   <<
     |  +-   +-   +- default:
     |  +-   +-   +-   St: Method Call
     |  +-   +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   +-   >> Proxy Statement: 
     |  +-   +-   +-   +- throw ;
     |  +-   +-   +-   <<
     |  +-   +-   +- }
     |  +-   +-   <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: expression
     |  +-   +-   +- Op: >> proxy [ new something ]
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: statementNode
     |  +-   +-   +- Op: >> proxy [ new something ]
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +- case :
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: assignOperator
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [AssignmentOperator] <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: expression2
     |  +-   +-   +- Op: Method Call
     |  +-   +-      +- Op: >> Proxy Data Access [Expression] <<
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: statementNode
     |  +-   +-   +- Op: >> proxy [ new something ]
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- default:
     |  +-   +-   St: =
     |  +-   +-   +- Op: Local variable access: statementNode
     |  +-   +-   +- Op: >> proxy [ new something ]
     |  +-   +- }
     |  +-   <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- throw ;
     |  +-   <<
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public SwitchStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Expression] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- LABEL: label_41
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_41;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [SwitchLabel] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- LABEL: label_42
     |     +-    |  +- >> Proxy Statement: 
     |     +-    |     +- while( )
     |     +-    |     +- Block:
     |     +-    |     +- +- Local Variables:
     |     +-    |     +- |  +- Symbol Var [ bsn ] Type [ Lcat.quadriga.parsers.code.statements.BlockStatementNode; ]
     |     +-    |     +- |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
     |     +-    |     +- +- Code:
     |     +-    |     +-    +- >> Proxy Statement: 
     |     +-    |     +-    |  +- switch() {
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +-   St: No operation
     |     +-    |     +-    |  +-   >> Proxy Statement: 
     |     +-    |     +-    |  +-   +- break;
     |     +-    |     +-    |  +-   <<
     |     +-    |     +-    |  +- default:
     |     +-    |     +-    |  +-   >> Proxy Statement: 
     |     +-    |     +-    |  +-   +- break label_42;
     |     +-    |     +-    |  +-   <<
     |     +-    |     +-    |  +- }
     |     +-    |     +-    |  <<
     |     +-    |     +-    +- St: Method Call
     |     +-    |     +-    |  +- Op: Method:
     |     +-    |     +-    |     +- java.util.List -> add
     |     +-    |     +-    |     +- Op: Local variable access: out
     |     +-    |     +-    +- Statements:
     |     +-    |     +-    +- St: =
     |     +-    |     +-    |  +- Op: Local variable access: bsn
     |     +-    |     +-    |  +- Op: Method Call
     |     +-    |     +-    |     +- Op: >> Proxy Data Access [BlockStatement] <<
     |     +-    |     +-    +- Statements:
     |     +-    |     +-    |  +- St: =
     |     +-    |     +-    |     +- Op: Local variable access: treeString
     |     +-    |     +-    |     +- Op: Method Call
     |     +-    |     +-    |        +- Op: Method:
     |     +-    |     +-    |           +- cat.quadriga.parsers.code.TreeRepresentable -> treeStringRepresentation
     |     +-    |     +-    |           +- Op: Local variable access: bsn
     |     +-    |     +-    +- St: Method Call
     |     +-    |     +-       +- Op: Method:
     |     +-    |     +-          +- java.util.List -> addAll
     |     +-    |     +-          +- Op: Local variable access: outBlock:
     |     +-    |     +- +- Local Variables:
     |     +-    |     +- |  +- Symbol Var [ bsn ] Type [ Lcat.quadriga.parsers.code.statements.BlockStatementNode; ]
     |     +-    |     +- |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
     |     +-    |     +- +- Code:
     |     +-    |     +-    +- >> Proxy Statement: 
     |     +-    |     +-    |  +- switch() {
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +-   St: No operation
     |     +-    |     +-    |  +-   >> Proxy Statement: 
     |     +-    |     +-    |  +-   +- break;
     |     +-    |     +-    |  +-   <<
     |     +-    |     +-    |  +- default:
     |     +-    |     +-    |  +-   >> Proxy Statement: 
     |     +-    |     +-    |  +-   +- break label_42;
     |     +-    |     +-    |  +-   <<
     |     +-    |     +-    |  +- }
     |     +-    |     +-    |  <<
     |     +-    |     +-    +- St: Method Call
     |     +-    |     +-    |  +- Op: Method:
     |     +-    |     +-    |     +- java.util.List -> add
     |     +-    |     +-    |     +- Op: Local variable access: out
     |     +-    |     +-    +- Statements:
     |     +-    |     +-    +- St: =
     |     +-    |     +-    |  +- Op: Local variable access: bsn
     |     +-    |     +-    |  +- Op: Method Call
     |     +-    |     +-    |     +- Op: >> Proxy Data Access [BlockStatement] <<
     |     +-    |     +-    +- Statements:
     |     +-    |     +-    |  +- St: =
     |     +-    |     +-    |     +- Op: Local variable access: treeString
     |     +-    |     +-    |     +- Op: Method Call
     |     +-    |     +-    |        +- Op: Method:
     |     +-    |     +-    |           +- cat.quadriga.parsers.code.TreeRepresentable -> treeStringRepresentation
     |     +-    |     +-    |           +- Op: Local variable access: bsn
     |     +-    |     +-    +- St: Method Call
     |     +-    |     +-       +- Op: Method:
     |     +-    |     +-          +- java.util.List -> addAll
     |     +-    |     +-          +- Op: Local variable access: out
     |     +-    |     <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [out.add] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_41;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [SwitchLabel] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- LABEL: label_42
     |     +-    |  +- >> Proxy Statement: 
     |     +-    |     +- while( )
     |     +-    |     +- Block:
     |     +-    |     +- +- Local Variables:
     |     +-    |     +- |  +- Symbol Var [ bsn ] Type [ Lcat.quadriga.parsers.code.statements.BlockStatementNode; ]
     |     +-    |     +- |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
     |     +-    |     +- +- Code:
     |     +-    |     +-    +- >> Proxy Statement: 
     |     +-    |     +-    |  +- switch() {
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +-   St: No operation
     |     +-    |     +-    |  +-   >> Proxy Statement: 
     |     +-    |     +-    |  +-   +- break;
     |     +-    |     +-    |  +-   <<
     |     +-    |     +-    |  +- default:
     |     +-    |     +-    |  +-   >> Proxy Statement: 
     |     +-    |     +-    |  +-   +- break label_42;
     |     +-    |     +-    |  +-   <<
     |     +-    |     +-    |  +- }
     |     +-    |     +-    |  <<
     |     +-    |     +-    +- St: Method Call
     |     +-    |     +-    |  +- Op: Method:
     |     +-    |     +-    |     +- java.util.List -> add
     |     +-    |     +-    |     +- Op: Local variable access: out
     |     +-    |     +-    +- Statements:
     |     +-    |     +-    +- St: =
     |     +-    |     +-    |  +- Op: Local variable access: bsn
     |     +-    |     +-    |  +- Op: Method Call
     |     +-    |     +-    |     +- Op: >> Proxy Data Access [BlockStatement] <<
     |     +-    |     +-    +- Statements:
     |     +-    |     +-    |  +- St: =
     |     +-    |     +-    |     +- Op: Local variable access: treeString
     |     +-    |     +-    |     +- Op: Method Call
     |     +-    |     +-    |        +- Op: Method:
     |     +-    |     +-    |           +- cat.quadriga.parsers.code.TreeRepresentable -> treeStringRepresentation
     |     +-    |     +-    |           +- Op: Local variable access: bsn
     |     +-    |     +-    +- St: Method Call
     |     +-    |     +-       +- Op: Method:
     |     +-    |     +-          +- java.util.List -> addAll
     |     +-    |     +-          +- Op: Local variable access: outBlock:
     |     +-    |     +- +- Local Variables:
     |     +-    |     +- |  +- Symbol Var [ bsn ] Type [ Lcat.quadriga.parsers.code.statements.BlockStatementNode; ]
     |     +-    |     +- |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
     |     +-    |     +- +- Code:
     |     +-    |     +-    +- >> Proxy Statement: 
     |     +-    |     +-    |  +- switch() {
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +- case :
     |     +-    |     +-    |  +-   St: No operation
     |     +-    |     +-    |  +-   >> Proxy Statement: 
     |     +-    |     +-    |  +-   +- break;
     |     +-    |     +-    |  +-   <<
     |     +-    |     +-    |  +- default:
     |     +-    |     +-    |  +-   >> Proxy Statement: 
     |     +-    |     +-    |  +-   +- break label_42;
     |     +-    |     +-    |  +-   <<
     |     +-    |     +-    |  +- }
     |     +-    |     +-    |  <<
     |     +-    |     +-    +- St: Method Call
     |     +-    |     +-    |  +- Op: Method:
     |     +-    |     +-    |     +- java.util.List -> add
     |     +-    |     +-    |     +- Op: Local variable access: out
     |     +-    |     +-    +- Statements:
     |     +-    |     +-    +- St: =
     |     +-    |     +-    |  +- Op: Local variable access: bsn
     |     +-    |     +-    |  +- Op: Method Call
     |     +-    |     +-    |     +- Op: >> Proxy Data Access [BlockStatement] <<
     |     +-    |     +-    +- Statements:
     |     +-    |     +-    |  +- St: =
     |     +-    |     +-    |     +- Op: Local variable access: treeString
     |     +-    |     +-    |     +- Op: Method Call
     |     +-    |     +-    |        +- Op: Method:
     |     +-    |     +-    |           +- cat.quadriga.parsers.code.TreeRepresentable -> treeStringRepresentation
     |     +-    |     +-    |           +- Op: Local variable access: bsn
     |     +-    |     +-    +- St: Method Call
     |     +-    |     +-       +- Op: Method:
     |     +-    |     +-          +- java.util.List -> addAll
     |     +-    |     +-          +- Op: Local variable access: out
     |     +-    |     <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [out.add] <<
     |     <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public SwitchLabel
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ other ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: other
     |     +- Op: >> proxy [ new something ]
     +- >> Proxy Statement: 
        +- switch() {
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [Expression] <<
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> addAll
        +-      +- Op: Local variable access: out
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   St: Method Call
        +-   +- Op: Method:
        +-      +- java.util.List -> add
        +-      +- Op: Local variable access: out
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- default:
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   >> Proxy Statement: 
        +-   +- throw ;
        +-   <<
        +- }
        <<
  final public Lcat.quadriga.parsers.code.statements.StatementNode; IfStatement
  Params
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ out ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ node1 ] Type [ Lcat.quadriga.parsers.code.statements.StatementNode; ]
  |  +- Symbol Var [ node2 ] Type [ Lcat.quadriga.parsers.code.statements.StatementNode; ]
  |  +- Symbol Var [ expression ] Type [ Lcat.quadriga.parsers.code.expressions.ExpressionNode; ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: out
     |     +- Op: >> proxy [ new something ]
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: node2
     |     +- Op: Literal
     |        +- Null
     +- Statements:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: Local variable access: expression
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Expression] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [symbolTable.newContext] <<
     +- St: =
     |  +- Op: Local variable access: node1
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [Statement] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [symbolTable.deleteContext] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [symbolTable.newContext] <<
     |  +-   St: =
     |  +-   +- Op: Local variable access: node2
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [Statement] <<
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [symbolTable.deleteContext] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public WhileStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Expression] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: >> Proxy Data Access [Statement] <<
  final public DoStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Statement] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Expression] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> add
           +- Op: Local variable access: out
  final public ForStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_39] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [Modifiers] <<
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [Type] <<
     |  |        +- St: =
     |  |        |  +- Op: Local variable access: t
     |  |        |  +- Op: Method Call
     |  |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  |        +- St: Method Call
     |  |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  |        +- St: Method Call
     |  |        |  +- Op: Method:
     |  |        |     +- java.util.List -> add
     |  |        |     +- Op: Local variable access: out
     |  |        +- St: Method Call
     |  |        |  +- Op: Method:
     |  |        |     +- java.util.List -> add
     |  |        |     +- Op: Local variable access: out
     |  |        +- St: Method Call
     |  |        |  +- Op: Method:
     |  |        |     +- java.util.List -> add
     |  |        |     +- Op: Local variable access: out
     |  |        +- St: Method Call
     |  |        |  +- Op: Method:
     |  |        |     +- java.util.List -> add
     |  |        |     +- Op: Local variable access: out
     |  |        +- St: Method Call
     |  |           +- Op: >> Proxy Data Access [Expression] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- >> Proxy Statement: 
     |              +- switch() {
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +-   >> Proxy Statement: 
     |              +-   +- switch() {
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +-   St: Method Call
     |              +-   +-   +- Op: >> Proxy Data Access [ForInit] <<
     |              +-   +-   >> Proxy Statement: 
     |              +-   +-   +- break;
     |              +-   +-   <<
     |              +-   +- default:
     |              +-   +-   St: No operation
     |              +-   +- }
     |              +-   <<
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [out.add] <<
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [out.add] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- switch() {
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +-   St: Method Call
     |              +-   +-   +- Op: >> Proxy Data Access [Expression] <<
     |              +-   +-   >> Proxy Statement: 
     |              +-   +-   +- break;
     |              +-   +-   <<
     |              +-   +- default:
     |              +-   +-   St: No operation
     |              +-   +- }
     |              +-   <<
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [out.add] <<
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [out.add] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- switch() {
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +- case :
     |              +-   +-   St: Method Call
     |              +-   +-   +- Op: >> Proxy Data Access [ForUpdate] <<
     |              +-   +-   >> Proxy Statement: 
     |              +-   +-   +- break;
     |              +-   +-   <<
     |              +-   +- default:
     |              +-   +-   St: No operation
     |              +-   +- }
     |              +-   <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- default:
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- throw ;
     |              +-   <<
     |              +- }
     |              <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [Statement] <<
  final public Lcat.quadriga.parsers.code.statements.StatementNode; ForInit
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ result ] Type [ Lcat.quadriga.parsers.code.statements.StatementNode; ]
  |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
  +- Code:
     +- Statements:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_2_40] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: =
     |  |           +- Op: Local variable access: result
     |  |           +- Op: Method Call
     |  |              +- Op: >> Proxy Data Access [LocalVariableDeclaration] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- >> Proxy Statement: 
     |              +- switch() {
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +- case :
     |              +-   St: =
     |              +-   +- Op: >> Proxy Data Access [result] <<
     |              +-   +- Op: Method Call
     |              +-      +- Op: >> Proxy Data Access [StatementExpressionList] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- break;
     |              +-   <<
     |              +- default:
     |              +-   St: Method Call
     |              +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |              +-   >> Proxy Statement: 
     |              +-   +- throw ;
     |              +-   <<
     |              +- }
     |              <<
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: treeString
     |     +- Op: Method Call
     |        +- Op: >> Proxy Data Access [result.treeStringRepresentation] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.addAll] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public Lcat.quadriga.parsers.code.statements.StatementNode; StatementExpressionList
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ statement ] Type [ Lcat.quadriga.parsers.code.statements.StatementNode; ]
  |  +- Symbol Var [ statements ] Type [ Ljava.util.List; ]
  |  +- Symbol Var [ treeString ] Type [ Ljava.lang.String; ]
  +- Code:
     +- Statements:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: statements
     |     +- Op: >> proxy [ new something ]
     +- St: =
     |  +- Op: Local variable access: statement
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [StatementExpression] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: statements
     +- LABEL: label_43
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_43;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: statement
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [StatementExpression] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: Method:
     |     +-          +- java.util.List -> add
     |     +-          +- Op: Local variable access: statementsBlock:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_43;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: =
     |     +-    |  +- Op: Local variable access: statement
     |     +-    |  +- Op: Method Call
     |     +-    |     +- Op: >> Proxy Data Access [StatementExpression] <<
     |     +-    +- St: Method Call
     |     +-       +- Op: Method:
     |     +-          +- java.util.List -> add
     |     +-          +- Op: Local variable access: statements
     |     <<
     +- St: =
     |  +- Op: >> Proxy Data Access [statement] <<
     |  +- Op: >> proxy [ new something ]
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: treeString
     |     +- Op: Method Call
     |        +- Op: >> Proxy Data Access [statement.treeStringRepresentation] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.addAll] <<
     +- Block:
     |  +- Local Variables:
     |  +- Code:
     |     +- If Statement:
     |        +- Condition:
     |        |  +- Op: Literal
     |        |     +- Boolean: true
     |        +- If Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  final public ForUpdate
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
        +- Op: >> Proxy Data Access [StatementExpressionList] <<
  final public BreakStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: t
     |     +- Op: Literal
     |        +- Null
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: Local variable access: t
     |  |     +- Op: Literal
     |  |        +- Null
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: Method Call
     |           |  +- Op: Method:
     |           |     +- java.util.List -> add
     |           |     +- Op: Local variable access: out
     |           +- St: Method Call
     |              +- Op: Method:
     |                 +- java.util.List -> add
     |                 +- Op: Local variable access: out
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public ContinueStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: t
     |     +- Op: Literal
     |        +- Null
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: =
     |  +-   +- Op: Local variable access: t
     |  +-   +- Op: Method Call
     |  +-      +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: Local variable access: t
     |  |     +- Op: Literal
     |  |        +- Null
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: Method Call
     |           |  +- Op: Method:
     |           |     +- java.util.List -> add
     |           |     +- Op: Local variable access: out
     |           +- St: Method Call
     |              +- Op: Method:
     |                 +- java.util.List -> add
     |                 +- Op: Local variable access: out
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public ReturnStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [Expression] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> add
           +- Op: Local variable access: out
  final public ThrowStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ other ] Type [ Ljava.util.List; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: other
     |     +- Op: >> proxy [ new something ]
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Expression] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> addAll
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> add
           +- Op: Local variable access: out
  final public SynchronizedStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Expression] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: >> Proxy Data Access [Block] <<
  final public TryStatement
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Block] <<
     +- LABEL: label_44
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_44;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [FormalParameter] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [Block] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_44;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [FormalParameter] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-    |  +- Op: Method:
     |     +-    |     +- java.util.List -> add
     |     +-    |     +- Op: Local variable access: out
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [Block] <<
     |     <<
     +- >> Proxy Statement: 
        +- switch() {
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [out.add] <<
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [out.add] <<
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [out.add] <<
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [Block] <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- default:
        +-   St: No operation
        +- }
        <<
  final public RUNSIGNEDSHIFT
  Params
  throws Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: &&
     |  |     +- Op: ==
     |  |     |  +- Op: >> Proxy Data Access [kind] <<
     |  |     |  |  +- Op: Method Call
     |  |     |  |     +- Op: >> Proxy Data Access [getToken] <<
     |  |     |  +- Op: >> Proxy Data Access [GT] <<
     |  |     +- Op: ==
     |  |        +- Op: >> Proxy Data Access [realKind] <<
     |  |        |  +- Op: cast Lcat.quadriga.parsers.tokens.MySimpleToken;
     |  |        |     +- Op: Method Call
     |  |        |        +- Op: >> Proxy Data Access [getToken] <<
     |  |        +- Op: >> Proxy Data Access [RUNSIGNEDSHIFT] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: Method Call
     |           |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |           +- >> Proxy Statement: 
     |              +- throw ;
     |              <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [jj_consume_token] <<
  final public RSIGNEDSHIFT
  Params
  throws Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: &&
     |  |     +- Op: ==
     |  |     |  +- Op: >> Proxy Data Access [kind] <<
     |  |     |  |  +- Op: Method Call
     |  |     |  |     +- Op: >> Proxy Data Access [getToken] <<
     |  |     |  +- Op: >> Proxy Data Access [GT] <<
     |  |     +- Op: ==
     |  |        +- Op: >> Proxy Data Access [realKind] <<
     |  |        |  +- Op: cast Lcat.quadriga.parsers.tokens.MySimpleToken;
     |  |        |     +- Op: Method Call
     |  |        |        +- Op: >> Proxy Data Access [getToken] <<
     |  |        +- Op: >> Proxy Data Access [RSIGNEDSHIFT] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: Method Call
     |           |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |           +- >> Proxy Statement: 
     |              +- throw ;
     |              <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [jj_consume_token] <<
  final public Annotation
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
        +- Condition:
        |  +- Op: Method Call
        |     +- Op: >> Proxy Data Access [jj_2_41] <<
        +- If Code:
        |  +- Block:
        |     +- Local Variables:
        |     +- Code:
        |        +- St: Method Call
        |           +- Op: >> Proxy Data Access [NormalAnnotation] <<
        +- Else Code:
           +- If Statement:
              +- Condition:
              |  +- Op: Method Call
              |     +- Op: >> Proxy Data Access [jj_2_42] <<
              +- If Code:
              |  +- Block:
              |     +- Local Variables:
              |     +- Code:
              |        +- St: Method Call
              |           +- Op: >> Proxy Data Access [SingleMemberAnnotation] <<
              +- Else Code:
                 +- Block:
                    +- Local Variables:
                    +- Code:
                       +- >> Proxy Statement: 
                          +- switch() {
                          +- case :
                          +-   St: Method Call
                          +-   +- Op: >> Proxy Data Access [MarkerAnnotation] <<
                          +-   >> Proxy Statement: 
                          +-   +- break;
                          +-   <<
                          +- default:
                          +-   St: Method Call
                          +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
                          +-   >> Proxy Statement: 
                          +-   +- throw ;
                          +-   <<
                          +- }
                          <<
  final public NormalAnnotation
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Name] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [MemberValuePairs] <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> add
           +- Op: Local variable access: out
  final public MarkerAnnotation
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: >> Proxy Data Access [Name] <<
  final public SingleMemberAnnotation
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [Name] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [MemberValue] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
        +- Op: Method:
           +- java.util.List -> add
           +- Op: Local variable access: out
  final public MemberValuePairs
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [MemberValuePair] <<
     +- LABEL: label_45
        +- >> Proxy Statement: 
           +- while( )
           +- Block:
           +- +- Local Variables:
           +- +- Code:
           +-    +- >> Proxy Statement: 
           +-    |  +- switch() {
           +-    |  +- case :
           +-    |  +-   St: No operation
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break;
           +-    |  +-   <<
           +-    |  +- default:
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break label_45;
           +-    |  +-   <<
           +-    |  +- }
           +-    |  <<
           +-    +- St: Method Call
           +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-       +- Op: >> Proxy Data Access [MemberValuePair] <<Block:
           +- +- Local Variables:
           +- +- Code:
           +-    +- >> Proxy Statement: 
           +-    |  +- switch() {
           +-    |  +- case :
           +-    |  +-   St: No operation
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break;
           +-    |  +-   <<
           +-    |  +- default:
           +-    |  +-   >> Proxy Statement: 
           +-    |  +-   +- break label_45;
           +-    |  +-   <<
           +-    |  +- }
           +-    |  <<
           +-    +- St: Method Call
           +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-    |  +- Op: Method:
           +-    |     +- java.util.List -> add
           +-    |     +- Op: Local variable access: out
           +-    +- St: Method Call
           +-       +- Op: >> Proxy Data Access [MemberValuePair] <<
           <<
  final public MemberValuePair
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: >> Proxy Data Access [MemberValue] <<
  final public MemberValue
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- >> Proxy Statement: 
        +- switch() {
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [Annotation] <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [MemberValueArrayInitializer] <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [ConditionalExpression] <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- default:
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   >> Proxy Statement: 
        +-   +- throw ;
        +-   <<
        +- }
        <<
  final public MemberValueArrayInitializer
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- >> Proxy Statement: 
     |  +- switch() {
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +- case :
     |  +-   St: Method Call
     |  +-   +- Op: >> Proxy Data Access [MemberValue] <<
     |  +-   LABEL: label_46
     |  +-   +- >> Proxy Statement: 
     |  +-      +- while( )
     |  +-      +- Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- If Statement:
     |  +-      +-    |  +- Condition:
     |  +-      +-    |  |  +- Op: Method Call
     |  +-      +-    |  |     +- Op: >> Proxy Data Access [jj_2_43] <<
     |  +-      +-    |  +- If Code:
     |  +-      +-    |  |  +- Block:
     |  +-      +-    |  |     +- Local Variables:
     |  +-      +-    |  |     +- Code:
     |  +-      +-    |  |        +- St: No operation
     |  +-      +-    |  +- Else Code:
     |  +-      +-    |     +- Block:
     |  +-      +-    |        +- Local Variables:
     |  +-      +-    |        +- Code:
     |  +-      +-    |           +- >> Proxy Statement: 
     |  +-      +-    |              +- break label_46;
     |  +-      +-    |              <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: >> Proxy Data Access [MemberValue] <<Block:
     |  +-      +- +- Local Variables:
     |  +-      +- +- Code:
     |  +-      +-    +- If Statement:
     |  +-      +-    |  +- Condition:
     |  +-      +-    |  |  +- Op: Method Call
     |  +-      +-    |  |     +- Op: >> Proxy Data Access [jj_2_43] <<
     |  +-      +-    |  +- If Code:
     |  +-      +-    |  |  +- Block:
     |  +-      +-    |  |     +- Local Variables:
     |  +-      +-    |  |     +- Code:
     |  +-      +-    |  |        +- St: No operation
     |  +-      +-    |  +- Else Code:
     |  +-      +-    |     +- Block:
     |  +-      +-    |        +- Local Variables:
     |  +-      +-    |        +- Code:
     |  +-      +-    |           +- >> Proxy Statement: 
     |  +-      +-    |              +- break label_46;
     |  +-      +-    |              <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-    |  +- Op: >> Proxy Data Access [out.add] <<
     |  +-      +-    +- St: Method Call
     |  +-      +-       +- Op: >> Proxy Data Access [MemberValue] <<
     |  +-      <<
     |  +-   >> Proxy Statement: 
     |  +-   +- switch() {
     |  +-   +- case :
     |  +-   +-   St: Method Call
     |  +-   +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
     |  +-   +-   >> Proxy Statement: 
     |  +-   +-   +- break;
     |  +-   +-   <<
     |  +-   +- default:
     |  +-   +-   St: No operation
     |  +-   +- }
     |  +-   <<
     |  +-   >> Proxy Statement: 
     |  +-   +- break;
     |  +-   <<
     |  +- default:
     |  +-   St: No operation
     |  +- }
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public AnnotationTypeDeclaration
  Params
  modifiers: I
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: =
     |  +- Op: Local variable access: t
     |  +- Op: Method Call
     |     +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: >> Proxy Data Access [AnnotationTypeBody] <<
  final public AnnotationTypeBody
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- LABEL: label_47
     |  +- >> Proxy Statement: 
     |     +- while( )
     |     +- Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_47;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [AnnotationTypeMemberDeclaration] <<Block:
     |     +- +- Local Variables:
     |     +- +- Code:
     |     +-    +- >> Proxy Statement: 
     |     +-    |  +- switch() {
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +- case :
     |     +-    |  +-   St: No operation
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break;
     |     +-    |  +-   <<
     |     +-    |  +- default:
     |     +-    |  +-   >> Proxy Statement: 
     |     +-    |  +-   +- break label_47;
     |     +-    |  +-   <<
     |     +-    |  +- }
     |     +-    |  <<
     |     +-    +- St: Method Call
     |     +-       +- Op: >> Proxy Data Access [AnnotationTypeMemberDeclaration] <<
     |     <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [out.add] <<
     +- St: Method Call
        +- Op: >> Proxy Data Access [out.add] <<
  final public AnnotationTypeMemberDeclaration
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ modifiers ] Type [ I ]
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- Statements:
     +- >> Proxy Statement: 
        +- switch() {
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +- case :
        +-   St: =
        +-   +- Op: Local variable access: modifiers
        +-   +- Op: Method Call
        +-      +- Op: >> Proxy Data Access [Modifiers] <<
        +-   If Statement:
        +-   +- Condition:
        +-   |  +- Op: Method Call
        +-   |     +- Op: >> Proxy Data Access [jj_2_44] <<
        +-   +- If Code:
        +-   |  +- Block:
        +-   |     +- Local Variables:
        +-   |     +- Code:
        +-   |        +- St: Method Call
        +-   |        |  +- Op: >> Proxy Data Access [Type] <<
        +-   |        +- St: =
        +-   |        |  +- Op: Local variable access: t
        +-   |        |  +- Op: Method Call
        +-   |        |     +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   |        +- St: Method Call
        +-   |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   |        +- St: Method Call
        +-   |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   |        +- St: Method Call
        +-   |        |  +- Op: Method:
        +-   |        |     +- java.util.List -> add
        +-   |        |     +- Op: Local variable access: out
        +-   |        +- St: Method Call
        +-   |        |  +- Op: Method:
        +-   |        |     +- java.util.List -> add
        +-   |        |     +- Op: Local variable access: out
        +-   |        +- St: Method Call
        +-   |        |  +- Op: Method:
        +-   |        |     +- java.util.List -> add
        +-   |        |     +- Op: Local variable access: out
        +-   |        +- >> Proxy Statement: 
        +-   |        |  +- switch() {
        +-   |        |  +- case :
        +-   |        |  +-   St: Method Call
        +-   |        |  +-   +- Op: >> Proxy Data Access [DefaultValue] <<
        +-   |        |  +-   >> Proxy Statement: 
        +-   |        |  +-   +- break;
        +-   |        |  +-   <<
        +-   |        |  +- default:
        +-   |        |  +-   St: No operation
        +-   |        |  +- }
        +-   |        |  <<
        +-   |        +- St: Method Call
        +-   |        |  +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   |        +- St: Method Call
        +-   |           +- Op: Method:
        +-   |              +- java.util.List -> add
        +-   |              +- Op: Local variable access: out
        +-   +- Else Code:
        +-      +- Block:
        +-         +- Local Variables:
        +-         +- Code:
        +-            +- >> Proxy Statement: 
        +-               +- switch() {
        +-               +- case :
        +-               +- case :
        +-               +-   St: Method Call
        +-               +-   +- Op: >> Proxy Data Access [ClassOrInterfaceDeclaration] <<
        +-               +-   >> Proxy Statement: 
        +-               +-   +- break;
        +-               +-   <<
        +-               +- case :
        +-               +-   St: Method Call
        +-               +-   +- Op: >> Proxy Data Access [EnumDeclaration] <<
        +-               +-   >> Proxy Statement: 
        +-               +-   +- break;
        +-               +-   <<
        +-               +- case :
        +-               +-   St: Method Call
        +-               +-   +- Op: >> Proxy Data Access [AnnotationTypeDeclaration] <<
        +-               +-   >> Proxy Statement: 
        +-               +-   +- break;
        +-               +-   <<
        +-               +- case :
        +-               +- case :
        +-               +- case :
        +-               +- case :
        +-               +- case :
        +-               +- case :
        +-               +- case :
        +-               +- case :
        +-               +- case :
        +-               +-   St: Method Call
        +-               +-   +- Op: >> Proxy Data Access [FieldDeclaration] <<
        +-               +-   >> Proxy Statement: 
        +-               +-   +- break;
        +-               +-   <<
        +-               +- default:
        +-               +-   St: Method Call
        +-               +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-               +-   >> Proxy Statement: 
        +-               +-   +- throw ;
        +-               +-   <<
        +-               +- }
        +-               <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- case :
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   >> Proxy Statement: 
        +-   +- break;
        +-   <<
        +- default:
        +-   St: Method Call
        +-   +- Op: >> Proxy Data Access [jj_consume_token] <<
        +-   >> Proxy Statement: 
        +-   +- throw ;
        +-   <<
        +- }
        <<
  final public DefaultValue
  Params
  out: Ljava.util.List;
  throws Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_consume_token] <<
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
     |  +- Op: Method:
     |     +- java.util.List -> add
     |     +- Op: Local variable access: out
     +- St: Method Call
        +- Op: >> Proxy Data Access [MemberValue] <<
  private Z jj_2_1
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_2
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_3
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_4
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_5
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_6
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_7
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_8
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_9
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_10
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_11
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_12
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_13
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_14
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_15
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_16
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_17
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_18
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_19
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_20
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_21
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_22
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_23
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_24
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_25
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_26
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_27
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_28
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_29
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_30
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_31
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_32
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_33
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_34
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_35
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_36
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_37
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_38
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_39
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_40
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_41
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_42
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_43
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_2_44
  Params
  xla: I
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  +- Op: Local variable access: xla
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- Op: =
     |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |     +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
        +- try 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       << catch() 
        +- Block:
        +- +- Local Variables:
        +- +- Code:
        +-    +- >> Proxy Statement: 
        +-       +- return ;
        +-       <<
        <<
  private Z jj_3R_348
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_301] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_113
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_112
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_347
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_297] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_111
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_110
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_346
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_170] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_109
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_108
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_191
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_212] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_107
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_44
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_350
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_359] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_167
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_106
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_190
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_211] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_105
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_104
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_189
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_210] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_103
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_188
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_209] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_70
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_103] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_104] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_105] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_106] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_3R_107] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_3R_108] <<
     |                                                              +- If Code:
     |                                                                 +- Block:
     |                                                                    +- Local Variables:
     |                                                                    +- Code:
     |                                                                       +- St: =
     |                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                       |  +- Op: Local variable access: xsp
     |                                                                       +- If Statement:
     |                                                                          +- Condition:
     |                                                                          |  +- Op: Method Call
     |                                                                          |     +- Op: >> Proxy Data Access [jj_3R_109] <<
     |                                                                          +- If Code:
     |                                                                             +- Block:
     |                                                                                +- Local Variables:
     |                                                                                +- Code:
     |                                                                                   +- St: =
     |                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                   +- If Statement:
     |                                                                                      +- Condition:
     |                                                                                      |  +- Op: Method Call
     |                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_110] <<
     |                                                                                      +- If Code:
     |                                                                                         +- Block:
     |                                                                                            +- Local Variables:
     |                                                                                            +- Code:
     |                                                                                               +- St: =
     |                                                                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                               |  +- Op: Local variable access: xsp
     |                                                                                               +- If Statement:
     |                                                                                                  +- Condition:
     |                                                                                                  |  +- Op: Method Call
     |                                                                                                  |     +- Op: >> Proxy Data Access [jj_3R_111] <<
     |                                                                                                  +- If Code:
     |                                                                                                     +- Block:
     |                                                                                                        +- Local Variables:
     |                                                                                                        +- Code:
     |                                                                                                           +- St: =
     |                                                                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                           |  +- Op: Local variable access: xsp
     |                                                                                                           +- If Statement:
     |                                                                                                              +- Condition:
     |                                                                                                              |  +- Op: Method Call
     |                                                                                                              |     +- Op: >> Proxy Data Access [jj_3R_112] <<
     |                                                                                                              +- If Code:
     |                                                                                                                 +- Block:
     |                                                                                                                    +- Local Variables:
     |                                                                                                                    +- Code:
     |                                                                                                                       +- St: =
     |                                                                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                       |  +- Op: Local variable access: xsp
     |                                                                                                                       +- If Statement:
     |                                                                                                                          +- Condition:
     |                                                                                                                          |  +- Op: Method Call
     |                                                                                                                          |     +- Op: >> Proxy Data Access [jj_3R_113] <<
     |                                                                                                                          +- If Code:
     |                                                                                                                             +- Block:
     |                                                                                                                                +- Local Variables:
     |                                                                                                                                +- Code:
     |                                                                                                                                   +- St: =
     |                                                                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                                                                   +- If Statement:
     |                                                                                                                                      +- Condition:
     |                                                                                                                                      |  +- Op: Method Call
     |                                                                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_114] <<
     |                                                                                                                                      +- If Code:
     |                                                                                                                                         +- >> Proxy Statement: 
     |                                                                                                                                            +- return ;
     |                                                                                                                                            <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_187
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_208] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_154
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_167] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_167] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_186
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_207] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_345
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_350] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_185
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_206] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_184
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_205] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_341
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_345] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_346] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_347] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_348] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_3R_349] <<
     |                                                  +- If Code:
     |                                                     +- >> Proxy Statement: 
     |                                                        +- return ;
     |                                                        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_336
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_341] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_183
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_204] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_147
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_154] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_182
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_203] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_181
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_202] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_180
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_201] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_179
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_200] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_134
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_147] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_178
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_92] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_328
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_336] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_177
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_199] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_17
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_70] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_37
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_83] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_71
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_115] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_17] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_169
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_37] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_177] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_178] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_179] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_3R_180] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_3R_181] <<
     |                                                              +- If Code:
     |                                                                 +- Block:
     |                                                                    +- Local Variables:
     |                                                                    +- Code:
     |                                                                       +- St: =
     |                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                       |  +- Op: Local variable access: xsp
     |                                                                       +- If Statement:
     |                                                                          +- Condition:
     |                                                                          |  +- Op: Method Call
     |                                                                          |     +- Op: >> Proxy Data Access [jj_3R_182] <<
     |                                                                          +- If Code:
     |                                                                             +- Block:
     |                                                                                +- Local Variables:
     |                                                                                +- Code:
     |                                                                                   +- St: =
     |                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                   +- If Statement:
     |                                                                                      +- Condition:
     |                                                                                      |  +- Op: Method Call
     |                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_183] <<
     |                                                                                      +- If Code:
     |                                                                                         +- Block:
     |                                                                                            +- Local Variables:
     |                                                                                            +- Code:
     |                                                                                               +- St: =
     |                                                                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                               |  +- Op: Local variable access: xsp
     |                                                                                               +- If Statement:
     |                                                                                                  +- Condition:
     |                                                                                                  |  +- Op: Method Call
     |                                                                                                  |     +- Op: >> Proxy Data Access [jj_3R_184] <<
     |                                                                                                  +- If Code:
     |                                                                                                     +- Block:
     |                                                                                                        +- Local Variables:
     |                                                                                                        +- Code:
     |                                                                                                           +- St: =
     |                                                                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                           |  +- Op: Local variable access: xsp
     |                                                                                                           +- If Statement:
     |                                                                                                              +- Condition:
     |                                                                                                              |  +- Op: Method Call
     |                                                                                                              |     +- Op: >> Proxy Data Access [jj_3R_185] <<
     |                                                                                                              +- If Code:
     |                                                                                                                 +- Block:
     |                                                                                                                    +- Local Variables:
     |                                                                                                                    +- Code:
     |                                                                                                                       +- St: =
     |                                                                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                       |  +- Op: Local variable access: xsp
     |                                                                                                                       +- If Statement:
     |                                                                                                                          +- Condition:
     |                                                                                                                          |  +- Op: Method Call
     |                                                                                                                          |     +- Op: >> Proxy Data Access [jj_3R_186] <<
     |                                                                                                                          +- If Code:
     |                                                                                                                             +- Block:
     |                                                                                                                                +- Local Variables:
     |                                                                                                                                +- Code:
     |                                                                                                                                   +- St: =
     |                                                                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                                                                   +- If Statement:
     |                                                                                                                                      +- Condition:
     |                                                                                                                                      |  +- Op: Method Call
     |                                                                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_187] <<
     |                                                                                                                                      +- If Code:
     |                                                                                                                                         +- Block:
     |                                                                                                                                            +- Local Variables:
     |                                                                                                                                            +- Code:
     |                                                                                                                                               +- St: =
     |                                                                                                                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                                               |  +- Op: Local variable access: xsp
     |                                                                                                                                               +- If Statement:
     |                                                                                                                                                  +- Condition:
     |                                                                                                                                                  |  +- Op: Method Call
     |                                                                                                                                                  |     +- Op: >> Proxy Data Access [jj_3R_188] <<
     |                                                                                                                                                  +- If Code:
     |                                                                                                                                                     +- Block:
     |                                                                                                                                                        +- Local Variables:
     |                                                                                                                                                        +- Code:
     |                                                                                                                                                           +- St: =
     |                                                                                                                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                                                           |  +- Op: Local variable access: xsp
     |                                                                                                                                                           +- If Statement:
     |                                                                                                                                                              +- Condition:
     |                                                                                                                                                              |  +- Op: Method Call
     |                                                                                                                                                              |     +- Op: >> Proxy Data Access [jj_3R_189] <<
     |                                                                                                                                                              +- If Code:
     |                                                                                                                                                                 +- Block:
     |                                                                                                                                                                    +- Local Variables:
     |                                                                                                                                                                    +- Code:
     |                                                                                                                                                                       +- St: =
     |                                                                                                                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                                                                       |  +- Op: Local variable access: xsp
     |                                                                                                                                                                       +- If Statement:
     |                                                                                                                                                                          +- Condition:
     |                                                                                                                                                                          |  +- Op: Method Call
     |                                                                                                                                                                          |     +- Op: >> Proxy Data Access [jj_3R_190] <<
     |                                                                                                                                                                          +- If Code:
     |                                                                                                                                                                             +- Block:
     |                                                                                                                                                                                +- Local Variables:
     |                                                                                                                                                                                +- Code:
     |                                                                                                                                                                                   +- St: =
     |                                                                                                                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                                                                                                                   +- If Statement:
     |                                                                                                                                                                                      +- Condition:
     |                                                                                                                                                                                      |  +- Op: Method Call
     |                                                                                                                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_191] <<
     |                                                                                                                                                                                      +- If Code:
     |                                                                                                                                                                                         +- >> Proxy Statement: 
     |                                                                                                                                                                                            +- return ;
     |                                                                                                                                                                                            <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_319
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_328] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_328] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_135
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_134] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_89
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_134] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_135] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_135] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_301
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_319] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_285
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_283
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_285] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_285] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_285] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_137] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_338
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_286] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_337
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_99] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_35
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_61
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_337] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_338] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_334
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_85] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_34
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_325
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_85] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_334] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_334] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_36
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_34] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_34] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_34] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_35] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_35] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_43
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_87] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_279
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_36] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_283] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_198
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_87] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_43] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_43] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_331
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_289] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_284
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_286] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_323
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_331] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_331] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_282
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_99] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_284] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_281
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_279] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_143
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_198] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_16
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_3
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_61] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_280
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_69] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_130
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_115] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_322
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_61] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_3] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_3] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_85
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_16] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_16] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_129
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_143] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_128
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_88] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_87
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_128] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_129] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_130] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_127
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_280] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_281] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: >> Proxy Data Access [xsp] <<
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_282] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_306
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_322] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_323] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_126
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_33
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_76] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_279] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_175
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_87] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_305
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_321] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_125
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_81
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_33] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_127] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_80
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_125] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_126] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_297
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_305] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_306] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_176
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_175] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_166
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_175] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_176] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_176] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_158
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_150
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_158] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_158] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_138
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_150] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_330
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_99
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_138] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_321
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_330] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_330] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_145
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_85] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_87] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_76
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                                              +- If Code:
     |                                                                 +- Block:
     |                                                                    +- Local Variables:
     |                                                                    +- Code:
     |                                                                       +- St: =
     |                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                       |  +- Op: Local variable access: xsp
     |                                                                       +- If Statement:
     |                                                                          +- Condition:
     |                                                                          |  +- Op: Method Call
     |                                                                          |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                                                          +- If Code:
     |                                                                             +- Block:
     |                                                                                +- Local Variables:
     |                                                                                +- Code:
     |                                                                                   +- St: =
     |                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                   +- If Statement:
     |                                                                                      +- Condition:
     |                                                                                      |  +- Op: Method Call
     |                                                                                      |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                                                                      +- If Code:
     |                                                                                         +- >> Proxy Statement: 
     |                                                                                            +- return ;
     |                                                                                            <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_174
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_146
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_85] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_329
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_86
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_214
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_68] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_153
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_166] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_213
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_68] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_320
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_329] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_329] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_193
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_213] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_214] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_197
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_196
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_42
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_85] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_304
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_321] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_173
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_196] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_197] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_144
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_85] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_153] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_303
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_320] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_192
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_171
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_193] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_41
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_85] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_86] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_302
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_89] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_133
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_146] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_140
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_171] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_139
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_68] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_132
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_145] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_165
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_174] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_102
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_139] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_140] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_164
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_173] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_131
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_144] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_116
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_88
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_131] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_132] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_133] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_170
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_192] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_302] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_303] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_304] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_286] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_163
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_117
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_162
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_149
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_102] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_73
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lookingAhead] <<
     |  +- Op: Literal
     |     +- Boolean: true
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_semLA] <<
     |  +- Op: &&
     |     +- Op: ==
     |     |  +- Op: >> Proxy Data Access [kind] <<
     |     |  |  +- Op: Method Call
     |     |  |     +- Op: >> Proxy Data Access [getToken] <<
     |     |  +- Op: >> Proxy Data Access [GT] <<
     |     +- Op: ==
     |        +- Op: >> Proxy Data Access [realKind] <<
     |        |  +- Op: cast Lcat.quadriga.parsers.tokens.MySimpleToken;
     |        |     +- Op: Method Call
     |        |        +- Op: >> Proxy Data Access [getToken] <<
     |        +- Op: >> Proxy Data Access [RSIGNEDSHIFT] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lookingAhead] <<
     |  +- Op: Literal
     |     +- Boolean: false
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: ||
     |  |     +- Op: !
     |  |     |  +- Op: >> Proxy Data Access [jj_semLA] <<
     |  |     +- Op: Method Call
     |  |        +- Op: >> Proxy Data Access [jj_3R_116] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_161
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_69
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_102] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_149] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_149] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_160
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_74
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lookingAhead] <<
     |  +- Op: Literal
     |     +- Boolean: true
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_semLA] <<
     |  +- Op: &&
     |     +- Op: ==
     |     |  +- Op: >> Proxy Data Access [kind] <<
     |     |  |  +- Op: Method Call
     |     |  |     +- Op: >> Proxy Data Access [getToken] <<
     |     |  +- Op: >> Proxy Data Access [GT] <<
     |     +- Op: ==
     |        +- Op: >> Proxy Data Access [realKind] <<
     |        |  +- Op: cast Lcat.quadriga.parsers.tokens.MySimpleToken;
     |        |     +- Op: Method Call
     |        |        +- Op: >> Proxy Data Access [getToken] <<
     |        +- Op: >> Proxy Data Access [RUNSIGNEDSHIFT] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_lookingAhead] <<
     |  +- Op: Literal
     |     +- Boolean: false
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: ||
     |  |     +- Op: !
     |  |     |  +- Op: >> Proxy Data Access [jj_semLA] <<
     |  |     +- Op: Method Call
     |  |        +- Op: >> Proxy Data Access [jj_3R_117] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_152
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_160] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_161] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_162] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_163] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_3R_164] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_3R_165] <<
     |                                                              +- If Code:
     |                                                                 +- >> Proxy Statement: 
     |                                                                    +- return ;
     |                                                                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_358
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_92] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_124
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_99] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_60
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_88] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_123
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_59
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_357
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_332] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_92] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_15
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_69] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_58
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_122
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_212
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_92] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_357] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_357] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_358] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_14
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_15] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_57
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_32
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_82] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_13
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_69] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_30
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_56
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_79
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_13] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_14] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_14] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_31
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_81] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_29
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_55
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_121
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_211
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_92] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_54
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_120
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_12
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_101
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_12] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_12] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_77
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_120] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_121] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3_31] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3_32] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_3R_122] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_3R_123] <<
     |                                                              +- If Code:
     |                                                                 +- Block:
     |                                                                    +- Local Variables:
     |                                                                    +- Code:
     |                                                                       +- St: =
     |                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                       |  +- Op: Local variable access: xsp
     |                                                                       +- If Statement:
     |                                                                          +- Condition:
     |                                                                          |  +- Op: Method Call
     |                                                                          |     +- Op: >> Proxy Data Access [jj_3R_124] <<
     |                                                                          +- If Code:
     |                                                                             +- >> Proxy Statement: 
     |                                                                                +- return ;
     |                                                                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_53
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_210
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_11
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_100
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_76] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_11] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_11] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_11] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_52
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_356
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_68
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_100] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_101] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_28
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_80] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_51
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_209
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_356] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_238
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_85] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_50
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_90
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_76] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_10
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_68] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_237
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_80] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_27
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_63
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_10] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_90] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_49
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_236
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_81] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_235
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_2
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_49] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_50] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_51] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_52] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_3R_53] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_3R_54] <<
     |                                                              +- If Code:
     |                                                                 +- Block:
     |                                                                    +- Local Variables:
     |                                                                    +- Code:
     |                                                                       +- St: =
     |                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                       |  +- Op: Local variable access: xsp
     |                                                                       +- If Statement:
     |                                                                          +- Condition:
     |                                                                          |  +- Op: Method Call
     |                                                                          |     +- Op: >> Proxy Data Access [jj_3R_55] <<
     |                                                                          +- If Code:
     |                                                                             +- Block:
     |                                                                                +- Local Variables:
     |                                                                                +- Code:
     |                                                                                   +- St: =
     |                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                   +- If Statement:
     |                                                                                      +- Condition:
     |                                                                                      |  +- Op: Method Call
     |                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_56] <<
     |                                                                                      +- If Code:
     |                                                                                         +- Block:
     |                                                                                            +- Local Variables:
     |                                                                                            +- Code:
     |                                                                                               +- St: =
     |                                                                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                               |  +- Op: Local variable access: xsp
     |                                                                                               +- If Statement:
     |                                                                                                  +- Condition:
     |                                                                                                  |  +- Op: Method Call
     |                                                                                                  |     +- Op: >> Proxy Data Access [jj_3R_57] <<
     |                                                                                                  +- If Code:
     |                                                                                                     +- Block:
     |                                                                                                        +- Local Variables:
     |                                                                                                        +- Code:
     |                                                                                                           +- St: =
     |                                                                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                           |  +- Op: Local variable access: xsp
     |                                                                                                           +- If Statement:
     |                                                                                                              +- Condition:
     |                                                                                                              |  +- Op: Method Call
     |                                                                                                              |     +- Op: >> Proxy Data Access [jj_3R_58] <<
     |                                                                                                              +- If Code:
     |                                                                                                                 +- Block:
     |                                                                                                                    +- Local Variables:
     |                                                                                                                    +- Code:
     |                                                                                                                       +- St: =
     |                                                                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                       |  +- Op: Local variable access: xsp
     |                                                                                                                       +- If Statement:
     |                                                                                                                          +- Condition:
     |                                                                                                                          |  +- Op: Method Call
     |                                                                                                                          |     +- Op: >> Proxy Data Access [jj_3R_59] <<
     |                                                                                                                          +- If Code:
     |                                                                                                                             +- Block:
     |                                                                                                                                +- Local Variables:
     |                                                                                                                                +- Code:
     |                                                                                                                                   +- St: =
     |                                                                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                                                                   +- If Statement:
     |                                                                                                                                      +- Condition:
     |                                                                                                                                      |  +- Op: Method Call
     |                                                                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_60] <<
     |                                                                                                                                      +- If Code:
     |                                                                                                                                         +- >> Proxy Statement: 
     |                                                                                                                                            +- return ;
     |                                                                                                                                            <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_208
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_84
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_2] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_2] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_234
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_79] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_91
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_65
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_91] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_92] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_233
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_207
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_78
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_26
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_78] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_78] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_371
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_374] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_98
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_241
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_97
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_96
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_69] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_232
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_241] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_241] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_231
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_152] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_9
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_142
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_152] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_228
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_231] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_232] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_233] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_234] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_3R_235] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_3R_236] <<
     |                                                              +- If Code:
     |                                                                 +- Block:
     |                                                                    +- Local Variables:
     |                                                                    +- Code:
     |                                                                       +- St: =
     |                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                       |  +- Op: Local variable access: xsp
     |                                                                       +- If Statement:
     |                                                                          +- Condition:
     |                                                                          |  +- Op: Method Call
     |                                                                          |     +- Op: >> Proxy Data Access [jj_3R_237] <<
     |                                                                          +- If Code:
     |                                                                             +- Block:
     |                                                                                +- Local Variables:
     |                                                                                +- Code:
     |                                                                                   +- St: =
     |                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                   +- If Statement:
     |                                                                                      +- Condition:
     |                                                                                      |  +- Op: Method Call
     |                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_238] <<
     |                                                                                      +- If Code:
     |                                                                                         +- >> Proxy Statement: 
     |                                                                                            +- return ;
     |                                                                                            <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_375
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_201] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_95
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_67
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_95] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_95] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_9] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_96] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_97] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: >> Proxy Data Access [xsp] <<
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_98] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_99] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_278
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_374
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_201] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_375] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_375] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_40
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_82
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_69] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_373
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_374] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_372
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_168] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_8
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_67] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_370
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_372] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_373] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_25
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_77] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_223
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_228] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_25] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_25] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_311
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_148] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_24
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_76] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_310
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_67] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_367
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_371] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_275
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_259] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_48
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_88] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_366
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_1
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_48] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_48] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_274
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_247] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_269
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_274] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_275] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_365
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_370] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_309
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_325] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_355
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_365] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_366] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_367] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_39
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_354
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_277
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_276
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_277] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_278] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_270
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_223] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_276] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_23
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_206
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_354] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_355] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_169] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_307
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_89] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_298
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_307] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_308] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_309] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_310] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_311] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_311] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: >> Proxy Data Access [xsp] <<
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_119
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                                              +- If Code:
     |                                                                 +- Block:
     |                                                                    +- Local Variables:
     |                                                                    +- Code:
     |                                                                       +- St: =
     |                                                                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                       |  +- Op: Local variable access: xsp
     |                                                                       +- If Statement:
     |                                                                          +- Condition:
     |                                                                          |  +- Op: Method Call
     |                                                                          |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                                                                          +- If Code:
     |                                                                             +- Block:
     |                                                                                +- Local Variables:
     |                                                                                +- Code:
     |                                                                                   +- St: =
     |                                                                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                                                   |  +- Op: Local variable access: xsp
     |                                                                                   +- If Statement:
     |                                                                                      +- Condition:
     |                                                                                      |  +- Op: Method Call
     |                                                                                      |     +- Op: >> Proxy Data Access [jj_3R_142] <<
     |                                                                                      +- If Code:
     |                                                                                         +- >> Proxy Statement: 
     |                                                                                            +- return ;
     |                                                                                            <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_118
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_75
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_22] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_118] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_119] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_22
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_76] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_21
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_75] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_263
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_270] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_205
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_169] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_262
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_269] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_340
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_268
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_267
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_261
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_267] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_268] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_247] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_344
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_88] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_259
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_261] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_262] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_263] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_343
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_339
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_343] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_344] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_332
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_339] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_340] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_326] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_204
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_169] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_227
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_223] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_353
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_169] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_333
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_332] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_226
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_223] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_324
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_332] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_333] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_333] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_308
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_324] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_203
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_169] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_353] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_252
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_259] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_251
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_227] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_250
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_226] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_258
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_257
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_249
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_257] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_258] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_247] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_247
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_249] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_250] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_251] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_252] <<
     |                                      +- If Code:
     |                                         +- >> Proxy Statement: 
     |                                            +- return ;
     |                                            <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_369
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_368
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_363
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_368] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_369] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_273
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_272
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_271
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_264
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_271] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_272] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_273] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_247] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_315
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_308] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_243
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_247] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_264] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_264] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_364
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_148] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_318
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_266
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_265
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_317
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_92] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_352
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_363] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_364] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_364] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_260
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_265] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_266] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_243] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_240
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_243] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_260] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_260] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_316
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_325] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_202
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_352] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_352] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_314
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_89] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_300
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_314] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_80] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_315] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_316] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_317] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: >> Proxy Data Access [xsp] <<
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_318] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_20
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_74] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_19
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_73] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_72
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_18
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_72] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3_19] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3_20] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_240] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_362
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_230
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_240] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_18] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_18] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_361
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_70] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_360
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_7
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_66] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_256
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_255
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_254
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_218
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_223] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_360] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_361] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_362] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_253
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_248
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_253] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_254] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_255] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_256] <<
     |                                      +- If Code:
     |                                         +- >> Proxy Statement: 
     |                                            +- return ;
     |                                            <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_230] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_287
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_66] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_7] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3_7] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_222
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_227] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_221
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_226] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_137
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_287] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [xsp] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_225
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_230] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_248] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_248] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_217
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_221] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_222] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_201
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_217] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_218] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_94
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_93
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_137] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_66
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_93] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_94] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_244
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_220
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_225] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_244] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_200
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_335
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_246
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_245
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_326
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_335] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_335] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_242
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_245] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_246] <<
     |              +- If Code:
     |                 +- >> Proxy Statement: 
     |                    +- return ;
     |                    <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_220] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_342
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_312] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_216
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_220] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_242] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_242] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_168
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_312] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_342] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_342] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_327
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_66] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_239
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_216] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_195
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_216] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_239] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_239] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_38
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_157
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_170] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_156
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_169] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_312
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_326] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_327] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_155
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_168] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_64
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_229
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_195] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_148
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_155] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_156] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_157] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_172
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_195] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_229] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_229] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_313
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_312] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_224
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_172] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_299
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_312] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_313] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_313] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_159
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_172] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_224] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_224] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_5
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_63] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_64] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_64] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- St: =
     |  +- Op: >> Proxy Data Access [xsp] <<
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: >> Proxy Data Access [xsp] <<
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: >> Proxy Data Access [xsp] <<
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_62
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_89] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_4
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_62] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_136
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_148] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_296
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_301] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_295
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_300] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_294
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_299] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_92
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_136] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_136] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_293
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_298] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_219
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_159] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_292
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_297] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_151
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_159] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_219] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_219] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_291
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_170] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_290
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_84] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_291] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_292] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_3R_293] <<
     |                          +- If Code:
     |                             +- Block:
     |                                +- Local Variables:
     |                                +- Code:
     |                                   +- St: =
     |                                   |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                   |  +- Op: Local variable access: xsp
     |                                   +- If Statement:
     |                                      +- Condition:
     |                                      |  +- Op: Method Call
     |                                      |     +- Op: >> Proxy Data Access [jj_3R_294] <<
     |                                      +- If Code:
     |                                         +- Block:
     |                                            +- Local Variables:
     |                                            +- Code:
     |                                               +- St: =
     |                                               |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                               |  +- Op: Local variable access: xsp
     |                                               +- If Statement:
     |                                                  +- Condition:
     |                                                  |  +- Op: Method Call
     |                                                  |     +- Op: >> Proxy Data Access [jj_3R_295] <<
     |                                                  +- If Code:
     |                                                     +- Block:
     |                                                        +- Local Variables:
     |                                                        +- Code:
     |                                                           +- St: =
     |                                                           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                                                           |  +- Op: Local variable access: xsp
     |                                                           +- If Statement:
     |                                                              +- Condition:
     |                                                              |  +- Op: Method Call
     |                                                              |     +- Op: >> Proxy Data Access [jj_3R_296] <<
     |                                                              +- If Code:
     |                                                                 +- >> Proxy Statement: 
     |                                                                    +- return ;
     |                                                                    <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_83
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_169] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3_6
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_65] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_215
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_151] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_289
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3_6] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |           |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |           |  +- Op: Local variable access: xsp
     |           +- If Statement:
     |              +- Condition:
     |              |  +- Op: Method Call
     |              |     +- Op: >> Proxy Data Access [jj_3R_290] <<
     |              +- If Code:
     |                 +- Block:
     |                    +- Local Variables:
     |                    +- Code:
     |                       +- St: =
     |                       |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |                       |  +- Op: Local variable access: xsp
     |                       +- If Statement:
     |                          +- Condition:
     |                          |  +- Op: Method Call
     |                          |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |                          +- If Code:
     |                             +- >> Proxy Statement: 
     |                                +- return ;
     |                                <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_141
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_151] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_215] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_215] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_351
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_194
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_115
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_141] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_194] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_288
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_289] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_359
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_87] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_199
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_71] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- St: =
     |  +- Op: Local variable access: xsp
     |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_351] <<
     |  +- If Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: Local variable access: xsp
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_286
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ xsp ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- Statements:
     +- >> Proxy Statement: 
     |  +- while( )
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_288] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: =
     |  +-    |  +- Op: Local variable access: xsp
     |  +-    |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: Method Call
     |  +-       |     +- Op: >> Proxy Data Access [jj_3R_288] <<
     |  +-       +- If Code:
     |  +-          +- Block:
     |  +-             +- Local Variables:
     |  +-             +- Code:
     |  +-                +- St: =
     |  +-                |  +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  +-                |  +- Op: Local variable access: xsp
     |  +-                +- >> Proxy Statement: 
     |  +-                   +- break;
     |  +-                   <<
     |  <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_349
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_3R_299] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private Z jj_3R_114
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: Method Call
     |  |     +- Op: >> Proxy Data Access [jj_scan_token] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  public Lcat.quadriga.parsers.QuadrigaSimpleTokenManager; ;
  Lcat.quadriga.parsers.JavaCharStream; ;
  public Lcat.quadriga.parsers.Token; ;
  public Lcat.quadriga.parsers.Token; ;
  private I ;
  private Lcat.quadriga.parsers.Token; ;
  private I ;
  private Z ;
  private Z ;
  public QuadrigaSimple
  Params
  stream: Ljava.io.InputStream;
  {
    this(, );
  }
  public QuadrigaSimple
  Params
  stream: Ljava.io.InputStream;
  encoding: Ljava.lang.String;
  {
    >> Proxy Statement: 
    +- try 
    +- Block:
    +- +- Local Variables:
    +- +- Code:
    +-    +- St: =
    +-       +- Op: >> Proxy Data Access [jj_input_stream] <<
    +-       +- Op: >> proxy [ new something ] catch() 
    +- Block:
    +- +- Local Variables:
    +- +- Code:
    +-    +- >> Proxy Statement: 
    +-       +- throw ;
    +-       <<
    <<St: =
    +- Op: >> Proxy Data Access [token_source] <<
    +- Op: >> proxy [ new something ]St: =
    +- Op: >> Proxy Data Access [token] <<
    +- Op: >> proxy [ new something ]St: =
    +- Op: >> Proxy Data Access [jj_ntk] <<
    +- Op: -
       +- Op: Literal
          +- Integer: 1
  }
  public ReInit
  Params
  stream: Ljava.io.InputStream;
  Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
        +- Op: >> Proxy Data Access [ReInit] <<
  public ReInit
  Params
  stream: Ljava.io.InputStream;
  encoding: Ljava.lang.String;
  Block:
  +- Local Variables:
  +- Code:
     +- >> Proxy Statement: 
     |  +- try 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- St: Method Call
     |  +-       +- Op: >> Proxy Data Access [jj_input_stream.ReInit] << catch() 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- >> Proxy Statement: 
     |  +-       +- throw ;
     |  +-       <<
     |  <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [token_source.ReInit] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [token] <<
     |  +- Op: >> proxy [ new something ]
     +- St: =
        +- Op: >> Proxy Data Access [jj_ntk] <<
        +- Op: -
           +- Op: Literal
              +- Integer: 1
  public QuadrigaSimple
  Params
  stream: Ljava.io.Reader;
  {
    St: =
    +- Op: >> Proxy Data Access [jj_input_stream] <<
    +- Op: >> proxy [ new something ]St: =
    +- Op: >> Proxy Data Access [token_source] <<
    +- Op: >> proxy [ new something ]St: =
    +- Op: >> Proxy Data Access [token] <<
    +- Op: >> proxy [ new something ]St: =
    +- Op: >> Proxy Data Access [jj_ntk] <<
    +- Op: -
       +- Op: Literal
          +- Integer: 1
  }
  public ReInit
  Params
  stream: Ljava.io.Reader;
  Block:
  +- Local Variables:
  +- Code:
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [jj_input_stream.ReInit] <<
     +- St: Method Call
     |  +- Op: >> Proxy Data Access [token_source.ReInit] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [token] <<
     |  +- Op: >> proxy [ new something ]
     +- St: =
        +- Op: >> Proxy Data Access [jj_ntk] <<
        +- Op: -
           +- Op: Literal
              +- Integer: 1
  public QuadrigaSimple
  Params
  tm: Lcat.quadriga.parsers.QuadrigaSimpleTokenManager;
  {
    St: =
    +- Op: >> Proxy Data Access [token_source] <<
    +- Op: Local variable access: tmSt: =
    +- Op: >> Proxy Data Access [token] <<
    +- Op: >> proxy [ new something ]St: =
    +- Op: >> Proxy Data Access [jj_ntk] <<
    +- Op: -
       +- Op: Literal
          +- Integer: 1
  }
  public ReInit
  Params
  tm: Lcat.quadriga.parsers.QuadrigaSimpleTokenManager;
  Block:
  +- Local Variables:
  +- Code:
     +- St: =
     |  +- Op: >> Proxy Data Access [token_source] <<
     |  +- Op: Local variable access: tm
     +- St: =
     |  +- Op: >> Proxy Data Access [token] <<
     |  +- Op: >> proxy [ new something ]
     +- St: =
        +- Op: >> Proxy Data Access [jj_ntk] <<
        +- Op: -
           +- Op: Literal
              +- Integer: 1
  private Lcat.quadriga.parsers.Token; jj_consume_token
  Params
  kind: I
  throws Block:
  +- Local Variables:
  |  +- Symbol Var [ oldToken ] Type [ Lcat.quadriga.parsers.Token; ]
  +- Code:
     +- Statements:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: >> Proxy Data Access [next] <<
     |  |     |  +- Op: =
     |  |     |     +- Op: Local variable access: oldToken
     |  |     |     +- Op: >> Proxy Data Access [token] <<
     |  |     +- Op: Literal
     |  |        +- Null
     |  +- If Code:
     |  |  +- St: =
     |  |     +- Op: >> Proxy Data Access [token] <<
     |  |     +- Op: >> Proxy Data Access [token.next] <<
     |  +- Else Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [token] <<
     |        +- Op: =
     |           +- Op: >> Proxy Data Access [token.next] <<
     |           +- Op: Method Call
     |              +- Op: >> Proxy Data Access [token_source.getNextToken] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_ntk] <<
     |  +- Op: -
     |     +- Op: Literal
     |        +- Integer: 1
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: ==
     |  |     +- Op: >> Proxy Data Access [token.kind] <<
     |  |     +- Op: >> Proxy Data Access [kind] <<
     |  +- If Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- >> Proxy Statement: 
     |              +- return ;
     |              <<
     +- St: =
     |  +- Op: >> Proxy Data Access [token] <<
     |  +- Op: >> Proxy Data Access [oldToken] <<
     +- >> Proxy Statement: 
        +- throw ;
        <<
  static private final class LookaheadSuccess extends {
    
  }
  
  final private #unknown LookaheadSuccess # ;
  private Z jj_scan_token
  Params
  kind: I
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: ==
     |  |     +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  |     +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- If Code:
     |  |  +- Block:
     |  |     +- Local Variables:
     |  |     +- Code:
     |  |        +- St: ++X
     |  |        |  +- Op: >> Proxy Data Access [jj_la] <<
     |  |        +- If Statement:
     |  |           +- Condition:
     |  |           |  +- Op: ==
     |  |           |     +- Op: >> Proxy Data Access [jj_scanpos.next] <<
     |  |           |     +- Op: Literal
     |  |           |        +- Null
     |  |           +- If Code:
     |  |           |  +- Block:
     |  |           |     +- Local Variables:
     |  |           |     +- Code:
     |  |           |        +- St: =
     |  |           |           +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  |           |           +- Op: =
     |  |           |              +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  |           |              +- Op: =
     |  |           |                 +- Op: >> Proxy Data Access [jj_scanpos.next] <<
     |  |           |                 +- Op: Method Call
     |  |           |                    +- Op: >> Proxy Data Access [token_source.getNextToken] <<
     |  |           +- Else Code:
     |  |              +- Block:
     |  |                 +- Local Variables:
     |  |                 +- Code:
     |  |                    +- St: =
     |  |                       +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  |                       +- Op: =
     |  |                          +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  |                          +- Op: >> Proxy Data Access [jj_scanpos.next] <<
     |  +- Else Code:
     |     +- Block:
     |        +- Local Variables:
     |        +- Code:
     |           +- St: =
     |              +- Op: >> Proxy Data Access [jj_scanpos] <<
     |              +- Op: >> Proxy Data Access [jj_scanpos.next] <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: >> Proxy Data Access [jj_scanpos.kind] <<
     |  |     +- Op: >> Proxy Data Access [kind] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- return ;
     |        <<
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: &&
     |  |     +- Op: ==
     |  |     |  +- Op: >> Proxy Data Access [jj_la] <<
     |  |     |  +- Op: Literal
     |  |     |     +- Integer: 0
     |  |     +- Op: ==
     |  |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |  |        +- Op: >> Proxy Data Access [jj_lastpos] <<
     |  +- If Code:
     |     +- >> Proxy Statement: 
     |        +- throw ;
     |        <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  final public Lcat.quadriga.parsers.Token; getNextToken
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
     |  +- Condition:
     |  |  +- Op: !=
     |  |     +- Op: >> Proxy Data Access [token.next] <<
     |  |     +- Op: Literal
     |  |        +- Null
     |  +- If Code:
     |  |  +- St: =
     |  |     +- Op: >> Proxy Data Access [token] <<
     |  |     +- Op: >> Proxy Data Access [token.next] <<
     |  +- Else Code:
     |     +- St: =
     |        +- Op: >> Proxy Data Access [token] <<
     |        +- Op: =
     |           +- Op: >> Proxy Data Access [token.next] <<
     |           +- Op: Method Call
     |              +- Op: >> Proxy Data Access [token_source.getNextToken] <<
     +- St: =
     |  +- Op: >> Proxy Data Access [jj_ntk] <<
     |  +- Op: -
     |     +- Op: Literal
     |        +- Integer: 1
     +- >> Proxy Statement: 
        +- return ;
        <<
  final public Lcat.quadriga.parsers.Token; getToken
  Params
  index: I
  Block:
  +- Local Variables:
  |  +- Symbol Var [ t ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ i ] Type [ I ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: t
     |     +- Op: ?
     |        +- Op: >> Proxy Data Access [jj_lookingAhead] <<
     |        +- Op: >> Proxy Data Access [jj_scanpos] <<
     |        +- Op: >> Proxy Data Access [token] <<
     +- >> Proxy Statement: 
     |  +- for( Statements:
     |  +- +- St: =
     |  +-    +- Op: Local variable access: i
     |  +-    +- Op: Literal
     |  +-       +- Integer: 0; ; Statements:
     |  +- +- St: ++X
     |  +-    +- Op: Local variable access: i) 
     |  +- Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: !=
     |  +-       |     +- Op: Field:
     |  +-       |     |  +- cat.quadriga.parsers.Token -> next
     |  +-       |     |  +- Op: Local variable access: t
     |  +-       |     +- Op: Literal
     |  +-       |        +- Null
     |  +-       +- If Code:
     |  +-       |  +- St: =
     |  +-       |     +- Op: Local variable access: t
     |  +-       |     +- Op: Field:
     |  +-       |        +- cat.quadriga.parsers.Token -> next
     |  +-       |        +- Op: Local variable access: t
     |  +-       +- Else Code:
     |  +-          +- St: =
     |  +-             +- Op: >> Proxy Data Access [t] <<
     |  +-             +- Op: =
     |  +-                +- Op: >> Proxy Data Access [t.next] <<
     |  +-                +- Op: Method Call
     |  +-                   +- Op: >> Proxy Data Access [token_source.getNextToken] <<Block:
     |  +- +- Local Variables:
     |  +- +- Code:
     |  +-    +- If Statement:
     |  +-       +- Condition:
     |  +-       |  +- Op: !=
     |  +-       |     +- Op: Field:
     |  +-       |     |  +- cat.quadriga.parsers.Token -> next
     |  +-       |     |  +- Op: Local variable access: t
     |  +-       |     +- Op: Literal
     |  +-       |        +- Null
     |  +-       +- If Code:
     |  +-       |  +- St: =
     |  +-       |     +- Op: Local variable access: t
     |  +-       |     +- Op: Field:
     |  +-       |        +- cat.quadriga.parsers.Token -> next
     |  +-       |        +- Op: Local variable access: t
     |  +-       +- Else Code:
     |  +-          +- St: =
     |  +-             +- Op: >> Proxy Data Access [t] <<
     |  +-             +- Op: =
     |  +-                +- Op: >> Proxy Data Access [t.next] <<
     |  +-                +- Op: Method Call
     |  +-                   +- Op: >> Proxy Data Access [token_source.getNextToken] <<
     |  <<
     +- >> Proxy Statement: 
        +- return ;
        <<
  private I jj_ntk
  Params
  Block:
  +- Local Variables:
  +- Code:
     +- If Statement:
        +- Condition:
        |  +- Op: ==
        |     +- Op: =
        |     |  +- Op: >> Proxy Data Access [jj_nt] <<
        |     |  +- Op: >> Proxy Data Access [token.next] <<
        |     +- Op: Literal
        |        +- Null
        +- If Code:
        |  +- >> Proxy Statement: 
        |     +- return ;
        |     <<
        +- Else Code:
           +- >> Proxy Statement: 
              +- return ;return ;
              <<
  public Lcat.quadriga.parsers.ParseException; generateParseException
  Params
  Block:
  +- Local Variables:
  |  +- Symbol Var [ errortok ] Type [ Lcat.quadriga.parsers.Token; ]
  |  +- Symbol Var [ line ] Type [ I ]
  |  +- Symbol Var [ column ] Type [ I ]
  |  +- Symbol Var [ mess ] Type [ Ljava.lang.String; ]
  +- Code:
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: errortok
     |     +- Op: >> Proxy Data Access [token.next] <<
     +- Statements:
     |  +- St: =
     |  |  +- Op: Local variable access: line
     |  |  +- Op: Field:
     |  |     +- cat.quadriga.parsers.Token -> beginLine
     |  |     +- Op: Local variable access: errortok
     |  +- St: =
     |     +- Op: Local variable access: column
     |     +- Op: Field:
     |        +- cat.quadriga.parsers.Token -> beginColumn
     |        +- Op: Local variable access: errortok
     +- Statements:
     |  +- St: =
     |     +- Op: Local variable access: mess
     |     +- Op: ?
     |        +- Op: ==
     |        |  +- Op: Field:
     |        |  |  +- cat.quadriga.parsers.Token -> kind
     |        |  |  +- Op: Local variable access: errortok
     |        |  +- Op: Literal
     |        |     +- Integer: 0
     |        +- Op: >> proxy [ [] ]
     |        +- Op: Field:
     |           +- cat.quadriga.parsers.Token -> image
     |           +- Op: Local variable access: errortok
     +- >> Proxy Statement: 
        +- return ;
        <<
  final public enable_tracing
  Params
  Block:
  +- Local Variables:
  +- Code:
  final public disable_tracing
  Params
  Block:
  +- Local Variables:
  +- Code:
  
}

class VarAndInit {
  Lcat.quadriga.parsers.Token; ;
  Lcat.quadriga.parsers.code.types.BaseType; ;
  Lcat.quadriga.parsers.code.statements.StatementNode; ;
  I ;
  
}

class ParameterClass {
  Lcat.quadriga.parsers.code.CodeZone; ;
  Lcat.quadriga.parsers.code.types.BaseType; ;
  Ljava.lang.String; ;
  Z ;
  I ;
  
}
