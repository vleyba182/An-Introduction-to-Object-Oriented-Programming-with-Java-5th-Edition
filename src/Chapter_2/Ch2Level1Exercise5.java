/*
    Chapter 2 Level 1 Exercise 5:
		Repeat Exercise 4, but this time use this format: Monday December 10, 2008.
       
    File: Ch2Level1Exercise5.java
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch2Level1Exercise5 {
	
	public static void main(String[] args) {
	
		Date	today;
	    SimpleDateFormat sdf;
	    
	    today = new Date();
	    sdf = new SimpleDateFormat("EEEE MMMM dd, yyyy");
	    System.out.println(sdf.format(today));
		
	}
}
