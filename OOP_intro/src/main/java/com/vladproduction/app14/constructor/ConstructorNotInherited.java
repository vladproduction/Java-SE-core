package com.vladproduction.app14.constructor;

public class ConstructorNotInherited {
    public static void main(String[] args) {

        //SubRecord does not inherit the constructor of SuperRecord, but it can call it using super()
        new SubRecord();

    }

    static class SuperRecord {
        public SuperRecord(){
            System.out.println("SuperRecord");
        }
    }

    static class SubRecord extends SuperRecord {
        public SubRecord(){
            super(); //calling super constructor
            System.out.println("SubRecord");
        }
    }

}
