package org.step.oop.anonimous;

public abstract class PersonService {

    public abstract Person powId(Person person);

    public boolean isValidPerson(Person person) {
        return person.getId() % 2 == 0;
    }
}
