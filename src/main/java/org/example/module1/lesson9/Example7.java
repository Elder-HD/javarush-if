package org.example.module1.lesson9;

public class Example7 {
    public static void main(String[] args) {
        sum(1, 2);

        sum(1, 2, 100);
    }

//    public static void sum(int a, int b) {
//        System.out.println("hello");
//    }

    public static void sum(int x, int y) {
        int result = x + y;
        System.out.println(result);
    }

    public static void sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
    }
}
