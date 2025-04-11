package com.vladproduction.java_io_basics.app08.object_stream_example.list_objects;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Autosalon implements Serializable {

    private String name;
    private List<Car> cars;

    public Autosalon(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Autosalon autosalon = (Autosalon) o;
        return Objects.equals(name, autosalon.name) && Objects.equals(cars, autosalon.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cars);
    }

    @Override
    public String toString() {
        return "Autosalon{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }
}
