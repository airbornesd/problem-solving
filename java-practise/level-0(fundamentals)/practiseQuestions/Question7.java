package practiseQuestions;/*
If a five-digit number is input through the keyboard, write a program to reverse the number.
 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Create a tool(k/a-object) for reading user input and name it scn.
        Scanner scn = new Scanner(System.in);

        // Taking user input(although this code does not have functionality)
        System.out.print("Enter a five digit number: ");
        int fiveDigitNumber = scn.nextInt();

        // Logic:
        fiveDigitNumber = (((fiveDigitNumber % 10) * 10000) + (((fiveDigitNumber / 10) % 10) * 1000)
                + (((fiveDigitNumber / 100) % 10) * 100) + (((fiveDigitNumber / 1000) % 10) * 10)
                + ((fiveDigitNumber / 10000) % 10));
        System.out.println(fiveDigitNumber);
    }
}
// This is without using control statement or recursion
// A Number having digit exactly 5 would work only