package org.step.oop.key.interfaces;

import java.util.Comparator;

public class Example {

    public static void main(String[] args) {
        int calculate = ParamMethods.calculate(1L, 1.0);
        ParamMethods.print("Calculate");

        Mark<Integer> first = new Mark<>(1);
        Mark<Integer> second = new Mark<>(2);


        int i1 = first.calculateNumber(second);
        int i2 = first.calculateWildcardNumber(second);

        Mark<Double> third = new Mark<>(1);

//        first.calculateNumber(third)
        first.calculateWildcardNumber(third);

        Person person = new Person(1, "First");
        Person anotherPerson = new Person(2, "Blablabla");

        int logic = Repository
                .logic(person.getUsername().length(), anotherPerson.getUsername().length());

        Repository<Person> repository = new PersonRepository();

        repository.powAge(person.getId(), anotherPerson.getId());

        int i = person.compareTo(anotherPerson);

        Comparator<Person> comparator = new Comparator<>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getUsername().length() - t1.getUsername().length();
            }
        };
    }
}
