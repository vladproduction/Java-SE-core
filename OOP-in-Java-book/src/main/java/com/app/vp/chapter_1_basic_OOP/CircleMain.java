package com.app.vp.chapter_1_basic_OOP;

/**
 * testing Circle class
 * */
public class CircleMain {
    public static void main(String[] args) {

        //init circle object (default constructor)
        Circle c1 = new Circle();
        //init circle object (one param constructor)
        Circle c2 = new Circle(5);
        //init circle object (full params constructor)
        Circle c3 = new Circle(10, "red");

        //testing getters
        double radius2 = c2.getRadius();
        System.out.println("radius2 = " + radius2);  //just printing result
        double radius3 = c3.getRadius();
        System.out.println("radius3 = " + radius3);
        String color3 = c3.getColor();
        System.out.println("color3 = " + color3);

        //testing method getArea()
        double area2 = c2.getArea();
        System.out.println("area2 = " + area2);
        double area3 = c3.getArea();
        System.out.println("area3 = " + area3);

        //testing toString()
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
