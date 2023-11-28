package org.example.module1.lesson4;

public class Example15 {
    public static void main(String[] args) {
        String s1 = "Вітаю";
        String s2 = "ВІТАЮ";
        String s3 = s1.toUpperCase();
        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equals(s3));//false
        System.out.println(s2.equals(s3));//true
        System.out.println("===================");

        System.out.println(s2 == s3);//false

    }
}
