package org.example.module1.lesson6;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input day number");
        int day = scanner.nextInt(); //day [ 1, .., 7]

        if (day == 1) {
            System.out.println("hello");
        } else if (day == 2) {
            System.out.println("hello");
            System.out.println("hello");
        } else if (day == 3) {
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
        }
    }
}
