package com.vladproduction.app14.constructor;

public class ParameterizedConstructor {

    private int x;
    private int y;

    public ParameterizedConstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void sum(){
        System.out.println(x + y);
    }

}
