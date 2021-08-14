package practiseQuestions;/*
 If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits.
 */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Create a tool(k/a-object) for reading user input and name it scn.
        Scanner scn = new Scanner(System.in);

        // Taking user input(although this code does not have functionality)
        System.out.print("Enter any 5 digit number: ");
        int fiveDigitNumber = scn.nextInt();

        // Logic:
        fiveDigitNumber = (fiveDigitNumber % 10) + (fiveDigitNumber / 10) % 10 + (fiveDigitNumber / 100) % 10 + (fiveDigitNumber / 1000) % 10 + (fiveDigitNumber / 10000) % 10;
        System.out.println("Sum of it's digit would be: " + fiveDigitNumber);

    }
}

// This is without using control statement or recursion
// A Number having digit less than or equal to 5 would work