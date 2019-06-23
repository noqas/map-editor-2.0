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
    public Cell getCell(int row, int col) {
        return cells[row][col];
    }


    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }


    public void clear() {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (cells[row][col].isPainted()) {

                    cells[row][col].erase();
                }
            }
        }
    }

    //grid to string
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                stringBuilder.append(cells[row][col]);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


    //string to grid
    public void stringToGrid(String stringOfNumbers) {

        int index = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if(stringOfNumbers.charAt(index) == '0') {
                    cells[row][col].erase();
                } else {
                    cells[row][col].fill();
                }
                index++;
            }
        index++;
        }
    }

}


