package com.app.vp.chapter_2_composition;

/**
 * Circle class modelling object with the point as the center of circle
 * and have a radius as well
 * So, we have relation a Point class to the Circle class where
 * Circle HAS-A Point
 * contain method:
 * -calculation area of the circle
 * -calculation circumference of the circle
 * -distance from two circles centers
 * */
public class Circle {

    private double radius; //1.0
    private Point center; //{0, 0}

    //constructors (3 overloaded)
    public Circle(){
        this.center = new Point(); // creating new Point with coordinates (0, 0)
        this.radius = 1.0;
    }
    public Circle(int xCenter, int yCenter, double radius){
        center = new Point(xCenter, yCenter); // creating new Point with set coordinates (xCenter, yCenter)
        this.radius = radius; //set radius
    }
    public Circle(Point center, double radius){
        this.center = center; //constructor for creating object Point
        this.radius = radius;
    }

    //getters and setters
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Point getCenter(){
        return this.center; //return object of Point class
    }
    public void setCenter(Point center){
        this.center = center;
    }

    //methods getters and setters for center coordinates
    public int getCenterX(){
        return center.getX(); //getter for coordinate x from Point class
    }
    public void setCenterX(int x){
        center.setX(x); //setter for coordinate x from Point class
    }
    public int getCenterY(){
        return center.getY(); //getter for coordinate y from Point class
    }
    public void setCenterY(int y){
        center.setY(y); //setter for coordinate y from Point class
    }

    public int[] getCenterXY(){
        return center.getXY(); //getXY() for class Point
    }
    public void setCenterXY(int x, int y){
        center.setXY(x, y);
    }

    /**
     * toString()
     * @return String value of Circle
     * */
    @Override
    public String toString() {
        return "Circle: (radius: " + radius + ", center: " + center + ")";
    }

    /**
     * getArea() calculate the square of the circle
     * @return double value the area of the circle
     * */
    public double getArea(){
        return Math.PI * radius * radius;
    }

    /**
     * getCircumference() calculate the length of circle
     * formula is: 2 * PI * radius
     * @return double value of circle length
     * */
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    /**
     * distance(Circle another) calculate distance from the center of current circle object to another circle object center
     * @param another object of Circle class
     * @return double value the distance
     * */
    public double distance(Circle another){
        //Point class has a distance method implemented
        return center.distance(another.center);
    }



}
