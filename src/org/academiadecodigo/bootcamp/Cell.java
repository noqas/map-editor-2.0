package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import static org.academiadecodigo.bootcamp.Grid.padding;


public class Cell {

    //properties
    private int col;
    private int row;
    private Rectangle rectangle;
    public static final int cellSize = 25;
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
}
