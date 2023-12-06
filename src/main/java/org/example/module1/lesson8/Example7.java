package org.example.module1.lesson8;

public class Example7 {
    public static void main(String[] args) {

        // (x*y)*z*
        int[][][][] data = new int[10][2][3][10];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    for (int d = 0; d < data[i][j][k].length; d++) {
                        data[i][j][k][d] = i * j * k * d;
                    }
                }
            }
        }


    }
}
