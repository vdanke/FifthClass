package org.step.serialization;

import java.io.*;
import java.util.Objects;

public class Person implements Serializable {

    private static final long serialVersionUID = -8742458827653072961L;

    public transient int id;
    public String username;

    @Serial
    private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {
        Object o = aInputStream.readObject();
        Person person = (Person) o;
        id = person.id;
        username = person.username;
    }

    @Serial
    private void writeObject(ObjectOutputStream aOutputStream) throws IOException {
        aOutputStream.writeObject(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
