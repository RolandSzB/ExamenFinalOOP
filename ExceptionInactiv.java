package exceptiile;

public class ExceptionInactiv extends Exception {
	private int errorCode;

	public ExceptionInactiv( String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
 public String toString() {
	 return "ExceptionInactiv ["+errorCode+"]:"+getMessage();
 }
}
