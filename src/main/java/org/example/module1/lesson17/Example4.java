package org.example.module1.lesson17;

import java.util.HashSet;

public class Example4 {

    private static final String LINE = "=".repeat(100);

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            set.add(i);
        }

        System.out.println(LINE);
        for (Integer value : set) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println(LINE);
    }
}
