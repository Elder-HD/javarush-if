package org.example.module1.lesson27;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example9 {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }

        ZoneId zoneId = ZoneId.of("Europe/Vienna");
        ZonedDateTime now = ZonedDateTime.now(zoneId);

        System.out.println(now);
    }
}
