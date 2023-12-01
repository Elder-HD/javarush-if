package org.example.module1.lesson7;

public class Example2 {
    public static void main(String[] args) {
        int[] items = new int[10];

        items[0] = 100;
        items[1] = items[0] + 100; // 100+100
        items[2]++;
        ++items[3];
        items[4] += 2;
        int index = items[2];  // index = 1
        items[index] = 2;// items[1] =2;

        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);
        System.out.println(items[3]);
        System.out.println(items[4]);
    }
}
