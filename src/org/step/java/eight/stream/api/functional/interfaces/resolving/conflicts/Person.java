package org.step.java.eight.stream.api.functional.interfaces.resolving.conflicts;

public interface Person {

    long getId();

    default String getUsername() {
        return "NotFriday";
    }

    default String getPassword() {
        return "Secret";
    }
}
