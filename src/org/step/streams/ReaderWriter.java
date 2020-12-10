package org.step.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class ReaderWriter {

    public static void main(String[] args) throws IOException {
        fileReader("FifthClass.iml");

        PrintWriter printWriter = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("FifthClass.iml")
                )
        );
    }

    public static void processData(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName, StandardCharsets.UTF_8);
        BufferedWriter bf = new BufferedWriter(fileWriter);
        PrintWriter pw = new PrintWriter(bf);

        pw.println("This is new sentence");

        pw.close();
    }

    public static void parents() throws IOException {
        char[] chars = new char[200];

        Reader reader = new FileReader("text.txt");
        Writer writer = new PrintWriter(System.out, true, StandardCharsets.UTF_8);

        int read = reader.read();
        int read1 = reader.read(chars);
        int read2 = reader.read(chars, 0, 100);
        long skip = reader.skip(20);

        StringBuilder stringBuilder = new StringBuilder();

        writer.append(stringBuilder);
        writer.write(103);
        writer.write("This is string");
        writer.write(chars);
        writer.write(chars, 0, 100);
        writer.write("This is string", 0, 5);
    }

    public static void charArrayReader() throws IOException {
        String strToRead = "kasmdnwjqndoiqd,;alsjdiowqiodmpoqwijd";
//        int length = strToRead.length();
//        char[] strIntArray = new char[length];
//        strToRead.getChars(0, length, strIntArray, 0);
        char[] chars = strToRead.toCharArray();
        CharArrayReader firstReader = new CharArrayReader(chars);
        CharArrayReader secondReader = new CharArrayReader(chars, 0, 3);

        int i;
        System.out.println("input1 is:");
        while ((i = firstReader.read()) != -1) {
            System.out.println((char) i);
        }
        System.out.println("input2 is:");
        while ((i = secondReader.read()) != -1) {
            System.out.println((char) i);
        }
    }

    public static void fileReader(String fileName) throws IOException {
        Reader reader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(reader);
//        String s;
//        while ((s = bufferedReader.readLine()) != null) {
//            System.out.println(s);
//        }
        String collect = bufferedReader
                .lines()
                .filter(str -> !str.contains("$"))
                .collect(Collectors.joining("\n"));
        System.out.println(collect);
    }
}