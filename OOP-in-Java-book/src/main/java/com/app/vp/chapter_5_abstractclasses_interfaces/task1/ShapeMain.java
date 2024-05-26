package com.app.vp.chapter_5_abstractclasses_interfaces.task1;

/**
 * Testing abstract class Shape and inherited:
 * -Rectangle
 * -Triangle
 * */
public class ShapeMain {
    public static void main(String[] args) {

        Shape rectangle1 = new Rectangle("red", 10, 10);
        System.out.println("rectangle1 = " + rectangle1);
        double rectangle1Area = rectangle1.getArea();
        System.out.println("rectangle1Area = " + rectangle1Area);
        double rectangle1Perimeter = rectangle1.getPerimeter();
        System.out.println("rectangle1Perimeter = " + rectangle1Perimeter);
        System.out.println();

        Triangle triangle1 = new Triangle("blue", 2, 2, 2, 3);
        System.out.println("triangle1 = " + triangle1); //toString
        double triangle1Area = triangle1.getArea();
        System.out.println("triangle1Area = " + triangle1Area);
        double triangle1Perimeter = triangle1.getPerimeter();
        System.out.println("triangle1Perimeter = " + triangle1Perimeter);


        //not possible to create new Shape(), have to define what concrete shape it should be first



    }
}
