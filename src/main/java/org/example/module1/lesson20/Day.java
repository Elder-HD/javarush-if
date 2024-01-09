package org.example.module1.lesson20;

import java.util.Arrays;
import java.util.List;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static List<Day> asList(){
        return Arrays.asList(values());
    }

    public void printInfo(){
        System.out.println(name());
    }
}

class Example1 {
    public static void main(String[] args) {
        Day[] values = Day.values();
        for (Day value : values) {
            System.out.println(value);
        }

        Day day = Day.valueOf("MONDAY");
        System.out.println(day == Day.MONDAY);

        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.FRIDAY.ordinal());
        Day monday = Day.MONDAY;
        System.out.println(monday.name());
        System.out.println(monday.toString());
        System.out.println(Day.SUNDAY.compareTo(Day.FRIDAY));

        Day.values()[5] = Day.FRIDAY;

        System.out.println(Day.values()[5]);

        List<Day> days = Day.asList();
        System.out.println(days.size());
        Day.FRIDAY.printInfo();


    }

}
