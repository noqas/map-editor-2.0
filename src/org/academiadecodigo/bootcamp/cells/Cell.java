package org.academiadecodigo.bootcamp.cells;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import static org.academiadecodigo.bootcamp.cells.Grid.padding;


public class Cell {

    //properties
    private int col;
    private int row;
    protected Rectangle rectangle;
    protected static final int cellSize = 15;
    private boolean painted;



    // constructor
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;

        rectangle = new Rectangle(col * cellSize + padding, row * cellSize + padding, cellSize, cellSize); // col, row, cellsize, cellsize
        rectangle.draw();
    }


    //methods
    public void fill() {
        rectangle.fill();
        painted = true;
    }


    public void erase() {
        rectangle.draw();
        painted = false;
    }


    public boolean isPainted() { //getter for booleans
        return painted;
    }


    public int getRow() {
        return row;
    }


    public int getCol() {
        return col;
    }


    public void setCol(int newCol) {
        col = newCol;
    }


    public void setRow(int newRow) {
        row = newRow;
    }


    @Override
    public String toString() {

        if(painted) {
            return "1";
        } else {
            return "0";
        }
    }
}
