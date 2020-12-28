package org.step.java.eight.stream.api.functional.interfaces.main;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.length() > 5;
    }
}
