package org.example.module1.lesson4;

//task 1 ---> OR (|| vs |)
// true = true||true
// true = true||false
// true = false||true
// false = false||false

public class Example11 {
    public static void main(String[] args) {
        int a = 10;

        //&& -коротка форма; & -повна форма
        //
        if ((a > 100) && (++a == 100)) { // & --> &&
            System.out.println("If works");
        }

        System.out.println("==========");
        System.out.println("a=" + a);
    }

}
