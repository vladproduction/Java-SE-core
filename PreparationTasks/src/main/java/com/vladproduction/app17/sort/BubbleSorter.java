package com.vladproduction.app17.sort;

public class BubbleSorter implements MySorter {

    @Override
    public void sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if(data[i] > data[j]){
                    swap(i, j, data);
                }
            }
        }

    }
}
