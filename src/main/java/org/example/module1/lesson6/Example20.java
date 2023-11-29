package org.example.module1.lesson6;

public class Example20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
                if (j == 5) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
