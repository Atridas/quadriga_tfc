package cat.quadriga.parsers.code;


public interface Linkable {
  boolean isCorrectlyLinked();
  Linkable getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog);
}
