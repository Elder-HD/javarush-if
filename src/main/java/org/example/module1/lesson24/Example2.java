package org.example.module1.lesson24;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Example2 {
    public static void main(String[] args) {
        File sourceFile = new File("src/main/resources/lesson24/example1.txt");
        File targetFile = new File("src/main/resources/lesson24/destination2.txt");
        try (Reader reader = new FileReader(sourceFile);
             Writer writer = new FileWriter(targetFile, true)) {
            int b;
            while ((b = reader.read()) != -1) {
                System.out.print((char) b);
                writer.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
