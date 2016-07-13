/**
 * Created by vicenteleyba on 6/21/16.
 *
 * The volume of a sphere is computed by the equation V = 4/3 * pi r^3
 * where V is the volume and r is the radius of the sphere. Write a program
 * that computes the volume of a sphere with a given radius r.
 *
 */

package Chapter_3;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ch3Level1Exercise8 {

    public static void main(String args[]) {

        double v, r;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter the radius of the sphere: ");
        r = scanner.nextDouble();
        v = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        System.out.println("The volume of the sphere with radius " + r + " is " + decimalFormat.format(v));

    }
}
