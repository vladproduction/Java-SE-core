package com.app.vp.chapter_4_polymorphism.shape_task;

public class Square extends Rectangle{

    private double side;

    //constructor-1
    public Square(){
        this.side = 1;
    }
    //constructor-2
    public Square(double side){
        super(side, side);
        this.side = side;
    }
    //constructor-3
    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + "}" + super.toString();
    }

    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public double getPerimeter(){
        return (side * 2) + (side * 2);
    }
}
