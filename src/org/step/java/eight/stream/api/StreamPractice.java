package org.step.java.eight.stream.api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>() {{
            add(new Person(1, 42, "first", "first", Arrays.asList(new Message(1, "дурак"))));
            add(new Person(2, 45, "second", "second", Arrays.asList(new Message(2, "none"))));
        }};

        long count = people.parallelStream()
                .filter(p -> p.getAge() > 40)
                .flatMap(p -> p.getMessages().stream())
                .map(Message::getContent)
                .filter(s -> s.contains("дурак"))
                .sequential()
                .count();

        List<Person> badPersons = people.stream().filter(p ->
                p.getMessages().stream()
                        .anyMatch(m -> m.getContent().contains("дурак"))
        )
                .parallel()
                .peek(p -> p.setUsername(p.getUsername() + " black point"))
                .collect(Collectors.toList());

        System.out.println(count);
    }

    public static void nonTerminalMethods(List<Person> people) {
        Stream<Person> objectStream = people.stream().filter(Objects::nonNull);
        Stream<Person> skip = people.stream().skip(10);
        Stream<Person> distinct = people.stream().distinct();
        Stream<String> stringStream = people.stream().map(Object::toString);
        Stream<Person> peek = people.stream().peek(o -> System.out.println(o.toString()));
        Stream<Person> limit = people.stream().limit(10);
        Stream<Person> sorted = people.stream().sorted(Comparator.comparingInt(Object::hashCode));
        IntStream intStream = people.stream().mapToInt(Object::hashCode);
        Stream<Message> messageStream = people.stream().flatMap(p -> p.getMessages().stream());
    }

    public static void terminalMethods(List<Person> people) {
        Optional<Person> first = people.stream().findFirst();
        Optional<Person> any = people.stream().findAny();
        List<Person> collect = people.stream()
                .filter(person -> person.getAge() < 63)
                .collect(Collectors.toList());
        Map<Long, String> collect1 = people.stream().collect(Collectors.toMap(
                Person::getId,
                Person::getUsername
        ));
        String collect2 = people.stream()
                .map(Person::getUsername)
                .collect(Collectors.joining("/"));
        long count = people.stream().count();
        boolean isIdMatch = people.stream().anyMatch(person -> person.getId() == 1);
        boolean isIdNonMatch = people.stream().noneMatch(person -> person.getId() == 1);
        boolean isUsernameAllMatch = people.stream()
                .allMatch(person -> person.getUsername().length() > 3);
        Optional<Person> max = people.stream().max(Comparator.comparing(Person::getAge));
        Optional<Person> min = people.stream().min(Comparator.comparingInt(Person::getAge));
        people.forEach(p -> System.out.println(p.toString()));
        people.parallelStream().forEachOrdered(p -> System.out.println(p.toString()));
        Person[] people1 = people.toArray(Person[]::new);
        Object[] objects = people.toArray();
        Integer reduce = people.stream().map(Person::getAge).reduce(0, Integer::sum);
    }

    public static void terminalNumberStreamExample(List<Person> people) {
        IntStream intStream = people.stream().mapToInt(Person::getAge);

        OptionalInt max = intStream.max();
        OptionalInt min = intStream.min();
        OptionalDouble average = intStream.average();
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
        int sum = intStream.sum();
        Stream<Integer> boxed = intStream.boxed();
        Stream<Person> personStream = intStream.mapToObj(people::get);
    }

    public static void streamCreation(List<Object> list, Integer[] arr) throws IOException {
        Random random = new Random(1000);
        Stream<Object> stream = list.stream();
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> integerStream1 = Arrays.stream(arr);
        Stream<String> lines = Files.lines(Paths.get("text.txt"));
        IntStream chars = "text".chars();
        Stream.builder().add("1").add("2");
        Stream<Object> objectStream = list.parallelStream();
        Predicate<Integer> predicate = i -> i % 2 == 0;
        Stream<Integer> limit = Stream.iterate(0, predicate, integer -> integer++).limit(5);
        Stream<String> limit1 = Stream.generate(() -> random.nextInt() + " hop").limit(5);
    }

    public static class Person {
        private long id;
        private int age;
        private String username;
        private String password;
        private List<Message> messages;

        public Person() {
        }

        public Person(long id, int age, String username, String password, List<Message> messages) {
            this.id = id;
            this.age = age;
            this.username = username;
            this.password = password;
            this.messages = messages;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<Message> getMessages() {
            return messages;
        }

        public void setMessages(List<Message> messages) {
            this.messages = messages;
        }
    }

    public static class Message {
        private long id;
        private String content;

        public Message() {
        }

        public Message(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
