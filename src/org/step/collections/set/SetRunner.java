package org.step.collections.set;

import org.step.collections.Person;

import java.util.*;

public class SetRunner {

    private static Person first = new Person(1, "username");
    private static Person second = new Person(2, "newUser");
    private static Person third = new Person(3, "username");
    private static Person fourth = new Person(4, "newUser");
    private static Person fifth = new Person(5, "username");
    private static Person sixth = new Person(6, "newUser");

    public static void main(String[] args) {
        sortedSetExample();
    }

    /*
    1-5|_| 5-10|_| 10-15|_|
    equals() hashcode() !!!
     */
    public static void setExample() {
        // HashSet<Person> hashSet = new HashSet<>();
        Set<Person> personSet = new HashSet<>();

        personSet.add(first);
        personSet.add(second);

        System.out.println(personSet.size());
    }

    public static void sortedSetExample() {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getId() - t1.getId();
            }
        };
        NavigableSet<Person> people = new TreeSet<>(comparator);

        people.addAll(Arrays.asList(fifth, fourth, sixth, third, second, first));

        people.forEach(p -> System.out.println(p.toString()));
    }

    public static void linkedHashSetExample() {
        // <E, V>
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
    }

    public static Set<Person> toRemember(List<Person> personList) {
        return new HashSet<>(personList);
    }
}
