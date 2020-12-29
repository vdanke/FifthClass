package org.step.java.eight.stream.api.functional.interfaces.resolving.conflicts;

public interface Naming {

    default String getUsername() {
        return "Friday";
    }

    default String getPassword() {
        return "Secret";
    }
}
