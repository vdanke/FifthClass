package org.step.oop.inner.nested;

public class Example {

    public static void main(String[] args) {
        Person build = Person.builder().id(1).build();
        Person user = Person.builder().username("user").build();
        Person build1 = Person.builder()
                .build();
        Person build2 = Person.builder()
                .address("address")
                .password("password")
                .build();

        Person.PersonValidator personValidator = build.new PersonValidator();

        boolean valid = personValidator.isValid();

        System.out.println(valid);
    }
}
