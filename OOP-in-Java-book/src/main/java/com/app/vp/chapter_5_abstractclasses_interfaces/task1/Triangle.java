package com.app.vp.chapter_5_abstractclasses_interfaces.task1;

/**
 * equilateral triangle
 * */
public class Triangle extends Shape{

    private final double sideA, sideB, sideC;
    private final double height;

    public Triangle(String color, double sideA, double sideB, double sideC, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", height=" + height + "}; " + super.toString();
    }

    /**
     * equilateral triangle area:
     * formula area = (base/2) * height
     * @return area as double value
     * */
    @Override
    public double getArea() {

        return 0.5 * sideA * height;
    }

    /**
     * equilateral triangle perimeter:
     * formula: perimeter = side * 3;
     * @return perimeter as double value
     * */
    @Override
    public double getPerimeter() {
        return sideA * 3;
    }

}
