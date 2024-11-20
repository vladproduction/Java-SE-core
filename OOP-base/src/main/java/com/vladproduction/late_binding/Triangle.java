package com.vladproduction.late_binding;

public class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        System.out.print("Area of triangle ");
        return dim1 * dim2 / 2;
    }
}
