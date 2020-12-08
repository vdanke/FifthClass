package org.step.fundamentals.convert;

public class Example {

    public static void main(String[] args) {
        int i = 123;
        String s = String.valueOf(i);
        String str = "" + i;
        s += "abc";
//        int i1 = Integer.parseInt(s);
        Integer integer = Integer.valueOf(str);

        System.out.println(integer);

        for (Character c : s.toCharArray()) {
            boolean isMatches = c.toString().matches("\\d++");
            if (isMatches) {
                System.out.println(c);
            }
        }
    }
}
