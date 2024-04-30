package org.example.module1.lesson26;

import java.io.File;

//Task 2*: add txt files with text
// implement recursive search in text files
public class Example4 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/module1/lesson26/d");
        searchAllFiles(file);
    }

    public static void searchAllFiles(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f: files) {
                searchAllFiles(f);
            }
        } else {
            System.out.println("file: " + file);
        }
    }

    //TODO:
    public static  void searchInAllFilesFromDirectory(File file, String text){

    }
}
