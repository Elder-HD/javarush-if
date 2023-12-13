package org.example.module1.lesson10;

public class Example8 {
    public static void main(String[] args) {
        String text = "";

        System.out.println(text.length());
        System.out.println(text.isEmpty());
        System.out.println("    \t ".isBlank());
        System.out.println("=".repeat(10));
        System.out.println("abcdf".charAt(0));

        char[] chars = "123456".toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("=".repeat(100));
        byte[] bytes = "こんにちは".getBytes();

        for (int i = 0; i <bytes.length ; i++) { // -128, 127
            System.out.println((char) bytes[i]); // does not work in the right way
        }
    }
}
