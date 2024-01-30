package org.example.module1.lesson27;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.sleep(1000);

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        Date current = new Date();
        Date date = new Date(2024 - 1900, 0, 30);

        System.out.println(current.toString());
        System.out.println(date.toString());
        System.out.println("===================");
        current.setYear(125);
        System.out.println(current.getYear() + 1900);
        System.out.println(current.getMonth() + 1);
        System.out.println(current.getDate());
        System.out.println(current.getDay());
        System.out.println(current.getHours());
        System.out.println(current.getMinutes());
        System.out.println(current.getSeconds());

        System.out.println("============");
    }
}
