package com.vladproduction.vp42_equals_String;

import java.util.Objects;

/**
 * Created by vladproduction on 18-Mar-24
 */


public class Building {

    int levels;

    public Building(int levels) {
        this.levels = levels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }
}
