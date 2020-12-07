package org.step.solid;

public class DieselCar extends Car {

    private String a;

    public DieselCar(String engineType) {
        super(engineType);
        System.out.println(engineType);
    }

    @Override
    public void displayEngineType() {
        super.displayEngineType();
    }

}
