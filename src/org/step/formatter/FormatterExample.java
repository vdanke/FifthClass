package org.step.formatter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FormatterExample {

    public static void main(String[] args) throws IOException {
        System.err.println("Panic aaaaa");

        byte[] bytes = System.in.readAllBytes();

        String s = new String(bytes, StandardCharsets.UTF_8);

        String str = "new";

        System.out.printf("The date is purchase: %tD %n", LocalDateTime.now());
        System.out.printf("Hashcode is: %h %n", str);

        System.out.print("Bla");
    }
}
