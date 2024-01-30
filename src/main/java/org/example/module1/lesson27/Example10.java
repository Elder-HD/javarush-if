package org.example.module1.lesson27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example10 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");


        LocalDateTime localDateTime =
                LocalDateTime.of(2024, 1, 30, 21, 0, 0);
        String format = localDateTime.format(dateTimeFormatter);


        System.out.println(format);


        LocalDateTime parse = LocalDateTime.parse("2024:01:30 22:00:00", dateTimeFormatter);

        System.out.println(parse.toString());
    }
}
