package org.step.oop.inner.nested;

public class Person {

    private int id;
    private String username;
    private String password;
    private String address;

    public Person() {
    }

    public Person(int id, String username, String password, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public class PersonValidator {
        public boolean isValid() {
            return username.length() > 5;
        }
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private int id;
        private String username;
        private String password;
        private String address;

        private PersonBuilder() {}

        public PersonBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PersonBuilder username(String username) {
            this.username = username;
            return this;
        }

        public PersonBuilder password(String password) {
            this.password = password;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(id, username, password, address);
        }
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
