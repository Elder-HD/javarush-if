package org.example.module1.lesson27;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example5 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        GregorianCalendar gregorianCalendar = new GregorianCalendar(2024, 1, 30);
        System.out.println(gregorianCalendar.get(Calendar.ERA));
        System.out.println(gregorianCalendar.get(Calendar.YEAR));
        System.out.println(gregorianCalendar.get(Calendar.MONTH));
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH));


        gregorianCalendar.set(Calendar.MONTH, 2);
    }
}
