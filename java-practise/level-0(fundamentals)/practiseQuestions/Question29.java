package practiseQuestions;/*
Reverse a number
 */

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input a no from user
        int n = scn.nextInt();
        int reverse = 0;

        // Looping till number become 0
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);

            // Removes last digit from n
            n = n / 10;
        }
        System.out.println(reverse);

    }
}
// This was the best way till now to reverse a number (for me)