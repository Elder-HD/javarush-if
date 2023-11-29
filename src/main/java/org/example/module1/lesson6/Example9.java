package org.example.module1.lesson6;

public class Example9 {

    public static void main(String[] args) {
        for (int i = 100; i >= 1 || (i % 2 == 0); i--) { // || --->&&
            System.out.println(i);
        }
    }
}
