package org.step.oop.enums;

public class Person {

    private int id;
    private String username;
    private Authorities role;

    public Person() {
    }

    public Person(int id, String username, Authorities role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Authorities getRole() {
        return role;
    }

    public void setRole(Authorities role) {
        this.role = role;
    }
}
