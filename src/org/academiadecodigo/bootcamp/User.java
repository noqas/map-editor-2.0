package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cells.Cell;
import org.academiadecodigo.bootcamp.cells.Cursor;
import org.academiadecodigo.bootcamp.cells.Grid;
import org.academiadecodigo.bootcamp.utilitaries.FileManager;
import org.academiadecodigo.bootcamp.utilitaries.KeyboardManager;

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


    //methods
    public void paintCell() {
        Cell currentCell = grid.getCell(cursor.getRow(), cursor.getCol());

        if(!currentCell.isPainted()) {
            currentCell.fill();
        } else {
            currentCell.erase();
        }
    }


    public void clearGrid() {
        grid.clear();
    }


    public void save() {
        FileManager.writeFile(grid.toString());
    }


    public void load() {
        grid.stringToGrid(FileManager.readFile());
    }
}
