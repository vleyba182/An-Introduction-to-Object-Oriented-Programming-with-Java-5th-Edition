/**
 * Created by vicenteleyba on 6/7/16.
 *
 *  Write a program that inputs the year a person
 *  is born and outputs theage of the person in the following format:
 *
 */

package Chapter_3;

import java.util.Scanner;
import java.util.Calendar;

public class Ch3Level1Exercise5 {

    public static void main(String[] args) {

        int birthYear, year;
        year = Calendar.getInstance().get(Calendar.YEAR);

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter the year you were born: ");
        birthYear = scanner.nextInt();

        System.out.print(year - birthYear);

    }
}
