package com.vladproduction.abstract_classes.demo;

public class Triangle_Heron extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle_Heron(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double semiPerimeter = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return area;
    }
}
