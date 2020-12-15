package org.step.collections.list;

import org.step.collections.Person;

import java.util.*;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>() {{
            add(new Person(1, "a"));
            add(new Person(2, "b"));
            add(new Person(3, "c"));
        }};
        ListIterator<Person> personListIterator = people.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next().toString());
            int index = personListIterator.nextIndex();
            System.out.println(index);
            if (index == 2) {
                System.out.println("Remove processing");
                personListIterator.remove();
                continue;
            }
            if (index == people.size() - 1) {
                System.out.println("Add processing");
                personListIterator.add(
                        new Person(new Random().nextInt(100), "random")
                );
            }
        }
    }
}
