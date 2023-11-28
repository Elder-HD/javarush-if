package org.example.module1.lesson4;

public class Example12 {
    public static void main(String[] args) {

//        int money;
//        if (age > 30)
//            money = 100;
//        else
//            money = 50;

        int age = 25;
        int money = (age > 30) ? 100 : 50;

        System.out.println(money); // with local variable money

        System.out.println((age > 30) ? 100 : 50);

        //(age > 30) ? System.out.println(100): System.out.println(50); does not work



    }
}
