package exception;

public class TooConfidentException extends RuntimeException {
    public TooConfidentException(String message) {
        super(message);
    }
}