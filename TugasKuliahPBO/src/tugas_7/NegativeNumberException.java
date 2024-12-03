package tugas_7;

public class NegativeNumberException extends Exception {

	public NegativeNumberException( ) {
		super();
	}

	public NegativeNumberException(String s) {
		super("error: " + s);
	}

}