package zoo.oop.demo.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CannotEatException extends RuntimeException {
    public CannotEatException(String message) {
        super(message);
        log.error(message);
    }
}
