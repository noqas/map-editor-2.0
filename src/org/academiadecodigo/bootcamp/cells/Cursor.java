package org.academiadecodigo.bootcamp.cells;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    //properties
    private Grid grid;
    private Cell[][] cells;


    //constructor
    public Cursor(Grid grid) {
        super(0, 0);
        this.grid = grid;
        rectangle.setColor(Color.ORANGE);
        fill();
    }


    //methods
    public void paintCell(int col, int row) {

        if(!cells[row][col].isPainted()) {
            cells[row][col].fill();
        } else {
            cells[row][col].erase();
        }
    }


    public void moveUp() {

        if(getRow() > 0) {
            rectangle.translate(0, -cellSize); // graphic
            setRow(getRow() - 1); // logic
        }
    }


    public void moveDown() {

        if (getRow() < grid.getRows() - 1) {
            rectangle.translate(0, cellSize);
            setRow(getRow() + 1);
        }
    }


    public void moveRight() {

        if (getCol() < grid.getCols() - 1) {
            rectangle.translate(cellSize, 0);
            setCol(getCol() + 1);
        }
    }


    public void moveLeft() {

        if (getCol() > 0) {
            rectangle.translate(-cellSize, 0);
            setCol(getCol() - 1);
        }
    }
}
