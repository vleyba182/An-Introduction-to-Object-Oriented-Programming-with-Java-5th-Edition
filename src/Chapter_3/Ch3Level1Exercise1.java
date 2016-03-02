package Chapter_3;

/**
 * Created by vicenteleyba on 3/1/16.
 *
 * Write a program to convert centimeters (input) to feet and inches(output).
 * 1 in = 2.54 cm.
 *
 */

import java.util.Scanner;

public class Ch3Level1Exercise1 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double centimeters, feet, inches;

        System.out.println("Please enter the number of centimeters:");
        centimeters = scanner.nextDouble();

        feet = centimeters / (2.54 * 12);
        inches = (centimeters * 2.54) - (feet * 12);

        System.out.println(feet);
        System.out.println(inches);



    }
}
