package com.app.vp.chapter_5_abstractclasses_interfaces.task5;

public class CircleTestMain {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println("circle1 = " + circle1);
        double circle1Area = circle1.getArea();
        System.out.println("circle1Area = " + circle1Area);
        double circle1Perimeter = circle1.getPerimeter();
        System.out.println("circle1Perimeter = " + circle1Perimeter);
        System.out.println();
        Circle circle2 = new Circle();
        System.out.println("circle2 = " + circle2);

        System.out.println("------------------------");
        ResizableCircle resizableCircle1 = new ResizableCircle(2);
        System.out.println("resizableCircle1 = " + resizableCircle1);
        double resizableCircle1Area = resizableCircle1.getArea();
        System.out.println("resizableCircle1Area = " + resizableCircle1Area);
        double resizableCircle1Perimeter = resizableCircle1.getPerimeter();
        System.out.println("resizableCircle1Perimeter = " + resizableCircle1Perimeter);
        System.out.println("----------after resize:------------");
        resizableCircle1.resize(10);
        System.out.println("resizableCircle1 = " + resizableCircle1);
        resizableCircle1Area = resizableCircle1.getArea();
        System.out.println("resizableCircle1Area = " + resizableCircle1Area);
        resizableCircle1Perimeter = resizableCircle1.getPerimeter();
        System.out.println("resizableCircle1Perimeter = " + resizableCircle1Perimeter);

    }
}
