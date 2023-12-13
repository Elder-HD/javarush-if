package org.example.module1.lesson10;

public class Example10 {
    public static void main(String[] args) {
        String text = "Textxt";

        System.out.println(text.equals("text"));
        System.out.println(text.equalsIgnoreCase("tExT"));

        System.out.println(text.startsWith("T"));
        System.out.println(text.endsWith("xt"));

        System.out.println(text.indexOf("xt"));
        System.out.println(text.lastIndexOf("xt"));
        System.out.println(text.matches(""));

        System.out.println(text.substring(1,2));


        System.out.println("abcdafa".replace('a', '_'));


    }
}
