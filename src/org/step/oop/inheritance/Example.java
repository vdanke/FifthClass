package org.step.oop.inheritance;

public class Example {

    public static void main(String[] args) {
        MyClass myClass = new SimpleClass("Chtoto");
        MyAPI myAPI = new SecondClass("Chtoto");



        some(myClass);
    }

    public static void some(MyClass myClass) {
        SimpleClass myClass1 = (SimpleClass) myClass;
    }
}
