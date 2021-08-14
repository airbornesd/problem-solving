package practiseQuestions;/*
The distance between two cities (in km.) is input through the
keyboard. Write a program to convert and print this distance in
meters, feet, inches and centimeters.
 */

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Create a tool(k/a-object) for reading user input and name it scn.
        Scanner scn = new Scanner(System.in);

        // Variables declaration
        double distanceKM, distanceMeter, distanceFeet, distanceinches, distanceCM;

        System.out.print("Enter the distance in km: ");

        // Now here we will assign a data type-Double were the we enter distance and it get stored
        distanceKM = scn.nextDouble();

        // Distance conversion
        distanceMeter = (distanceKM * 1000);
        distanceFeet = (distanceMeter * 3.2808);
        distanceinches = (distanceFeet * 12);
        distanceCM = (distanceMeter * 100);

        // Output
        // We have used String’s format() method for printing double to 2 decimal places
        System.out.println("Distance in meter: " + distanceMeter + "m");
        System.out.println("Distance in feet: " + String.format("%.2f", distanceFeet) + "ft");
        System.out.println("Distance in inches: " + String.format("%.2f", distanceinches) + "in");
        System.out.println("Distance in centimeter: " + String.format("%.2f", distanceCM) + "cm");

    }
}
