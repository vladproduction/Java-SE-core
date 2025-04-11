package com.vladproduction.java_io_basics.app08.object_stream_example.list_objects;

import java.util.ArrayList;
import java.util.List;

import static com.vladproduction.java_io_basics.app08.object_stream_example.list_objects.Country.*;
import static com.vladproduction.java_io_basics.app08.object_stream_example.list_objects.Type.*;

public class DataGenerator {

    public static List<Car> generateCarsGermany() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(1, "BMW", SUV, GERMANY);
        Car car2 = new Car(2, "BMW-X5", CITY, GERMANY);
        Car car3 = new Car(3, "Audi", SPORT, GERMANY);
        Car car4 = new Car(4, "Mercedes", SUV, GERMANY);
        Car car5 = new Car(5, "WV", CITY, GERMANY);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }

    public static List<Car> generateCarsJapan() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(1, "Toyota", SUV, JAPAN);
        Car car2 = new Car(2, "Toyota", CITY, JAPAN);
        Car car3 = new Car(3, "Honda", SPORT, JAPAN);
        Car car4 = new Car(4, "Honda", SUV, JAPAN);
        Car car5 = new Car(5, "Subaru", CITY, JAPAN);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }

    public static Autosalon generateAutosalon(List<Car> cars, String name) {
        return new Autosalon(name, cars);
    }

}
