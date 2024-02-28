package com.vladproduction.abstract_classes.demo;

public class Main01 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        Triangle triangle = new Triangle("Green", 5.0, 10.0);
        Triangle_Heron triangleHeron = new Triangle_Heron("Black", 2.0, 2.0, 2.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle_Heron Area: " + triangleHeron.area());
    }
}
