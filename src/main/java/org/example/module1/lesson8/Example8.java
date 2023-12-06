package org.example.module1.lesson8;

public class Example8 {
    public static void main(String[] args) {
        int[] items = new int[4]; // {0, 0, 0, 0}
        String[] strings = new String[4]; //{null, null, null, null}
        int[][] items2= {{1}, {2,3}};

        int[][] data = new int[4][]; //{null,null,null,null}

        int[] [] data2= new int[4][2];// {{0,0}, {0,0}, {0,0}, {0,0}}


        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        for (int i = 0; i < data.length; i++) { // data.length ---> 4
            for (int j = 0; j < data[i].length; j++) { // data[0] ---> null, null.length-->NPE
                data[j][i] = i * j;
            }
        }
//
//
//        // to print array
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                System.out.print(data[j][i] + " ");
//            }
//            System.out.println();
//        }
    }
}
