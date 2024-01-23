package org.example.module1.lesson25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String text = " Hello all! Привіт! Привіт!Привіт!Привіт!Привіт!Привіт!Привіт!Привіт!\n" +
                "Привіт!Привіт!Привіт!Привіт!Привіт!Привіт!\n" +
                "Привіт!Привіт!Привіт!Привіт!Привіт!";

        byte[] bytesSource = text.getBytes(); // {1, 0, 2,3,4}

        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(bytesSource);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(2048)) {
            int numberOfBytes;
            byte[] buffer = new byte[32];
            while ((numberOfBytes = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, numberOfBytes);
            }

            System.out.println(outputStream.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
