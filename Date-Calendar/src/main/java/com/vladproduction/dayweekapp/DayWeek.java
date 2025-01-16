package com.vladproduction.dayweekapp;

/**
 * simple UI;
 * define what day of the week by three inputs (month, day, year);
 *
 */
public class DayWeek {
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
    }

    enum DaysOfTheWeek {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
        private int value;

        DaysOfTheWeek(int value) {
            this.value = value;
        }
    }

}
