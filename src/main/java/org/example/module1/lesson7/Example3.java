package org.example.module1.lesson7;

public class Example3 {
    public static void main(String[] args) {
        int length = 0;
        int[] array = new int[length];
        // index 0 ,... , 99

        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index++]);
        }
    }
}
