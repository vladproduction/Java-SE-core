package com.vladproduction.recomendationfordeveloping.decompositionrefactoring;

public class MainApp {
    public static void main(String[] args) {
        try {
            Matrix p = new Matrix(2, 3);
            MatrixUtils utils = new MatrixUtils();
            utils.fillRandom(p, 2, 8);
            System.out.println("Matrix p:\n" + p);

            Matrix q = new Matrix(3, 4);
            utils.fillRandom(q, 2, 7);
            System.out.println("Matrix q:\n" + q);

            Matrix result = p.multiply(q);
            System.out.println("Product of matrices p and q:\n" + result);
        } catch (MatrixException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
