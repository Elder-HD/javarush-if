package org.example.module1.lesson4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input temperature using int: ");
        int temperature = scanner.nextInt();
        if (temperature > 20) {
            System.out.println("одягнути сорочку");
        } else if (temperature > 10) {
            System.out.println("одягнути светр");
        } else if (temperature > 0) {
            System.out.println("одягнути плащ");
        } else {
            System.out.println("одягнути пальто");
        }

    }
}
