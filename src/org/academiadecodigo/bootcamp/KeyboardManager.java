package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardManager implements KeyboardHandler {

    //properties
    private User user;


    //constructor
    public KeyboardManager(User user) {
        this.user = user;
        setKeyboard();
    }


    //methods
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        int key = keyboardEvent.getKey();

        switch (key) {
            case KeyboardEvent.KEY_LEFT:  //move left

                break;

            case KeyboardEvent.KEY_RIGHT:  //move right
                break;

            case KeyboardEvent.KEY_UP:  //move up
                break;

            case KeyboardEvent.KEY_DOWN:  //move down
                break;

            case KeyboardEvent.KEY_SPACE:  //paints the cell black
                break;

            case KeyboardEvent.KEY_R:   //paints the cell in a random color
                break;

            case KeyboardEvent.KEY_C:  //clears all the grid
                break;

            case KeyboardEvent.KEY_S:  //save grid
                break;

            case KeyboardEvent.KEY_L:  //load grid
                break;

            default:
                break;
        }
    }


    public void setKeyboard() {
        Keyboard keyboard = new Keyboard(this);
        KeyboardEvent[] keyboardEvents = new KeyboardEvent[8];

        for (int i = 0; i < keyboardEvents.length; i++) {
            keyboardEvents[i] = new KeyboardEvent();
        }

        keyboardEvents[0].setKey(KeyboardEvent.KEY_UP);
        keyboardEvents[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[1].setKey(KeyboardEvent.KEY_DOWN);
        keyboardEvents[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[2].setKey(KeyboardEvent.KEY_RIGHT);
        keyboardEvents[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[3].setKey(KeyboardEvent.KEY_LEFT);
        keyboardEvents[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[4].setKey(KeyboardEvent.KEY_SPACE);
        keyboardEvents[4].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[5].setKey(KeyboardEvent.KEY_R);
        keyboardEvents[5].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[6].setKey(KeyboardEvent.KEY_L);
        keyboardEvents[6].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[7].setKey(KeyboardEvent.KEY_S);
        keyboardEvents[7].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}
