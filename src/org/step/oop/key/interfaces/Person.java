package org.step.oop.key.interfaces;

public class Person implements Comparable<Person> {

    private int id;
    private String username;

    public Person() {
    }

    public Person(int id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public int compareTo(Person person) {
        return this.username.length() - person.getUsername().length();
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
}
