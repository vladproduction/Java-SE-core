package com.app.vp.chapter_7_collections.algorithms.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_binarySearch {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 800.00));
        products.add(new Product("Phone", 500.00));
        products.add(new Product("Headphones", 100.00));

        // Sort the list by price (ascending)
        Collections.sort(products); // Assuming natural ordering by price

//        Product targetProduct = new Product("Tablet", 300.00); // Product to search for
        Product targetProduct = new Product("Headphones", 100.00);

        // Search for the target product using binary search
        int index = Collections.binarySearch(products, targetProduct);

        if (index >= 0) {
            System.out.println("Product found at index: " + index);
            System.out.println(products.get(index));
        } else {
            System.out.println("Product not found in the list.");
        }
    }


}
