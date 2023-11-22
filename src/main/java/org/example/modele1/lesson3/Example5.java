package org.example.modele1.lesson3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Input a");
        int a = console.nextInt(); //2
        System.out.println("Input b");
        int b = console.nextInt(); //3
        // 1) put values instead of a and b  "a=" + 2 + ", b=" + 3
        // "a=2" + ", b=" + 3
        //"a=2, b="+3
        //"a=2, b=3"
//        "a=" + 2 + ", b=" + 3
        System.out.println("a=" + a + ", b=" + b);

        System.out.println("a+b=" + (a + b));
        System.out.println("a+b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));
    }
}
