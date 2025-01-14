package com.vladproduction.polymorphism_02.shape_hierarchy;

public class PolymorphismShapes {
    public static void main(String[] args) {
        // Create shape objects
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        // Outputs the area of each shape
        System.out.println("Circle Area: " + circle.area()); // Output: Circle Area: 78.53981633974483
        System.out.println("Rectangle Area: " + rectangle.area()); // Output: Rectangle Area: 24.0
        System.out.println("Triangle Area: " + triangle.area()); // Output: Triangle Area: 10.5
    }
}

/**
 * Polymorphism in Action:
 *
 * In the PolymorphismShapes class, different types of shapes are instantiated, and their areas are calculated
 * using the common method call area(), demonstrating polymorphism. The specific implementation of area() that
 * gets executed is determined at runtime based on the object type (Circle, Rectangle, or Triangle).
 * */
