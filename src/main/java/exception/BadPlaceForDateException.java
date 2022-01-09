package exception;

public class BadPlaceForDateException  extends RuntimeException {
    public BadPlaceForDateException(String message) {
        super(message);
    }
}
