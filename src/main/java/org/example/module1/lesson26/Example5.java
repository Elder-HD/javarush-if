package org.example.module1.lesson26;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example5 {
    public static void main(String[] args) {
        Path root = Path.of("src/main/resources");
        try (DirectoryStream<Path> files = Files.newDirectoryStream(root)) {
            for (Path path : files)
                System.out.println(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
