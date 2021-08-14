package practiseQuestions;/*
Java program to find first and last digit of any number and sum of the both
 */

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // For last digit:
        int lastDigit = n % 10;
        System.out.println("Last Digit is: " + lastDigit);

        // For first digit:
        int firstDigit = n;
        int count = 0;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
            count++;
        }
        System.out.println("First Digit is: " + firstDigit);

        // Sum of the last and first digit:
        System.out.println("Sum would be: " + (lastDigit + firstDigit));

    }
}
