package org.step.solid;

public class Car {

    protected String engineType;
    private String a;

    {
        a = "Abc";
        System.out.println("First");
    }

    public Car(String engineType) {
        this.engineType = engineType;
    }

    public void displayEngineType() {
        System.out.println(engineType);
    }

    public String getA() {
        return a;
    }
}
