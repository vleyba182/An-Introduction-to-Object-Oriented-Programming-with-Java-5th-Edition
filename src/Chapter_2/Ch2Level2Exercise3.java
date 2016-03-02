package Chapter_2; /**
 * Created by vicenteleyba on 3/1/16.
 *
 * Write a Java program that displays a frame window 300 pixels wide and
 * 200 pixels high with the title My First Frame. Place the frame so
 * that its top left corner is at a position 50 pixels from the top of
 * the screen and 100 pixels from the left of the screen. To position
 * a window at a specified location, you use the setLocation method, as in
 * //assume mainWindow is declared and created frame.setLocation( 50, 50 );
 * Through experimentation, determine how the two arguments in the
 * setLocation method affect the positioning of the window.
 *
 */

import javax.swing.*;

public class Ch2Level2Exercise3 {

    public static void main(String[] args) {

        JFrame myWindow;

        myWindow = new JFrame();

        myWindow.setSize(800, 600);
        myWindow.setTitle("Welcome to Java!");
        myWindow.setLocation(50, 50);
        myWindow.setVisible(true);

    }
}
