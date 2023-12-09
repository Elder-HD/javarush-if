package org.example.module1.lesson9;

import java.lang.Math;
public class Example11 {
    public static void main(String[] args) {
        staticMethod();

        int max = Math.max(-1, 3);
        String s = String.valueOf(1);
        System.out.println(max);
    }


    private static void staticMethod(){
        System.out.println("static method");
    }
}
