package com.vladproduction.vp34_wildcards_generics.shapes_calc_area;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Triangle implements Shape<Float>{

    private final float baseLength;
    private final float height;

    public Triangle(float baseLength, float height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public Float calculateArea() {

        return (baseLength * height) * 0.5F;
    }
}

/**
 * Area of a Triangle = A = ½ (b × h);
 * where b and h are the base and height of the triangle, respectively;
 * */
