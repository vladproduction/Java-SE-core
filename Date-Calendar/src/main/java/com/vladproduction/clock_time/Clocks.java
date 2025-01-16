package com.vladproduction.clock_time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Clocks {
    public static void main(String[] args) {
        Clock clockSDF = Clock.systemDefaultZone();
        System.out.println("clock_systemDefaultZone = " + clockSDF);

        Instant instant = clockSDF.instant();
        System.out.println("instant = " + instant);//2025-01-16T10:15:14.532350100Z

        Clock clockUTC = Clock.systemUTC();
        System.out.println("clock_systemUTC [Z] = " + clockUTC);
        System.out.println("clock_systemUTC = " + clockUTC.instant());//2025-01-16T10:15:14.533853400Z

        //creating a clock and using another clock:
        Clock clock2 = Clock.offset(clockSDF, Duration.ofHours(10));
        System.out.println("clock2.instant() = " + clock2.instant());

        //How do you create an instance of the Clock class in Java 8?
        //Clock clockA = new Clock();
        Clock clockB = Clock.systemUTC();
        //Clock clockC = Clock.getTimeZone("UTC");
        //Clock clockD = Clock.getDefault();
    }
}
