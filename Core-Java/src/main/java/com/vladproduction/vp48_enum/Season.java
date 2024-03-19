package com.vladproduction.vp48_enum;

/**
 * Created by vladproduction on 19-Mar-24
 */

public enum Season {
    SUMMER(35), AUTUMN(10), WINTER(-12), SPRING(21);

    private int avgTemp;

    Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }
}
