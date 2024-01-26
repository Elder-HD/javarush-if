package org.example.module1.lesson26;

import java.io.File;
import java.nio.file.Path;

public class Example2 {
    public static void main(String[] args) {
        String filename = "src/main/resources/module1.lesson26/data.txt";

        Path path = Path.of(filename);

        System.out.println(path.toAbsolutePath());
        System.out.println(path.isAbsolute());
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.getNameCount());

        //File vs Path
        System.out.println("==============================");
        File file = path.toFile();
        System.out.println(file.canExecute());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.isDirectory());
    }

}
