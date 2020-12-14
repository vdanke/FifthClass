package org.step.exceptions.api;

import org.step.exceptions.Person;

public class UsernamePasswordAuthorizationHandler implements AuthorizationHandler<Person> {

    private Person[] arr = new Person[]{new Person(1, "username")};

    @Override
    public Person authorize(Person person) {
        for (Person p : arr) {
            if (p.getUsername().equals(person.getUsername())) {
                return person;
            }
        }
        throw new NotAuthorizedException("Person not found");
    }
}
