package com.app.vp.chapter_1_basic_OOP;
/**
 * class representing how to calculate Area of the circle
 * */
public class Circle {

    private double radius;
    private String color;

    //constructor-1 with params
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //constructor-2 with param
    public Circle(double radius) {
        this.radius = radius;
        this.color = "green";
    }

    //default constructor-3
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    //Getters & Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * method that calculate the circle area
     * @return area value as double
     * */
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    /**
     * printing method
     * @return formatted result of String
     * */
    @Override
    public String toString() {
        return String.format("Circle: %s, radius: %.2f, color: %s",
                this.getClass().getSimpleName(),
                radius,
                color
                );
    }
}
