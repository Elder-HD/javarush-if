package org.example.module1.lesson24;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in);) {
            String line = console.nextLine();
            System.out.println(line);
        }
    }
}
