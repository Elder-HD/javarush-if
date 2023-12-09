package org.example.module1.lesson9;

public class Example9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 90;

        System.out.println(findMax1(a, b));
        System.out.println(findMax2(a, b));

    }

    public static int findMax1(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }


    public static int findMax2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int findMax3(int a, int b) {
        return (a > b) ? a : b;
    }


}
