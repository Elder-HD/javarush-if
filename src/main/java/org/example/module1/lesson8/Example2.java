package org.example.module1.lesson8;

public class Example2 {
    public static void main(String[] args) {
        int[] items = {1, 2, -3, 4, 5};

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.println();

        System.out.println("==============================");
        int[][] data = new int[5][4];
        // 5- ширина 4-довжина
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        data[0][1] = 1;
        data[2][3] = -2;
        data[3][1] = 6;
        // 0 0 0  0 0
        // 1 0 0  6 0
        // 0 0 0  0 0
        // 0 0 -2 0 0

        // 0 0 0  0 0
        // 1 0 0  6 0
        //

        for (int i = 0; i < 4; i++) { // i=1
            for (int j = 0; j < 5; j++) { //
                System.out.print(data[j][i] + " ");
            }
            System.out.println();
        }


    }
}
