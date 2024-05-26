package com.app.vp.chapter_2_composition;

import java.util.Arrays;

/**
 * Testing Circle class
 * where we have association HAS-A, center of the circle representing by Point class object
 * also testing methods declared in class Circle
 * */
public class CircleMain {
    public static void main(String[] args) {

        //constructors
        Circle circle1 = new Circle();
        System.out.println("circle1 = " + circle1); //testing toString()
        Circle circle2 = new Circle(1, 2, 3.3);
        System.out.println("circle2 = " + circle2);
        //creating as anonymous object Point
        Circle circle3 = new Circle(new Point(10, 20), 10);
        System.out.println("circle3 = " + circle3);

        //testing getters & setters
        circle1.setCenter(new Point());
        circle1.setRadius(7.7);
        System.out.println("circle1 = " + circle1);

        circle1.setCenter(new Point(4, 4));
        System.out.println("circle1 = " + circle1);

        Point circle1Center = circle1.getCenter();
        double circle1Radius = circle1.getRadius();
        System.out.println("circle1Center = " + circle1Center);
        System.out.println("circle1Radius = " + circle1Radius);

        //testing coordinates
        circle1.setCenterX(21);
        circle1.setCenterY(22);
        System.out.println("circle1.getCenterX() = " + circle1.getCenterX());
        System.out.println("circle1.getCenterY() = " + circle1.getCenterY());

        circle1.setCenterXY(55, 55);
        System.out.println("circle1 = " + circle1);
        int[] centerXY = circle1.getCenterXY();
        System.out.println("centerXY = " + Arrays.toString(centerXY));
        int circle1_x_0 = circle1.getCenterXY()[0];
        int circle1_y_1 = circle1.getCenterXY()[1];
        System.out.println("circle1_x_0 = " + circle1_x_0);
        System.out.println("circle1_y_1 = " + circle1_y_1);

        //testing getArea() and getCircumference()
        double circle1Area = circle1.getArea();
        System.out.println("circle1Area = " + circle1Area);
        double circle1Circumference = circle1.getCircumference();
        System.out.println("circle1Circumference = " + circle1Circumference);

        //testing distance()
        System.out.printf("distance: %.2f%n", circle1.distance(circle2));
        System.out.printf("distance: %.2f%n", circle2.distance(circle1));


    }
}
