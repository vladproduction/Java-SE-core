package com.vladproduction.app05.polymorphism;

public class BothStaticAndDynamicPolymorphisms {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(3.0);
        double circleArea = shape.area(); // dynamic: resolved at runtime
        shape.display("Circle area", circleArea); // static: resolved at compile time

        shape = new Rectangle(4.0, 5.0);
        double rectArea = shape.area(); // dynamic
        shape.display("Rectangle area", rectArea); // static
    }

    // Base class
    abstract static class Shape {
        // Dynamic polymorphism: will be overridden
        public abstract double area();

        // Static polymorphism: method overloading
        public void display(String message) {
            System.out.println("Message: " + message);
        }

        public void display(String message, double value) {
            System.out.println(message + ": " + value);
        }
    }

    // Subclass 1
    static class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        // Method overriding (dynamic polymorphism)
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    // Subclass 2
    static class Rectangle extends Shape {
        private final double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Method overriding (dynamic polymorphism)
        @Override
        public double area() {
            return width * height;
        }
    }

}
