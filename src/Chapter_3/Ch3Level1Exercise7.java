/**
 * Created by vicenteleyba on 6/20/16.
 *
 * If you invest P dollars at R percent interest rate compounded annually,in
 * N years, your investment will grow to P(1 + R/100)^N dollars.
 * Write an application that accepts P, R, and N and computes the
 * amount of money earned after N years.
 *
 */

package Chapter_3;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Ch3Level1Exercise7 {

    public static void main(String args[]) {

        double a, p, r, n;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter the principal amount: ");
        p = scanner.nextDouble();
        System.out.println("Please enter the annual rate of interest: ");
        r = scanner.nextDouble();
        System.out.println("Please enter the number of times the interest is compounded per year: ");
        n = scanner.nextDouble();

        a =  p * Math.pow((1 + (r / 100)), n);
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        System.out.println("The amount of money accumulated after n years, including interest is $" + decimalFormat.format(a));

    }
}
