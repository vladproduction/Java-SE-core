package com.vladproduction.late_binding;

public class Figure {
    protected double dim1;
    protected double dim2;
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public double area() {
        System.out.print("Area is not defined ");
        return 0.0;
    }
}