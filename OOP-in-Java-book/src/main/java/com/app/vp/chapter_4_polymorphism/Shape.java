package com.app.vp.chapter_4_polymorphism;

/**
 * Base class for subclasses that extends Shape
 * Providing common variables for subclasses
 * Not for creating instances of this class
 * */
public class Shape {

    private String color;

    //shape constructor
    public Shape(String color){
        this.color = color;
    }

    /*public Shape(){
        this.color = "white"; //defining color value by default
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }*/

    @Override
    public String toString() {
        return "Shape (color: " + color + ")";
    }

    /**
     * Method to calculate the area of the shape:
     * has to be implemented in subclasses purposely
     * */
    public double getArea(){
        System.err.println("Shape unknown! Not available to calculate.");
        return 0;
    }
}
