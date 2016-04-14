/**
 * Created by vicenteleyba on 3/1/16.
 *
 * Write a program to convert centimeters (input) to feet and inches(output).
 * 1 in = 2.54 cm.
 *
 */

package Chapter_3;

import java.util.Scanner;

public class Ch3Level1Exercise1 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double centimeters, feet, inches;

        System.out.println("Please enter the number of centimeters:");
        centimeters = scanner.nextDouble();

        feet = Math.floor(centimeters / (2.54 * 12));
        inches = (centimeters / 2.54) - (12 * feet);

        System.out.println(feet);
        System.out.println(inches);
        System.out.println(centimeters + " cm = " + feet + " ft " + inches + " in" );

    }
}
