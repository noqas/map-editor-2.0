package org.academiadecodigo.bootcamp;


public class Colors {

    public enum PossibleColors {

        BLACK,
        RED,
        BLUE,
        GREEN,
        YELLOW,
        ORANGE,
        PINK,
        LIGHTGRAY,
        GRAY,
        DARKGRAY,
        CYAN,
        MAGENTA,
        WHITE,
    }


    public static PossibleColors getRandomNumber() {
        return PossibleColors.values()[(int) (Math.floor(Math.random() * 14))];
    }
}
