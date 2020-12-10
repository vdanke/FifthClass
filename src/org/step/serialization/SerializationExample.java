package org.step.serialization;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        Object obj = new Person();
        ObjectOutputStream ou = new ObjectOutputStream(bo);
        ou.writeObject(obj);
        byte[] bytes = bo.toByteArray();
        for (byte b : bytes) {
            System.out.println(b);
        }
        System.out.println("\n");
        ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
        ObjectInputStream oi = new ObjectInputStream(bi);
        Object i = oi.readObject();
        System.out.printf("Equals: %b%n", i.equals(obj));
        System.out.printf("Link equals: %b%n", i == obj);
        System.out.printf("String representation: %s", i.toString());
    }
}
