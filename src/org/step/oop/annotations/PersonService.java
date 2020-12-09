package org.step.oop.annotations;

import java.util.UUID;

public class PersonService {

    private final Person[] people = new Person[100];

    {
        people[0] = new Person(UUID.randomUUID().toString());
        people[1] = new Person(UUID.randomUUID().toString());
        people[2] = new Person(UUID.randomUUID().toString());
    }

    public PersonService() {
        System.out.println("Creation");
    }

    public Person[] findAllPersons() {
        return people;
    }
}
