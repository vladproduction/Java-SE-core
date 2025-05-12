package com.vladproduction.app02.fields_modifiers;

public class Rectangle02 {

    private int width;
    private int height;

    public Rectangle02(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            this.width = 1;
        } else {
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calcArea() {
        return this.width * this.height; //params of this object
    }
}
