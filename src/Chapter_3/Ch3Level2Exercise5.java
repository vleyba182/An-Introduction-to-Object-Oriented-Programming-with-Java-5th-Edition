/**
 * Created by vicenteleyba on 8/8/16.
 *
 * Write a program that determines the number of days in a
 * given semester. Input to the program is the year, month,
 * and day information of the first and the last days of a
 * semester. Hint: Create GregorianCalendar objects for the
 * start and end dates of a semester and manipulate their
 * DAY_OF_YEAR data.
 *
 */

package Chapter_3;

import java.util.Scanner;

public class Ch3Level2Exercise5 {

    public static void main(String[] args) {

        int semesterStartDay, semesterStartMonth, semesterStartYear, semesterEndDay, semesterEndMonth, semesterEndYear;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the start date of the semester in the format Month, Day, and Year (Example: 8 8 2016):");
        semesterStartMonth = scanner.nextInt();
        semesterStartDay = scanner.nextInt();
        semesterStartYear = scanner.nextInt();

        System.out.println("Please enter the end date of the semester in the format Month, Day, and Year (Example: 12 1 2016):");

    }
}
