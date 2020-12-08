package org.step.oop.statics;

public class IdValidator {

    public static String variable;
    public String nonStatic;

    static {
        System.out.println("Static block");
        variable = "";
    }

    public static boolean isIdValid(final int id) {
        return id % 2 == 0;
    }
}
