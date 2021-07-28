package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Taking no of rows as n input
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {

            // Print spaces in decreasing order
            for (int j = i; j < n; j++) {
                System.out.print("\t");
            }

            // Print star in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }

            // Move to next line
            System.out.println();
        }
    }
}
