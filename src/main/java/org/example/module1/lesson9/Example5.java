package org.example.module1.lesson9;

public class Example5 {
    public static void main(String[] args) {
        int v = 10;
        System.out.println("v=" + v);
        method(v);
        System.out.println("v2=" + v);
    }

    public static void method(int value) {
        value = 1_000_000;
    }
}
