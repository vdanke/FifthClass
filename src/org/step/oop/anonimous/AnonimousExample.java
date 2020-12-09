package org.step.oop.anonimous;

public class AnonimousExample {

    public static void main(String[] args) {
        Person person = new Person(2);

        PersonService personService = new PersonService(){
            @Override
            public Person powId(Person person) {
                int id = person.getId();
                int powId = id * id;

                person.setId(powId);

                return person;
            }
        };

        boolean isValid = personService.isValidPerson(person);

        personService.powId(person);

        System.out.println(isValid);
        System.out.println(person.getId());
    }
}
