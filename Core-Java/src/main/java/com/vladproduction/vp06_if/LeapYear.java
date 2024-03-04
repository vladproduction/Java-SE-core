package com.vladproduction.vp06_if;

public class LeapYear {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Usage: java LeapYear <year>");
            System.exit(1);
        }

        int year;
        try {
            year = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid year: " + args[0]);
            System.exit(1);
            return; // Unreachable but added for clarity
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
