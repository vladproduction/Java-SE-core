package com.vladproduction.polymorphism_02.shape_hierarchy;

// Subclass for Circle
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return area(radius); // Call overloaded method
    }
}