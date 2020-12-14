package org.step.exceptions;

public class PersonService {

    public void savePerson(String username, int id) {
        if (id == 0) {

        }
        Person person = new Person(id, username);
        // call repository
        System.out.println("Perform saving");
        System.out.printf("Saved object is: %s", person.toString());
    }
}
