/*
Factorial of a given number
 */

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numberEntered = scn.nextInt();
        int factorial = 1;

        for (int i = numberEntered; i >= 1; i--) {
            factorial = i * factorial;
        }
        System.out.println(factorial);

    }
}
