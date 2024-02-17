package org.example.module2.lesson2;

public class Example6 {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(1,-2,10));
    }

    // no-static overload and override (sub-classes)
    // static overload
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
