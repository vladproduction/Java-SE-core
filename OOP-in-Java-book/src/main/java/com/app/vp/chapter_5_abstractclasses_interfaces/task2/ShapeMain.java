package com.app.vp.chapter_5_abstractclasses_interfaces.task2;

public class ShapeMain {
    public static void main(String[] args) {

        //create circle object
        Circle circle1 = new Circle("red", true, 1);
        System.out.println(circle1); //testing toString() for Circle
        double circle1Area = circle1.getArea(); //testing getArea() for Circle
        System.out.println("circle1Area = " + circle1Area);
        double circle1Perimeter = circle1.getPerimeter(); //testing getPerimeter() for Circle
        System.out.println("circle1Perimeter = " + circle1Perimeter);

        //upcasting (new Circle is references to Shape type)
        Shape shape1 = new Circle("blue", true, 1);
        System.out.println(shape1);//testing toString() for Shape
        double shape1Area = shape1.getArea();//testing getArea() for Shape
        System.out.println("shape1Area = " + shape1Area);
        double shape1Perimeter = shape1.getPerimeter();//testing getPerimeter() for Shape
        System.out.println("shape1Perimeter = " + shape1Perimeter);

        //create rectangle object and testing methods
        Rectangle rectangle1 = new Rectangle("green", true, 10, 10);
        System.out.println(rectangle1);//testing toString() for Rectangle
        double rectangle1Area = rectangle1.getArea();//testing getArea() for Rectangle
        System.out.println("rectangle1Area = " + rectangle1Area);
        double rectangle1Perimeter = rectangle1.getPerimeter();//testing getPerimeter() for Rectangle
        System.out.println("rectangle1Perimeter = " + rectangle1Perimeter);

        //upcasting (new Rectangle is references to Shape type)
        Shape shape2 = new Rectangle("green", true, 10, 10);
        System.out.println(shape2);//testing toString() for Shape
        double shape2Area = shape2.getArea();//testing getArea() for Shape
        System.out.println("shape2Area = " + shape2Area);
        double shape2Perimeter = shape2.getPerimeter();//testing getPerimeter() for Shape
        System.out.println("shape2Perimeter = " + shape2Perimeter);

        //square
        System.out.println("-----square1-----");
        Square square1 = new Square();//testing constructor-1
        System.out.println("square1 = " + square1);
        System.out.println(square1.getArea()); //test getArea()
        System.out.println(square1.getPerimeter()); //test getPerimeter()

        System.out.println("-----square2-----");
        Square square2 = new Square(20.0); //testing constructor-2
        square2.setWidth(23);//testing overridden setWidth()
        square2.setLength(23);//testing overridden setLength()
        System.out.println("square2 = " + square2);
        System.out.println(square2.getArea()); //test getArea()
        System.out.println(square2.getPerimeter()); //test getPerimeter()

        System.out.println("-----square3-----");
        Square square3 = new Square("green", true, 50);//testing constructor-3
        System.out.println("square3 = " + square3);
        System.out.println(square3.getArea()); //test getArea()
        System.out.println(square3.getPerimeter()); //test getPerimeter()

    }
}
