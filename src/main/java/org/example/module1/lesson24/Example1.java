package org.example.module1.lesson24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example1 {

    // Task1*: reimplement current code using buffer: read( byte[] buffer) and write(byte[] buffer) ???
    public static void main(String[] args) {
        File sourceFile = new File("src/main/resources/lesson24/example1.txt");
        File targetFile = new File("src/main/resources/lesson24/destination1.txt");
        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(targetFile)) {
            int b;
            while ((b = inputStream.read()) != -1) {
                System.out.print((char)b);
                outputStream.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("Привіт!");
    }
}
