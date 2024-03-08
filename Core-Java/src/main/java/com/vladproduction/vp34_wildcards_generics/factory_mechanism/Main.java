package com.vladproduction.vp34_wildcards_generics.factory_mechanism;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        Product<String> book = ProductFactory.createProduct("BOOK");
        System.out.println("Book Data: " + book.getData());

        Product<Integer> electronic = ProductFactory.createProduct("ELECTRONIC");
        System.out.println("Electronic Data: " + electronic.getData());
        // Might need specific data access depending on Electronic implementation

    }
}
