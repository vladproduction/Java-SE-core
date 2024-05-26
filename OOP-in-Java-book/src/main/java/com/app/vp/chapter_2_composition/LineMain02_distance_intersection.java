package com.app.vp.chapter_2_composition;

public class LineMain02_distance_intersection {

    public static void main(String[] args) {

        // Create Line objects
        Point point1 = new Point(2, 4);
        Point point2 = new Point(8, 12);
        Line line1 = new Line(point1, point2);

        Point point3 = new Point(5, 7); // Point to calculate distance from line1
        Point point4 = new Point(1, 1); // Point for a non-intersecting line
        Point point5 = new Point(3, 9); // Point for an intersecting line segment

        // Calculate and print distances
        System.out.println("Distance from point3 (" + point3.getX() + ", " + point3.getY() + ") to line1: " + line1.distance(point3));

        // Create a non-intersecting line
        Line line2 = new Line(point4, new Point(3, 3));

        // Check for intersection and print result
        System.out.println("Do line1 and line2 intersect? " + line1.intersects(line2));

        // Create an intersecting line segment
        Line line3 = new Line(point5, new Point(7, 5));

        // Check for intersection and print result
        System.out.println("Do line1 and line3 intersect? " + line1.intersects(line3));
    }
}
