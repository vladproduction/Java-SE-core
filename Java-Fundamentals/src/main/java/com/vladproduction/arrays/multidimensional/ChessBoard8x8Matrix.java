package com.vladproduction.arrays.multidimensional;

public class ChessBoard8x8Matrix {

    protected static final int ROW = 8;
    protected static final int COL = 8;

    public static void main(String[] args) {
        printer(createMultiArr());

    }


    //init method;
    //perform as matrix 8x8;
    private static int[][] createMultiArr(){
        int [][] chessFields = new int[ROW][COL]; // Create an 8x8 matrix
        for (int i = 0; i < chessFields.length; i++) {
            for (int j = 0; j < chessFields[i].length; j++) {
                if((i + j) % 2 == 0){
                    chessFields[i][j] = 0; // imitate color: white
                } else {
                    chessFields[i][j] = 1; // // imitate color: black
                }
            }
        }
        return chessFields;
    }

    //print method;
    private static void printer(int[][] multiArr) {
        if(multiArr != null){
            for (int[] row : multiArr) {
                for (int i : row) {
                    System.out.print(i + " ");
                }
                System.out.println(); //new line
            }
        } else {
            throw new IllegalArgumentException("Chess board must not be null.");
        }

    }

}
