package com.app.vp.chapter_4_polymorphism;

/**
 * Class inherited Shape class properties
 * overriding its methods for Rectangle behaviour
 * */
public class Rectangle extends Shape{

    //defined class variables
    private int length;
    private int width;

    //constructor with params
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    /*//getters & setters
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }*/

    /**
     * @Overridden
     * Method toString() print information about created object
     * super.toString() - properties came from the superclass
     * @return String value of Rectangle properties + super.toString()
     * */
    @Override
    public String toString() {
        return "Rectangle (" +"length=" + length +", width=" + width + "); Superclass is: " + super.toString();
    }

    /**
     * @Overridden
     * Method to calculate of Rectangle area
     * formula: area = width * length
     * @return area of Rectangle as double value
     * */
    @Override
    public double getArea(){
        return width * length;
    }
}
