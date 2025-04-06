package com.vladproduction.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {

        // Runtime polymorphism demonstration
        System.out.println("Runtime Polymorphism:");
        Shape shape = new Shape();
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 8.0);

        // Array of shapes demonstrating polymorphism
        Shape[] shapes = {shape, circle, rectangle, triangle};

        for (Shape s : shapes) {
            s.display(); // Method called depends on the actual object type
            System.out.println("Area: " + s.calculateArea());
            System.out.println();
        }

        // Compile-time polymorphism demonstration
        System.out.println("Compile-time Polymorphism (Overloading):");
        Calculator calc = new Calculator();

        System.out.println("Adding integers: " + calc.add(5, 10));
        System.out.println("Adding doubles: " + calc.add(5.5, 10.5));
        System.out.println("Adding three integers: " + calc.add(5, 10, 15));
        System.out.println("Concatenating strings: " + calc.add("Hello ", "World"));

    }
}
