package org.step.oop.key.interfaces;

public class PersonRepository implements Repository<Person> {

    @Override
    public Person[] findAll() {
        return new Person[0];
    }

    @Override
    public Person findById() {
        return null;
    }

    @Override
    public void save(Person person) {

    }

    @Override
    public void delete(Person person) {

    }
}
