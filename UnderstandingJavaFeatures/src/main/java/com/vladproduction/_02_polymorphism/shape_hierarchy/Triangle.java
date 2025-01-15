package com.vladproduction._02_polymorphism.shape_hierarchy;

// Subclass for Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return area(base, height, true); // Call overloaded method
    }
}
