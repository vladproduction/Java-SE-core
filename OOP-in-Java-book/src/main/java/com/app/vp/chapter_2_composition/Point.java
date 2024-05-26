package com.app.vp.chapter_2_composition;



/**
 * Point class for modeling 2D point with coordinates (x, y).
 * Containing overloading distance methods with different behaviours,
 * which returns double value as result of calculation (depending on parameters set)
 * */
public class Point {

    //defining starting coordinates values
    private int x, y;

    //constructor with params
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //overloading constructors
    //default constructor, for more control
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // getters & setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * return x and y as elements of a two-element array,
     * representing as coordinates
     * @return int[] with coordinates
     * */
    public int[] getXY(){
        int [] results = new int [2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    /**
     * setter coordinates x and y for point
     * @param x int value
     * @param y int value
     * */
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Method toString() return (x, y)
     * */
    @Override
    public String toString() {
        return "Point: (" + this.x +", " + this.y + ")";
    }

    /**
     * Method 1: returns the distance from a given object to a point, given by coordinates (x,y);
     * @param x int value of x coordinate
     * @param y int value of y coordinate
     * @return distance double value
     * */
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Method 2: returns the distance from a given point to a given point - an object of the Point class named another.
     * @param another Object of Point class
     * @return distance double value
     * */
    public double distance(Point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Method 3: returns distance from this object to the point with coordinates (0,0)
     * @return distance double value
     * */
    public double distance(){

        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
