package com.app.vp.chapter_1_basic_OOP;

/**
 * Rational class show:
 * how simplifies the rational number by finding the greatest common divisor (GCD) of numerator and denominator
 * and dividing both by the GCD
 * */
public class Rational {

    private int numerator;
    private int denominator;

    //decide to exclude getters and setters,
    //just init by constructor all values and normalize number inside directly

    //constructor initialising rational object with arguments
    public Rational(int numerator, int denominator){
        //validating denominator (illegal to be as zero)
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can not be zero!");
        }
        //initializing
        this.numerator = numerator;
        this.denominator = denominator;
        //invoke normalize() method
        normalize();
    }

    /**
     * Helper method:
     * Normalizes the rational number by finding the greatest common divisor (GCD)
     * of numerator and denominator and dividing both by the GCD
     * */
    private void normalize() {
        //invoke gcd() method
        int gcd = gcd(numerator, denominator);
        //normalizing numbers
        numerator /= gcd;
        denominator /= gcd;
    }

    /**
     * Helper method:
     * Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     * @params a, b first and second int params
     * @return int value of GCD for a and b params
     * */
    private int gcd(int a, int b) {
        //loop to find gcd
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; //return gcd as a result
    }

    /**
     * Method overload addition operator (+)
     * Show if we need to add two rational numbers and returns a new Rational object representing the sum
     * @param other rational number
     * @return new Rational number representing the sum
     * */
    public Rational add(Rational other){
        //calculating the value of new numerator
        int newNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        //provides the common denominator for the resulting sum
        int newDenominator = denominator * other.denominator;
        return new Rational(newNumerator, newDenominator); //returning new object
    }

    /**
     * representational of rational number in reduced form
     * @return String value in reduce
     * */
    @Override
    public String toString() {
        //validation of denominator if it is already 1, so returning numerator
        //as simplified number
        if(denominator == 1){
            return String.valueOf(numerator);
        }
        //or returning both by slash splitting
        return numerator + "/" + denominator;
    }
}
