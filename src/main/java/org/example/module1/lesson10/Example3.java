package org.example.module1.lesson10;

public class Example3 {

    public static final double ACCELERATION_OF_GRAVITY = 9.8;
    //9.8
    private static final int CONSTANT = 10;

    public static void main(String[] args) {
        final byte a = 100;
        final byte b = 2;
        byte c = a + b + CONSTANT;

        System.out.println(c);// -128, ..., 127
        double t = 10;
        double v = ACCELERATION_OF_GRAVITY * t;
    }
}
