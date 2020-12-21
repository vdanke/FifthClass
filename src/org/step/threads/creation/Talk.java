package org.step.threads.creation;

public class Talk extends Thread {

    public Talk(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.printf("The count of Talk is: %d%n", i);
            i++;
        }
    }
}
