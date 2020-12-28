package org.step.java.eight.stream.api.functional.interfaces.main;

import java.util.function.Function;

public class FunctionImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
