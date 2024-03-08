package com.vladproduction.vp34_wildcards_generics.shapes_calc_area;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Circle implements Shape<Double>{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}
