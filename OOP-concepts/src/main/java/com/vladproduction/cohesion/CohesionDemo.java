package com.vladproduction.cohesion;

import java.util.List;

public class CohesionDemo {
    public static void main(String[] args) {

        System.out.println("===== Low Cohesion Example =====");
        LowCohesionExample lowCohesion = new LowCohesionExample();

        // Using the low cohesion class for various unrelated operations
        lowCohesion.addUser("john_doe");
        lowCohesion.login("john_doe");
        lowCohesion.setTaxRate(0.08);
        double tax = lowCohesion.calculateTax(100.0);
        System.out.println("Tax amount: $" + tax);
        lowCohesion.sendEmail("someone@example.com", "Hello", "This is a test email");
        lowCohesion.writeToFile("test.txt", "This is test content");
        lowCohesion.logout();

        System.out.println("\n===== High Cohesion Example =====");
        // Using separate high cohesion classes for each specific responsibility

        // User management
        UserManager userManager = new UserManager();
        userManager.addUser("john_doe");
        userManager.addUser("jane_smith");
        userManager.login("john_doe");

        // Tax calculations
        TaxCalculator taxCalculator = new TaxCalculator(0.07);
        taxCalculator.setTaxRate(0.08);
        double taxAmount = taxCalculator.calculateTax(100.0);
        double total = taxCalculator.calculateTotalWithTax(100.0);
        System.out.println("Tax amount: $" + taxAmount);
        System.out.println("Total with tax: $" + total);

        // Email service
        EmailService emailService = new EmailService("smtp.example.com", 587, "system@example.com");
        emailService.sendEmail("client@example.com", "Invoice", "Please find your invoice attached");

        List<String> allUsers = userManager.getAllUsers();
        emailService.sendBulkEmail(allUsers, "System Update", "The system will be down for maintenance");

        // File handling
        FileHandler fileHandler = new FileHandler("/tmp");
        fileHandler.writeToFile("user_data.txt", "User data content");
        String content = fileHandler.readFromFile("user_data.txt");
        System.out.println("File content: " + content);

        userManager.logout();

        System.out.println("\nHigh cohesion provides better organization, maintainability, and reusability of code.");
    }


}
