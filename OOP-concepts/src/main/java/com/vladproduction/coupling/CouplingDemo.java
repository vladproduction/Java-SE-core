package com.vladproduction.coupling;

public class CouplingDemo {
    public static void main(String[] args) {

        System.out.println("===== Tight Coupling Example =====");
        TightlyCoupledOrderProcessor tightProcessor = new TightlyCoupledOrderProcessor();
        tightProcessor.processOrder("ORD-12345", "customer@example.com");

        // Problems with tight coupling:
        // 1. Cannot easily switch to a different database
        // 2. Cannot easily switch to a different notification method
        // 3. Testing is difficult because we can't mock dependencies
        // 4. Changes to MySQL or EmailNotifier might require changes in OrderProcessor

        System.out.println("\n===== Loose Coupling Example =====");

        // Create implementations of interfaces
        Database postgresDB = new PostgreSQLDatabase();
        NotificationService smsNotifier = new SMSNotifier();

        // Inject dependencies
        LooselyCoupleddOrderProcessor looseProcessor =
                new LooselyCoupleddOrderProcessor(postgresDB, smsNotifier);

        // Process order using PostgreSQL and SMS
        looseProcessor.processOrder("ORD-67890", "+1234567890");

        System.out.println("\n----- Switching Dependencies -----");

        // Easily switch to different implementations
        Database mongoDB = new MongoDBDatabase();
        NotificationService pushNotifier = new PushNotifier();

        // Using setter injection to change dependencies
        looseProcessor.setDatabase(mongoDB);
        looseProcessor.setNotifier(pushNotifier);

        // Process order using MongoDB and Push Notifications
        looseProcessor.processOrder("ORD-24680", "user123");

        System.out.println("\nBenefits of loose coupling:");
        System.out.println("1. Easy to switch implementations");
        System.out.println("2. Better testability (can use mock implementations)");
        System.out.println("3. Changes in one class don't necessarily affect others");
        System.out.println("4. Code is more maintainable and flexible");

    }
}
