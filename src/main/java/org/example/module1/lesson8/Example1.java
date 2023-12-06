package org.example.module1.lesson8;

public class Example1 {
    public static void main(String[] args) {
        int[] items = new int[5];
        // 0 0 0 0 0
        items[1] = 1; // 0 1 0 0 0
        items[3] = -1;// 0 1 0 -1 0


        int[][] data = new int[5][4];
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0

        data[2][1] = 1;
        // 0 0 0 0 0
        // 0 0 1 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0


        data[3][2] = -1;
        // 0 0 0 0  0
        // 0 0 1 0  0
        // 0 0 0 -1 0
        // 0 0 0 0  0
    }
}
