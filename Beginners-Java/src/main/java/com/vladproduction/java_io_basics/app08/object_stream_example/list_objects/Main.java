package com.vladproduction.java_io_basics.app08.object_stream_example.list_objects;

import java.io.File;
import java.util.List;

public class Main {

    private static final String pathFileGermanyAuto = "src/main/java/com/vladproduction/java_io_basics/app08/object_stream_example/list_objects/AutosalonGermany.txt";
    private static final String pathFileJapanAuto = "src/main/java/com/vladproduction/java_io_basics/app08/object_stream_example/list_objects/AutosalonJapan.txt";
    private static final File fileGermanyAuto = new File(pathFileGermanyAuto);
    private static final File fileJapanAuto = new File(pathFileJapanAuto);

    public static void main(String[] args) {

        //prepare data
        List<Car> carsGermany = DataGenerator.generateCarsGermany();
        List<Car> carsJapan = DataGenerator.generateCarsJapan();

        //prepare Autosalon:
        Autosalon autosalonGermany = DataGenerator.generateAutosalon(carsGermany, "Germany-Autosalon");
        Autosalon autosalonJapan = DataGenerator.generateAutosalon(carsJapan, "Japan-Autosalon");

        //write data method
        DataHelper.writeData(fileGermanyAuto, autosalonGermany);
        DataHelper.writeData(fileJapanAuto, autosalonJapan);

        //read data method:
        Autosalon autosalonGermanyResult = DataHelper.readData(fileGermanyAuto);
        System.out.println(autosalonGermanyResult);
        System.out.println("========");
        Autosalon autosalonJapanResult = DataHelper.readData(fileJapanAuto);
        System.out.println(autosalonJapanResult);

    }
}
