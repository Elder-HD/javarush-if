package org.example.module1.lesson12;

public class Example1 {
    public static void main(String[] args) {
        double infinityDouble = 1.0 / 0.0;
        System.out.println(infinityDouble);// Infinity
        System.out.println(-1.0 / 0.0);// -Infinity


        System.out.println(infinityDouble * 100);

        System.out.println(infinityDouble * 0.0); // 1) 1_000_000 * 0.1  2)  1_000_000*0.00000000000000001

        System.out.println(infinityDouble / 1_000_000);


        System.out.println(infinityDouble * infinityDouble);
        System.out.println(infinityDouble / infinityDouble);
        System.out.println(infinityDouble - infinityDouble);
        System.out.println(-infinityDouble - infinityDouble);



        System.out.println((100 / 0.0) == (1_000_000 / 0.0));
    }
}
