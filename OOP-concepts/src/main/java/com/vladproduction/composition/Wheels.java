package com.vladproduction.composition;

public class Wheels {

    private int count;
    private String brand;
    private double size;

    public Wheels(int count, String brand, double size) {
        this.count = count;
        this.brand = brand;
        this.size = size;
    }

    public void rotate() {
        System.out.println(count + " " + brand + " wheels rotating. Size: " + size + " inches");
    }

    public void brake() {
        System.out.println("Wheels braking...");
    }

    public int getCount() {
        return count;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

}
