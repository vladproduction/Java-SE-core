package com.vladproduction.formatting;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EnhancedDateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select date format: ");
        System.out.println("1. yyyy-MM-dd");
        System.out.println("2. MM/dd/yyyy");
        System.out.println("3. dd-MM-yyyy");
        int formatChoice = Integer.parseInt(scanner.nextLine());

        DateTimeFormatter formatter;
        switch (formatChoice) {
            case 1:
                formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                break;
            case 2:
                formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                break;
            case 3:
                formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                break;
            default:
                System.out.println("Invalid format choice. Defaulting to yyyy-MM-dd.");
                formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        }

        System.out.println("Enter the first date and time in " + formatter + ": ");
        String firstDateInput = scanner.nextLine();
        System.out.println("Enter the second date and time in " + formatter + ": ");
        String secondDateInput = scanner.nextLine();

        try {
            // Parse the input dates
            LocalDateTime firstDateTime = LocalDateTime.parse(firstDateInput + "T00:00");
            LocalDateTime secondDateTime = LocalDateTime.parse(secondDateInput + "T00:00");

            // Compare the two date-times
            if (firstDateTime.isBefore(secondDateTime)) {
                System.out.println(firstDateTime.format(formatter) + " is before " + secondDateTime.format(formatter));
            } else if (firstDateTime.isAfter(secondDateTime)) {
                System.out.println(firstDateTime.format(formatter) + " is after " + secondDateTime.format(formatter));
            } else {
                System.out.println(firstDateTime.format(formatter) + " is the same as " + secondDateTime.format(formatter));
            }

            // Check if both dates fall on the same day of the week
            DayOfWeek day1 = firstDateTime.toLocalDate().getDayOfWeek();
            DayOfWeek day2 = secondDateTime.toLocalDate().getDayOfWeek();
            if (day1.equals(day2)) {
                System.out.println("Both dates fall on the same day of the week: " + day1);
            } else {
                System.out.println("The dates fall on different days of the week: " + day1 + " and " + day2);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date/time format. Please use the correct format specified.");
        } finally {
            scanner.close();
        }
    }
}
