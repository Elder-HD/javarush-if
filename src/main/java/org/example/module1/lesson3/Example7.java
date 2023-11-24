package org.example.module1.lesson3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        String str = "10 20 30 40 abc";

        Scanner scanner = new Scanner(str);
        scanner.nextInt();
        scanner.nextInt();

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        String c = scanner.next();
        System.out.println(c);
    }
}
