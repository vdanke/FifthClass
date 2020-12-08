package org.step.oop.overloading;

public class OverloadingExample {

    private String field;

    public OverloadingExample() {
    }

    public OverloadingExample(String field) {
        this.field = field;
    }

    public int printString(String str) {
        return str.length();
    }

    public void printString(String str, int countPrint) {

    }

    public static void printString(Integer i) {

    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
    }
}
