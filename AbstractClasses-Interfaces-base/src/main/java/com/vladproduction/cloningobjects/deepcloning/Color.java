package com.vladproduction.cloningobjects.deepcloning;

public class Color implements Cloneable{

    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }

    // Implement clone method for deep copying
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
