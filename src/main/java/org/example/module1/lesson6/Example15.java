package org.example.module1.lesson6;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            System.out.println(s);
            if ("exit".equals(s)) {
                break;
            }
        }
    }
}
