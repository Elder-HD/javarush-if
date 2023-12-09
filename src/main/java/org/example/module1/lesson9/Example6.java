package org.example.module1.lesson9;

public class Example6 {
    public static void main(String[] args) {
        int[] items = new int[2];
        printArray(items);

        method1(items);
        printArray(items);

        method2(items);
        printArray(items);

        items[0] = -100;
        printArray(items);

        items = new int[10];
        printArray(items);
    }

    public static void method1(int[] values) {
        values = new int[100];
    }

    public static void method2(int[] values) {
        values[0] = 1_000_000;
    }

    public static void printArray(int[] array) {
        System.out.println("======================");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("======================");

    }
}
