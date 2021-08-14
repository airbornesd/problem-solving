package practiseQuestions;/*
Write a Java program to calculate product of the digits of a number.
 */

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int x = n;
        int product = 1;

        // counts the no of the digit
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        for (int i = 0; i <= (count - 1); i++) {
            int y = (int) (x / Math.pow(10, i) % 10);
            product = y * product;
        }
        System.out.println(product);


    }
}
// if a number contain zero(0), product will be zero