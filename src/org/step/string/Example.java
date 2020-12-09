package org.step.string;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Example {

    public static void main(String[] args) {
        String str = "abc";
        String abc = "abc";
        String httpUrl = "/carl/corall/" + 1;

        String[] split = httpUrl.split("/");
        for (String a : split) {
            if (a.matches("\\d++")) {
                System.out.println(a);
            }
        }

        int c1 = str.indexOf('c');
        int c2 = str.lastIndexOf('c');
        String replace = str.replace('b', 'd');
        boolean isContaining = str.contains("a");
        char[] chars = str.toCharArray();
        String s1 = String.copyValueOf(chars, 0, 1);
        char c = str.charAt(0);
        int length = str.length();
        CharSequence charSequence = str.subSequence(0, 1);
        String s2 = String.valueOf(1);
        String query = String.format("DELETE FROM %s WHERE id=%d", "persons", 1);

        String s3 = Base64
                .getEncoder()
                .encodeToString("abc".getBytes(StandardCharsets.UTF_8));

        byte[] strBytes = getStrBytes(str);

        String s = new String(strBytes, StandardCharsets.UTF_8);

        System.out.println(s);
    }

    public static byte[] getStrBytes(String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }
}
