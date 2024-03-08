package com.vladproduction.vp34_wildcards_generics.read_data_process;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class DataProcessor {

    public static void processData(DataSource<?> source){
        Object data = source.getData();
        System.out.println("Data: " + data);
    }

}
