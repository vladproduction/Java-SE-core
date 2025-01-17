package com.vladproduction.period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodsExample {
    public static void main(String[] args) {

        Period per1 = Period.of(1, 1, 1);
        System.out.println("per1 = " + per1); //per1 = P1Y1M1D

        //period persisting only by days:
        Period per2 = Period.ofDays(2);
        System.out.println("per2 = " + per2); //per2 = P2D

        //2 local dates and between()
        LocalDate ld2 = LocalDate.of(2024, 1, 1);
        LocalDate ld1 = LocalDate.now();
        Period per3 = Period.between(ld2, ld1);
        System.out.println("per3 = " + per3); //calculate amount of days from now to start of the year2024 example: per3 = P1Y16D

        //what if we need value in days for the previous params:
        System.out.println("per3(days) = " + per3.getDays());//16; does not work correct, it calculates only days, skip months and even years
        //to fix it:
        long daysBetweenDates = ChronoUnit.DAYS.between(ld2, ld1);
        System.out.println("daysBetweenDates = " + daysBetweenDates);//daysBetweenDates = 382

    }
}
