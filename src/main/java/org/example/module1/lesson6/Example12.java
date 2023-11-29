package org.example.module1.lesson6;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input day number");
        int day = scanner.nextInt(); //day [ 1, .., 7]

        for (int i = 0; i < day; i++) {
            System.out.println("hello");
        }
    }
}
