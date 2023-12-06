package org.example.module1.lesson8;

public class Example5 {
    public static void main(String[] args) {
        int[] line0 = {31, 28, 31};
        int[] line1 = {30, 31, 30};
        int[] line2 = {31, 31, 30};
        int[] line3 = {31, 30, 31};

        int[] ints = {0, 1, 2, 3};
        int[][] data = {line0, line1, line2, line3};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(data[j][i] + " ");
            }
            System.out.println();
        }


    }
}
