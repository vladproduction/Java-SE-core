package com.vladproduction.recomendationfordeveloping.immutableclass;

import java.util.Arrays;

/**
 * Such an object cannot be changed from creation to destruction, which reduces the security costs when used in competing operations.
 * In the standard Java implementation, there are quite a few classes with immutable internal state. For example, the String class.
 * A class with Immutable behavior can contain methods for creating an object of the same type with an internal state that is different from the current one.
 * This is justified from a resource point of view only if such changes occur infrequently.
 * */
public final class ImmutableType {
    private String name;
    private int id;
    String[] strings;
    public String[] getStrings() {
        return Arrays.copyOf(strings, strings.length);
    }
    public ImmutableType(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    // equals, hashCode, toString

}
