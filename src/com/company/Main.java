package com.company;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {
    static int changeX; // The change in the character's x position.
    static int changeY; // The change in the character's y position.
    static int charMoveX = 780; // The character's current x position.
    static int charMoveY = 670; // The character's current y position.
    public static void charMove (Graphics g){
        g.setColor(Color.pink);
        g.fillRect(charMoveX, charMoveY, 50, 20);

        charMoveX = charMoveX + changeX;
        charMoveY = charMoveY + changeY;
    } // End of charMove.

    public void keyPressed (KeyEvent e){

        int button = e.getKeyCode();

        if (button == KeyEvent.VK_SPACE) {

        }

        if (button == KeyEvent.VK_V) {
            changeX = 6;
        }

        if (button == KeyEvent.VK_LEFT) {
            changeX = -10;
        }

        if (button == KeyEvent.VK_RIGHT) {
            changeX = 10;
        }

        if (button == KeyEvent.VK_UP) {
            changeY = -10;
        }

        if (button == KeyEvent.VK_DOWN) {

        }
    } // End of keyPressed.


    public void keyReleased (KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            changeX = 0;
        }
        if (key == KeyEvent.VK_SPACE) {

        }

        if (key == KeyEvent.VK_RIGHT) {
            changeX = 0;
        }

        if (key == KeyEvent.VK_UP) {
            changeY = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            changeY = 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KeyEvent e = input.nextLine();
        KeyEvent f = input.nextLine();
       keyPressed(e);
       keyReleased(f);




    }
}
    
    