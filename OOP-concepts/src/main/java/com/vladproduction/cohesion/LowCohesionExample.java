package com.vladproduction.cohesion;

import java.util.ArrayList;
import java.util.List;

// Example of LOW cohesion - This class does too many unrelated things
public class LowCohesionExample {

    private String currentUser;
    private List<String> userList;
    private double taxRate;

    public LowCohesionExample() {
        this.userList = new ArrayList<>();
        this.taxRate = 0.07; // 7% default tax rate
    }

    // User management functions
    public void addUser(String username) {
        userList.add(username);
        System.out.println("Added user: " + username);
    }

    public void removeUser(String username) {
        userList.remove(username);
        System.out.println("Removed user: " + username);
    }

    public void login(String username) {
        if (userList.contains(username)) {
            currentUser = username;
            System.out.println("Logged in as: " + username);
        } else {
            System.out.println("User not found!");
        }
    }

    public void logout() {
        System.out.println("Logged out user: " + currentUser);
        currentUser = null;
    }

    // Tax calculation functions - unrelated to user management
    public void setTaxRate(double rate) {
        this.taxRate = rate;
        System.out.println("Tax rate set to: " + rate);
    }

    public double calculateTax(double amount) {
        return amount * taxRate;
    }

    // Email functions - also unrelated
    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("Sending email to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        // In a real system, this would connect to an email service
    }

    // File operations - another unrelated function
    public void writeToFile(String filename, String content) {
        System.out.println("Writing to file: " + filename);
        // In a real system, this would write to a file
    }

    public String readFromFile(String filename) {
        System.out.println("Reading from file: " + filename);
        // In a real system, this would read from a file
        return "Content of " + filename;
    }

}
