package com.vladproduction.formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterExamples {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DDD", Locale.US);
        System.out.println(formatter.format(LocalDateTime.now()));
//        +++ 030
//        30
//        Jan
//        Monday
//        January
//        Mon

        LocalDateTime ldt1 = LocalDateTime.now();
        String formattedMedium_ldt1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(ldt1);
        System.out.println("formattedMedium_ldt1 = " + formattedMedium_ldt1);

        System.out.println("----------");
        DateTimeFormatter parser = new DateTimeFormatterBuilder()
                .appendPattern("yyyyMMdd")
                .toFormatter();
        System.out.println(parser.parse("20230115", LocalDate::from)); //2023-01-15

    }
}
