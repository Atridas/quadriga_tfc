package cat.quadriga.parsers.code.printers;

public final class PrintString implements PrintInfo {
	String text;
	
	public PrintString(final String text) {
		this.text = text;
	}
	
	public String toString() {
	  return text;
	}
}
