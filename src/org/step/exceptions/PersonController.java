package org.step.exceptions;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public int person() {
        try {
            personService.savePerson("nickname", 1);
        } catch (Exception e) {
            return 400;
        }
        return 201;
    }
}
