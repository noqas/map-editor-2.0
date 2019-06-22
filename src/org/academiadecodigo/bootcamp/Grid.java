package org.academiadecodigo.bootcamp;

public class Grid {

    //properties
    private int rows;
    private int cols;
    private Cell[][] cells;
    public static final int padding = 10;


    //constructor
    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        cells = new Cell[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                cells[row][col] = new Cell(row, col);
            }
        }
    }




}
