package org.step.oop.enums;

public enum Authorities {

    ROLE_USER("This is USER"),
    ROLE_ADMIN("This is ADMIN");

    private final String description;

    Authorities(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
