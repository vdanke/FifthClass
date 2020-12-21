package org.step.threads.creation;

import java.util.Random;
import java.util.concurrent.Callable;

public class Fly implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int size = 5;
        Integer[] arr = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        int maxValue = 0;
        for (int i = 0; i < size; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
