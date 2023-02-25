package hackAssignment;

import java.util.Scanner;

public class patternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1;
        int spaces = 1;

        for (int i = 1; i <= 2 * n + 1; i++) {
            int m = n;
            for (int j = 1; j <= stars; j++) {
                System.out.print(m + "\t");
                m--;
            }
            for (int k = spaces; k <= 2 * n - 1; k++) {
                System.out.print("\t");
            }

            if (i == n + 1) {
                m = m + 2;
                for (int j = 1; j < stars; j++) {
                    System.out.print(m + "\t");
                    m++;
                }
            } else {
                m = m + 1;
                for (int j = 1; j <= stars; j++) {
                    System.out.print(m + "\t");
                    m++;
                }
            }
            System.out.println();

            if (i > n) {
                stars--;
                spaces -= 2;
            } else {
                stars++;
                spaces += 2;
            }

        }
    }
}
