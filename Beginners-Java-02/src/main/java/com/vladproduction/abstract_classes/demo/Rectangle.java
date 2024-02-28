package com.vladproduction.abstract_classes.demo;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(String color, double length, double width) {
        super(color); // Calls parent constructor
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {

        return length * width;
    }
}
