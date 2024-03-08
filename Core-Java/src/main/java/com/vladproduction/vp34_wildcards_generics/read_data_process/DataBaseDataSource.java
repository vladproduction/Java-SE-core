package com.vladproduction.vp34_wildcards_generics.read_data_process;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class DataBaseDataSource implements DataSource<Integer>{
    @Override
    public Integer getData() {
        return 12345;
    }
}
