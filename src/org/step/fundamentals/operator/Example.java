package org.step.fundamentals.operator;

import org.step.fundamentals.solid.Car;
import org.step.fundamentals.solid.DieselCar;

public class Example {

    public static void main(String[] args) {
        if (isValid(new DieselCar("Diesel"))) {
            System.out.println("Valid");
        }
        for (int i = 0; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (Integer p : new int[]{1, 2, 3}) {
            System.out.println(p ^ 3);
        }
        boolean isSorted = true;

        while (isSorted) {
            isSorted = false;
        }

        Integer i = 5;

        // String, Enum ...
        switch (i) {
            case 5:
                System.out.println("Five is found");
                break;
            default:
                System.out.println("Not 5");
        }

//        do {
//
//        } while (isSorted) {
//
//        }
    }

    public static boolean isValid(Car car) {
        return car.hashCode() > 3;
    }
}
