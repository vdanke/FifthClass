package org.step.exceptions;

public class PersonService {

    public void savePerson(String username, int id) {
        if (id == 0) {
            throw new IdNotValidException(
                    String.format("ID is not valid: %d", id)
            );
        }
        if (username.length() < 4) {
            throw new UsernameNotValidException(
                    String.format("Username is not valid: %d", username.length()),
                    "Wow easier"
            );
        }
        Person person = new Person(id, username);
        // call repository
        System.out.println("Perform saving");
        System.out.printf("Saved object is: %s%n", person.toString());
    }
}
