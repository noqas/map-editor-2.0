package org.academiadecodigo.bootcamp.cells;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    //properties
    private Grid grid;


    //constructor
    public Cursor(int row, int col, Grid grid) {
        super(row, col);
        this.grid = grid;

        rectangle.setColor(Color.ORANGE);
        rectangle.fill();
    }

}
