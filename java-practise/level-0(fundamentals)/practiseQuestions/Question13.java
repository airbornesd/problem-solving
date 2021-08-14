package practiseQuestions;/*
A five-digit number is entered through the keyboard.
Write a program to obtain the reversed number and to
determine whether the original and reversed numbers are equal or not.
 */

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fiveDigitNumberEntered, reversedFiveDigitNumberEntered;

        fiveDigitNumberEntered = scn.nextInt();

        // Logic:
        reversedFiveDigitNumberEntered = ((fiveDigitNumberEntered % 10) * 10000 + ((fiveDigitNumberEntered / 10) % 10) * 1000 +
                ((fiveDigitNumberEntered / 100) % 10) * 100 + ((fiveDigitNumberEntered / 1000) % 10) * 10
                + ((fiveDigitNumberEntered / 10000) % 10));

        if ( reversedFiveDigitNumberEntered == fiveDigitNumberEntered ){
            System.out.println( reversedFiveDigitNumberEntered + " - both are same");
        } else {
            System.out.println(reversedFiveDigitNumberEntered + " - not same");
        }

    }
}
