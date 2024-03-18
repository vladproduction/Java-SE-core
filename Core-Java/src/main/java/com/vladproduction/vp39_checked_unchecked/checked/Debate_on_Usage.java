package com.vladproduction.vp39_checked_unchecked.checked;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Debate_on_Usage {
    //////////////Using Checked Exceptions://////////////

    /**Imagine a service that processes user orders. Traditionally, you might use a checked exception
     * like OutOfStockException to indicate unavailability of an item when processing an order.

     Using Checked Exceptions:

     public class OrderService {

     public void processOrder(Order order) throws OutOfStockException {
     for (OrderItem item : order.getItems()) {
     if (!Inventory.checkStock(item.getProductId(), item.getQuantity())) {
     throw new OutOfStockException("Item " + item.getProductId() + " is out of stock");
     }
     // ... (process order logic) ...
     }
     }
     }

     public class Main {

     public static void main(String[] args) {
     OrderService service = new OrderService();
     try {
     service.processOrder(createOrder()); // Order might contain out-of-stock items
     } catch (OutOfStockException e) {
     System.err.println("Error processing order: " + e.getMessage());
     // Handle out-of-stock scenario (e.g., inform user, offer alternatives)
     }
     }
     }*/

    //////////////Alternative Approach (Unchecked Exception + Design Pattern)://////////////
    /**Use Unchecked Exception (Optional):

     public class OrderService {

     public void processOrder(Order order) {
     for (OrderItem item : order.getItems()) {
     if (!Inventory.checkStock(item.getProductId(), item.getQuantity())) {
     throw new OrderProcessingException("Item out of stock: " + item.getProductId()); // Unchecked exception
     }
     // ... (process order logic) ...
     }
     }
     }

     Implement Strategy Pattern:
     Java
     public interface OrderItemProcessingStrategy {
     void process(OrderItem item) throws OrderProcessingException;
     }

     public class InStockProcessingStrategy implements OrderItemProcessingStrategy {
    @Override
    public void process(OrderItem item) throws OrderProcessingException {
    // ... (logic to process in-stock items) ...
    }
    }

     public class OutOfStockProcessingStrategy implements OrderItemProcessingStrategy {
    @Override
    public void process(OrderItem item) throws OrderProcessingException {
    throw new OrderProcessingException("Item out of stock: " + item.getProductId());
    }
    }

     public class OrderService {

     public void processOrder(Order order) {
     for (OrderItem item : order.getItems()) {
     OrderItemProcessingStrategy strategy = Inventory.checkStock(item.getProductId(), item.getQuantity())
     ? new InStockProcessingStrategy() : new OutOfStockProcessingStrategy();
     strategy.process(item);
     }
     }
     }*/

    /**Benefits:

     Easier exception handling (no forced checks for OrderProcessingException).
     More flexibility in handling different order item processing scenarios.
     Drawbacks:

     Requires more code for implementing strategies.
     Might introduce a layer of complexity for seemingly simple situations.
     Conclusion: The choice between checked and unchecked exceptions, along with design patterns like the Strategy pattern,
     depends on the specific context. Consider the trade-offs between compile-time safety, code conciseness,
     and handling different error scenarios effectively.*/
}
