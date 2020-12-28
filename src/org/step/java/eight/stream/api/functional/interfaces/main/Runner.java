package org.step.java.eight.stream.api.functional.interfaces.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {

    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = i -> i > 5;
        Supplier<List<Integer>> listSupplier = ArrayList::new;
        Consumer<List<Integer>> listConsumer = l -> l.forEach(System.out::println);
        Function<String, Integer> stringIntegerFunction = String::length;

        System.out.println(listSupplier.get());;
        System.out.println(integerPredicate.test(4));
    }
}
