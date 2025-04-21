package com.vladproduction.app17.sort;

public interface MySorter {

    void sort(int [] data);

    default void swap(int i, int j, int [] data) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    // [2, 4, 6]
    //i = 1, j = 2
    default void swap2(int i, int j, int [] data) {
        data[i] = data[i] + data[j]; // data[1] = data[1] + data[2] = 4 + 6 = 10;  [2, 10, 6]
        data[j] = data[i] - data[j]; // data[2] = data[1] - data[2] = 10 - 6 = 4;  [2, 10, 4]
        data[i] = data[i] - data[j]; // data[1] = data[1] - data[2] = 10 - 4 = 6;  [2, 6, 4]
    }

}
