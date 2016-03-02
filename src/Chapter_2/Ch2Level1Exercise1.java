package Chapter_2; /**
 * Created by vicenteleyba on 3/1/16.
 *
 * Chapter 2 Level 1 Exercise 1:
 * Write a program that displays a frame window 800
 * pixels wide and 600pixels high. Set the title of
 * the frame to Welcome to Java.
 *
 * */


import javax.swing.*;

class Ch2Level1Exercise1 {

    public static void main(String[] args) {

        JFrame myWindow;

        myWindow = new JFrame();

        myWindow.setSize(800, 600);
        myWindow.setTitle("Welcome to Java!");
        myWindow.setVisible(true);
    }

}
