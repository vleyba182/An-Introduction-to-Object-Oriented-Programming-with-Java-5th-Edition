/**
 * Created by vicenteleyba on 7/12/16.
 *
 * Your weight is actually the amount of gravitational attraction
 * exerted on you by the Earth. Since the Moon’s gravity is only
 * one-sixth of the Earth’s gravity, on the Moon you would weigh
 * only one-sixth of what you weigh on Earth. Write a program
 * that inputs the user’s Earth weight and outputs her or his weight on
 * Mercury, Venus, Jupiter, and Saturn. Use the values in this table.
 *
 *  Planet            Multiply the Earth Weight by
 * Mercury                      0.4
 * Venus                        0.9
 * Jupiter                      2.5
 * Saturn                       1.1
 *
 */


package Chapter_3;

import java.util.Scanner;

public class Ch3Level2Exercise2 {

    public static void main(String[] args) {

        double earthWeight, mercuryWeight, venusWeight, jupiterWeight, santurnWeight;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter your weight (Earth Weight):");
        earthWeight = scanner.nextDouble();
        mercuryWeight = earthWeight * 0.4;
        venusWeight = earthWeight * 0.9;
        jupiterWeight = earthWeight * 2.5;
        santurnWeight = earthWeight * 1.1;

        System.out.println("        Planet        Weight");
        System.out.println("        Mercury       " + mercuryWeight);
        System.out.println("        Venus         " + venusWeight);
        System.out.println("        Jupiter       " + jupiterWeight);
        System.out.println("        Saturn        " + santurnWeight);

    }
}
