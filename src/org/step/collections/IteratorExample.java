package org.step.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IteratorExample {

    public static void main(String[] args) {
        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person.toString());
            }
        };
        List<Person> people = new ArrayList<>(
                Arrays.asList(new Person(1, "u"), new Person(2, "p"))
        );
        Iterator<Person> iterator = people.iterator();

        people.forEach(personConsumer);

        iterator.forEachRemaining(personConsumer);

//        while(iterator.hasNext()) {
//            // iterator.remove(); not valid
//            System.out.println(iterator.next().toString());
//        }
    }
}
