package com.vladproduction.task_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Task.
 * Enter n from the console - the dimension of the matrix a [n] [n].
 * Set the values of the matrix elements in the range of values from -M to M using a random number generator (Random class).
 * 1. Arrange the rows (columns) of the matrix in ascending order of the values of the elements of the k-th column (row).
 * 2. Find and output the largest number of ascending (descending) elements of the matrix, following in a row.
 * 3. Find the sum of the matrix elements located between the first and second positive elements of each row
 * 4. Find the maximum element in the matrix and remove from the matrix all rows and columns containing it
 */
public class ConsoleMatrixService {
    public static void main(String[] args) {

        int n = 5; // Dimension of the matrix
        int M = 10; // Range for matrix elements -M to M
        int[][] matrix = createRandomMatrix(n, M);

        System.out.println("Original matrix:");
        printMatrix(matrix);

        // 1. Arrange the rows based on the k-th column.
        int k = 2; // Example: sorting based on the 2nd column (0-indexed)
        sortRowsByColumn(matrix, k);
        System.out.println("Matrix sorted by column " + (k + 1) + ":");
        printMatrix(matrix);

        // 2. Find the largest number of ascending (or descending) elements in a row.
        int longestAscendingCount = findLongestAscendingSequence(matrix);
        System.out.println("Longest ascending sequence in any row: " + longestAscendingCount);

        // 3. Sum elements between the first and second positive elements in each row.
        int[] sumsBetweenPositives = sumBetweenFirstTwoPositives(matrix);
        System.out.println("Sums between first two positive elements in each row:");
        for (int sum : sumsBetweenPositives) {
            System.out.println(sum);
        }

        // 4. Remove all rows and columns containing the maximum element.
        matrix = removeMaxElementRowsAndColumns(matrix);
        System.out.println("Matrix after removing rows and columns containing maximum element:");
        printMatrix(matrix);
    }

    // Create a random matrix
    private static int[][] createRandomMatrix(int n, int M) {
        Random random = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * M + 1) - M; // Values in range -M to M
            }
        }
        return matrix;
    }

    // Print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.printf("%4d ", elem);
            }
            System.out.println();
        }
    }

    // Sort rows by the kth column
    private static void sortRowsByColumn(int[][] matrix, int k) {
        Arrays.sort(matrix, Comparator.comparingInt(row -> row[k]));
    }

    // Find the longest ascending sequence in any row
    private static int findLongestAscendingSequence(int[][] matrix) {
        int maxLength = 0;
        for (int[] row : matrix) {
            int currentLength = 1;
            for (int i = 1; i < row.length; i++) {
                if (row[i] > row[i - 1]) {
                    currentLength++;
                } else {
                    maxLength = Math.max(maxLength, currentLength);
                    currentLength = 1;
                }
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

    // Calculate the sums of elements between the first and second positive elements in each row
    private static int[] sumBetweenFirstTwoPositives(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int firstPositiveIndex = -1;
            int secondPositiveIndex = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    if (firstPositiveIndex == -1) {
                        firstPositiveIndex = j;
                    } else if (secondPositiveIndex == -1) {
                        secondPositiveIndex = j;
                        break;
                    }
                }
            }
            if (firstPositiveIndex != -1 && secondPositiveIndex != -1) {
                int sum = 0;
                for (int k = firstPositiveIndex + 1; k < secondPositiveIndex; k++) {
                    sum += matrix[i][k];
                }
                sums[i] = sum;
            } else {
                sums[i] = 0; // If not found, sum is 0
            }
        }
        return sums;
    }

    // Remove rows and columns that contain the maximum element
    private static int[][] removeMaxElementRowsAndColumns(int[][] matrix) {
        int maxElem = Integer.MIN_VALUE;

        // Find the maximum element
        for (int[] row : matrix) {
            for (int elem : row) {
                maxElem = Math.max(maxElem, elem);
            }
        }

        // Identify rows and columns to remove
        boolean[] rowsToRemove = new boolean[matrix.length];
        boolean[] colsToRemove = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == maxElem) {
                    rowsToRemove[i] = true;
                    colsToRemove[j] = true;
                }
            }
        }

        // Create new matrix without the rows and columns to remove
        int newRowCount = 0;
        for (boolean row : rowsToRemove) {
            if (!row) newRowCount++;
        }

        int newColCount = 0;
        for (boolean col : colsToRemove) {
            if (!col) newColCount++;
        }

        int[][] newMatrix = new int[newRowCount][newColCount];
        int newRowIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (!rowsToRemove[i]) {
                int newColIndex = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (!colsToRemove[j]) {
                        newMatrix[newRowIndex][newColIndex++] = matrix[i][j];
                    }
                }
                newRowIndex++;
            }
        }

        return newMatrix;
    }
}
