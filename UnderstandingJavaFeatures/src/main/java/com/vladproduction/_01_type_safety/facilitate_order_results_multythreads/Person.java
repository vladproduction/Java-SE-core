package com.vladproduction._01_type_safety.facilitate_order_results_multythreads;

public abstract class Person {

    protected String name;
    protected int tel;

    public Person(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public abstract String getInfo();

}