package com.vladproduction.abstract_classes.demo;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area(); // Abstract method for calculating area
}
