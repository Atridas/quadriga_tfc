package cat.quadriga.parsers.code;

import cat.quadriga.parsers.code.statements.BucleOrSwitchInterface;

public class ContinueException extends BreakOrContinueException {

  private static final long serialVersionUID = -4572768569432218128L;

  public ContinueException(BucleOrSwitchInterface tobreak) {
    super(tobreak);
  }

}
