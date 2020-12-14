package org.step.exceptions.api;

public interface AuthorizationHandler<T> {

    T authorize(T t);
}
