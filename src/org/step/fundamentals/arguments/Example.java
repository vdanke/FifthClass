package org.step.fundamentals.arguments;

public class Example {

    public static void main(String[] args) {
        long sum = sum("HI", 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6);
        System.out.println(sum);
        String s = "First";
        changeStr(s);
        System.out.println(s);
    }

    public static void changeStr(String str) {
        str = "New String";
    }

    public static long sum(String str, double del, int... numbers) {
        long sum = 0;

        System.out.printf("Say %s \n", str);

        for (Integer i : numbers) {
            sum += i / del;
        }
        return sum;
    }
}
