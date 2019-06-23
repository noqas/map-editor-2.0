package org.academiadecodigo.bootcamp.cells;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    //properties
    private Grid grid;
    private Cell[][] cells;


    //constructor
    public Cursor() {
        super(0, 0);
        // this.grid = grid;

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
        setRow(getRow() - 1); // logic
        rectangle.translate(0, cellSize); // graphic
    }


    public void moveDown() {
        setRow(getRow() + 1);
        rectangle.translate(0, -cellSize);
    }


    public void moveRight() {
        setCol(getCol() + 1);
        rectangle.translate(cellSize, 0);
    }


    public void moveLeft() {
        setCol(getCol() - 1);
        rectangle.translate(-cellSize, 0);
    }
}
