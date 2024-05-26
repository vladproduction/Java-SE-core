package com.app.vp.chapter_1_basic_OOP;

import java.text.DecimalFormat;

/**
 * class demonstrate calculation of perimeter and area for triangle
 * */
public class Triangle {

    //fields
    private double a, b, c;

    //constructor default
    public Triangle(){
    }

    //constructor with params
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getters & setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    /**
     * calculation perimeter
     * @return double value
     * */
    public double perimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

    /**
     * calculation area by Herons formula
     * -Herons formula: Area = sqrt(s * (s - a) * (s - b) * (s - c))
     * -where s is semi-perimeter: s = (a + b + c) / 2
     * @return double value
     * */
    public double area(Triangle triangle){
        double semiPerimeter = (perimeter(triangle)) / 2;
        double result = Math.sqrt(semiPerimeter * (semiPerimeter - triangle.a) * (semiPerimeter - triangle.b) * (semiPerimeter - triangle.c));
        // Create a DecimalFormat object to limit decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        String area = df.format(result); //formatting result to hide numbers over 2 elements after comma
        return Double.parseDouble(area);
    }

    /**
     *
     * */
    @Override
    public String toString() {
        return String.format("Triangle: a = %.2f, b = %.2f,c = %.2f", a, b, c);
    }
}
