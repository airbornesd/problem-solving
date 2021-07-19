/*
Any integer is input through the keyboard. Write a program to find out whether it is an odd number or even number.
 */

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int enterIntNumber;

        System.out.print("Enter an integer value to check odd or even: ");
        enterIntNumber = scn.nextInt();

        // Using condition if-else:
        if (enterIntNumber % 2 == 0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }

    }
}
