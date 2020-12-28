package org.step.java.eight.stream.api.functional.interfaces;

public class StringIntegerDataTransformer implements DataTransformer<String, Integer> {

    @Override
    public Integer transform(String s) {
        return s.length();
    }
}
