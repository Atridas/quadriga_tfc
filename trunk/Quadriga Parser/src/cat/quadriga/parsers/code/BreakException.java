package cat.quadriga.parsers.code;

import cat.quadriga.parsers.code.statements.BucleOrSwitchInterface;

public class BreakException extends BreakOrContinueException {

  private static final long serialVersionUID = 1199699674156128007L;

  public BreakException(BucleOrSwitchInterface tobreak) {
    super(tobreak);
  }

}
