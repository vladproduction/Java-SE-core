package com.vladproduction.vp34_wildcards_generics.demo;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Animals {

    private int id;

    public Animals(){

    }
    public Animals(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal eating!");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
