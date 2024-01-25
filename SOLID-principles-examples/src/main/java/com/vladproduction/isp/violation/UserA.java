package com.vladproduction.isp.violation;

public class UserA {

    private ClassA classA;

    public UserA(ClassA classA) {
        this.classA = classA;
    }

    public void callGetName(){
        System.out.println(classA.getName());
    }
}
