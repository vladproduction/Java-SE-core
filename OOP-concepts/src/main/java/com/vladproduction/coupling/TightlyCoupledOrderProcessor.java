package com.vladproduction.coupling;

// TIGHT COUPLING EXAMPLE
// Classes that are tightly coupled - changes in one class affect the other

// OrderProcessor directly depends on specific implementations
public class TightlyCoupledOrderProcessor {

    private MySQLDatabase database; // Direct reference to concrete implementation
    private EmailNotifier emailNotifier; // Direct reference to concrete implementation

    public TightlyCoupledOrderProcessor() {
        // Hard-coded creation of dependencies
        this.database = new MySQLDatabase();
        this.emailNotifier = new EmailNotifier();
    }

    public void processOrder(String orderId, String customerEmail) {
        // Direct use of concrete implementations
        database.connect(); // Direct dependency on MySQLDatabase implementation

        // Retrieve order details
        String orderDetails = database.query("SELECT * FROM orders WHERE id = " + orderId);

        // Update order status
        database.update("UPDATE orders SET status = 'PROCESSED' WHERE id = " + orderId);

        // Send notification
        emailNotifier.sendEmail(customerEmail, "Order Processed",
                "Your order " + orderId + " has been processed.\n" + orderDetails);

        database.disconnect();

        System.out.println("Order " + orderId + " processed for customer: " + customerEmail);
    }

}
