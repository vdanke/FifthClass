package org.step.oop.key.interfaces;

public class ParamMethods {

    public static <T extends Number> int calculate(T first, T second) {
        return first.intValue() + second.intValue();
    }

    public static <T extends String> void print(T t) {
        System.out.println(t);
    }
}
