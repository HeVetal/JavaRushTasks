package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Работа с клавиатурой
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        for (int i = 0; i < 3; i++) {
//            switch (key) {
//                case LEFT -> setCellColor(0, i, Color.GREEN);
//                case RIGHT -> setCellColor(2, i, Color.GREEN);
//                case UP -> setCellColor(i, 0, Color.GREEN);
//                case DOWN -> setCellColor(i, 2, Color.GREEN);
//            }
            if (key == Key.LEFT) {
                setCellColor(0, i, Color.GREEN);
            } else if (key == Key.RIGHT) {
                setCellColor(2, i, Color.GREEN);
            } else if (key == Key.UP) {
                setCellColor(i, 0, Color.GREEN);
            } else if (key == Key.DOWN) {
                setCellColor(i, 2, Color.GREEN);
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if(key == Key.UP || key == Key.DOWN || key == Key.LEFT || key == Key.RIGHT)
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }
}
