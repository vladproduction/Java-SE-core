package com.vladproduction._03_collections_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// Demonstrating ArrayList, LinkedList, and Vector
public class CollectionExample {
    public static void main(String[] args) {
        // Use ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // Use LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Fish");
        System.out.println("LinkedList: " + linkedList);

        // Use Vector
        List<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");
        System.out.println("Vector: " + vector);

        // Custom collection example
        MyCustomCollection<String> myCollection = new MyCustomCollection<>();
        myCollection.add("One");
        myCollection.add("Two");
        
        System.out.println("Custom Collection: " + myCollection);

        /*
        ArrayList: [Apple, Banana, Cherry]
        LinkedList: [Dog, Cat, Fish]
        Vector: [Red, Green, Blue]
        Custom Collection: [One, Two]
         */
    }
}

