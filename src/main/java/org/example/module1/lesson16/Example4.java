package org.example.module1.lesson16;

public class Example4 {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 0;
        double result = a / b;

        System.out.println(result);

        System.out.println(Double.isInfinite(result));
        System.out.println(Double.isFinite(result));
        double v = result * 0.0;
        System.out.println(v);
        System.out.println(Double.isNaN(v));
    }
}
