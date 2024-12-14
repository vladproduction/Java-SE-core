package com.vladproduction.operators.equality_relational;

public class Example02 {
    public static void main(String[] args) {
        int count = 1;
        System.out.println(count < 1);
        System.out.println(count > 0);
        System.out.println(count <= 0);
        System.out.println(count >= -1);
        System.out.println(count == 0);
        System.out.println(count != 1);

        System.out.println("===========");
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = null;
        System.out.println(object1 == object2); //refer to diff memory location
        System.out.println(object3 == null);

        System.out.println("===========");
        Object object4 = new Object();
        Object object5 = object4;
        System.out.println(object5 == object4); //has same references




    }
}
