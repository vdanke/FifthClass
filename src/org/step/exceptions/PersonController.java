package org.step.exceptions;

import org.step.exceptions.api.AuthorizationHandler;
import org.step.exceptions.api.UsernamePasswordAuthorizationHandler;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public int person(byte[] body) {
        String str = new String(body, StandardCharsets.UTF_8);
        String[] arr = str.split(" ");
        String username = "";
        int id = 0;
        int i = 0;
        for (String s : arr) {
            if (i == 0) {
                username = s.split(":")[1];
            } else {
                id = Integer.parseInt(s.split(":")[1]);
            }
            i++;
        }
        personService.savePerson(username, id);
        return 201;
    }

    public Person login(Person person) {
        AuthorizationHandler<Person> authHandle = new UsernamePasswordAuthorizationHandler();
        return authHandle.authorize(person);
    }
}
