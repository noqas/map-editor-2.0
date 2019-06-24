package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cells.Cell;
import org.academiadecodigo.bootcamp.cells.Cursor;
import org.academiadecodigo.bootcamp.cells.Grid;
import org.academiadecodigo.bootcamp.utilitaries.FileManager;
import org.academiadecodigo.bootcamp.utilitaries.KeyboardManager;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class User {

    //properties
    private Grid grid;
    private Cursor cursor;
    private KeyboardManager keyboardManager;
    private boolean painting = false;


    //constructor
    public User() {
        grid = new Grid(50, 50);
        cursor = new Cursor(grid);
        keyboardManager = new KeyboardManager(this, cursor, grid);
    }


    //methods
    public void setPainting(boolean painting) {
        this.painting = painting;
    }


    public void moveCursor(Cursor.Directions direction) { //but the user moves the cursor, using the cursor directions

        switch(direction) {
            case UP:
                cursor.moveUp();
                break;

            case DOWN:
                cursor.moveDown();
                break;

            case LEFT:
                cursor.moveLeft();
                break;

            default:
                cursor.moveRight();
                break;
        }

        if(painting == true) {
            paintCell();
        }
    }


    public void paintCell() {
        Cell currentCell = grid.getCell(cursor.getRow(), cursor.getCol());

        if(!currentCell.isPainted()) {
            currentCell.fill();
        } else {
            currentCell.erase();

        }
    }


    public void paintColor() {

        int randomNumber = (int) Math.floor((Math.random() * 12));

        switch(randomNumber) {

            case 0:
                //paint magenta;
                break;

            case 1:
                //paint red
                break;

            case 2:
                //paint blue
                break;

            case 3:
                //paint cyan
                break;

            case 4:
                //paint gray
                break;

            case 5:
                //paint pink
                break;

            case 6:
                //paint black
                break;

            case 7:
                //paint green
                break;

            case 8:
                //paint white
                break;

            case 9:
                //paint orange
                break;

            case 10:
                //paint yellow
                break;

            case 11:
                //paint dark gray
                break;

            default:
                //paint light gray
                break;
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
