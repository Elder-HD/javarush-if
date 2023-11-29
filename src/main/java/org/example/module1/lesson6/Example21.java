package org.example.module1.lesson6;

public class Example21 {
    // goto from C++
    public static void main(String[] args) {
        first:
        for (int i = 1; i <= 10; i++) {
            second:
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
                if (j == 5) {
                    break first;
                }
            }
            System.out.println();
        }
    }
}
