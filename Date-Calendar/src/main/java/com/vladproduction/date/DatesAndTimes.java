package com.vladproduction.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args) {

        //date
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2025, 1, 16);
        LocalDate ld3 = LocalDate.of(2025, Month.JUNE, 2);

        System.out.println("date");
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3 + "\n");

        //no compile error:
        //LocalDate invalidMonth = LocalDate.of(2022, 13, 12);
        //13 month not existing: DateTimeException: Invalid value for MonthOfYear (valid values 1 - 12): 13

        //time
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(23, 55);

        System.out.println("time");
        System.out.println(lt1);
        System.out.println(lt2 + "\n");

        //datetime
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2025, 1, 16, 10, 10);
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);

        System.out.println("datetime");
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3 + "\n");

        //monthday
        MonthDay md1 = MonthDay.now();
        MonthDay md2 = MonthDay.of(1, 16);
        LocalDate newLocalDate = md2.atYear(2025);

        System.out.println("monthday");
        //to avoid dashes:
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd");
        System.out.println(md1.format(formatter1)); // Will output: 01-16 without additional dashes.
        System.out.println(md1); //--01-16
        System.out.println(md1.getDayOfMonth());
        System.out.println(md1.getMonth());
        System.out.println(md1.getMonthValue());
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMdd");
        System.out.println(md2.format(formatter2));// Will output: 0116 without additional dashes.
        System.out.println(newLocalDate + "\n");

        //yearmonth
        YearMonth ym1 = YearMonth.now();
        LocalDate yearMonthLocalDate = ym1.atDay(16);

        System.out.println("yearmonth");
        System.out.println(ym1);
        System.out.println(yearMonthLocalDate + "\n");

        System.out.println("==========");
        System.out.println(LocalDate.of(2023, 02, 10).plusDays(1));


        int monthValue = LocalDate.parse("2023-02-10").getMonthValue();
        System.out.println(monthValue);
    }
}
