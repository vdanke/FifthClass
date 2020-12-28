package org.step.java.eight.stream.api.functional.interfaces;

public class FunctionalInterfacePractice {

    /*
    Functional interfaces:
    1 абстрактный метод (помощь со стороный @FunctionalInterface)
    2 множество default и static методов
     */
    public static void main(String[] args) {
//        DataTransformer<String, Integer> dataTransformer = String::length;

        String s = new StringIntegerDataTransformer().transformGenericMethod(new Object());
        byte[] bytes = DataTransformer.transformToBytes(new Object());

        for (byte b : bytes) {
            System.out.println(b);
        }
        System.out.println(s);

//        Integer length = dataTransformer.transform("New length");
//
//        System.out.println(length);
    }
}
