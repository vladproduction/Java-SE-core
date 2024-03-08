package com.vladproduction.vp34_wildcards_generics.shapes_calc_area;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class MainB {
    public static void main(String[] args) {

        Triangle triangle10_5 = new Triangle(10.0f, 5.0f);
        Triangle triangle5_5 = new Triangle(5.0f, 5.0f);
        Triangle triangle2_5 = new Triangle(2.0f, 5.0f);
        Circle circle10 = new Circle(10.0);
        Circle circle5 = new Circle(5.0);
        Circle circle2 = new Circle(2.0);
        Square square10 = new Square(10);
        Square square5 = new Square(5);
        Square square2 = new Square(2);

        //--------------------------------------------------------
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(triangle10_5);
        triangles.add(triangle5_5);
        triangles.add(triangle2_5);
        List<Circle> circles = new ArrayList<>();
        circles.add(circle10);
        circles.add(circle5);
        circles.add(circle2);
        List<Square> squares = new ArrayList<>();
        squares.add(square10);
        squares.add(square5);
        squares.add(square2);

//        calculation(triangles); //float
//        calculation(circles);   //double
//        calculation(squares);   //int


        //---------------------------------------
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(square10);
        shapeList.add(square5);
        shapeList.add(square2);
        shapeList.add(triangle10_5);
        shapeList.add(triangle5_5);
        shapeList.add(triangle2_5);
        shapeList.add(circle10);
        shapeList.add(circle5);
        shapeList.add(circle2);
        calculation(shapeList);




    }

    private static void calculation(List<? extends Shape> list) {

        for (Shape shape : list) {
            System.out.println(shape.calculateArea() + " - " + shape.getClass().getSimpleName());
        }

    }


}
