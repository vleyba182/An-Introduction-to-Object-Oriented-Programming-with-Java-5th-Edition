/**
 * Created by vicenteleyba on 7/14/16.
 *
 *  Write a program to solve quadratic equations of
 *  the form Ax^2 + Bx+ C = 0 where the coefficients
 *  A, B, and C are real numbers. The two real number
 *  solutions are derived by the formula
 *
 *  x = -B +- sqrt(B^2 - 4AC) / 2A
 *  For this exercise, you may assume that A != 0 and the
 *  relationship B^2 >= 4AC holds, so there will be
 *  real number solutions for x.
 *
 */

package Chapter_3;

import java.util.Scanner;
import java.lang.Math;

public class Ch3Level2Exercise4 {

    public static void main(String[] args) {

        double  a, b, c, x1, x2;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter the A, B, and C coefficients (Each separated by a space): ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        x1 = (-b + Math.sqrt((Math.pow(b, 2.0)) - (4.0 * a * c))) / (2.0 * a);
        x2 = (-b - Math.sqrt((Math.pow(b, 2.0)) - (4.0 * a * c))) / (2.0 * a);

        System.out.println("x = " + x1 + " or " + x2);

    }
}
