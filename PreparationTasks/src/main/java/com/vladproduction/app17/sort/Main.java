package com.vladproduction.app17.sort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] data = {2,6,11,-2,50,0,100};

        MySorter sorter = defineSorter(1);
        sorter.sort(data);

        System.out.println(Arrays.toString(data));


    }

    public static MySorter defineSorter(int type){

        switch (type){
            case 0: return new BubbleSorter();
            case 1: return new SelectionSorter();
            default: return new BubbleSorter();
        }

    }

}
