package org.step.java.eight.stream.api.functional.interfaces.resolving.conflicts;

public class PersonImpl implements Naming, Person {

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getUsername() {
        return Person.super.getUsername();
    }

    @Override
    public String getPassword() {
        return Naming.super.getPassword();
    }

    public static class RandomizerImpl implements Randomizer {
        @Override
        public Naming randomize() {
            return new PersonImpl();
        }
    }

    public static class CredentialsGeneratorImpl implements CredentialsGenerator {
        @Override
        public Person generate() {
            return new PersonImpl();
        }
    }
}
