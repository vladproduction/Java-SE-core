package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App
{
    public static void main( String[] args ){

        Car car = new Car("Car1", 2023);
        ObjectMapper om = new ObjectMapper();
        try {
            String carModel = om.writeValueAsString(car);
            System.out.println(carModel);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
