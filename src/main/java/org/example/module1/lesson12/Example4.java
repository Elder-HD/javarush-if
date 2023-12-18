package org.example.module1.lesson12;

public class Example4 {
    public static void main(String[] args) {
        long a = 1L;
        int b = (int) a;
        short c = (short) b;
        byte d1 = (byte) c;
        byte d2 = (byte) a;

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("=================================");

        int a2 = 127 + 128;

        byte b2 = (byte) a2;

        System.out.println(b2);
    }
}
