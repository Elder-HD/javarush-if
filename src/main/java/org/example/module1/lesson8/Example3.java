package org.example.module1.lesson8;

public class Example3 {
    public static void main(String[] args) {
        int[][] data = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                data[j][i] = i * j;
            }
        }


        // to print array
        for (int i = 0; i < 10; i++) { // i=1
            for (int j = 0; j < 10; j++) { //
                System.out.print(data[j][i] + " ");
            }
            System.out.println();
        }
    }
}
