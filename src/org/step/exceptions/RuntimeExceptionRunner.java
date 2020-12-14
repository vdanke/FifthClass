package org.step.exceptions;

import java.nio.charset.StandardCharsets;

public class RuntimeExceptionRunner {

    public static void main(String[] args) {
//        try {
//            String str = null;
//            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
//        } catch (RuntimeException e) {
//            System.out.printf("Exception happened: %s%n", e.getLocalizedMessage());
//        }
//        System.out.println("After throw");
        Object first = performExceptionHandling(null);
        String str = first.getClass().isAssignableFrom(NullPointerException.class) ?
                ((NullPointerException) first).getLocalizedMessage():
                new String((byte[]) first, StandardCharsets.UTF_8);
        System.out.println(str);
    }

    public static byte[] convertStringToBytesUTF8(String str) {
//        if else
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static Object performExceptionHandling(String str) {
        try {
            return convertStringToBytesUTF8(str);
        } catch (Exception e) {
            // new Exception()
            return e;
        }
    }
}
