/**
 * Created by vicenteleyba on 4/14/16.
 *
 * Write a program that does the reverse of Exercise 2,
 * that is,input degrees Fahrenheit and prints out the temperature
 * in degrees Celsius. The formula to convert degrees Fahrenheit to
 * equivalent degrees Celsius is: Celsius = 5/9 * (Fahrenheit - 32)
 *
 */

package Chapter_3;

import java.util.Scanner;

public class Ch3Level1Exercise4 {

    public static void main(String[] args ) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double degreesCelsius, degreesFahrenheit;

        System.out.println("Enter temperature in degrees Fahrenheit: ");
        degreesFahrenheit = scanner.nextDouble();
        degreesCelsius = (5.0/9.0) * ((degreesFahrenheit - 32));

        System.out.println(degreesFahrenheit  + " °F = " + degreesCelsius + " °C");

    }
}
