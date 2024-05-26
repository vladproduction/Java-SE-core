package com.app.vp.chapter_5_abstractclasses_interfaces.task1;

/**
 * base abstract class containing constructor and two methods:
 * -getArea();
 * -getPerimeter();
 *
 * toString() to get color of the shape
 * */
public abstract class Shape {

    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
