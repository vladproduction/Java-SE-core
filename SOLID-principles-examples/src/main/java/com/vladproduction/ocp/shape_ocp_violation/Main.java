package com.vladproduction.ocp.shape_ocp_violation;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(10, 10);

        var ac = new AreaCalculator();
        System.out.println("[rectangles] " + ac.areaCalc(rect1, rect2));

        Circle circle = new Circle(5);
        System.out.println("[circles] " + ac.areaCalc(circle));

        System.out.println("total = " + (ac.areaCalc(rect1, rect2) + ac.areaCalc(circle)));

    }
}
