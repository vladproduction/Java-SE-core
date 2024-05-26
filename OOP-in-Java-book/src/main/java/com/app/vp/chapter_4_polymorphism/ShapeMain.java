package com.app.vp.chapter_4_polymorphism;

/**
 * Testing Rectangle and Triangle classes
 * check for:
 * - upcasting and downcasting
 * - getArea() consequently
 * */
public class ShapeMain {
    public static void main(String[] args) {

        //upcasting rectangle
        Shape shape1 = new Rectangle("red", 4, 5);
        System.out.println("shape1 = " + shape1);//testing toString()
        System.out.println(shape1.getArea()); //testing getArea()

        //upcasting triangle
        Shape shape2 = new Triangle("blue", 4, 5);
        System.out.println("shape2 = " + shape2);//testing toString()
        System.out.println(shape2.getArea());//testing getArea()
    }
}
