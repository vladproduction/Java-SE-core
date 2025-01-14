package com.vladproduction.polymorphism_02.shape_hierarchy;

// Abstract superclass
abstract class Shape {
    // Abstract method for area calculation
    abstract double area();

    // Method Overloading: Calculate area with different parameters
    double area(double radius) {
        return Math.PI * radius * radius; // Area of a Circle
    }

    double area(double length, double width) {
        return length * width; // Area of a Rectangle
    }

    double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height; // Area of a Triangle
        }
        return 0; // Default case
    }
}
