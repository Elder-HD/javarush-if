package org.example.module1.lesson9;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] items = new int[5];

        for (int i = 0; i < items.length; i++) {
            items[i] = scanner.nextInt();
        }


        for (int i = 0; i <items.length ; i++) {
            if(items[i]==5){
                return;
            }
        }

        printArray(items);
    }

    private static void printArray(int[] array) {
        System.out.println("======================");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("======================");

    }
}
