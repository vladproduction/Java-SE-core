package com.vladproduction.app01.classes;

public class Rectangle {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public int calcArea() {

        return this.width * this.height; //params of this object

    }
}
