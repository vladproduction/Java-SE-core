package com.vladproduction.how_memory_works;

/**
 * Concepts of JVM Memory Management
 *
 * Stack Memory:
 * The stack is used for storing local variables and method call frames.
 * Memory is allocated and deallocated in a last-in, first-out manner.
 * Primitive types (e.g., int, char, etc.) and references to objects are stored in the stack.
 *
 * Heap Memory:
 * The heap is used for dynamic memory allocation where objects are stored.
 * Memory in the heap is managed by the garbage collector, which automatically frees memory that is no longer in use.
 * Objects created using the new keyword (like the Person and Address objects) reside in the heap.
 *
 * Combining Stack and Heap:
 * References to objects are stored in the stack, while the actual objects are stored in the heap.
 * For example, person in the stack points to a Person object in the heap.
 *
 * Modification of Elements:
 * Modifying stack elements involves changing the value of local primitive variables.
 * Modifying heap elements involves changing the attributes of object instances, which can affect all references to that object.
 * */
public class HeapVSStack {
    public static void main(String[] args) {

        // Stack Memory
        int stackVariable = 10; // Primitive data type stored in the stack

        Person person = new Person("John Doe", 30, new Address("Main St", "New York", 123, Country.USA));

        // Heap Memory
        Address address = new Address("1st Ave", "Los Angeles", 456, Country.USA);

        // Combine Stack and Heap
        // The 'person' reference is stored in the stack, but the actual 'Person' object and its 'Address' are in the heap

        // Accessing elements from the Stack
        System.out.println("Stack Variable: " + stackVariable); // Accessing local stack variable

        // Accessing elements from the Heap
        System.out.println("Person Name: " + person.getName());
        System.out.println("Address City: " + person.getAddress().getCity());

        // Modification of Stack Elements
        stackVariable += 5; // Modifying stack variable
        System.out.println("Modified Stack Variable: " + stackVariable);

        // Modification of Heap Elements
        person.setName("Jane Doe");
        person.getAddress().setCity("San Francisco");
        System.out.println("Modified Person Name: " + person.getName());
        System.out.println("Modified Address City: " + person.getAddress().getCity());


    }

}

class Person {
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {
    String street;
    String city;
    int houseNumber;
    Country country;

    public Address(String street, String city, int houseNumber, Country country) {
        this.street = street;
        this.city = city;
        this.houseNumber = houseNumber;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

enum Country {
    USA, SPAIN, ITALY, UKRAINE, BRAZIL
}