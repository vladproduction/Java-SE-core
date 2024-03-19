package com.vladproduction.vp47_serialization_transient.try_with_resources;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class Vehicle implements Serializable {
    @Serial
    private static final long serialVersionUID = 4184663242797836018L;
    private int id;
    private String brand;
    private double price;

    public Vehicle(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
