/**
 * Created by vicenteleyba on 3/2/16.
 *
 *  Write a program that inputs temperature in degrees
 *  Celsius and prints out the temperature in degrees Fahrenheit.
 *  The formula to convert degrees Celsius to equivalent degrees Fahrenheit
 *  is Fahrenheit =  1.8 * Celsius + 32
 */

package Chapter_3;

import java.util.Scanner;

public class Ch3Level1Exercise2 {

    public static void main(String[] args ) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double degreesCelsius, degreesFahrenheit;

        System.out.println("Enter temperature in degrees Celsius: ");
        degreesCelsius = scanner.nextDouble();
        degreesFahrenheit = 1.8 * degreesCelsius + 32;
        System.out.println(degreesCelsius  + " °C = " + degreesFahrenheit + " °F" );

    }
}
