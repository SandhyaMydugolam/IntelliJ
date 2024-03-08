package exception;

public class TooLongException extends Exception {
    public TooLongException() {
    }

    public TooLongException(String message) {
        super(message);
    }
}
