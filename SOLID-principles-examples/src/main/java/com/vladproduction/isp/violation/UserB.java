package com.vladproduction.isp.violation;

public class UserB {

    private ClassA classA;

    public UserB(ClassA classA) {
        this.classA = classA;
    }

    public void callGetDate(){
        System.out.println(classA.getDate());
    }
}
