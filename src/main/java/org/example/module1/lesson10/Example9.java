package org.example.module1.lesson10;

public class Example9 {
    public static void main(String[] args) {
        String text = "Alex\nIvan\nPetro\nAndrii";

        String[] names = text.split("\n");

        System.out.println(names.length);

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }

        String lineWithNames = String.join(", ", names);

        System.out.println(lineWithNames);

    }
}
