/**
 * Created by vicenteleyba on 3/3/16.
 *
 * Write a program that accepts a person’s weight and displays the
 * number of calories the person needs in one day. A person needs 19
 * calories per pound of body weight, so the formula expressed in Java is
 * calories = bodyWeight * 19;
 */

package Chapter_3;

import java.util.Scanner;

public class Ch3Level1Exercise3 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double calories, bodyWeight;

        System.out.println("Please Enter Your Body Weight (Pounds): ");
        bodyWeight = scanner.nextDouble();
        calories = bodyWeight * 19;
        System.out.println("Number of Calories Needed is " + calories);

    }
}
