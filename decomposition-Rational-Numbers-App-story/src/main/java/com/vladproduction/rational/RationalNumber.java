package com.vladproduction.rational;

public class RationalNumber {

    private final int numerator;
    private final int denominator;

    public RationalNumber(final int numerator, final int denominator) {
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator for a RationalNumber must not be zero");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    @Override
    public String toString(){
        return numerator == 0 ? "0" : numerator + "/" + denominator;
    }

    public RationalNumber add(RationalNumber another) {
        int sumNumerator = this.numerator * another.denominator + another.numerator * this.denominator;
        int sumDenominator = this.denominator * another.denominator;
        return new RationalNumber(sumNumerator, sumDenominator);
    }

    public RationalNumber multiply(RationalNumber another) {
        int multNumerator = this.numerator * another.numerator;
        int multDenominator = this.denominator * another.denominator;
        return new RationalNumber(multNumerator, multDenominator);
    }

    public RationalNumber divide(RationalNumber another) {
        /*int divNumerator = this.numerator * another.denominator;
        int divDenominator = this.denominator * another.numerator;
        return new RationalNumber(divNumerator, divDenominator);*/
        return multiply(new RationalNumber(another.denominator, another.numerator));
    }

    private static int gcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        if (0 == b) return a;
        else return gcd(b, a % b);
    }
}
