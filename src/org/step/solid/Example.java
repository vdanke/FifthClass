package org.step.solid;

public class Example {

    public static void main(String[] args) {
        Car electric = new SuperCar("Electric");
        Car diesel = new DieselCar("Diesel");
        System.out.println(diesel.getA());

        System.out.println(diesel instanceof Car);
        System.out.println(diesel instanceof DieselCar);
        System.out.println(diesel instanceof ElectricCar);
        System.out.println(diesel.getClass().isAssignableFrom(Car.class));

        iteration();

        iteration();

        show(diesel);
    }

    private static void iteration() {
        while (true) {
            break;
        }
    }

    public static void show(Car car) {
        car.displayEngineType();
    }
}
