package org.example.module1.lesson27;

import java.time.LocalDate;
import java.time.Month;

public class Example6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate localDate2 = LocalDate.of(2024, 1, 1);

        System.out.println(now);
        System.out.println(localDate);
        System.out.println(localDate2);
        System.out.println("==============");
        System.out.println(now.getEra());
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());

        LocalDate datePlus2Days = now.plusDays(2);
        LocalDate minus1000YearsDate = now.minusYears(1000);
        System.out.println(datePlus2Days);
        System.out.println(minus1000YearsDate);
    }
}
