package com.vladproduction.equals;

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //if they have same reference
        if (obj == null) return false; //if they are null
        if (this.getClass() != obj.getClass()) return false; //if they are objects from different classes
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y; //true: if state is exactly the same (fields values)
    }

    public static void main(String[] arg) {
        Point point1 = new Point(5, -5);
        Point point2 = point1;                        //copy object
        Point point3 = new Point(5, -5);        //creating new object
        Point point4 = new Point(5, 5);         //creating new object
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));
        System.out.println(point1.equals(point4));

        //output if equals is not overridden:
        /*true
        false
        false*/

        //output if equals is override:
        /*true
        true
        false*/
    }


}
