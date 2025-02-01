package com.vladproduction.escape_references_exercise;

import java.util.HashMap;
import java.util.Map;

public class Price {

    private Map<String, Double> rates;
    private Double value;

    public Price(Double value) {
        this.value = value;
        rates = new HashMap<String, Double>();
        rates.put("USD", 1d);
        rates.put("GBP", 0.6);
        rates.put("EUR", 0.8);
    }

    //todos: remove escaping reference (we should not change value while converting)
    /*public Double convert(String currency) {
        if(currency.equals("USD")) {
            return value;
        } else {
            Double convertion = rates.get("USD") / rates.get(currency);
            value = value * convertion;
            return value;
        }
    }*/

    //fixed (returning a brand-new value which has been converted)
    public Double convert(String currency) {
        if(currency.equals("USD")) {
            return value; // return here as a new Double within constructor using Double factory static method
        } else {
            Double convertion = rates.get("USD") / rates.get(currency);
            return value * convertion;
        }
    }

    public String toString() {
        return this.value.toString();
    }

}
