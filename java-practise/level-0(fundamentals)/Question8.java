/*
Write a program to receive Cartesian co-ordinates (x, y) of a point and convert them into polar co-ordinates (r, q).
 */

import java.util.Scanner;
// Defining a math class inside the package java.lang, use to perform math operation easily
// Use can also solve the problem without using math class, by using loops and recursion
import java.lang.Math;

public class Question8 {
    public static void main(String[] args) {
        // Create a tool(k/a-object) for reading user input and name it scn.
        Scanner scn = new Scanner(System.in);

        // Variables declaration
        double xCoordinate, yCoordinate, rRadius, qAngle;

        // User Inputs:
        System.out.println("Write Cartesian co-ordinates(x, y) followed by the spaces: ");
        xCoordinate = scn.nextInt();
        yCoordinate = scn.nextInt();

        // Logic:
        // Using Math.sqrt for sq-root
        // Using Math.atan for tan inverse, and Math.toDegree is used for converting Radian to Degree
        rRadius = Math.sqrt(((xCoordinate) * (xCoordinate) + (yCoordinate) * (yCoordinate)));
        qAngle = Math.toDegrees(Math.atan((yCoordinate / xCoordinate)));

        // Output:
        System.out.println("The point (" + xCoordinate + ", " + yCoordinate +") is (" + String.format("%.2f", rRadius) + ", "+ String.format("%.2f", qAngle) +"°) in Polar Coordinates");

    }
}
