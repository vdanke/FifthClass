package org.step.oop.enums;

public class Example {

    public static void main(String[] args) {
        Person person = new Person(1, "first", Authorities.ROLE_USER);
        Person anotherPerson = new Person(2, "second", Authorities.ROLE_ADMIN);

        boolean isAdmin = isAdmin(person);

        String role = "ROLE";

        Authorities[] values = Authorities.values();

        boolean isEqual;

        for (Authorities au : values) {
            isEqual = au.name().equals(role);
            if (isEqual) {
                break;
            }
            return;
        }
//        throw new IllegalArgumentException();

        Authorities authorities = Authorities.valueOf(role);

        System.out.println(authorities.name());

        System.out.println(person.getRole().name());
        System.out.println(person.getRole().getDescription());
    }

    public static boolean isAdmin(Person person) {
        switch (person.getRole()) {
            case ROLE_USER -> {
                return false;
            }
            case ROLE_ADMIN -> {
                return true;
            }
            default -> throw new RuntimeException("Not Authorized");
        }
    }
}
