package org.example.module1.lesson27;

import java.time.LocalTime;

public class Example7 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        LocalTime in2Hour = now.plusHours(1);

        System.out.println(in2Hour);
        System.out.println(now.minusHours(20));
    }
}
