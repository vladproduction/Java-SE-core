package com.vladproduction.abstract_classes.demo;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Calls parent constructor
        this.radius = radius;
    }

    @Override
    public double area() {

        return Math.PI * radius * radius;
    }
}
