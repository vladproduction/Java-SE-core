package com.vladproduction.zoneid;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Time_ZoneId {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        ZoneId zoneId = ZoneId.of("Europe/Kiev");
        ZonedDateTime zdt = ZonedDateTime.of(localDate, localTime,zoneId);
        System.out.println(zdt);

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIds);


    }

}
