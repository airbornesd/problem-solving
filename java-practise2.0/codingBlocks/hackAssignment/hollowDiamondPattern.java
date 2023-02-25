package hackAssignment;

import java.util.Scanner;

public class hollowDiamondPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int limitForSpaces = -1;
        int limitForStars = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = limitForStars; j <= n / 2; j++) {
                System.out.print("*\t");
            }
            for (int k = 0; k < limitForSpaces; k++) {
                System.out.print("\t");
            }
            if (i == 1 || i == n) {
                for (int j = limitForStars + 1; j <= n / 2; j++) {
                    System.out.print("*\t");
                }
            } else {
                for (int j = limitForStars; j <= n / 2; j++) {
                    System.out.print("*\t");
                }
            }
            System.out.println();
            if (i > n / 2) {
                limitForSpaces -= 2;
                limitForStars--;
            } else {
                limitForSpaces += 2;
                limitForStars++;
            }
        }

    }
}
