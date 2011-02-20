package cat.quadriga.parsers.code;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public final class ErrorLog {

  private final List<Error>   errors   = new Vector<Error>();
  private final List<Warning> warnings = new Vector<Warning>();

  public void insertError(String error, CodeZone cz) {
    errors.add(new Error(cz, error));
  }
  public void insertError(Error error) {
    errors.add( error );
  }

  public void insertWarning(String warning, CodeZone cz) {
    warnings.add(new Warning(cz, warning));
  }
  public void insertWarning(Warning warning) {
    warnings.add( warning );
  }

  public List<Error> getErrors() {
    return Collections.unmodifiableList(errors);
  }
  public List<Warning> getWarning() {
    return Collections.unmodifiableList(warnings);
  }

  public class Error extends CodeZone {
    public final String stringError;
    
    Error(CodeZone cz, String str) {
      super(cz);
      stringError = str;
    }
  }
  public class Warning extends CodeZone {
    public final String stringWarning;
    
    Warning(CodeZone cz, String str) {
      super(cz);
      stringWarning = str;
    }
  }
}
