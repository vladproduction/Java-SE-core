package com.vladproduction.dayweekapp;

/**
 * Implement the program that determines the day of the week for a given date;
 * Steps to resolve task:
 * <p>
 * 1) Parse the command-line arguments to get the month, day, and year.
 * 2) Apply the formulas provided to compute y0, x, m0, and d0.
 * 3) Output the result, which is d0, representing the day of the week.
 */
public class DefineDayProgram {

    /*Day of the week. Write a program that takes a date as input and prints the
    day of the week that date falls on. Your program should accept three int command-line
    arguments: m (month), d (day), and y (year). For m, use 1 for January, 2 for
    February, and so forth. For output, print 0 for Sunday, 1 for Monday, 2 for Tuesday,
    and so forth. Use the following formulas, for the Gregorian calendar:
    y0 = y - (14 - m) / 12
    x = y0 + y0 / 4 - y0 / 100 + y0 / 400
    m0 = m + 12 * ((14 - m) / 12) - 2
    d0 = (d + x + (31 * m0) / 12) % 7
    Example: On which day of the week did February 14, 2000 fall?
    y0 = 2000 - 1 = 1999
    x = 1999 + 1999 / 4 - 1999 / 100 + 1999 / 400 = 2483
    m0 = 2 + 12 * 1 - 2 = 12
    d0 = (14 + 2483 + (31 * 12) / 12) % 7 = 2500 % 7 = 1
    Answer : Monday.*/
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide three arguments: month, day, year.");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Calculate the variables as per the formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output the day of the week
        DaysOfTheWeek[] days = DaysOfTheWeek.values();
        for (DaysOfTheWeek day : days) {
            if (d0 == day.value) {
                    System.out.println(day.name());
            }
        }
//        System.out.println(d0);
        //for the 1 15 2025
        //program result WEDNESDAY
    }

    enum DaysOfTheWeek {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
        private int value;

        DaysOfTheWeek(int value) {
            this.value = value;
        }
    }

}
