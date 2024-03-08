package com.vladproduction.vp34_wildcards_generics.shapes_calc_area;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class MainA {
    public static void main(String[] args) {

        square();
        circle();
        triangle();


    }

    private static void square(){
        System.out.println("-----------square-------------");

        Square square10 = new Square(10);
        Shape<Integer> shapeSquare10 = square10;
        System.out.println(shapeSquare10.calculateArea());

        Square square5 = new Square(5);
        Shape<Integer> shapeSquare5 = square5;
        System.out.println(shapeSquare5.calculateArea());

        Square square2 = new Square(2);
        Shape<Integer> shapeSquare2 = square2;
        System.out.println(shapeSquare2.calculateArea());
    }

    private static void circle(){
        System.out.println("-----------circle-------------");

        Circle circle10 = new Circle(10.0);
        Shape<Double> shapeCircle10 = circle10;
        System.out.printf("%.3f\n", shapeCircle10.calculateArea());

        Circle circle5 = new Circle(5.0);
        Shape<Double> shapeCircle5 = circle5;
        System.out.printf("%.3f\n", shapeCircle5.calculateArea());

        Circle circle2 = new Circle(2.0);
        Shape<Double> shapeCircle2 = circle2;
        System.out.printf("%.3f\n", shapeCircle2.calculateArea());
    }

    private static void triangle(){
        System.out.println("-----------triangle-------------");

        Triangle triangle10_5 = new Triangle(10.0f, 5.0f);
        Shape<Float> shapeTriangle10_5 = triangle10_5;
        System.out.printf("%.2f\n", triangle10_5.calculateArea());

        Triangle triangle5_5 = new Triangle(5.0f, 5.0f);
        Shape<Float> shapeTriangle5_5 = triangle5_5;
        System.out.printf("%.2f\n", triangle5_5.calculateArea());

        Triangle triangle2_5 = new Triangle(2.0f, 5.0f);
        Shape<Float> shapeTriangle2_5 = triangle2_5;
        System.out.printf("%.2f\n", triangle2_5.calculateArea());

        List<Triangle> triangles = new ArrayList<>();
        triangles.add(triangle10_5);
        triangles.add(triangle5_5);
        triangles.add(triangle2_5);

        System.out.println("----list triangles-------");
        for (Triangle triangle : triangles) {
            System.out.printf("%.2f\n", triangle.calculateArea());

        }
    }


}
