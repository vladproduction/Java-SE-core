package com.vladproduction._07_functional_programming.visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternExample {
    public static void main(String[] args) {
        // Create shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());

        // Create visitor
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate area using visitor
        for (Shape shape : shapes) {
            shape.accept(areaCalculator); // Each shape accepts the visitor
        }

        // Output the total area
        System.out.println("Total Area: " + areaCalculator.getTotalArea());
    }

    /**
     * Explanation of the Visitor Pattern:
     *
     * Polymorphism:
     * The Visitor interface declares different visit methods for every shape type, allowing the AreaCalculator
     * to operate on various shape types without needing to know their details. Each shape implements the accept method that
     * takes a Visitor and calls the appropriate visit method based on its type.
     *
     * Extensibility:
     * Adding a new shape class (e.g., Triangle) would require only implementing the Shape interface and adding a new
     * method in the Visitor class, thus benefiting from the Open/Closed Principle.
     *
     * Decoupling:
     * The operations on the objects are encapsulated in the visitor classes, separating the algorithm
     * from the object structure, which enhances maintainability.
     * */
}
