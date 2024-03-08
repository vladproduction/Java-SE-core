package com.vladproduction.vp34_wildcards_generics.factory_mechanism;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Electronic implements Product<Integer>{

    private final Integer modelNumber;

    public Electronic(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public Integer getData() {
        return modelNumber;
    }
}
