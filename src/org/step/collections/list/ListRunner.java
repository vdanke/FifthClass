package org.step.collections.list;

import org.step.collections.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {
        arrayListExample();
    }

    public static void arrayListExample() {
        ArrayList<Person> people = new ArrayList<>(2);

        people.add(new Person(2, "b"));
        people.add(new Person(1, "a"));

        System.out.println(people);

        Person person = people.get(0);
        people.add(1, new Person(3, "a"));
        boolean contains = people.contains(person);
        // person.equals(incoming person)
        people.ensureCapacity(10);
        System.out.println(people.size());
//        people.trimToSize();
        System.out.println(contains);
    }

    public static void linkedListExample() {
        LinkedList<Person> people = new LinkedList<>();
        // Node<A>
        // Node<B>
        people.addFirst(new Person());
        people.addLast(new Person());
        people.get(1);
        Person element = people.element();
        Person peek = people.peek();
        people.pop();
        people.poll();
    }
}
