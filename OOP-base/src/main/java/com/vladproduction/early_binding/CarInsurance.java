package com.vladproduction.early_binding;

public class CarInsurance extends Insurance {
    public static final int HIGH = 200;

    @Override
    public int getPremium() {
        return HIGH;
    }

    public static String getCategory() {
        return "CarInsurance";
    }
}
