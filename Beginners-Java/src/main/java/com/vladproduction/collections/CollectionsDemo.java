package com.vladproduction.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<String> collectionString = new ArrayList<>();
        collectionString.add("Hello");
        collectionString.add("World");
        collectionString.add("Java");
        collectionString.add("Collections");
        System.out.println(collectionString);
        System.out.println(collectionString.size());
    }

}
