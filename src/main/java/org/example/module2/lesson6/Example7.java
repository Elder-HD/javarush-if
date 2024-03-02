package org.example.module2.lesson6;

import java.util.function.Function;

public class Example7 {
    public static void main(String[] args) {
        //With static method
//        Function<String, Integer> converter = (line) ->  findLineLength(line);
        Function<String, Integer> converter1 = Example7::findLineLength;

        Integer length = converter1.apply("Hello");
        System.out.println(length);

        System.out.println(converter1.apply(null));

        //With no-static method
        Example7 e = new Example7();
        Function<String, Integer> converter2 = e::findLineLength2;

        System.out.println(converter2.apply("Hi"));


        // functional interface (int, String)    | our method (String, int)
    }


    public static int findLineLength(String line) {
        System.out.println("working ....");

        return line == null ? 0 : line.length();
    }

    public int findLineLength2(String line) {
        System.out.println("working ....");

        return line == null ? 0 : line.length();
    }
}
