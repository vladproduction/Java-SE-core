package com.vladproduction.calendar;

import java.util.Calendar;

public class UsingCalendar {
    public static void main(String[] args) {
        // Current date:
        Calendar today=Calendar.getInstance();
        System.out.println("Today "+today.getTime());
        System.out.println("Day of week:\t"+today.get(Calendar.DAY_OF_WEEK));
        System.out.println("Date:\t\t\t"+today.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month:\t\t\t"+today.get(Calendar.MONTH));
        System.out.println("Year:\t\t\t"+today.get(Calendar.YEAR));
        System.out.println("Hours:\t\t\t"+today.get(Calendar.HOUR));
        System.out.println("Minutes:\t\t"+today.get(Calendar.MINUTE));
        System.out.println("Seconds:\t\t"+today.get(Calendar.SECOND));

    }
}
