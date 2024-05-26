package com.app.vp.chapter_2_composition;

/**
 * Testing Point class
 * */
public class PointMain {
    public static void main(String[] args) {

        //check constructor and toString()
        Point point1 = new Point(1, 2);
        System.out.println("point1 = " + point1);
        System.out.println(point1);

        //default constructor
        Point point2 = new Point();
        System.out.println("point2 = " + point2);
        System.out.println(point2);

        //check getters & setters
        point1.setX(10);
        point1.setY(20);
        System.out.println(point1); //updated

        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());

        //check getXY() & setXY()
        point1.setXY(100, 200);
        System.out.println(point1); //updated
        int x_0 = point1.getXY()[0];
        int y_0 = point1.getXY()[1];
        System.out.println("x_0 = " + x_0);
        System.out.println("y_0 = " + y_0);

        //check distance (3 overloaded methods)
        point2.setXY(150, 250);
        System.out.printf("Distance: %.2f%n", point1.distance(110, 210)); //from current position to set coordinates
        System.out.printf("Distance: %.2f%n", point1.distance(point2)); //from point1 to point2
        System.out.printf("Distance: %.2f%n", point2.distance(point1)); //from point2 to point1
        System.out.printf("Distance: %.2f%n", point1.distance()); //from point1 to default point position with coordinates (x, y)
        System.out.printf("Distance: %.2f%n", point2.distance()); //from point2 to default point position with coordinates (x, y)


    }
}
