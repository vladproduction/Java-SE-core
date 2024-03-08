package com.vladproduction.vp34_wildcards_generics.read_data_process;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class FileDataSource implements DataSource<String>{
    @Override
    public String getData() {
        return "This is data from a file.";
    }
}
