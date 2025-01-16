package com.vladproduction.date;

import java.time.LocalDate;

public class CurrentDate {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
    }
}
