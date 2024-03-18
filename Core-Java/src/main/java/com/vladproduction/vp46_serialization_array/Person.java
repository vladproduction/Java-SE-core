package com.vladproduction.vp46_serialization_array;

import java.io.Serializable;

/**
 * Created by vladproduction on 18-Mar-24
 */
/**implements Serializable allow java to serialize objects as Person*/
public class Person implements Serializable {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "(" + id + ":" + name + ", age: " + age + ")";
    }
}
