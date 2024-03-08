package com.vladproduction.vp34_wildcards_generics.read_data_process;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class MainApp {
    public static void main(String[] args) {

        FileDataSource fileDataSource = new FileDataSource();
        DataBaseDataSource dataBaseDataSource = new DataBaseDataSource();

        DataProcessor.processData(fileDataSource);
        DataProcessor.processData(dataBaseDataSource);


    }
}
