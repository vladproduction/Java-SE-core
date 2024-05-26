package com.app.vp.chapter_2_composition;

import java.util.Arrays;

/**
 * Testing Line class with association to Point class
 * where Line HAS-A Point
 */
public class LineMain {
    public static void main(String[] args) {

        //testing constructors
        Line line1 = new Line(1, 1, 2, 2); //creating line by set coordinates for (begin, end)
        System.out.println("line1 = " + line1); //testing toString()

        Line line2 = new Line(5, 5, 6, 6); //creating line by set Points (begin, end)
        System.out.println("line2 = " + line2); //testing toString()

        //testing getters & setters
        line1.setBeginX(10);
        line1.setBeginY(10);
        line1.setEndX(20);
        line1.setEndY(20);
        int line1BeginX = line1.getBeginX();
        int line1BeginY = line1.getBeginY();
        System.out.println("line1BeginX = " + line1BeginX);
        System.out.println("line1BeginY = " + line1BeginY);
        int line1EndX = line1.getEndX();
        int line1EndY = line1.getEndY();
        System.out.println("line1EndX = " + line1EndX);
        System.out.println("line1EndY = " + line1EndY);
        System.out.println(line1);

        line2.setBegin(new Point(1, 1));
        line2.setEnd(new Point(2, 2));
        Point line2Begin = line2.getBegin();
        Point line2End = line2.getEnd();
        System.out.println("line2Begin = " + line2Begin);
        System.out.println("line2End = " + line2End);
        System.out.println(line2);

        //int[] getBeginXY(int x, int y) & int[] getEndXY(int x, int y)
        int[] line1BeginXY = line1.getBeginXY(0, 1);
        System.out.println("line1BeginXY = " + Arrays.toString(line1BeginXY));
        int[] line1EndXY = line1.getEndXY(0, 1);
        System.out.println("line1EndXY = " + Arrays.toString(line1EndXY));

        //setBeginXY(int x, int y) & setEndXY(int x, int y)
        line1.setBeginXY(100, 100);
        line1.setEndXY(200, 200);
        System.out.println(line1);

        //getLength() testing calculation the distance for two points (begin, end)
        Line line3 = new Line(new Point(10,20), new Point(1,2));
        Line line4 = new Line(new Point(1,2), new Point(10,20));
        double line3Length = line3.getLength();
        double line4Length = line4.getLength();
        System.out.println("line3Length = " + line3Length);
        System.out.println("line4Length = " + line4Length);

        //getGradient() testing vertical and not-vertical
        // to return the angle of inclination of the segment relative to the X axis
        Line line5 = new Line(new Point(2,4), new Point(2,12)); //using Point objects
        Line line6 = new Line(1,1,5,5); //using coordinates
        System.out.println("line5 = " + line5);
        System.out.println("line6 = " + line6);
        double line5Length = line5.getLength();
        double line6Length = line6.getLength();
        System.out.println("line5Length = " + line5Length);
        System.out.println("line6Length = " + line6Length);

        //truing to get gradient for vertical:
        try {
            double line5Gradient = line5.getGradient();
            System.out.println("line5Gradient = " + line5Gradient);
        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

        //gradient for not-vertical:
        double line6Gradient = line6.getGradient();
        System.out.println("line6Gradient = " + line6Gradient);

        //test distance(int x, int y)
        Line line7 = new Line(2,4,2,12);
        double distance_coordinated = line7.distance(2, 2);
        System.out.println("distance_coordinated = " + distance_coordinated);

        //test distance(Point p)
        Point point = new Point(10, 10);
        double distance_pointed = line7.distance(point);
        System.out.println("distance_pointed = " + distance_pointed);

        //test intersects(Line another)
        boolean line1_intersects_line2 = line1.intersects(line2);
        System.out.println("line1_intersects_line2 = " + line1_intersects_line2);

        boolean line1_intersects_line3 = line1.intersects(line3);
        System.out.println("line1_intersects_line3 = " + line1_intersects_line3);

        // **Create line8 that intersects with line10**
        // Create Line objects
        Point point1 = new Point(2, 4);
        Point point2 = new Point(8, 12);
        Line line10 = new Line(point1, point2);
        Point point6 = new Point(5, 5); // Intersection point on line10
        Point point7 = new Point(10, 5); // Point off line10 but on same slope
        Line line8 = new Line(point6, point7);
        // Check intersection with line4 (should intersect)
        System.out.println("Do line10 and line8 intersect? " + line10.intersects(line8));


    }
}
