package com.app.vp.chapter_4_polymorphism;

/**
 * Class inherited Shape class properties
 * overriding its methods for Triangle behaviour
 * */
public class Triangle extends Shape{

    //defined class variables
    private int base;
    private int height;

    //constructor with params
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    /*//getters & setters
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }*/

    /**
     * @Overridden
     * Method toString() print information about created object
     * super.toString() - properties came from the superclass
     * @return String value of Triangle properties + super.toString()
     * */
    @Override
    public String toString() {
        return "Triangle (" +"base=" + base +", height=" + height + "); Superclass is: " + super.toString();
    }

    /**
     * @Overridden
     * Method to calculate of Triangle area
     * formula: area = (base / 2) * height
     * @return area of Triangle as double value
     * */
    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
}
