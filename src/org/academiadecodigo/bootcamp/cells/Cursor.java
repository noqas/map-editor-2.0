package org.academiadecodigo.bootcamp.cells;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    //properties
    private Grid grid;
    private Color color;


    //constructor
    public Cursor(Grid grid) {
        super(0, 0);
        this.grid = grid;
        color = Color.ORANGE;
        rectangle.setColor(color);
        fill();
    }


    //methods
    public enum Directions { // cursor has directions

        UP,
        DOWN,
        RIGHT,
        LEFT,

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
