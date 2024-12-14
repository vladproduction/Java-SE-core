package com.vladproduction.arrays.multidimensional;


public class ChessFigures {
    private static final int ROWS = 8;
    private static final int COLUMNS = 8;

    public static void main(String[] args) {
        String[][] board = chessFigures();
        printBoard(board);
    }

    private static String[][] chessFigures() {
        String[][] figures = new String[ROWS][COLUMNS];

        // Place black pieces
        figures[0][0] = "♖"; // Black Rook
        figures[0][1] = "♘"; // Black Knight
        figures[0][2] = "♗"; // Black Bishop
        figures[0][3] = "♔"; // Black King
        figures[0][4] = "♕"; // Black Queen
        figures[0][5] = "♗"; // Black Bishop
        figures[0][6] = "♘"; // Black Knight
        figures[0][7] = "♖"; // Black Rook
        for (int i = 0; i < COLUMNS; i++) {
            figures[1][i] = "♟"; // Black Pawns
        }

        // Place white pieces
        figures[7][0] = "♖"; // White Rook
        figures[7][1] = "♘"; // White Knight
        figures[7][2] = "♗"; // White Bishop
        figures[7][3] = "♔"; // White King
        figures[7][4] = "♕"; // White Queen
        figures[7][5] = "♗"; // White Bishop
        figures[7][6] = "♘"; // White Knight
        figures[7][7] = "♖"; // White Rook
        for (int i = 0; i < COLUMNS; i++) {
            figures[6][i] = "♙"; // White Pawns
        }

        // Initialize empty squares for the rest of the board
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                figures[i][j] = "_"; // Empty square
            }
        }

        return figures; //return populated chessboard
    }

    private static void printBoard(String[][] strings) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(strings[i][j] + " ");
            }
            System.out.println();
        }
    }


}
