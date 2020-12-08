package org.step.oop.statics;

public class User {

    private int id;

    {
        System.out.println("Usual block");
    }

    public User(int id) {
        this.id = id;
    }

    public void printUser() {
        System.out.println("User id: " + id);
    }

    public int getUserId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int variable = 43;

        return (id + variable) * id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().isAssignableFrom(User.class)) {
            return false;
        }
        User incoming = (User) obj;
        return this.id == incoming.id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm dying");
        super.finalize();
    }
}
