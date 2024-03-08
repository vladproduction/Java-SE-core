package com.vladproduction.vp34_wildcards_generics.shapes_calc_area;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Square implements Shape<Integer> {

    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public Integer calculateArea() {

        return sideLength * sideLength;
    }
}
