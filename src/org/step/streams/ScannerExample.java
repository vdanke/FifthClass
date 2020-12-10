package org.step.streams;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerExample {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("FifthClass.iml");
        Scanner scanner = new Scanner(fr);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.printf("Int %d%n", scanner.nextInt());
            } else if (scanner.hasNextBoolean()) {
                System.out.printf("Boolean %b%n", scanner.nextBoolean());
            } else {
                System.out.printf("String %s%n", scanner.next());
            }
        }
    }

    public static double[] filterOnlyDouble(String str){
        int i = 0;
        double[] arrDouble = new double[str.length()];
        Scanner scanner = new Scanner(str);
        scanner.findInLine("\\d++\\.\\d++");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                arrDouble[i] = scanner.nextDouble();
                i++;
            }
        }
        return arrDouble;
    }

    private static void scannerCreation() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
