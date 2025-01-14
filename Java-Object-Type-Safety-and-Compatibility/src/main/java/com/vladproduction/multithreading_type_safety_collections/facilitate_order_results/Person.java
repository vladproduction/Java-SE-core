package com.vladproduction.multithreading_type_safety_collections.facilitate_order_results;

public abstract class Person {

    protected String name;
    protected int tel;

    public Person(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public abstract String getInfo();

}
