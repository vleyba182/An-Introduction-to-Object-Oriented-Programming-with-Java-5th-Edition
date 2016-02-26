/*
    Chapter 2 Level 1 Exercise 3:
       Input the user’s first,middle,and last name as three separate
       strings and display the name in the order of the first name, the middle initial, 
       and the last name. Include the period after the middle initial. If the input strings 
       are Wolfgang, Amadeus, and Mozart, for example, then the ouput would be Wolfgang A. Mozart. 
       Use the console window for output.
       
    File: Ch2Level1Exercise2.java
*/

import java.util.Scanner;

public class Ch2Level1Exercise3 {

	public static void main(String[] args) {
	
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		String firstName, middleName, lastName;
		
		System.out.println("Please Enter Your First Name:");
		firstName = scanner.next();
		System.out.println("Please Enter Your Middle Name:");
		middleName = scanner.next();
		System.out.println("Please Enter Your Last Name:");
		lastName = scanner.next();
		
		System.out.print(firstName + " ");
		System.out.print(middleName.substring(0,1) +". ");
		System.out.print(lastName);
	}

}
