package com.vladproduction.ocp.shape_ocp_solution;

public class Main {
    public static void main(String[] args) {

        var ac = new AreaCalculator();
        System.out.println("[shapes] " + ac.areaCalc(
                new Rectangle(10, 5),
                new Rectangle(10, 10),
                new Circle(5)));
    }
}
