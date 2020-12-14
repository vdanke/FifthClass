package org.step.exceptions;

import org.step.exceptions.api.CustomNotAuthorizedException;
import org.step.exceptions.api.FailureAuthorizationHandler;
import org.step.exceptions.api.FailureAuthorizationHandlerImpl;
import org.step.exceptions.api.NotAuthorizedException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class AppRunner {

    public static void main(String[] args) throws IOException {
        Person person = new Person(1, "usrrasf");

        String s = person.toString();

        PersonController personController = new PersonController(
                new PersonService()
        );
        try {
            int responseCode = personController.person(s.getBytes(StandardCharsets.UTF_8));
            Person username = personController.login(new Person(1, "opopo"));
            System.out.println(responseCode);
            System.out.println(username.toString());
        } catch (Exception e) {
            if (e instanceof IdNotValidException) {
                handleIdNotValidException((IdNotValidException) e);
            }
            if (e instanceof UsernameNotValidException) {
                handleUsernameNotValidException((UsernameNotValidException) e);
            }
            if (e instanceof NotAuthorizedException) {
                FailureAuthorizationHandler fHandler = new FailureAuthorizationHandlerImpl();
                fHandler.handle((NotAuthorizedException) e);
            }
        }
    }

    public static void handleIdNotValidException(IdNotValidException e) {
        System.out.println(e.getLocalizedMessage());
    }

    public static void handleUsernameNotValidException(UsernameNotValidException e) {
        System.out.println(e.getLocalizedMessage() + " " + e.getAdditionalStatus());
    }
}
