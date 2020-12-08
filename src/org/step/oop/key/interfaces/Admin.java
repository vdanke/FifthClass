package org.step.oop.key.interfaces;

public class Admin extends Person {

    public Admin() {
        super();
    }

    public Admin(int id, String username) {
        super(id, username);
    }

    @Override
    public int compareTo(Person person) {
        return super.compareTo(person);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }
}
