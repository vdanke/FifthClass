package org.step.formatter.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

    public static void main(String[] args) {
        Pattern compile = Pattern.compile("bad");

        String str = "bad bad bad is evil";

        Matcher matcher = compile.matcher(str);

        String good = matcher.replaceAll("Good");

        System.out.println(good);

        boolean isMatch = matcher.matches();

        System.out.println(isMatch);
    }
}
