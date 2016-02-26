/*
    Chapter 2 Level 1 Exercise 4:
		Write a program to display today's date in this format: 10 December 2008. 
		Use the console window for output. Refer to Table 2.1 for the necessary 
		designator symbols.
       
    File: Ch2Level1Exercise4.java
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch2Level1Exercise4 {

	public static void main(String[] args) {
		
		Date	today;
	    SimpleDateFormat sdf;
	    
	    today = new Date();
	    sdf = new SimpleDateFormat("dd MMMM yyyy");
	    System.out.println(sdf.format(today));

	}

}
