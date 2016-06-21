/**
 * * Created by vicenteleyba on 6/7/16.
 *
 * A quantity known as the body mass index (BMI) is used to
 * calculate the risk of weight-related health problems. BMI is computed by
 * the formula:
 *
 * BMI = w / (h / 100)^2
 *
 * where w is weight in kilograms and h is height in centimeters.
 * A BMI of about 20 to 25 is considered “normal.”
 * Write an application that accepts weight and height (both integers)
 * and outputs the BMI.
 *
 */

package Chapter_3;

import java.util.Scanner;


public class Ch3Level1Exercise6 {

    public static void main(String[] args) {

        int weight, height;
        double BMI;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms");
        weight = scanner.nextInt();
        System.out.println("Please enter your height in centimeters");
        height = scanner.nextInt();
        BMI = weight / (Math.pow(height, 2) / Math.pow(100, 2));
        System.out.println(BMI);

    }
}
