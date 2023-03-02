package zoo.oop.demo.exception;

public class CannotEatException extends RuntimeException {
    public CannotEatException(String message) {
        super(message);
    }
}
