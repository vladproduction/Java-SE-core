package com.vladproduction.oop_principles.abstraction;

abstract class Rectangle implements Shape {

    // Abstract class providing a base implementation for some shapes
    int width;
    int height;

    // Implementation for shared functionality like setting dimensions
    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Abstract method to be implemented in subclasses
    public abstract double getArea();
}