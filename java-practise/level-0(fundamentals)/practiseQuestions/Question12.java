package practiseQuestions;/*
Any year is input through the keyboard. Write a program to determine whether the year is a leap year or not
 */
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int yearEntered;

        System.out.print("Enter a year to check whether it is leap year or not: ");
        yearEntered = scn.nextInt();

        /*
        Logic:
        1-If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
        2-If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
        3-If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
        4-The year is a leap year (it has 366 days).
        5-The year is not a leap year (it has 365 days).
        So entered year is divided by 4, if evenly divided chances are it's a leap year,
        then for condition no. 2 year which are evenly divided by 100 must also be divided by 400 to be leap year.
        example- 1700, 1800, 1900 are divided by 4, 100 but not by 400 therefore they are not leap year.
        */

        if ((yearEntered % 4 == 0 && yearEntered % 100 != 0) || (yearEntered % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year!");
        }


    }
}
