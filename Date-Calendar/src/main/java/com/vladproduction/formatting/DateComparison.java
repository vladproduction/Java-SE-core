package com.vladproduction.formatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        System.out.println("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();

        try {
            // Parse the input dates
            LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
            LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

            // Compare the two dates
            if (firstDate.isBefore(secondDate)) {
                System.out.println(firstDate.format(formatter) + " is before " + secondDate.format(formatter));
            } else if (firstDate.isAfter(secondDate)) {
                System.out.println(firstDate.format(formatter) + " is after " + secondDate.format(formatter));
            } else {
                System.out.println(firstDate.format(formatter) + " is the same as " + secondDate.format(formatter));
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}
