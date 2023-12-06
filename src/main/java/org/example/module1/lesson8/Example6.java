package org.example.module1.lesson8;

public class Example6 {
    public static void main(String[] args) {
        int[] line0 = {31, 28, };
        int[] line1 = {30, 31, 30};
        int[] line2 = {31, 31, 30, 100};
        int[] line3 = {31, 30, };

        int[][] data = {line0, line1, line2, line3};
        int[] data0 = data[0]; // data0=line0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }


    }
}
