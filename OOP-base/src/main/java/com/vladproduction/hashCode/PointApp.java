package com.vladproduction.hashCode;

import com.vladproduction.equals.Point;

public class PointApp {
    public static void main(String[] arg) {
        Point point1 = new Point(5, -5); //same reference, hence same hashCode return
        Point point2 = point1;
        Point point3 = new Point(5, -5);
        Point point4 = new Point(5, 5);
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point3.hashCode()); //object identical with previous one but hashes is different
        System.out.println(point4.hashCode());

        //output:
        /*455659002
        455659002
        250421012
        1915318863*/

    }

}
