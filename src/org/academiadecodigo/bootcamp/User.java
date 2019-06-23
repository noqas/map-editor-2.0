package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cells.Cell;
import org.academiadecodigo.bootcamp.cells.Cursor;
import org.academiadecodigo.bootcamp.cells.Grid;

public class User {

    //properties
    private Grid grid;
    private Cursor cursor;
    private KeyboardManager keyboardManager;


    //constructor
    public User() {
        grid = new Grid(50, 50);
        cursor = new Cursor(grid);
        keyboardManager = new KeyboardManager(this, cursor, grid);
    }


    public void paintCell() {

        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());

        if(!cell.isPainted()) {
            cell.fill();
        } else {
            cell.erase();
        }
    }
}
