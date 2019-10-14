package rps;

public class InvalidInput extends Exception {
	public InvalidInput() {
		super("Invalid Input");
	}
	public InvalidInput (String message) {
		super(message);
	}
}
