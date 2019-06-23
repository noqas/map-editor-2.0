package org.academiadecodigo.bootcamp.cells;

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


    // methods
    public void clearGrid() {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (cells[rows][cols].isPainted()) {

                    cells[rows][cols].erase();
                }
            }
        }
    }


    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
