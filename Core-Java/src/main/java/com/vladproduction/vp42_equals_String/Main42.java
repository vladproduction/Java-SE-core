package com.vladproduction.vp42_equals_String;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main42 {
    public static void main(String[] args) {

        // if we compare primitives:
        int x = 2;
        int y = 2;
        System.out.println(x==y); //true; '==' works for primitives
        //they are always references to the same place in memory

        //if we compare Objects:
        Building building1 = new Building(2);
        Building building2 = new Building(2);
        System.out.println(building1==building2); //false '==' does not work for objects
        // '==' equals compare references of objects
        /**but if we want to compare objects not by references but by as objects:
         * we have to override method equals() for our class and for comparing we have to
         * use method equals()*/
        System.out.println(building1.equals(building2)); //'true' if we override equals() in class Building
        //otherwise - not overridden equals() is going to be 'false'

    }
}
