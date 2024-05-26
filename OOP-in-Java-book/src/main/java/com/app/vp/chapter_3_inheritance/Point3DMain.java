package com.app.vp.chapter_3_inheritance;

/**
 * Testing both constructors, getters & setters, toString() and two distance methods.
 * */
public class Point3DMain {
    public static void main(String[] args) {

        // Test constructor with all parameters
        System.out.println("Testing constructor with all parameters:");
        Point3D point1 = new Point3D(3, 5, 2.5);
        System.out.println(point1); // Output: Point3D: (3, 5, 2.5)

        // Test getters and setters
        System.out.println("\nTesting getters and setters:");
        point1.setX(10);
        point1.setY(8);
        point1.setZ(4.0);
        System.out.println("X coordinate: " + point1.getX()); // Output: X coordinate: 10
        System.out.println("Y coordinate: " + point1.getY()); // Output: Y coordinate: 8
        System.out.println("Z coordinate: " + point1.getZ()); // Output: Z coordinate: 4.0

        // Test overloaded toString method
        System.out.println("\nTesting toString method:");
        System.out.println(point1); // Output: Point3D: (10, 8, 4.0) (updated values)

        // Test constructor with default x and y (0, 0)
        System.out.println("\nTesting constructor with z parameter:");
        Point3D point2 = new Point3D(7.2);
        System.out.println(point2); // Output: Point3D: (0, 0, 7.2)

        // Test distance methods
        System.out.println("\nTesting distance methods:");
        Point3D point3 = new Point3D(2, 4, 1.5);
        double distance1 = point1.distance(point3);
        System.out.println("Distance between point1 and point3: " + distance1); // Output: Distance between point1 and point3: ~9.287087810503355

        double distance2 = point2.distance(5, 3, 6.8);
        System.out.println("Distance between point2 and (5, 3, 6.8): " + distance2); // Output: Distance between point2 and (5, 3, 6.8): ~5.844655678480984
    }

    }

