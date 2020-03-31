
public class InvalidInputFormatException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	
	public InvalidInputFormatException(String message) {
		this.message = message;
	}
}
