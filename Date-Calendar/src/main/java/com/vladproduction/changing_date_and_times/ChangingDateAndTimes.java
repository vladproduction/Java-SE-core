package com.vladproduction.changing_date_and_times;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class ChangingDateAndTimes {
    public static void main(String[] args) {

        //create some DateTime object (for example now())
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("ldt1 = " + ldt1);//ldt1 = 2025-01-17T20:05:20.336434700

        //plus and minus methods
        //days (altering year if days more added for the current year)
        LocalDateTime ldt2 = ldt1.plusDays(10);
        System.out.println("ldt2 = " + ldt2);//ldt2 = 2025-01-27T20:06:14.713945900 (10 days were added to ldt1)

        //minutes (altering day in assumption by adding minutes)
        LocalDateTime ldt3 = ldt1.plusMinutes(10);
        System.out.println("ldt3 = " + ldt3);//ldt3 = 2025-01-17T20:18:56.332454500 (were added 10 minutes to ldt1)
        //minus method works the same way in opposite

        //with methods
        //to specify a month for ldt1 (let say we need June)
        LocalDateTime ldt4 = ldt1.withMonth(6);
        System.out.println("ldt4 = " + ldt4);

        //plus and minus methods who working with period and duration:
        //Period: plus week for example
        LocalDateTime plusWeekTo_ldt1 = ldt1.plus(Period.ofWeeks(1));
        System.out.println("plusWeekTo_ldt1 = " + plusWeekTo_ldt1);//plusWeekTo_ldt1 = 2025-01-24T20:25:28.781910800 (week were added)

        //subtract for 4 hours
        LocalDateTime minus4HoursFrom_ldt1 = ldt1.minus(Duration.ofHours(10));
        System.out.println("minus4HoursFrom_ldt1 = " + minus4HoursFrom_ldt1);//minus4HoursFrom_ldt1 = 2025-01-17T10:29:53.707296 (-10 hours were performed)

    }
}
