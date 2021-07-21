/*
WAP to print all natural numbers from 1 to n using while loop
 */

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 1;
        int n = scn.nextInt();

        while (i <= n) {
            System.out.println(i);
            i++;
        }

    }
}
