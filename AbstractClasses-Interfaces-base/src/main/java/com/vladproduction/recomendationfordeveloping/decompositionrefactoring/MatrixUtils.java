package com.vladproduction.recomendationfordeveloping.decompositionrefactoring;

import java.util.Random;

public class MatrixUtils {

    private Random random = new Random();

    public void fillRandom(Matrix matrix, int minValue, int maxValue) throws MatrixException{
        int rows = matrix.getRows();
        int columns = matrix.getColumns();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                 int value = random.nextInt((maxValue - minValue) + maxValue);
                 matrix.setElement(i, j, value);
            }
        }
    }

}
