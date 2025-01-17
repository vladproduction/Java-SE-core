package com.vladproduction.duration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        Duration d1 = Duration.of(1, ChronoUnit.DAYS);
        Duration d2 = Duration.of(2, ChronoUnit.DAYS);
        System.out.println("d1 = " + d1);//d1 = PT24H
        System.out.println("d2 = " + d2);//d2 = PT48H

        //create Duration by a specific method:
        Duration d3 = Duration.ofHours(5);
        System.out.println("d3 = " + d3);//d3 = PT5H

        //duration and between two times:
        LocalTime ltNow = LocalTime.now();
        LocalTime lt15 = LocalTime.of(15, 0);
        Duration durationBetween = Duration.between(ltNow, lt15);
        System.out.println("durationBetween = " + durationBetween);


        //How is a Duration object created in Java 8?
        Duration oneHour1 = Duration.ofHours(1);
        Duration oneHour2 = Duration. ofMinutes(60);
//        Duration oneHour3 = new Duration("PT1H");
        Duration oneHour4 = Duration.parse("PT1H");

        System.out.println("oneHour1 = " + oneHour1);
        System.out.println("oneHour2 = " + oneHour2);
//        System.out.println("oneHour3 = " + oneHour3);
        System.out.println("oneHour4 = " + oneHour4);

        /*Correct:
        In Java 8, an object of the Duration class can be created using the static methods ofHours(), ofMinutes(), parse(), etc.
        You cannot create an object of the Duration class using a constructor.*/
    }
}
