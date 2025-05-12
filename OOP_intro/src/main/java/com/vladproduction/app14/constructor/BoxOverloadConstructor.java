package com.vladproduction.app14.constructor;

//class BoxOverloadConstructor demonstrate overloaded constructors
public class BoxOverloadConstructor {

    double width, height, depth;

    //first constructor
    public BoxOverloadConstructor(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //second constructor
    public BoxOverloadConstructor() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
        //or
        this.width = this.height = this.depth = 0;
    }

    //third constructor
    public BoxOverloadConstructor(double length) {
        this.width = this.height = this.depth = length;
    }

    double volume() {
        return width * height * depth;
    }

}
