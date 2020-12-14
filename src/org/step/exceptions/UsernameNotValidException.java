package org.step.exceptions;

public class UsernameNotValidException extends RuntimeException {
    private String additionalStatus;

    public UsernameNotValidException(String message, String additionalStatus) {
        super(message);
        this.additionalStatus = additionalStatus;
    }

    public String getAdditionalStatus() {
        return additionalStatus;
    }
}
