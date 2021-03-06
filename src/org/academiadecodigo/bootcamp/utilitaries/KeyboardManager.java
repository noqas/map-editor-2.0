package org.academiadecodigo.bootcamp.utilitaries;

import org.academiadecodigo.bootcamp.User;
import org.academiadecodigo.bootcamp.cells.Cursor;
import org.academiadecodigo.bootcamp.cells.Grid;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardManager implements KeyboardHandler {

    //properties
    private User user;
    private Cursor cursor;
    private Grid grid;


    //constructor
    public KeyboardManager(User user, Cursor cursor, Grid grid) {
        this.user = user;
        this.cursor = cursor;
        this.grid = grid;
        setKeyboard();
    }


    //methods
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        int key = keyboardEvent.getKey();

        switch (key) {
            case KeyboardEvent.KEY_LEFT:  //move left
                user.moveCursor(Cursor.Directions.LEFT);
                break;

            case KeyboardEvent.KEY_RIGHT:  //move right
                user.moveCursor(Cursor.Directions.RIGHT);
                break;

            case KeyboardEvent.KEY_UP:  //move up
                user.moveCursor(Cursor.Directions.UP);
                break;

            case KeyboardEvent.KEY_DOWN:  //move down
                user.moveCursor(Cursor.Directions.DOWN);
                break;

            case KeyboardEvent.KEY_SPACE:  //paints the cell black
                if (!user.isPainting()){
                    user.setPainting(true);
                    user.paintCell();
                } else {user.setPainting(false);}
                break;

            case KeyboardEvent.KEY_C:  //clears all the grid
                user.clearGrid();
                break;

            case KeyboardEvent.KEY_R:   //paints the cell in a random color
                break;

            case KeyboardEvent.KEY_S:  //save grid
                user.save();
                break;

            case KeyboardEvent.KEY_L:  //load grid
                user.load();
                break;

            default:
                break;
        }
    }


    public void setKeyboard() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventLeft);

        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventRight);

        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventUp);

        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventDown);

        KeyboardEvent eventSpace = new KeyboardEvent();
        eventSpace.setKey(KeyboardEvent.KEY_SPACE);
        eventSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventSpace);

        KeyboardEvent eventC = new KeyboardEvent();
        eventC.setKey(KeyboardEvent.KEY_C);
        eventC.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventC);

        KeyboardEvent eventS = new KeyboardEvent();
        eventS.setKey(KeyboardEvent.KEY_S);
        eventS.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventS);

        KeyboardEvent eventL = new KeyboardEvent();
        eventL.setKey(KeyboardEvent.KEY_L);
        eventL.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventL);

        KeyboardEvent eventR = new KeyboardEvent();
        eventR.setKey(KeyboardEvent.KEY_R);
        eventR.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventR);
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            user.setPainting(false);
        }
    }
}
