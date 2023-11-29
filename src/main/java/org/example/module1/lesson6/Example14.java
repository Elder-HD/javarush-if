package org.example.module1.lesson6;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        while (!"exit".equals(s)) {
            System.out.println(s);
            s = console.nextLine();
        }


        System.out.println("=======================");

        String s1;
        do {
            s1 = console.nextLine();
            System.out.println(s1);
        }
        while (!"exit".equals(s1));
    }
}
