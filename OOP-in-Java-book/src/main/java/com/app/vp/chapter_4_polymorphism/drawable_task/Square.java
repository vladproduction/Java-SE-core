package com.app.vp.chapter_4_polymorphism.drawable_task;

public class Square extends Shape implements Drawable{

    private double side;

    public Square() {
        this.side = 1;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square drawing:");
        System.out.println("\tArea:"  + this.getArea());
        System.out.println("\tPerimeter:"  + this.getPerimeter());
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
