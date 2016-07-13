/**
 * Created by vicenteleyba on 7/7/16.
 *
 * The velocity of a satellite circling around theEarth is
 * computed by the formula v = sqrt(GMe / r)
 *
 * where Me = 5.98 * 10^24 kg is the mass of the Earth, r
 * the distance from the center of the Earth to the satellite in meters,
 * and G = 6.67 * 10^11 m^3/kg * s^2 the universal gravitational constant.
 * The unit of the velocity v is m/s. Write a program that inputs the radius r
 * and outputs the satellite’s velocity. Confirm that a satellite that is closer to
 * the Earth travels faster. Define symbolic constants for ME and G. The distance to
 * the Hubble Space Telescope from the center of the Earth, for example, is
 * approximately 6.98 * 10^6 m.
 *
*/

package Chapter_3;

import java.util.Scanner;

public class Ch3Level2Exercise1 {

    public static void main(String[] args) {

        final double MASS_OF_EARTH = 5.98e+24;
        final double UNIVERSAL_GRAVITATIONAL_CONSTANT = 6.67e-11;
        double r, velocity;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter the distance from the center of the earth to the satellite in meters: ");
        r = scanner.nextDouble();

        velocity = Math.sqrt((MASS_OF_EARTH * UNIVERSAL_GRAVITATIONAL_CONSTANT) / r);
        System.out.println(velocity);

    }
}
