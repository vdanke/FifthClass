package org.step.fundamentals.variables;

import org.step.fundamentals.entity.Entity;

// psvm - public static void main
// sout - System.out.println()
// souf - System.out.printf()
public class VariableExample {

    public Entity findByUsername(String username) {
        return new Entity();
    }

    public long sum(int i, int l) {
        int x = 200;
        long xl = x;
        return i + l;
    }

    public String classCast(Object o) {
        return (String) o;
    }

    public int sumInt(long a, long b) {
        return (int)(a + b);
    }

    public long sum(long d, double b) {
        return d + (long) b;
    }

    public static void main(String[] args) {
        byte b = 1;
        short s = 127;
        int i = 12345;
        long valueOfMyMind = 126735761254761L;

        // null, true, false

        float f = 1.23f;
        double d = 5.43d;

        boolean isTrue = true;

        char c = 'c';

        char[] chars = "Mama mila ramu".toCharArray();

        for (int j = 0; j < chars.length; j++) {
            System.out.println(chars[i]);
        }
        for (Character ch : chars) {
            System.out.println(ch);
        }
    }
}
