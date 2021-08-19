// Check Question43 from level0

package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n / 2;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (i <= n / 2) {
                spaces--;
                stars = stars + 2;
            } else {
                spaces++;
                stars = stars - 2;
            }

        }

    }
}