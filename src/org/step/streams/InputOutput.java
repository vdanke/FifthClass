package org.step.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputOutput {

    public static void main(String[] args) throws IOException {
        pipeInputOutput();
    }

    public static void parents() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("text.txt");
        OutputStream outputStream = new FileOutputStream("text.txt");
    }

    public static void byteArray() {
        ByteArrayInputStream bi = new ByteArrayInputStream(
                "This is string".getBytes(StandardCharsets.UTF_8)
        );
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        byte[] bytes = bi.readAllBytes();
        String s = new String(bytes, StandardCharsets.UTF_8);
        int available = bi.available();
        bo.write(new byte[200], 0, available);
    }

    public static void inputOutput() throws IOException {
        // input
        InputStream inputStream = new FileInputStream("text.txt");
        byte[] bytes = inputStream.readAllBytes();
        byte[] readBytes = new byte[500];
        int read = inputStream.read(readBytes, 0, 500);
        int i;
        while ((i = inputStream.read()) != -1) {
            System.out.println(i);
        }
        inputStream.mark(500);
        // catch exception
        inputStream.reset();
        inputStream.close();
        // output
        byte[] toWrite = new byte[200];
        OutputStream outputStream = new ByteArrayOutputStream(500);
        outputStream.write(200);
        outputStream.write(toWrite);
        outputStream.write(toWrite, 0, 150);
        outputStream.flush();
    }

    public static void pipeInputOutput() throws IOException {
        byte[] toWrite = new byte[]{1, 0, -1};
        int[] toRead = new int[toWrite.length];

        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);

        for (byte b : toWrite) {
            pipedOutputStream.write(b);
        }
        int available = pipedInputStream.available();

        if (available > 4) {
            System.out.println("Bad **** happened");
        }
        pipedOutputStream.close();
        byte[] bytes = pipedInputStream.readAllBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }
//        for (int i = 0; i < available; i++) {
//            toRead[i] = pipedInputStream.read();
//            System.out.println(toRead[i]);
//        }
    }
}
