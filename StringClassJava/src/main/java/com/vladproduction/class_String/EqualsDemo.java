package com.vladproduction.class_String;

public class EqualsDemo {

    public static void main(String args[]){
        String s1="Hello";
        String s2=new String("Hello");
        String s3="Good-bye";
        String s4="HELLO";
        System.out.println(s1+" равно "+s2+" --> "+s1.equals(s2));
        System.out.println(s1+" равно "+s3+" --> "+s1.equals(s3));
        System.out.println(s1+" равно "+s4+" --> "+s1.equals(s4));
        System.out.println(s1+" равно "+s4+
                " --> "+s1.equalsIgnoreCase(s4));
        System.out.println(s1+" равно "+s2+" --> "+(s1==s2));
    }
}
