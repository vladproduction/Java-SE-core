package com.vladproduction._02_polymorphism.shape_hierarchy;

// Subclass for Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return area(length, width); // Call overloaded method
    }
}
