package com.vladproduction.vp45_serialization;

import java.io.Serializable;

/**
 * Created by vladproduction on 18-Mar-24
 */
/**implements Serializable allow java to serialize objects as Person*/
public class Person implements Serializable {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
