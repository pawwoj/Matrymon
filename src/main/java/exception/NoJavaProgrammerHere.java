package exception;

public class NoJavaProgrammerHere   extends RuntimeException {
    public NoJavaProgrammerHere(String message) {
        super(message);
    }
}