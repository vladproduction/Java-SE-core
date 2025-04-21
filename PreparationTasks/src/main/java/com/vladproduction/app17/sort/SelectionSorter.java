package com.vladproduction.app17.sort;

public class SelectionSorter implements MySorter {

    @Override
    public void sort(int[] data) {


        for (int i = 0; i < data.length - 1; i++) {
            int min = data[i];
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if(data[j] < min){
                    min = data[j];
                    minIndex = j;
                }
            }
            swap(i, minIndex, data);
        }

    }
}
