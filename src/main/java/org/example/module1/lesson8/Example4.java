package org.example.module1.lesson8;

public class Example4 {
    public static void main(String[] args) {
        int[][] months = {
                {31, 28, 31},
                {30, 31, 30},
                {31, 31, 30},
                {31, 30, 31}
        };

        System.out.println(months[0][1]);
        months[0][1] =29;
        System.out.println(months[0][1]);

    }
}
