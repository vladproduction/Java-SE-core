package com.vladproduction.polymorphism;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method overriding
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void display() {
        System.out.println("This is a rectangle with length " + length + " and width " + width);
    }
}
