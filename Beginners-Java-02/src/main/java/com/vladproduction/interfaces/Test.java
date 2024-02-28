package com.vladproduction.interfaces;

public class Test implements SomeInterface, HumanInterface {
    @Override
    public void test() {

    }

    @Override
    public String getString(String text) {
        return text;
    }

    @Override
    public void talk() {

    }

    @Override
    public void walk() {

    }

    @Override
    public int getAge() {
        return 0;
    }
}
