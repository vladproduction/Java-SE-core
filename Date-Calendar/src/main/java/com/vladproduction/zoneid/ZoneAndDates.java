package com.vladproduction.zoneid;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneAndDates {
    public static void main(String[] args) {
        System.out.println("\n*** listingOfAllZoneIDs ***");
        listingOfAllZoneIDs();
        System.out.println("\n*** listingOfAllZoneIDsDisplayNames ***");
        listingOfAllZoneIDsDisplayNames();
        System.out.println("\n*** createZonedDateTimes ***");
        createZonedDateTimes();
        System.out.println("\n*** getTimeInUTCStandard ***");
        getTimeInUTCStandard();
        System.out.println("\n*** getUtcLocalDateTimeExample ***");
        getUtcLocalDateTimeExample();

    }

    private static void getUtcLocalDateTimeExample() {
        // Get the current time in UTC as an Instant
        Instant utcNow = Instant.now();
        System.out.println("Current time utc now = \n" + utcNow);
        // Convert Instant to LocalDateTime in UTC
        LocalDateTime utcLocalDateTime = LocalDateTime.ofInstant(utcNow, ZoneOffset.UTC);
        System.out.println("Current LocalDateTime in UTC: \n" + utcLocalDateTime);
    }

    private static void getTimeInUTCStandard() {
        // Get the current time in UTC
        Instant utcNow = Instant.now();

        System.out.println("Current time in UTC: " + utcNow);
    }

    private static void createZonedDateTimes() {
        ZoneId zoneId = ZoneId.of("Europe/Kyiv");
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, zoneId);
        System.out.println(zoneId);
        System.out.println(zdt1);

        //other way to create ZoneDateTime instance:
        ZonedDateTime zdt2 = ldt.atZone(zoneId);
        //or:
        ZonedDateTime zdt3 = ZonedDateTime.now();
        System.out.println("zdt2 = " + zdt2);
        System.out.println("zdt3 = " + zdt3.getZone());
    }

    private static void listingOfAllZoneIDsDisplayNames() {
        for (String zoneIDString : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(zoneIDString);
            String zoneIdDisplayName = zoneId.getDisplayName(TextStyle.FULL, Locale.UK);
            System.out.println(zoneIDString + " : " + zoneIdDisplayName); //Europe/Kyiv : Kyiv Time
        }
    }

    private static void listingOfAllZoneIDs() {
        for (String zoneID : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneID); //Europe/Kiev
        }
    }
}
