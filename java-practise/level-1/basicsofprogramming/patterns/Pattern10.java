package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spacesOut = n / 2;
        int spacesIn = -1;

        for (int i = 1; i <= n; i++) {
            // for outer spaces
            for (int j = 1; j <= spacesOut; j++) {
                System.out.print("\t");
            }
            // then star
            System.out.print("*\t");

            // for inner spaces
            for (int j = 1; j <= spacesIn; j++) {
                System.out.print("\t");
            }
            // then star only if i must be greater than 1 and smaller than n
            if (i > 1 && i < n) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                spacesOut--;
                spacesIn = spacesIn + 2;
            } else {
                spacesOut++;
                spacesIn = spacesIn - 2;
            }
            System.out.println();

        }
    }
}
