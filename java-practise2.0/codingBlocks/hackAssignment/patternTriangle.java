package hackAssignment;

import java.util.Scanner;

public class patternTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int forSpace = 1;
        int forStars = 1;
        int rows = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = forSpace; j < n; j++) {
                System.out.print("\t");
            }

            int rowsNew = rows;
            for (int k = 1; k <= forStars; k++) {
                System.out.print(rowsNew + "\t");
                if (k > forStars / 2) {
                    rowsNew--;
                } else {
                    rowsNew++;
                }
            }

            System.out.println();
            forSpace++;
            forStars += 2;

            // for getting digit instead of stars
            rows++;

        }


    }
}
