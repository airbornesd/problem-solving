/*
Given the coordinates (x, y) of center of a circle and its radius,
write a program that will determine whether a point lies inside the circle,
outside the circle or on the surface of the circle.
 */

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1Coordinate, y1Coordinate, rRadius, positionOfPoint;

        System.out.println("Enter Coordinate(x1,y1) and Radius(r) followed by the spaces: ");
        x1Coordinate = scn.nextInt();
        y1Coordinate = scn.nextInt();
        rRadius = scn.nextInt();

        /*
        Logic:
        this question is solved using standard equation only, supposing center of the circle C(0, 0)
        it could be solved using general equation also where center are provided.
         */
        positionOfPoint = (x1Coordinate * x1Coordinate) + (y1Coordinate * y1Coordinate) - (rRadius * rRadius);

        if(positionOfPoint == 0 ){
            System.out.println("On the surface of the circle");
        } else if ( positionOfPoint > 0) {
            System.out.println("Outside of the surface");
        } else {
            System.out.println("Inside the surface");
        }

    }
}
