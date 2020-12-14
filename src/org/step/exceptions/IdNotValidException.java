package org.step.exceptions;

/*
extends Exception - checked (try catch)
extends RuntimeException - unchecked

super() is important!!!!
 */
public class IdNotValidException extends RuntimeException {

    public IdNotValidException() {
        super();
    }

    public IdNotValidException(String message) {
        super(message);
    }

    public IdNotValidException(String message, Throwable cause) {
        super(message, cause);
    }
}
