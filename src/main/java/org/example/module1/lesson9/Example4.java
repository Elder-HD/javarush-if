package org.example.module1.lesson9;

public class Example4 {
    public static void main(String[] args) {
        int[][] data = new int[10][10];

        initArray(data);

        printArray(data);
    }

    public static void initArray(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[j][i] = i * j;
            }
        }
    }


    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
