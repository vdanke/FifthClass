package org.step.oop.specificators;

public class Example {

    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass("Chtoto");

        String notChangeable = finalClass.getNotChangeable();
    }

    public void validateSomething(final Integer i) {

    }
}
