package practiceQuestions;
/*
The distance between two cities (in km.) is input through the
keyboard. Write a program to convert and print this distance
in meters, feet, inches and centimeters.
 */

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double distanceKM, distanceMeter, distanceFeet, distanceInch, distanceCM;

        distanceKM = scn.nextDouble();
        distanceMeter = (distanceKM * 1000);
        distanceFeet = (distanceKM * 3280.84);
        distanceInch = (distanceKM * 39370.1);
        distanceCM = (distanceKM * 100000);

        System.out.println("Distance in kilometer: " + distanceKM +
                "\nDistance in meter: " + distanceMeter +
                "\nDistance in feet: " + distanceFeet +
                "\nDistance in inch: " + distanceInch +
                "\nDistance in cm: " + distanceCM);
    }
}
