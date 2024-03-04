package com.vladproduction.vp06_if;

public class WaterFlow {
    public static void main(String[] args) {
        int water_tap = 15;
        int pipe_volume = 25;
        waterFlowCapacity(water_tap, pipe_volume);
    }

    protected static void waterFlowCapacity(int water_tap, int pipe_volume) {
        if (water_tap < pipe_volume) {
            System.out.println("pipe flow is allowed".toUpperCase());
        }else {
            System.out.println("pipe flow is NOT allowed".toUpperCase());
//            throw new IllegalArgumentException("reduce water_tap OR increase pipe_volume".toUpperCase());
        }
    }
}
