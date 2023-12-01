package org.example.module1.lesson7;

public class Example7 {
    public static void main(String[] args) {
        int[] months1 = new int[12];
        months1[0] = 31; // січень
        months1[1] = 28; // лютий
        months1[2] = 31; // березень
        months1[3] = 30; // квітень
        months1[4] = 31; // травень
        months1[5] = 30; // червень
        months1[6] = 31; // липень
        months1[7] = 31; // серпень
        months1[8] = 30; // вересень
        months1[9] = 31; // жовтень
        months1[10] = 30; // листопад
        months1[11] = 31; // грудень

        // довжини місяців року
        int[] months =  { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String[] monthNames = {
                "Січень",
                "Лютий",
                "Березень",
                "Квітень",
                "Травень",
                "Червень",
                "Липень",
                "Серпень",
                "Вересень",
                "Жотень",
                "Листопад",
                "Грудень",
        };


        System.out.println(months.length);
        System.out.println(monthNames.length);
    }
}
