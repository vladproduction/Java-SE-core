package com.app.vp.chapter_1_basic_OOP;

/**
 * testing Triangle calculation of perimeter and area
 * */
public class TriangleMain {
    public static void main(String[] args) {
        //init object
        Triangle triangle = new Triangle(10, 10, 12);
        System.out.println(triangle); //testing toSting()

        //testing getters $ setters
        System.out.println(triangle.getA());
        System.out.println(triangle.getB());
        System.out.println(triangle.getC());
        triangle.setA(20);
        triangle.setB(20);
        triangle.setC(20);
        System.out.println(triangle); //updated

        //testing perimeter
        double perimeter = triangle.perimeter(triangle);
        System.out.println("perimeter = " + perimeter);

        //testing area
        double area = triangle.area(triangle);
        System.out.println("area = " + area); //was: 173.20508075688772
        //area with defined formatted output (DecimalFormat)
        System.out.println(triangle.area(triangle));

    }
}
