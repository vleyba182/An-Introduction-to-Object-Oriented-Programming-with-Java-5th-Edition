/**
 * Created by vicenteleyba on 7/13/16.
 *
 * When you say you are 18 years old,you are really
 * saying that the Earth has circled the Sun 18 times.
 * Since other planets take fewer or more days than Earth to
 * travel around the Sun, your age would be different on other
 * planets. You can compute how old you are on other planets by the
 * formula y = (x * 365) / d where x is the age on Earth, y is the
 * age on planet Y,and d is the number of Earth days the planet Y
 * takes to travel around the Sun. Write an application that
 * inputs the user’s Earth age and print outs his or her age
 * on Mercury, Venus, Jupiter, and Saturn. The values
 * for d are listed in the table.
 *
 * Planet           Approximate Number of Earth Days for This
 *                  Planet to Travel around the Sun
 * Mercury          88
 * Venus            225
 * Jupiter          4,380
 * Saturn           10,767
 *
 *
 */

package Chapter_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch3Level2Exercise3 {

    public static void main(String[] args) {

        double  earthAge, mercuryAge, venusAge, jupiterAge, saturnAge;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        earthAge = scanner.nextDouble();

        mercuryAge = (earthAge * 365.0) / 88.0;
        venusAge = (earthAge * 365.0) / 225.0;
        jupiterAge = (earthAge * 365.0) / 4380.0;
        saturnAge = (earthAge * 365.0) / 10767.0;

        DecimalFormat df = new DecimalFormat("##.0#");

        System.out.println("Planet\t\tAge");
        System.out.println("Mercury" + "\t\t" + df.format(mercuryAge));
        System.out.println("Venus" + "\t\t" + df.format(venusAge));
        System.out.println("Jupiter" + "\t\t" + df.format(jupiterAge));
        System.out.println("Saturn" + "\t\t" + df.format(saturnAge));

    }
}
