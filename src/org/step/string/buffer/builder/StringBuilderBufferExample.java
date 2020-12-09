package org.step.string.buffer.builder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StringBuilderBufferExample {

    public static void main(String[] args) throws IOException {
        stringBuilderBufferExample();

        StringBuffer stBuilder = new StringBuffer();

        for (String str : args) {
            stBuilder.append(str);
            stBuilder.append("/");
        }
        String s = stBuilder.toString();
    }

    public static void stringBuilderBufferExample() throws IOException {
        StringBuilder stringBuilder = new StringBuilder("This is Mazda");
        StringBuilder withoutAny = new StringBuilder();
        StringBuilder withCapacity = new StringBuilder(1000);

        int length = stringBuilder.length();
        int capacity = stringBuilder.capacity();

        int capacity1 = withCapacity.capacity();

        System.out.println(capacity1);

        withCapacity.append(new String(new FileInputStream("FifthClass.iml").readAllBytes(), StandardCharsets.UTF_8));

        System.out.println(withCapacity);

        withCapacity.trimToSize();

        System.out.println(withCapacity.capacity());

        char c = stringBuilder.charAt(0);
        stringBuilder.setCharAt(0, 'c');
        CharSequence charSequence = stringBuilder.subSequence(0, 5);
        String str = new BufferedReader(new FileReader("FifthClass.iml")).readLine();

        stringBuilder.append(str);

        StringBuilder reverse = stringBuilder.reverse();

        System.out.println(stringBuilder.toString());
    }
}
