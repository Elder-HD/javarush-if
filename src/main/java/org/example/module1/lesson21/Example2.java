package org.example.module1.lesson21;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        Integer c = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - div, other - add");
        int choose = scanner.nextInt();
        try {
            if (choose == 1) {
                System.out.println(a / b);
            } else {
                System.out.println(a + c);
            }
        } catch (ArithmeticException e) {
            handleMathException(e);
        } catch (NullPointerException e){
            handleNPE(e);
        }

        System.out.println("End");
    }

    private static void handleNPE(NullPointerException e) {
        System.out.println(e);
    }

    private static void handleMathException(ArithmeticException e) {
        System.out.println("==================");
        System.out.println("Arithmetic exception ....");
        System.out.println(e);
        System.out.println("==================");
    }
}
