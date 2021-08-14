package practiseQuestions;/*
   Question 1:
   Create a Java program that asks the user for their favorite number
    between 1 and 100 then read this number from the console.
   Suppose the user enters 24.
   Then display the following to the console:
   Amazing!! That's my favorite number too! No really!!, 24 is my favorite number!

*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("What' your favorite number? Enter between 1 and 100! ");

        int favoriteNumber = scn.nextInt();

        System.out.println("Amazing!! That's my favorite number too! No really!!, " + favoriteNumber + " is my favorite number!");


    }
}
