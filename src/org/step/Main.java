package org.step;

public class Main {

    public static void main(String[] args) {
        String first = "first";
        String second = "first";

        String result = first == second ? first : second;

        System.out.println(first == second);
        System.out.println(first.equals(second));

        int[] arr = new int[]{1, 2, 3};

        long sum = 0;

        for (Integer i : arr) {
            double pow = Math.pow((double) i, 2);
            sum += (long) pow;
        }

        System.out.println(sum);
    }
}
