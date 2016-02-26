/*
    Chapter 2 Level 2 Exercise 1:
		Write a program that displays a frame window W pixels wide and H pixels high. 
		Use the Scanner to enter the values for W and H. The title of the frame is 
		also entered by the user.
       
    File: Ch2Level2Exercise1.java
*/

import java.util.Scanner;
import javax.swing.JFrame;

public class Ch2Level2Exercise1 { 

	public static void main(String[] args) {

		Scanner scanner;
		scanner = new Scanner(System.in);
		int pixelWidth, pixelHeight;
		String frameTitle;
		
		System.out.println("Enter the pixel width and pixel height of the frame window:");
		pixelWidth = scanner.nextInt();
		pixelHeight = scanner.nextInt();
		
		System.out.println("Enter the title of the frame window:");
		frameTitle = scanner.next();
		
		JFrame myWindow;
		
		myWindow = new JFrame();
		myWindow.setSize(pixelWidth, pixelHeight);
		myWindow.setTitle(frameTitle);
		myWindow.setVisible(true);
		
	}
}