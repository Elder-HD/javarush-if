package org.example.module1.lesson9;

public class Example8 {
    public static void main(String[] args) {
        int sum1 = sum(1, 2);
        System.out.println(sum1);

        System.out.println(sum(1,2,1000));
    }


    public static int sum(int a, int b) {
        int result = a + b;

        return result;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
