package com.vladproduction.polymorphism;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method overriding
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void display() {
        System.out.println("This is a triangle with base " + base + " and height " + height);
    }

}
