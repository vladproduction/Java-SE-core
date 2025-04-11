package com.vladproduction.java_io_basics.app08.object_stream_example.list_objects;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Car implements Serializable {

    private long id;
    private String name;
    private Type type;
    private Country country;

    public Car(long id, String name, Type type, Country country) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(name, car.name) && type == car.type && country == car.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, country);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", country=" + country +
                '}';
    }
}
