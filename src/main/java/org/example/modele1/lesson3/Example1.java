package org.example.modele1.lesson3;

public class Example1 {
    public static void main(String[] args) {
        byte a = 100; // [-128, 127]
        byte b = 3;

//        byte c = a + b;// it doesn't work
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(--a);

        // byte with byte ----> result int
        // byte with int -----> result int

    }
}
