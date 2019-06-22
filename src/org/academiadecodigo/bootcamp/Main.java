package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cells.Cursor;
import org.academiadecodigo.bootcamp.cells.Grid;

public class Main {

    public static void main(String[] args) {

        Grid grid = new Grid(20, 20);
        Cursor cursor = new Cursor(0,0, grid);
    }
}
