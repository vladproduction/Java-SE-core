package com.app.vp.chapter_3_inheritance;

import com.app.vp.chapter_1_basic_OOP.Circle;

/**
 * Class Cylinder inherits from class Circle all fields (radius and color) and all methods
 * (including getRadius(), getArea()) from the Circle superclass.
 * Repeated is very important properties of OOP.
 * In Cylinder defines the height variable, two public methods -
 * getHeight() and getVolume(), as well as custom constructors.
 * */
public class Cylinder extends Circle {

    //own variable
    private double height;

    //default constructor-1 of Cylinder
    public Cylinder() {
        super(); //invoke constructor-3 Circle() as superclass
        height = 1.0;
    }

    //constructor-2 with param came from superclass (Circle)
    public Cylinder(double radius) {
        super(radius); //invoke constructor-2 Circle(radius) as superclass with radius as param
        height = 1.0;
    }

    //constructor-3 with params; radius from superclass (Circle) and height only for Cylinder object
    public Cylinder(double radius, double height, String color) {
        super(radius, color); //invoke constructor-1 Circle(radius, color) as superclass with radius as param
        this.height = height; //define the height parameter for cylinder
    }

    //getters & setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Method getVolume() is used getArea() came from superclass Circle
     * formula: volume = area * height;
     * @return volume of cylinder as double value
     * */
    public double getVolume(){
        return getArea() * height; //getArea() from Circle class return (base area for our cylinder) * height
    }

    /*
    scenario is: to override getArea() from Circle to return value of cylinder surface area
    If the getArea() method is called from an object of type Circle, then the method calculates the area of the circle.
    If getArea() is called from an object of type Cylinder, the surface area of the cylinder is calculated
    by implementing an override.
    */
    /**
     * @Override getArea()
     * Method for calculation of cylinder surface area
     * formula: cylinder surface area = 2 * PI * r * h + 2 * ba
     * where:
     * r - is radius of circle of the base of the cylinder,
     * h - height of the cylinder,
     * ba - base area of the cylinder
     * @return surface area of cylinder as double area
     * */
    @Override
    public double getArea(){
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea(); //super.getArea() - using method from superclass
    }

    //have to change getVolume as well for correct calculation now
    /**
     * Method getVolume_modified() is used super.getArea() - using method from superclass
     * formula: volume = super.getArea() * height;
     * @return volume of cylinder as double value
     * */
    public double getVolume_modified(){
        return super.getArea() * height;
    }

    /**
     * @Override toString()
     * @return String value of cylinder object
     * */
    @Override
    public String toString(){
        return "Cylinder: radius = " + getRadius() + ", height = " + height;
    }

}
