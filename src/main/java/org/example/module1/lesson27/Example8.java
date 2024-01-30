package org.example.module1.lesson27;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Example8 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 30, 20, 40, 0);
        System.out.println(localDateTime);

        Instant now = Instant.now();
        Instant instant = Instant.ofEpochMilli(1000);
        System.out.println(now);

        System.out.println(now.getEpochSecond());
        System.out.println(now.toEpochMilli());
        System.out.println(now.getNano());

    }
}
