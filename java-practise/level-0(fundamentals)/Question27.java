/*
Write a Java program to calculate sum of digits of a number.
 */

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int x = n;
        int sum = 0;

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        for (int i = 0; i <= (count - 1); i++) {
            int y = (int) (x / Math.pow(10, i) % 10);
            sum += y;        // sum = sum + y;
        }
        System.out.println(sum);

    }
}
// Eliminate extra variable