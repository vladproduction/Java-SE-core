package com.vladproduction.coupling;

// Loosely coupled processor - depends on interfaces, not implementations
public class LooselyCoupleddOrderProcessor {

    private Database database; // Reference to interface
    private NotificationService notifier; // Reference to interface

    // Dependencies injected through constructor
    public LooselyCoupleddOrderProcessor(Database database, NotificationService notifier) {
        this.database = database;
        this.notifier = notifier;
    }

    public void processOrder(String orderId, String customerContact) {
        // Using interfaces instead of concrete classes
        database.connect();

        // Retrieve order details
        String orderDetails = database.query("SELECT * FROM orders WHERE id = " + orderId);

        // Update order status
        database.update("UPDATE orders SET status = 'PROCESSED' WHERE id = " + orderId);

        // Send notification using interface
        notifier.sendNotification(customerContact, "Order Processed",
                "Your order " + orderId + " has been processed.\n" + orderDetails);

        database.disconnect();

        System.out.println("Order " + orderId + " processed for customer: " + customerContact);
    }

    // We can also set dependencies after construction (setter injection)
    public void setDatabase(Database database) {
        this.database = database;
    }

    public void setNotifier(NotificationService notifier) {
        this.notifier = notifier;
    }

}
