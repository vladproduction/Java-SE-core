package com.vladproduction.dayweekapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DayWeekSwing {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Day of the Week Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        // Input fields
        JTextField monthField = new JTextField();
        JTextField dayField = new JTextField();
        JTextField yearField = new JTextField();
        JLabel resultLabel = new JLabel("Result: ");
        JButton calculateButton = new JButton("Calculate");

        // Add components to the frame
        frame.add(new JLabel("Month (1-12):"));
        frame.add(monthField);
        frame.add(new JLabel("Day (1-31):"));
        frame.add(dayField);
        frame.add(new JLabel("Year:"));
        frame.add(yearField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        // Action listener for the calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get input values
                String monthInput = monthField.getText();
                String dayInput = dayField.getText();
                String yearInput = yearField.getText();

                // Validate input
                if (!isValidInput(monthInput, dayInput, yearInput)) {
                    resultLabel.setText("Invalid input. Please enter valid month, day, and year.");
                    return;
                }

                int m = Integer.parseInt(monthInput);
                int d = Integer.parseInt(dayInput);
                int y = Integer.parseInt(yearInput);

                // Calculate the day of the week
                int y0 = y - (14 - m) / 12;
                int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
                int m0 = m + 12 * ((14 - m) / 12) - 2;
                int d0 = (d + x + (31 * m0) / 12) % 7;

                // Get the corresponding day of the week
                DaysOfTheWeek[] days = DaysOfTheWeek.values();
                String dayOfWeek = "Invalid date";
                for (DaysOfTheWeek day : days) {
                    if (d0 == day.value) {
                        dayOfWeek = day.name();
                        break;
                    }
                }

                // Display the result
                resultLabel.setText("Result: " + dayOfWeek);
            }
        });

        // Display the frame
        frame.setVisible(true);

    }

    private static boolean isValidInput(String month, String day, String year) {
        try {
            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);
            int y = Integer.parseInt(year);
            return m >= 1 && m <= 12 && d >= 1 && d <= 31 && y > 0; // Basic validation
        } catch (NumberFormatException e) {
            return false; // Invalid number format
        }
    }

    enum DaysOfTheWeek {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
        private final int value;

        DaysOfTheWeek(int value) {
            this.value = value;
        }
    }
}
