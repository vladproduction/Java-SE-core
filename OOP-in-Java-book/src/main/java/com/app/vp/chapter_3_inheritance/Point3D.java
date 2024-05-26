package com.app.vp.chapter_3_inheritance;

import com.app.vp.chapter_2_composition.Point;

/**
 * Implementing the Point3D class for a three-dimensional point - inheritance of the Point class for a two-dimensional point.
 * Contain constructors, getters, setters, the toString method and two additional methods.
 * */
public class Point3D extends Point {

    //Define z coordinate for 3D point
    private double z;

    //constructor-1: with params (x, y, z)
    public Point3D(int x, int y, double z){
        super(x, y); //superclass constructor with (x, y)
        this.z = z;
    }
    //constructor-2: overloaded with default x and y params
    public Point3D(double z){
        super();//superclass constructor with (0, 0) as default
        this.z = z;
    }

    //getters & setters
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * @Overridden toString(); includes the z coordinate in the string representation;
     * @return String value of Point3D object
     * */
    @Override
    public String toString() {
        return "Point3D: (" + getX() + ", " + getY() + ", " + z + ")";
    }

    /*Overriding occurs in inheritance hierarchies.
    A subclass overrides a method already defined in its superclass.
    The methods have the same name and parameter list (including number, order, and types).
    Since they have different parameter lists, they are not overloaded methods. They are overridden methods because they share
    the same name and parameter list with the distance method(s) in the superclass (Point),
    but they provide specific implementations for calculating distance in 3D space*/
    /**
     * @Overridden
     * Method 1: Calculates the distance between this point
     * and another Point3D object using the distance formula for 3D space;
     * @param another Point3D object
     * @return distance from point to point as double value
     * */
    //todo: why not possible to use @Override annotation???
    public double distance(Point3D another) {
        double xDiff = getX() - another.getX();
        double yDiff = getY() - another.getY();
        double zDiff = z - another.z;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }

    /**
     * @Overridden
     * Method 2: Calculate distance between this point to a point defined by its coordinates (x, y, z)
     * @param x int value of x coordinate
     * @param y int value of y coordinate
     * @param z double value of z coordinate
     * @return
     */
    //todo: why not possible to use @Override annotation???
    public double distance(int x, int y, double z) {
        double xDiff = getX() - x;
        double yDiff = getY() - y;
        double zDiff = this.z - z;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }
}
