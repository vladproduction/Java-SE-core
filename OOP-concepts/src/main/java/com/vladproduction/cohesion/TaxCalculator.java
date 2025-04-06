package com.vladproduction.cohesion;

// Tax operations - High cohesion class focusing only on tax-related operations
public class TaxCalculator {

    private double taxRate;

    public TaxCalculator(double defaultRate) {
        this.taxRate = defaultRate;
    }

    public void setTaxRate(double rate) {
        this.taxRate = rate;
        System.out.println("Tax rate set to: " + rate);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double calculateTax(double amount) {
        return amount * taxRate;
    }

    public double calculateTotalWithTax(double amount) {
        return amount + calculateTax(amount);
    }

}
