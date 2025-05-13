package com.vladproduction.app23.equals_hashcode;

import java.util.Objects;

// Modern implementation using Objects utility class (Java 7+)
public class Product {

    private final String id;
    private final String name;
    private final double price;
    private final String category;

    public Product(String id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        // Using Objects.equals to handle null checks
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Double.compare(price, product.price) == 0 &&
                Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        // Using Objects.hash to generate hashCode
        return Objects.hash(id, name, price, category);
    }

}
