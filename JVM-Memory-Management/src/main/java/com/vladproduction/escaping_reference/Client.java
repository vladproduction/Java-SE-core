package com.vladproduction.escaping_reference;

import java.util.HashMap;
import java.util.Map;

public class Client {

    private String name;
    private String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setAddress(String address) {
        this.address = address;
    }

    // Print method for demonstration
    public void printInfo() {
        System.out.println("Name: " + name + ", Address: " + address);
    }

    public static void main(String[] args) {
        // Create a HashMap to hold Client objects with their IDs
        Map<Integer, Client> clientHashMap = new HashMap<>();

        // Adding entries to the HashMap
        clientHashMap.put(1, new Client("John Doe", "123 Main St"));
        clientHashMap.put(2, new Client("Jane Smith", "456 Maple Ave"));
        clientHashMap.put(3, new Client("Sam Brown", "789 Oak Blvd"));

        // Retrieve and mutate an entry
        Client client = clientHashMap.get(2);  // Get Jane Smith's Client object
        if (client != null) {
            client.setAddress("101 Pine St"); // Update Jane's address
        }

        // Print all clients in the HashMap
        System.out.println("List of Clients:");
        for (Map.Entry<Integer, Client> entry : clientHashMap.entrySet()) {
            System.out.print("ID: " + entry.getKey() + ", ");
            entry.getValue().printInfo(); // Call printInfo on the Client object
        }

        // Output result for a specific client
        Client john = clientHashMap.get(1);
        if (john != null) {
            System.out.println("\nDetails for ID 1:");
            john.printInfo();
        }
    }

}
