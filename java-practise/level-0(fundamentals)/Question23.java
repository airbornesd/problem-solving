/*
Write a Java program to print multiplication table of any number.
 */

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            int j = n * i;
            System.out.println(n + " * " + i + " = " + j);
        }

    }
}
