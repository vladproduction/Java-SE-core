package com.vladproduction.recomendationfordeveloping.decompositionrefactoring;

/**
 * refactoring:
 * create a system that allows you to multiply entire matrices by one another.
 * class representing a matrix, encapsulating the data and methods related to matrix operations, including multiplication.
 * */
public class Matrix {

    private final int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public Matrix(int rows, int cols) throws MatrixException {
        if (rows < 1 || cols < 1) {
            throw new MatrixException("Matrix dimensions must be positive.");
        }
        this.data = new int[rows][cols];
    }

    public int getRows() {
        return data.length;
    }

    public int getColumns() {
        return data[0].length;
    }

    public int getElement(int row, int col) throws MatrixException {
        checkBounds(row, col);
        return data[row][col];
    }

    public void setElement(int row, int col, int value) throws MatrixException {
        checkBounds(row, col);
        data[row][col] = value;
    }

    private void checkBounds(int row, int col) throws MatrixException {
        if (row < 0 || row >= getRows() || col < 0 || col >= getColumns()) {
            throw new MatrixException("Index out of bounds: (" + row + ", " + col + ")");
        }
    }

    public Matrix multiply(Matrix other) throws MatrixException {
        if (this.getColumns() != other.getRows()) {
            throw new MatrixException("Incompatible matrices for multiplication.");
        }
        Matrix result = new Matrix(this.getRows(), other.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < other.getColumns(); j++) {
                int sum = 0;
                for (int k = 0; k < this.getColumns(); k++) {
                    sum += this.getElement(i, k) * other.getElement(k, j);
                }
                result.setElement(i, j, sum);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
