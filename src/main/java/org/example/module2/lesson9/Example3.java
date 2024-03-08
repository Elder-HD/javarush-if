package org.example.module2.lesson9;

public class Example3 {
    public static void main(String[] args) {
        Object reference1 = "";
        Object reference2 = "" + 1;
        Object reference3 = 123 + " hello";
        Object reference4 = 123;
        Object reference5 = new Object();

        System.out.println(reference1.getClass().getName());
        System.out.println(reference2.getClass().getName());
        System.out.println(reference3.getClass().getName());
        System.out.println(reference4.getClass().getName());
        System.out.println(reference5.getClass().getName());
    }
}
