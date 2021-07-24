/*
Write a program to calculate overtime pay of 10 employees.
Overtime is paid at the rate of Rs. 12.00 per hour for every hour worked above 40 hours.
Assume that employees do not work for fractional part of an hour.
 */

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int overTime = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("\nEmployee no." + i + "! Please mention your working hours: ");
            int workingHours = scn.nextInt();

            if (workingHours > 40) {
                overTime = (workingHours - 40);
                overTime = overTime * 12;
                System.out.println("Overtime of Employee " + i + " would be: " + overTime + "$");
            } else {
                System.out.println("Employee " + i + " work more than 40 hours!");
            }

        }

    }
}
