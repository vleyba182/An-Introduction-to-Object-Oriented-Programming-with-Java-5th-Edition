/**
 * Created by vicenteleyba on 11/6/15.

    Chapter 2 Level 1 Exercise 2:
		Input the user’s first and last name as two separate strings.
		Then display a frame window with its title set to <last>, <first>,
		where <last> and <first> are the input values. For example, if the
		input values are Johann and Strauss, then the title would be Strauss, Johann.

    File: Ch2Level1Exercise2.java
    this is a test
*/

import java.util.Scanner;
import javax.swing.*;

public class Ch2Level1Exercise2 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        String firstName, lastName;

        System.out.println("Enter Your First and Last Name");
        firstName = scanner.next();
        lastName = scanner.next();

        JFrame myWindow;

        myWindow = new JFrame();

        myWindow.setSize(800, 600);
        myWindow.setTitle(lastName +"," + " " + firstName);
        myWindow.setVisible(true);
    }

}
