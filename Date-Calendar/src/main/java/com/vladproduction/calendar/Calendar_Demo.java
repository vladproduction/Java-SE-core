package com.vladproduction.calendar;

import java.util.Calendar;

public class Calendar_Demo {
    public static void main(String[] args) {
        // Current date:
        Calendar start=Calendar.getInstance();
        System.out.println("Start execution: "+start.getTime());
        long time;
        // Millions seconds ago:
        time=start.getTimeInMillis()-1000000000;
        Calendar t=Calendar.getInstance();
        t.setTimeInMillis(time);
        System.out.println("Millions seconds ago: " +t.getTime());
        // Time of finishing programme(almost):
        Calendar finish=Calendar.getInstance();
        System.out.println("Finish execution: "+finish.getTime());
        // Duration of working programme:
        System.out.println("Past "+(finish.getTimeInMillis()-
                start.getTimeInMillis())+" milliseconds");

    }
}
