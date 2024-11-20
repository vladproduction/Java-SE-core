package com.vladproduction.late_binding;

public class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    public double area() {
        System.out.print("Area of rectangle ");
        return dim1 * dim2;
    }
}

