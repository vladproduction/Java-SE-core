package com.vladproduction.interfaces.extendsclassimplementsinterfaces;

public class Client extends Base implements Call {
    public void сall() {
        System.out.println("сall() of class Client: NUM = " + NUM);
        super.сall();
    }
}
