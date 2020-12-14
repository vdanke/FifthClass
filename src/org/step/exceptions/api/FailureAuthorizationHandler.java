package org.step.exceptions.api;

public interface FailureAuthorizationHandler {

    void handle(NotAuthorizedException e);
}
