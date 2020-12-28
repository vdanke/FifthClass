package org.step.java.eight.stream.api.optionals;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalPractice {

    public static void main(String[] args) {
        Dao dao = new Dao();

        String test = filterProcessingData("dsa");

        System.out.println(test);

        logProcessingData("Petya");

        throwExceptionIfDataIsEmpty(null);

//        Optional.of()
//        String data = dao.getById(4);
//        Optional<String> optionalData = Optional.ofNullable(dao.getById(3));
//
//        boolean isPresent = optionalData.isPresent();
//
//        if (isPresent) {
//            String s = optionalData.get();
//            System.out.println(s.toLowerCase());
//        }
    }

    public static void creationExample(Object o) {
        Optional<Object> empty = Optional.empty();
        Optional<Object> of = Optional.of(o);
        Optional<Object> ofNullable = Optional.ofNullable(o);
    }

    public static String orElseGetProcessingData(String data) {
        return Optional.ofNullable(data)
                .filter(d -> d.length() > 5)
                .orElseGet(() -> String.format(
                        "Data is not enough, length: %d", data.length())
                );
    }

    public static void throwExceptionIfDataIsEmpty(String data) {
        Optional.ofNullable(data).orElseThrow(() -> new RuntimeException("Bad things happened"));
    }

    public static String mapProcessingData(String data) {
        return Optional.of(data).map(s -> String.format("Hello, %s", s)).get();
    }

    public static void logProcessingData(String data) {
        Optional.ofNullable(data).ifPresent(s -> System.out.printf("Hello, %s%n", s));
    }

    public static String filterProcessingData(String data) {
        Optional<String> optional = Optional.ofNullable(data);

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.getBytes(StandardCharsets.UTF_8).length < 12;
            }
        };
//        Optional.of(data)
//                .filter(s -> s.getBytes(StandardCharsets.UTF_8).length < 12)
//                .orElse(Data.EMPTY_DATA.name());
        return optional.filter(predicate).orElse(Data.EMPTY_DATA.name());
    }

    public static class Dao {

        private static final Map<Integer, String> DATABASE = new HashMap<>();

        static {
            DATABASE.put(1, "First");
            DATABASE.put(2, "Second");
            DATABASE.put(3, "Third");
        }

        public String getById(Integer id) {
            return DATABASE.get(id);
        }

        public Optional<String> getOptionalById(Integer id) {
            String data = DATABASE.get(id);
            if (data == null || !data.startsWith("f")) {
                return Optional.empty();
            }
            return Optional.of(data);
        }

        public Optional<String> getOptionalNullableById(Integer id) {
            return Optional.ofNullable(DATABASE.get(id));
        }

        public void add(String name) {
            DATABASE.put(DATABASE.size() + 1, name);
        }
    }

    public enum Data {
        EMPTY_DATA
    }
}
