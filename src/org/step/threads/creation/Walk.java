package org.step.threads.creation;

public class Walk implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.printf("The count of Walk is: %d%n", i);
            i++;
        }
    }
}
