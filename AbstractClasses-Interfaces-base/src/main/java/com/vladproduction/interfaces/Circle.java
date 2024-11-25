package com.vladproduction.interfaces;

public class Circle implements Shape {
    double radius;
    Circle(double x) {
        radius = x;
    }
    public double getSquare() {
        return PI*radius*radius;
    }
}