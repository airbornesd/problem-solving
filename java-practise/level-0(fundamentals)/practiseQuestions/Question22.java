package practiseQuestions;/*
Write a Java program to find sum of all even and odd numbers between 1 to n.
 */

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int j = 0;

        // for odd use (i = (2 * i) + 1)
        for (int i = 0; i <= n; i = i + 2) {
            j = i + j;
        }
        System.out.println(j);

    }
}
// although it can also be done by using if statement, that would be more acceptable
