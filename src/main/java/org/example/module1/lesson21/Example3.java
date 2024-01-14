package org.example.module1.lesson21;

public class Example3 {
    //outOfMemoryError
    public static void main(String[] args) {
        try {
            long[] items = new long[Integer.MAX_VALUE / 2];
        } catch (OutOfMemoryError error){
            System.out.println("error");
            int[] ints = new int[1_000_000];
        }

    }
}
