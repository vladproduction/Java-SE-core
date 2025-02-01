package com.vladproduction.escaping_reference;

/**
 * Escaping References refer to a situation in programming where an internal reference to an object is exposed to the outside of its intended scope,
 * allowing external code to maintain a reference to the internal state of that object.
 * This can lead to unintended mutations and can violate encapsulation, making the code more difficult to manage and less safe.
 * */

// Address class
class Address {
    private String street;
    private String city;
    
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    // Mutator
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

// Person class
class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Method that exposes reference to the Address object
    public Address getAddress() {
        return address; // Escaping reference!
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Address: " + address.getStreet() + ", " + address.getCity());
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield");
        Person person = new Person("John Doe", address);

        System.out.println("\tInitial");
        // Print initial info
        person.printInfo();

        // External code can mutate the address state
        Address externalAddressRef = person.getAddress();
        externalAddressRef.setCity("Shelbyville"); // Mutating internal state

        System.out.println("\tAfter mutation");
        // Print info again after mutation
        person.printInfo();
    }
}
