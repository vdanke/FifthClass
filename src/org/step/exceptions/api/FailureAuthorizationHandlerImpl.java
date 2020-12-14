package org.step.exceptions.api;

public class FailureAuthorizationHandlerImpl implements FailureAuthorizationHandler {

    @Override
    public void handle(NotAuthorizedException e) {
        if (e.getClass().isAssignableFrom(CustomNotAuthorizedException.class)) {
            System.out.println("My exception happened");
        } else {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
