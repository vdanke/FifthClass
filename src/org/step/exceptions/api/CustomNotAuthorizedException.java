package org.step.exceptions.api;

public class CustomNotAuthorizedException extends NotAuthorizedException {

    public CustomNotAuthorizedException() {
        super();
    }

    public CustomNotAuthorizedException(String message) {
        super(message);
    }

    public CustomNotAuthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
}
