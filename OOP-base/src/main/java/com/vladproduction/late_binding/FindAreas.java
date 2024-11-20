package com.vladproduction.late_binding;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10.0, 5.0);
        Rectangle r = new Rectangle(9.0, 5.0);
        Triangle t = new Triangle(10.0, 8.0);
        Figure figref;
        figref = r;
        System.out.println(figref.area());
        figref = t;
        System.out.println(figref.area());
        figref = f;
        System.out.println(figref.area());
    }
}
