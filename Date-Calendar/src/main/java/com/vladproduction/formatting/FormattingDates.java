package com.vladproduction.formatting;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDates {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        //formatting:
        String dateFormatted1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt);
        System.out.println("dateFormatted1 = " + dateFormatted1);

        String dateFormatted2 = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);
        System.out.println("dateFormatted2 = " + dateFormatted2);

        //custom formatter:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dtf.format(ldt)); //17-January-2025
        System.out.println(dtf.format(ldt.plusMonths(1))); //17-February-2025

        //other way format style using Enum
        String formatStyle_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(ldt);
        String formatStyle_medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(ldt);
        String formatStyle_full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(ldt);
        String formatStyle_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(ldt);

        System.out.println("formatStyle_short = " + formatStyle_short);
        System.out.println("formatStyle_medium = " + formatStyle_medium);
        System.out.println("formatStyle_full = " + formatStyle_full);
        System.out.println("formatStyle_long = " + formatStyle_long);

        //What value of the timeFormat variable in the first line of the code below would result in the string "14:30:00" in the console?
        String timeFormat = "14:30:00";
        LocalTime time = LocalTime.of(14, 30);
        System.out.println(time.format(DateTimeFormatter.ofPattern(timeFormat)));
        //1)HH:MM:ss
        //2)hh:mm:ss
        //3)HH:MM:SS
        //4) + HH:mm:ss

    }
}
