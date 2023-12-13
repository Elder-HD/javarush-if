package org.example.module1.lesson10;

public class Example4 {
    public static int count = 0;
    public static int sum = 0;

    public static void add(int data) {
        sum = sum + data;
        int sum = data * 2;
        System.out.println(sum);
        System.out.println(Example4.sum);
        count++;
    }
}
