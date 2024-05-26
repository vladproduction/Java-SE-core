package com.app.vp.chapter_3_inheritance;

/**
 * testing class Cylinder and properties that came from superclass Circle
 * */
public class CylinderMain {
    public static void main(String[] args) {

        //testing constructor-1
        Cylinder cylinder1 = new Cylinder();
        //printing data
        System.out.println("Cylinder 1: " +
                        "Radius = " + cylinder1.getRadius() +
                        ", Height = " + cylinder1.getHeight() +
                        ", Color = " + cylinder1.getColor() +
                        ", Area = " + cylinder1.getArea() +
                        ", Volume = " + cylinder1.getVolume_modified()
        );

        //testing constructor-2
        Cylinder cylinder2 = new Cylinder(5);
        //printing data
        System.out.println("Cylinder 2: " +
                "Radius = " + cylinder2.getRadius() +
                        ", Height = " + cylinder2.getHeight() +
                        ", Color = " + cylinder2.getColor() +
                        ", Area = " + cylinder2.getArea() +
                        ", Volume = " + cylinder2.getVolume_modified()
        );

        //testing constructor-3
        Cylinder cylinder3 = new Cylinder(5, 10, "blue");
        //printing data
        System.out.println("Cylinder 3: " +
                "Radius = " + cylinder3.getRadius() +
                        ", Height = " + cylinder3.getHeight() +
                        ", Color = " + cylinder3.getColor() +
                        ", Area = " + cylinder3.getArea() +
                        ", Volume = " + cylinder3.getVolume_modified()
        );

        //testing overridden toString()
        System.out.println("cylinder1 = " + cylinder1);
        System.out.println("cylinder2 = " + cylinder2);
        System.out.println("cylinder3 = " + cylinder3);



    }
}
