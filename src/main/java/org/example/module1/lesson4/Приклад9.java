package org.example.module1.lesson4;

import java.util.Scanner;

// поганий приклад
public class Приклад9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input temperature using int: ");
        int температура = scanner.nextInt();
        if (температура > 20) {
            System.out.println("одягнути сорочку");
        } else if (температура > 10) {
            System.out.println("одягнути светр");
        } else if (температура > 0) {
            System.out.println("одягнути плащ");
        } else {
            System.out.println("одягнути пальто");
        }

    }
}
