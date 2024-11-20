package com.vladproduction.demo;

class ChildClass extends ParentClass {
    public void parentMethod(int i) {
        System.out.println("parentMethod ChildClass" + i);
    }

    public void childMethod(int i) {
        System.out.println("childMethod ChildClass" + i);
    }


}
