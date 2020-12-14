package org.step.exceptions;

import java.io.*;

public class ExceptionRunner {

    /*
    try
    catch
    finally
    throw
    throws

    Checked exception and unchecked exception
     */
    public static void main(String[] args) throws Exception {
//        try {
//            String[] arr = arrayStr();
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//        String str = resourceAutoClose("text1.txt");
//        if (str.equals(FileReadResult.FAILED.name())) {
//            System.out.println("File is empty");
//        } else {
//            System.out.printf("Success: %s", str);
//        }
//        double d = 1.1;
//        try {
//            if (d == 1.0) {
//                throw new FileNotFoundException("Bad things happened");
//            }
//            System.out.printf("My number is: %f %n", d);
//            d = 42/0;
//        } catch (ArithmeticException | FileNotFoundException e) {
//            d = 2.0;
//            System.out.printf("Exception happened: %s%n", e.getLocalizedMessage());
//        } finally {
//            d *= 5;
//        }
//        System.out.println(d);
    }

    public static String resourceAutoClose(String fileName) {
        StringBuilder strBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufferedReader.readLine();
            strBuilder.append(line);
        } catch (IOException e) {
            System.out.printf("Exception happened: %s%n", e.getLocalizedMessage());
        }
        return strBuilder.length() > 0 ? strBuilder.toString() : FileReadResult.FAILED.name();
    }

    public static String[] arrayStr() {
        return new String[Integer.MAX_VALUE];
    }
}
