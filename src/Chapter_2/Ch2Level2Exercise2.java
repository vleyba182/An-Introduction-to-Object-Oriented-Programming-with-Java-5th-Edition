package Chapter_2;/*
    Chapter 2 Level 2 Exercise 2:
		Display the current time in the title of a frame window
		using this format: 12:45:43 PM. Refer to Table 2.1 for 
		the necessary designator symbols.
       
    File: Ch2Level2Exercise2.java
*/

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;

public class Ch2Level2Exercise2 {
	
	public static void main(String[] args){
		
		Date	today;
	    SimpleDateFormat sdf;
	    
	    today = new Date();
	    sdf = new SimpleDateFormat("HH:mm:ss a");
		
		JFrame myWindow;
		
		myWindow = new JFrame();
		myWindow.setSize(800, 600);
		myWindow.setTitle(sdf.format(today));
		myWindow.setVisible(true);
			
	}
}